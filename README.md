# Movie Helper Application Documentation

## 1. Introduction
<div class="wrap-text">
Movie Helper is an assistant for selecting the best films. It enhances the evening by curating the finest movies available on a specific platform, making the process of choosing enjoyable. It enables users to browse through the most popular streaming platforms to verify the availability of titles and check their ratings on IMDb. To accomplish this, it leverages the artificial intelligence of ChatGPT 3.5. As a result, users receive a list of five selected films.
</div>
<div style="text-align: center">
    <img alt="Movie helper aform" src="https://github.com/nes211/moviehelper/blob/4015c17337d36ca9e312e7560d9b5e218a081f41/img/html_form.jpg">
</div>


## 2. Getting Started
### Installation

    Clone the project repository from Git.
    Import the project into your preferred Java IDE (designed in IntelliJ 2023.3).
    Ensure you have the Java version 17 installed.
  

### Configuration
<div class="wrap-text">
    Ensure database configurations are correctly set up in application.properties.
    Modify email configurations in email.properties for access your service.    
</div>
<br>
<img alt="Email configuration" src="https://github.com/nes211/Workshop/blob/d7a3ef891ca3bd68eac09655cc065a444c3946ad/img/email_config.jpg">

## 3. Features

<div class="wrap-text">


</div>

## 4. Technologies Used

    Spring Boot Framework: For developing RESTful APIs with basic authorization features.
    Hibernate: For object-relational mapping and data storage.
    Lombok: For reducing boilerplate code.
    Open AI - Chat GPT 3.5: For search movies
    Git: For version control.

## 5. Application Structure

    src/main/java: Contains the application source code.
    src/main/resources: Contains configuration files and search form.

## 6. Usage
<div class="wrap-text">
    Running the Application:
        Start the application locally using your IDE or by running mvn spring-boot:run in the terminal.
</div>

<div class="wrap-text">
    Interacting with the API:
        Use use index_form.html fill fields and submit.
        Await for response.
        Response is show as a list of 5 best movies from selected category.
        <br>Postman requests file included in repo: <img alt="Postman request file" src="[https://github.com/nes211/Workshop/blob/249e7df7c38367da0c3878e1564520ffb0b7f1ad/img/structore.jpg](https://github.com/nes211/Workshop/blob/1f99ddf38881f278ac7fa78365b7f3c3bdbdc730/Workshop.postman_collection.json)">
</div>

<br>
<img alt="Postman queries" src="https://github.com/nes211/Workshop/blob/5637826ae8f2af306e69ecc3dc24b48aae1c8290/img/postman.jpg">
<br>
<br>

## 7. Authentication and Authorization

    Users can register in using their email adress and password via the /user/add endpoint.
    Authentication successful after proper credentials included in all requests.

## 8. Database Schema

### Table Structure
<img alt="Shows table structure" src="https://github.com/nes211/Workshop/blob/249e7df7c38367da0c3878e1564520ffb0b7f1ad/img/structore.jpg">

### Users Table
<img alt="Shows user table" src="https://github.com/nes211/Workshop/blob/249e7df7c38367da0c3878e1564520ffb0b7f1ad/img/users.jpg">

### Tasks Table
<img alt="Shows tasks table" src="https://github.com/nes211/Workshop/blob/249e7df7c38367da0c3878e1564520ffb0b7f1ad/img/tasks.jpg">


### Cars Table 
<img alt="Showscars table" src="https://github.com/nes211/Workshop/blob/249e7df7c38367da0c3878e1564520ffb0b7f1ad/img/cars.jpg">

## 9. Testing

### Unit Tests (JUnit)

    Unit tests are located in the src/test/java directory.
    Run tests using your IDE or mvn test command.

### Integration Tests (RestAssured)

    Integration tests are located in the src/test/java directory.
    Run tests using your IDE or mvn verify command.

## 10. Deployment

    Deploy the application to your preferred environment (local, cloud, etc.).
    Ensure proper configuration for the deployment environment.

## 11. Some problems during project
<div class="wrap-text">
    Vin crc verification. There is no only one crc algorithm for Vin number. Most comapany has them own crc algorithm. The most popular is Luna10 
    (inculde weight multiply system and modulo divide by 11 method).
</div>

## 12. Troubleshooting

  ### 1. Application Fails to Start

Issue: The application fails to start, and an error message is displayed.

Solution:
<div class="wrap-text">
    Check if all required dependencies are installed and configured correctly.
    Verify that the database connection settings in application.properties are accurate.
    Review the application logs for detailed error messages to pinpoint the issue.
</div>
 
 ### 2. Unable to Authenticate

Issue: Users are unable to authenticate and receive errors when attempting to log in.

Solution:

    Ensure that the user is registered.
    Ensure that the provided credentials are correct.
    Check the user roles and permissions to ensure proper access control.

  ### 3. Email Notifications Not Sending

Issue: Email notifications are not being sent to users upon repair completion.

Solution:
<div class="wrap-text">
    Verify that the email service configuration in email.properties is correct, including the SMTP server settings.
    Check if the email address provided for notifications is valid and accessible.
    Review the application logs for any errors related to the email service.
</div>

### 4. Database Connection Issues

Issue: The application encounters errors related to database connectivity.

Solution:
<div class="wrap-text">
    Check if the database server is running and accessible. H2 server is running all the time with application.
    Verify that the database credentials and connection settings in application.properties are accurate.
    Test the connection manually using a database client or command-line tool.
</div>
    
## 13. Future Improvements
<div class="wrap-text">
    Roadmap for future development includes adding additional features such as user management page.
    Feature requests and suggestions are encouraged.
</div>

## 14. License

    This project is licensed under the MIT License.

## 15. Contact

    For support or inquiries, contact the project maintainers at nes211nes211nes@gmail.com.
    Project repository: https://github.com/nes211/Workshop

