# gradle-plugin-kotlin-example
A Gradle plugin example written in Kotlin

## Usage

Build script snippet for use in all Gradle versions:

```groovy
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.com.hekeki.gradle:gradle-plugin-kotlin-example:0.0.1"
  }
}

apply plugin: "com.hekeki.gradle.gradle-plugin-kotlin-example"
```

Build script snippet for new, incubating, plugin mechanism introduced in Gradle 2.1:
```groovy
plugins {
  id "com.hekeki.gradle.gradle-plugin-kotlin-example" version "0.0.1"
}
```

## Run example plugin
```bash
user@host $ ./gradlew runKotlinExample
:runKotlinExample
[YIPPIE] Running gradle plugin written in kotlin

BUILD SUCCESSFUL
```