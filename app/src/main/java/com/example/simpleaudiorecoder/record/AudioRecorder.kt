package com.example.simpleaudiorecoder.record

import java.io.File

interface AudioRecorder {
    fun start(outputFile: File)
    fun stop()
}