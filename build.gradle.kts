
plugins {
    id("java")
}

group = "br.com.iterasys"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation("org.testng:testng:7.7.1")
    testImplementation("org.hamcrest:hamcrest:2.2")
    implementation("io.appium:java-client:8.5.1")
    implementation("org.seleniumhq.selenium:selenium-java:4.10.0")
    implementation("io.cucumber:cucumber-testng:7.14.0")
    implementation("io.github.bonigarcia:webdrivermanager:5.5.3")



}


tasks.test {
    useTestNG()
}