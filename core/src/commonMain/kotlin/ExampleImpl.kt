package atomicfu.bug

import kotlinx.atomicfu.locks.SynchronizedObject

class ExampleImpl(
    private val map: Map<String, Int> = emptyMap(),
) : Example {

    private val lock = SynchronizedObject()

    override operator fun get(key: String): Int = synchronized(lock) {
        map["test"] ?: 0
    }
}
