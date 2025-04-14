Here’s a proper documentation `README.md` style description for your Spring project, suitable for GitHub:

---

# 📘 Spring XML-Based Configuration Example

This repository demonstrates a simple **Spring Framework** project using **XML-based configuration** to define and manage beans. The project contains a basic example of dependency injection in Spring using a `Student` class.

---

## 📂 Project Structure

```
spring-xml-config-example/
│
├── src/
│   ├── com/spring/proj/entity/Student.java       # Bean class
│   ├── com/spring/proj/main/Main.java            # Application entry point
│   └── com/spring/proj/resources/applicationContext.xml # Spring XML configuration
│
├── lib/                                          # External JARs (Spring + Commons Logging)
└── README.md
```

---

## 📌 Technologies Used

- Java
- Spring Framework (version 4.2.x)
- XML Configuration
- Apache Commons Logging

---

## 📦 Required JARs

You need to manually download and include the following JAR files in your classpath:

1. `spring-beans-4.2.x.jar`
2. `spring-context-4.2.x.jar`
3. `spring-core-4.2.x.jar`
4. `spring-expression-4.2.x.jar`
5. `commons-logging-1.2.jar`

You can download the JARs from the official [Spring Framework Repository](https://repo.spring.io/) or Maven Central.

---

## 📄 Bean Configuration (`applicationContext.xml`)

```xml
<bean class="com.spring.proj.entity.Student" id="stdId">
    <property name="name" value="Tarun"/>
    <property name="rollno" value="101"/>
    <property name="email" value="tarun@gmail.com"/>
</bean>
```

This XML file defines a `Student` bean with injected values for `name`, `rollno`, and `email`.

---

## 📘 How It Works

1. **Student.java**  
   A simple POJO with private fields, getters/setters, and a `display()` method to print student details.

2. **Main.java**  
   Loads the Spring context from the XML file and retrieves the `Student` bean by its ID (`stdId`), then invokes the `display()` method.

---

## ▶️ Running the Application

1. Ensure all required JAR files are in your classpath.
2. Compile the Java files:

```bash
javac -cp "lib/*" -d bin src/com/spring/proj/entity/Student.java src/com/spring/proj/main/Main.java
```

3. Run the application:

```bash
java -cp "bin:lib/*" com.spring.proj.main.Main
```

> Windows users should replace `:` with `;` in the classpath.

---

## 📋 Output

```
name Tarun
Roll No 101
Email tarun@gmail.com
```

---

## 🔗 Resources

- [Spring Framework Reference Documentation](https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/)
- [Spring XML Schema Configuration Guide](https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html)

---

🚀 Spring Boot & JAR Version Details
Although this example uses XML-based configuration (which is more traditional), the project is bootstrapped using Spring Boot for easier setup and dependency management.

Spring Boot version used: 2.x compatible

Spring Framework JAR version: 6.2.3

Commons Logging version: 1.2

⚠️ Note: All Spring JARs are from version 6.2.3, except commons-logging, which remains on 1.2 due to compatibility and legacy support.

This allows you to leverage Spring Boot's streamlined project structure while still exploring how beans and dependency injection work through manual XML configuration.

