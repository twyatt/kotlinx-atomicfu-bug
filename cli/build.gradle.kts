plugins {
    kotlin("multiplatform")
    id("kotlinx-atomicfu")
}

kotlin {
    jvmToolchain(11)
    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(projects.core)
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}
