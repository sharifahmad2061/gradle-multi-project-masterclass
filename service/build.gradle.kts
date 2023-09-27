plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":model"))
    implementation("org.springframework.boot:spring-boot-starter:3.1.4")
}