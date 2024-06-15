plugins {
    kotlin("jvm") version "2.0.0"
    alias(libs.plugins.graalvm)
}

group = "eu.kgorecki"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.bundles.kotest)
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}