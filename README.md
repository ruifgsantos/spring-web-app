# spring-web-app
Sample web app using Java SpringBoot framework.
The app has 3 interations:
- Accessing the root path (http://localhost:8080/) to display a simple HTML page with an image and a text;
- Accessing the root path with a variable (http://localhost:8080/MyName) to display the same home page but with a twist;
- Accessing a different path (http://localhost:8080/home) to display a message.

In order to run the application, you must execute the following commands. Make sure to have Java installed in your computer.

Firstly, we will build an executable Java Jar file with all aplication files inside and dependencies:

```
./mvnw clean install package
```

By doing this, we are creating the Jar file under the project directory target/ (this directory did not exist prior the execution of the command).

All is set to run the application:

```
java -jar target/spring-web-app-0.0.1-SNAPSHOT.jar
```

Now go to your browser of choice and access ```http://localhost:8080```
