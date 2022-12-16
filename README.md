# Assignment: Spring boot CRUD operations including h2(in-memory database)

## Run Spring Boot application

- Run ```mvn spring-boot:run``` in terminal.
- Open the h2 database client in browser using ```http://localhost:8080/h2-ui/login.jsp```.
- Enter ```jdbc:h2:mem:testdb``` as JDBC url to connect to in-memory database and click on `connect`.
- Now open another tab in browser(or postman) to test the CRUD operations and simultaneously check 
the database in the previously opened h2 client tab to validate the changes made by the CRUD REST API calls

Example: hit ```http://localhost:8080/api/students``` in new tab to check the ```GET``` response.
