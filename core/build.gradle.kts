plugins {
    kotlin("multiplatform")
    id("kotlinx-atomicfu")
}

kotlin {
    jvmToolchain(11)
    jvm()
}
