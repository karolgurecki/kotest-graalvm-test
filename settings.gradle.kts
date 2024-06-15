plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "kotest-graalvm-test"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("kotest", "5.9.1")

            plugin("graalvm","org.graalvm.buildtools.native").version("0.10.2")

            library("kotest-runnerJunit5Jvm", "io.kotest", "kotest-runner-junit5-jvm").versionRef("kotest")
            library("kotest-assertionsCore", "io.kotest", "kotest-assertions-core").versionRef("kotest")

            bundle("kotest", listOf("kotest-runnerJunit5Jvm", "kotest-assertionsCore"))
        }
    }
}