## playback states
    int STATE_IDLE = 1;
    int STATE_BUFFERING = 2;
    int STATE_READY = 3;
    int STATE_ENDED = 4;


# logs when
## 1. init, play, call incoming, decline call
// init
11:32:18.559 PlayerListener        com.mohit.exoplayer           I  onAvailableCommandsChanged:
11:32:18.633 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = false, playbackState = 3
11:32:18.633 PlayerListener        com.mohit.exoplayer           I  onPlaybackStateChanged: playbackState = 3
// play
11:32:21.691 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = false
11:32:21.695 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = true, playbackState = 3
11:32:21.695 PlayerListener        com.mohit.exoplayer           I  onPlayWhenReadyChanged: playWhenReady = true
11:32:21.695 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: true
// incoming call
11:32:27.427 PlayerListener        com.mohit.exoplayer           I  onPlaybackSuppressionReasonChanged: playbackSuppressionReason = 1
11:32:27.427 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: false
// decline call
11:32:33.105 PlayerListener        com.mohit.exoplayer           I  onPlaybackSuppressionReasonChanged: playbackSuppressionReason = 0
11:32:33.106 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: true

## 2. init, play, call incoming, pick up call, hang up
// init
11:36:20.711 PlayerListener        com.mohit.exoplayer           I  onAvailableCommandsChanged:
11:36:20.782 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = false, playbackState = 3
11:36:20.782 PlayerListener        com.mohit.exoplayer           I  onPlaybackStateChanged: playbackState = 3
// play
11:36:23.427 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = false
11:36:23.431 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = true, playbackState = 3
11:36:23.432 PlayerListener        com.mohit.exoplayer           I  onPlayWhenReadyChanged: playWhenReady = true
11:36:23.432 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: true
// incoming call
11:36:30.541 PlayerListener        com.mohit.exoplayer           I  onPlaybackSuppressionReasonChanged: playbackSuppressionReason = 1
11:36:30.541 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: false
// pickup call
// hang up
11:36:45.400 PlayerListener        com.mohit.exoplayer           I  onPlaybackSuppressionReasonChanged: playbackSuppressionReason = 0
11:36:45.401 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: true


## 3. init, play, call incoming, pick up call, play, hang up
// init
11:39:27.922 PlayerListener        com.mohit.exoplayer           I  onAvailableCommandsChanged:
11:39:27.988 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = false, playbackState = 3
11:39:27.988 PlayerListener        com.mohit.exoplayer           I  onPlaybackStateChanged: playbackState = 3
// play
11:39:33.858 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = false
11:39:33.862 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = true, playbackState = 3
11:39:33.862 PlayerListener        com.mohit.exoplayer           I  onPlayWhenReadyChanged: playWhenReady = true
11:39:33.862 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: true
// incoming call
11:39:38.060 PlayerListener        com.mohit.exoplayer           I  onPlaybackSuppressionReasonChanged: playbackSuppressionReason = 1
11:39:38.060 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: false
// play 
11:39:45.363 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = false
11:39:45.364 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = false, playbackState = 3
11:39:45.364 PlayerListener        com.mohit.exoplayer           I  onPlayWhenReadyChanged: playWhenReady = false
11:39:45.364 PlayerListener        com.mohit.exoplayer           I  onPlaybackSuppressionReasonChanged: playbackSuppressionReason = 0
// play again
11:39:50.482 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = false
// hang up

# ===============================================================
init 48:55
play 49:12
incoming call 49:24
answer call 49:32
play 49:42
play again 49:51
decline call 50:05
play again 50:17
pause 50:33

