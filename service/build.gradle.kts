plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":model"))
    implementation("org.springframework.boot:spring-boot-starter:3.1.4")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.4")
}

testing {
    suites {
        named("test", JvmTestSuite::class) {
            useJUnitJupiter()
        }
    }
}