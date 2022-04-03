pluginManagement {
    plugins {

    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("org.jetbrains.kotlin")) {
                useVersion("1.6.10")
            }
        }
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "cashier-common"

