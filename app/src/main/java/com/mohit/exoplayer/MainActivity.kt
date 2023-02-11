package com.mohit.exoplayer

import android.content.ContentResolver
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.C
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.audio.AudioAttributes


class MainActivity : AppCompatActivity() {

    lateinit var playBtn: Button
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPlayer()

        playBtn = findViewById(R.id.play_btn)
        playBtn.setOnClickListener {
            Log.i("MainActivity", "onCreate: is already playing = ${player.isPlaying}")
            player.playWhenReady = !player.isPlaying
//            if (player.isPlaying) player.pause() else player.play()
        }
    }

    private fun initPlayer() {
        player = ExoPlayer.Builder(this).build()
        player.addMediaItem(MediaItem.fromUri(getAudioUri()))
        player.prepare()

        val audioAttributes: AudioAttributes =
            AudioAttributes.Builder().setUsage(C.USAGE_MEDIA).setContentType(C.AUDIO_CONTENT_TYPE_MUSIC).build()

        (player as ExoPlayer).setAudioAttributes(audioAttributes, true)
        player.addListener(SimplePlayerListener)
        player.addListener(object : Player.Listener {
            override fun onIsPlayingChanged(isPlaying: Boolean) {
                super.onIsPlayingChanged(isPlaying)
                playBtn.text = if (isPlaying) getString(R.string.pause) else getString(R.string.play)
                Toast.makeText(this@MainActivity, (if (player.isPlaying) "Playing" else "Paused"), Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun getAudioUri(): Uri {
        return Uri.Builder()
            .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
            .authority(packageName)
            .appendPath("${R.raw.audio}")
            .build()
    }
}