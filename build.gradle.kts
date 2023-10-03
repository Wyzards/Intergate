plugins {
    id("java")
}

tasks.jar {
    destinationDirectory.set(file("C:\\Users\\Ryan\\Desktop\\1.20 Paper Server\\plugins"))
}

group = "com.Theeef.me"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}