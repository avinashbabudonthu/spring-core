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
* [Setter Injection](#setter-injection)
* [Constructor Injection](#constructor-injection)
* [Autowire dependency injection byType](src/main/java/autowire/by/type)
* [Autowire dependency injection by constructor](src/main/java/autowire/constructor)
* [Date injection](src/main/java/date/injection)
* [Properties injection](src/main/java/properties/injection)

## Setter Injection
* Create a package **setter.injection** in **src/main/java**
* Create a folder **setter.injection** in **src/main/resources**
* Create classes following classes **setter.injection** package. Refer classes **[here](src/main/java/setter/injection)**
```
Student.java
StudentRepository.Java
StudentRepositoryImpl.java
StudentService.java
StudentServiceImpl.java
```
* Inject **StudentRepository** to **StudentService**
* Create spring config file **[setter-injection.xml](src/main/resources/setter.injection/setter-injection.xml
)** in **src/main/resource/setter.injection** folder
* Create and inject beans in **setter-injection.xml**
* Get **StudentService** from spring bean config file using **ClassPathXmlApplicationContext**. Refer **[App.java](src/main/java/setter/injection/App.java)**


## Run this project
* Import project into IDE as Maven or Gradle project
* Execute App class in each package