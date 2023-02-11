package com.mohit.exoplayer

import android.util.Log
import com.google.android.exoplayer2.*
import com.google.android.exoplayer2.audio.AudioAttributes
import com.google.android.exoplayer2.metadata.Metadata
import com.google.android.exoplayer2.text.Cue
import com.google.android.exoplayer2.text.CueGroup
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters

// just log the calls, using Log.v and Log.i
object SimplePlayerListener: Player.Listener {

    private const val TAG = "PlayerListener"

    override fun onIsPlayingChanged(isPlaying: Boolean) {
        super.onIsPlayingChanged(isPlaying)
        Log.i(TAG, "onIsPlayingChanged: $isPlaying")
    }

    override fun onEvents(player: Player, events: Player.Events) {
        super.onEvents(player, events)
        Log.v(TAG, "onEvents: ")
    }

    override fun onTimelineChanged(timeline: Timeline, reason: Int) {
        super.onTimelineChanged(timeline, reason)
        Log.v(TAG, "onTimelineChanged: ")
    }

    override fun onMediaItemTransition(mediaItem: MediaItem?, reason: Int) {
        super.onMediaItemTransition(mediaItem, reason)
        Log.i(TAG, "onMediaItemTransition: ")
    }

    override fun onTracksChanged(tracks: Tracks) {
        super.onTracksChanged(tracks)
        Log.v(TAG, "onTracksChanged: ")
    }

    override fun onMediaMetadataChanged(mediaMetadata: MediaMetadata) {
        super.onMediaMetadataChanged(mediaMetadata)
        Log.v(TAG, "onMediaMetadataChanged: ")
    }

    override fun onPlaylistMetadataChanged(mediaMetadata: MediaMetadata) {
        super.onPlaylistMetadataChanged(mediaMetadata)
        Log.v(TAG, "onPlaylistMetadataChanged: ")
    }

    override fun onIsLoadingChanged(isLoading: Boolean) {
        super.onIsLoadingChanged(isLoading)
        Log.v(TAG, "onIsLoadingChanged: isLoading = $isLoading")
    }

    override fun onLoadingChanged(isLoading: Boolean) {
        super.onLoadingChanged(isLoading)
        Log.v(TAG, "onLoadingChanged: isLoading = $isLoading")
    }

    override fun onAvailableCommandsChanged(availableCommands: Player.Commands) {
        super.onAvailableCommandsChanged(availableCommands)
        Log.i(TAG, "onAvailableCommandsChanged: ")
    }

    override fun onTrackSelectionParametersChanged(parameters: TrackSelectionParameters) {
        super.onTrackSelectionParametersChanged(parameters)
        Log.i(TAG, "onTrackSelectionParametersChanged: ")
    }

