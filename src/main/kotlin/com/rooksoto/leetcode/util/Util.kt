package com.rooksoto.leetcode.util

import kotlin.system.measureTimeMillis

fun profile(
    shouldLog: Boolean = false,
    block: () -> Unit
): Long = measureTimeMillis(block).apply {
    if (shouldLog) println("Execution time: ${this}ms.")
}
