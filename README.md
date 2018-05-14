# FRIDGE WEB APP #

### What is this repository for? ###

* This is a prototype web application to track items in your fridge. The idea is to not get lost until when your food is still good inside the fridge by adding them with a 'startDate' and 'expireDate' field.
* The color indicates the state of the items. Red means it passed the expiration date, yellow means it will expire on the current day or in the next, green means that it is at least 2 days from expiring.

### How do I set up? ###

* The project was developed in Java using [Spring](https://spring.io/), [Thymeleaf](https://www.thymeleaf.org/) and [MongoDB](https://www.mongodb.com/). JDK at least 1.8 and MongoDB server is required to build the application.
* Dependencies: Used Gradle to manage build and dependencies.
* How to run the application: at the project root directory, execute from the command line the command:
`./gradlew clean build`
to build the application. To start, run the command:
`./gradlew bootRun`
The application should start at:
`localhost:8080`