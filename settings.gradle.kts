pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "Sunscreen"
include("api")
include("spigot")
//include("spigot-v1_20_1")
include("R1_21_4")
