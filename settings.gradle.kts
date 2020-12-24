/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/7.0-20201224092022+0000/userguide/multi_project_builds.html
 */
rootProject.name = "catalog-pocs"
include("lib")

includeBuild("build-logic")

dependencyResolutionManagement {
    repositories {
        jcenter()
    }
    dependencyResolutionManagement {
        versionCatalogs {
            create("libs") {
                alias("junit-api").to("org.junit.jupiter:junit-jupiter-api:5.7.0")
                alias("junit-engine").to("org.junit.jupiter", "junit-jupiter-engine").withoutVersion()

                alias("commons-math3").to("org.apache.commons:commons-math3:3.6.1")

                alias("guava").to("com.google.guava:guava:30.0-jre")
            }
        }
    }
}