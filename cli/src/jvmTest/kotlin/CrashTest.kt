package atomicfu.bug

import kotlin.test.Test

class CrashTest {

    @Test
    fun simpleTest() {
        val example = ExampleImpl()
        val hello = Hello(example)
    }
}