    override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
        super.onPlayerStateChanged(playWhenReady, playbackState)
        Log.i(TAG, "onPlayerStateChanged: playWhenReady = $playWhenReady, playbackState = $playbackState")
    }

    override fun onPlaybackStateChanged(playbackState: Int) {
        super.onPlaybackStateChanged(playbackState)
        Log.i(TAG, "onPlaybackStateChanged: playbackState = $playbackState")
    }

    override fun onPlayWhenReadyChanged(playWhenReady: Boolean, reason: Int) {
        super.onPlayWhenReadyChanged(playWhenReady, reason)
        Log.i(TAG, "onPlayWhenReadyChanged: playWhenReady = $playWhenReady")
    }

    override fun onPlaybackSuppressionReasonChanged(playbackSuppressionReason: Int) {
        super.onPlaybackSuppressionReasonChanged(playbackSuppressionReason)
        Log.i(TAG, "onPlaybackSuppressionReasonChanged: playbackSuppressionReason = $playbackSuppressionReason")
    }

    override fun onRepeatModeChanged(repeatMode: Int) {
        super.onRepeatModeChanged(repeatMode)
        Log.v(TAG, "onRepeatModeChanged: ")
    }

    override fun onShuffleModeEnabledChanged(shuffleModeEnabled: Boolean) {
        super.onShuffleModeEnabledChanged(shuffleModeEnabled)
        Log.i(TAG, "onShuffleModeEnabledChanged: ")
    }

    override fun onPlayerError(error: PlaybackException) {
        super.onPlayerError(error)
        Log.i(TAG, "onPlayerError: ")
    }

    override fun onPlayerErrorChanged(error: PlaybackException?) {
        super.onPlayerErrorChanged(error)
        Log.i(TAG, "onPlayerErrorChanged: ")
    }

    override fun onPositionDiscontinuity(reason: Int) {
        super.onPositionDiscontinuity(reason)
        Log.i(TAG, "onPositionDiscontinuity: ")
    }

    override fun onPositionDiscontinuity(
        oldPosition: Player.PositionInfo,
        newPosition: Player.PositionInfo,
        reason: Int
    ) {
        super.onPositionDiscontinuity(oldPosition, newPosition, reason)
        Log.i(TAG, "onPositionDiscontinuity: ")
    }

    override fun onPlaybackParametersChanged(playbackParameters: PlaybackParameters) {
        super.onPlaybackParametersChanged(playbackParameters)
        Log.i(TAG, "onPlaybackParametersChanged: ")
    }

    override fun onSeekBackIncrementChanged(seekBackIncrementMs: Long) {
        super.onSeekBackIncrementChanged(seekBackIncrementMs)
        Log.i(TAG, "onSeekBackIncrementChanged: ")
    }

    override fun onSeekForwardIncrementChanged(seekForwardIncrementMs: Long) {
        super.onSeekForwardIncrementChanged(seekForwardIncrementMs)
        Log.i(TAG, "onSeekForwardIncrementChanged: ")
    }

    override fun onMaxSeekToPreviousPositionChanged(maxSeekToPreviousPositionMs: Long) {
        super.onMaxSeekToPreviousPositionChanged(maxSeekToPreviousPositionMs)
        Log.i(TAG, "onMaxSeekToPreviousPositionChanged: ")
    }

    override fun onSeekProcessed() {
        super.onSeekProcessed()
        Log.i(TAG, "onSeekProcessed: ")
    }

    override fun onAudioSessionIdChanged(audioSessionId: Int) {
        super.onAudioSessionIdChanged(audioSessionId)
        Log.i(TAG, "onAudioSessionIdChanged: ")
    }

    override fun onAudioAttributesChanged(audioAttributes: AudioAttributes) {
        super.onAudioAttributesChanged(audioAttributes)
        Log.i(TAG, "onAudioAttributesChanged: ")
    }

    override fun onVolumeChanged(volume: Float) {
        super.onVolumeChanged(volume)
        Log.i(TAG, "onVolumeChanged: ")
    }

    override fun onSkipSilenceEnabledChanged(skipSilenceEnabled: Boolean) {
        super.onSkipSilenceEnabledChanged(skipSilenceEnabled)
        Log.i(TAG, "onSkipSilenceEnabledChanged: ")
    }

    override fun onDeviceInfoChanged(deviceInfo: DeviceInfo) {
        super.onDeviceInfoChanged(deviceInfo)
        Log.i(TAG, "onDeviceInfoChanged: ")
    }

    override fun onDeviceVolumeChanged(volume: Int, muted: Boolean) {
        super.onDeviceVolumeChanged(volume, muted)
        Log.i(TAG, "onDeviceVolumeChanged: ")
    }

    override fun onRenderedFirstFrame() {
        super.onRenderedFirstFrame()
        Log.i(TAG, "onRenderedFirstFrame: ")
    }

    override fun onCues(cues: MutableList<Cue>) {
        super.onCues(cues)
        Log.i(TAG, "onCues: ")
    }

    override fun onCues(cueGroup: CueGroup) {
        super.onCues(cueGroup)
        Log.i(TAG, "onCues: 2")
    }

    override fun onMetadata(metadata: Metadata) {
        super.onMetadata(metadata)
        Log.i(TAG, "onMetadata: ")
    }
}