init 48:55
11:48:55.073 mohit.exoplayer       com.mohit.exoplayer           W  Accessing hidden method Landroid/view/View;->computeFitSystemWindows(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z (unsupported, reflection, allowed)
11:48:55.073 mohit.exoplayer       com.mohit.exoplayer           W  Accessing hidden method Landroid/view/ViewGroup;->makeOptionalFitsSystemWindows()V (unsupported, reflection, allowed)
11:48:55.115 ExoPlayerImpl         com.mohit.exoplayer           I  Init edc8e3c [ExoPlayerLib/2.18.2] [c1s, SM-N981B, samsung, 33]
11:48:55.127 mohit.exoplayer       com.mohit.exoplayer           W  Accessing hidden method Landroid/media/AudioTrack;->getLatency()I (unsupported, reflection, allowed)
11:48:55.174 MSHandlerLifeCycle    com.mohit.exoplayer           I  check: return. pkg=com.mohit.exoplayer parent=null callers=com.android.internal.policy.DecorView.setVisibility:4373 android.app.ActivityThread.handleResumeActivity:5463 android.app.servertransaction.ResumeActivityItem.execute:54 android.app.servertransaction.ActivityTransactionItem.execute:45 android.app.servertransaction.TransactionExecutor.executeLifecycleState:176
11:48:55.174 MSHandlerLifeCycle    com.mohit.exoplayer           I  removeMultiSplitHandler: no exist. decor=DecorView@2ce7d77[]
11:48:55.193 MSHandlerLifeCycle    com.mohit.exoplayer           I  removeMultiSplitHandler: no exist. decor=DecorView@2ce7d77[MainActivity]
11:48:55.239 Parcel                com.mohit.exoplayer           W  Expecting binder but got null!
11:48:55.251 PlayerListener        com.mohit.exoplayer           I  onAvailableCommandsChanged:
11:48:55.253 InputMethodManager    com.mohit.exoplayer           I  startInputInner - mService.startInputOrWindowGainedFocus
11:48:55.287 DMCodecAdapterFactory com.mohit.exoplayer           I  Creating an asynchronous MediaCodec adapter for track type audio
11:48:55.313 CCodecBufferChannel   com.mohit.exoplayer           I  [c2.sec.mp3.decoder#751] Created output block pool with allocatorID 16 => poolID 35 - OK
11:48:55.314 CCodecBufferChannel   com.mohit.exoplayer           I  [c2.sec.mp3.decoder#751] 4 initial input buffers available
11:48:55.316 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = false, playbackState = 3
11:48:55.316 PlayerListener        com.mohit.exoplayer           I  onPlaybackStateChanged: playbackState = 3
// play 49:12
11:49:12.317 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = false
11:49:12.320 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = true, playbackState = 3
11:49:12.337 PlayerListener        com.mohit.exoplayer           I  onPlayWhenReadyChanged: playWhenReady = true
11:49:12.337 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: true
11:49:12.340 System                com.mohit.exoplayer           W  A resource failed to call close.
11:49:12.498 AudioTrack            com.mohit.exoplayer           W  getTimestamp_l(493): retrograde timestamp time corrected, 19715565691051 < 19715810481013
// incoming call 49:24
11:49:24.410 PlayerListener        com.mohit.exoplayer           I  onPlaybackSuppressionReasonChanged: playbackSuppressionReason = 1
11:49:24.410 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: false
// answer call 49:32
11:49:32.329 MSHandlerLifeCycle    com.mohit.exoplayer           I  removeMultiSplitHandler: no exist. decor=DecorView@2ce7d77[MainActivity]
11:49:32.335 WindowManager         pid-1223                      E  win=Window{2ccfdfb u0 com.mohit.exoplayer/com.mohit.exoplayer.MainActivity} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.ActivityRecord.destroySurfaces:6428 com.android.server.wm.ActivityRecord.destroySurfaces:6409 com.android.server.wm.ActivityRecord.notifyAppStopped:6473 com.android.server.wm.ActivityRecord.activityStopped:7060 com.android.server.wm.ActivityClientController.activityStopped:258 android.app.IActivityClientController$Stub.onTransact:613 com.android.server.wm.ActivityClientController.onTransact:136
11:49:39.413 MSHandlerLifeCycle    com.mohit.exoplayer           I  removeMultiSplitHandler: no exist. decor=DecorView@2ce7d77[MainActivity]
11:49:39.423 MSHandlerLifeCycle    com.mohit.exoplayer           I  removeMultiSplitHandler: no exist. decor=DecorView@2ce7d77[MainActivity]
11:49:39.495 InputMethodManager    com.mohit.exoplayer           I  startInputInner - mService.startInputOrWindowGainedFocus
// play 49:42
11:49:42.789 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = false
11:49:42.790 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = false, playbackState = 3
11:49:42.790 PlayerListener        com.mohit.exoplayer           I  onPlayWhenReadyChanged: playWhenReady = false
11:49:42.790 PlayerListener        com.mohit.exoplayer           I  onPlaybackSuppressionReasonChanged: playbackSuppressionReason = 0
// play again 49:51
11:49:51.491 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = false
// decline call 50:05
11:50:13.092 InputMethodManager    com.mohit.exoplayer           I  startInputInner - mService.startInputOrWindowGainedFocus
// play again 50:17
11:50:17.673 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = false
11:50:17.674 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = true, playbackState = 3
11:50:17.674 PlayerListener        com.mohit.exoplayer           I  onPlayWhenReadyChanged: playWhenReady = true
11:50:17.674 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: true
11:50:17.830 AudioTrack            com.mohit.exoplayer           W  getTimestamp_l(493): retrograde timestamp time corrected, 19780917742159 < 19781134104274
11:50:18.250 mohit.exoplayer       com.mohit.exoplayer           I  Compiler allocated 6075KB to compile void android.view.ViewRootImpl.performTraversals()
11:50:18.811 InputMethodManager    com.mohit.exoplayer           I  startInputInner - mService.startInputOrWindowGainedFocus
// pause 50:33
11:50:33.281 MainActivity          com.mohit.exoplayer           I  onCreate: is already playing = true
11:50:33.282 PlayerListener        com.mohit.exoplayer           I  onPlayerStateChanged: playWhenReady = false, playbackState = 3
11:50:33.282 PlayerListener        com.mohit.exoplayer           I  onPlayWhenReadyChanged: playWhenReady = false
11:50:33.282 PlayerListener        com.mohit.exoplayer           I  onIsPlayingChanged: false
# =============================================================