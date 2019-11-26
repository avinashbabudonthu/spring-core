# Dependency Injection using Xml

## Create project using maven
```
mvn archetype:generate -DgroupId=com.dependency.injection.xml -DartifactId=dependency-injection-xml -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add gradle
```
gradle init --type pom
```

## Versions
* Maven **3.5.2**
* Gradle **5.0**

## Dependencies
* junit:junit:4.12
* org.projectlombok:lombok:1.18.8
* org.slf4j:slf4j-api:1.7.28
* org.slf4j:slf4j-log4j12:1.7.28
* org.springframework:spring-core:5.1.9.RELEASE
* org.springframework:spring-context:5.1.9.RELEASE

## Examples
* [Setter injection](src/main/java/setter/injection)
* [Constructor injection](src/main/java/basic/constructor/injection)
* [Autowire dependency injection byType](src/main/java/autowire/by/type)
* [Autowire dependency injection by constructor](src/main/java/autowire/constructor)
* [Date injection](src/main/java/date/injection)
* [Properties injection](src/main/java/properties/injection)

## Run this project
* Import project into IDE as Maven or Gradle project
* Execute App class in each package