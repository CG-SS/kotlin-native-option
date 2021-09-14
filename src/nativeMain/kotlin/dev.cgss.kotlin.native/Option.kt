package dev.cgss.kotlin.native

import platform.windows.boolean

class Option<T> private constructor(val value: T){

    companion object {
        val EMPTY = Option(null)

        fun <K> of(v: K): Option<K> {
            return Option(v)
        }

    }

    fun isEmpty() : Boolean {
        return value == null
    }

    fun isPresent() : Boolean {
        return !isEmpty()
    }

}

