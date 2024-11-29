plugins {
    `java-library`
}

group = "io.github.josephsimutis"
version = "1.0.0"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}