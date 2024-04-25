enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

plugins {
    // Provides repositories for auto-downloading JVM toolchains.
    // https://github.com/gradle/foojay-toolchains
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

include(
    "core",
    "cli",
)
