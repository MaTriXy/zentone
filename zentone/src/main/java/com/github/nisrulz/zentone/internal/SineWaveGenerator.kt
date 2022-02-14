package com.github.nisrulz.zentone.internal

import kotlin.math.sin

object SineWaveGenerator : WaveByteArrayGenerator {

    override fun calculateData(index: Int, samplingInterval: Float, amplitude: Int): Byte {
        val angle = (Math.PI * index) / samplingInterval
        return (amplitude * sin(angle) * Byte.MAX_VALUE).toInt().toByte()
    }
}