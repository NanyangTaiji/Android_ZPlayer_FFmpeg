package com.zhy.zplayer_ffmpeg.FFmpeg

/**
 *Created by ZQL
 *Created on 2022/5/22
 **/
object AVCodecHandler {

    init {
        System.loadLibrary("ffmpeg-lib")
    }

    external fun initFFmpeg()

    external fun setFilePath(filePath: String, callBack: AVCodecCallBack?)

    external fun setVideoCodecFilePath(filePath: String, callBack: AVCodecCallBack?)
    external fun setAudioCodecFilePath(filePath: String, callBack: AVCodecCallBack?)

}