Spring AOP Demo Project

Aspect-Oriented Programming (AOP) with the Spring Framework to apply cross-cutting concerns (such as logging) to business logic. The project is a simple Spring application that uses Spring AOP to log method executions in a business service.

Project Setup

Prerequisites
Before running this project, make sure you have the following installed:

Java JDK (version 8 or higher)
Maven (for dependency management)
IDE (such as IntelliJ IDEA or Eclipse)


How to Run the Application

Step 1: Build the Project

mvn clean install

Step 2: Run the Application

Open the MainApp.java class in your IDE.
Right-click on MainApp.java and select "Run".

mvn exec:java -Dexec.mainClass="com.spring.aop.MainApp"

Contributing:

Feel free to fork this repository and submit pull requests. If you have any issues or suggestions, please open an issue on GitHub