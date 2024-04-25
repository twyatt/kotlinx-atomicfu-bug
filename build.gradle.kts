buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.23.2")
    }
}

plugins {
    kotlin("multiplatform") version "1.9.23" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}
