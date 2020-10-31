package com.zeryther.kotlinpractice

class KotlinPractice {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world!")

            val fruits = listOf("Banana", "Avocado", "Apple", "Kiwifruit")
            fruits
                .filter { this.startsWithIgnoreCase(it, "a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
        }

        fun startsWithIgnoreCase(text: String, check: String): Boolean {
            return text.toLowerCase().startsWith(check.toLowerCase())
        }
    }
}