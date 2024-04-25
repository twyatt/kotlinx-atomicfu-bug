package atomicfu.bug

import kotlinx.atomicfu.locks.SynchronizedObject

class ExampleImpl(
    private val map: Map<String, Int> = emptyMap(),
) : Example, SynchronizedObject() {

    override operator fun get(key: String): Int = synchronized(this) {
        map["test"] ?: 0
    }
}
