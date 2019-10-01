# Dependency Injection using Xml

## Create project using maven
```
mvn archetype:generate -DgroupId=dependency.inject.java.config -DartifactId=dependency-injection-java-config -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
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
* org.springframework:spring-test:5.1.9.RELEASE

## Examples
### Dependency injection using java config and setter
* Basic setter injection using spring java configuration
* package - **dependency.inject.setter.injection**
* Create classes Student, StudentService, StudentRepository
* Create configuration class - **AppConfig**
* StudentRepository injected to StudentService
* Get StudentService bean in App class using class - **AnnotationConfigApplicationContext** 

### Using Annotations like @Service, @Repository with java config
* Usage of annotation **ComponentScan** in make spring to scan all packages and sub packages
* package - **component.scan.with.annotations**
* Create classes Student, StudentService, StudentRepository
* Create configuration class - **AppConfig**
* Declare **ComponentScan** annotation at class level of **AppConfig**. Give package
* Test method - **component.scan.with.annotations.App**
* Test class **component.scan.with.annotations.StudentServiceTest** by using **SpringJUnit4ClassRunner**, **@ContextConfiguration**

### Properties Injection
* Inject values from properties file using spring java configuration
* Package - **properties.injection**
* Create **app.properties** file in **src/main/resources**
* Declare **@PropertySource(value = "properties.injection/app.properties")** annotation in AppConfig
* Create bean **PropertySourcesPlaceholderConfigurer** in **AppConfig**
 

## Run this project
* Import project into IDE as Maven or Gradle project
* Execute App class in each package