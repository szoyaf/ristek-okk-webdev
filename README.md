<h1>Welcome to my simple OKK Application!</h1>

Here are the things that you need to setup before running the application locally
1. Install a Spring Boot Framework in your Computer. IF you're using Visual Studio Code, you can download the **Spring Boot Dashboard** extenstion, i'm using version **v0.13.1** to run the app in my computer
2. Install Postgres DB in your computer and create a database named **ristek**. Make sure your postgres runs in port 5432
3. Configure your database username & password in spring boot application.properties. Configure for both **spring.datasource.*** and **spring.flyway.***
```
# Server configuration
server.port=8080

# PostgreSQL database configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/ristek
spring.datasource.username=postgres
spring.datasource.password=password
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# JPA/Hibernate configuration
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update      
spring.jpa.properties.hibernate.format_sql=true

spring.flyway.enabled=true
spring.flyway.url=jdbc:postgresql://localhost:5432/ristek
spring.flyway.user=postgres
spring.flyway.password=password
spring.flyway.schemas=migrations
spring.flyway.locations=classpath:db/migration/ristek
```
4. Run the spring boot app! 🍀
