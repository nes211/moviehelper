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
<div class="wrap-text">
    Clone the project repository from Git.
    Import the project into your preferred Java IDE (designed in IntelliJ 2023.3).
    Ensure you have the Java version 17 installed.
</div>  

### Configuration
<div class="wrap-text">
    Ensure database configurations are correctly set up in application.properties.
   <br> Modify credentials in application.properties for access your Chat GPT 3.5.    
</div>
<br>
<img alt="Email configuration" src="https://github.com/nes211/moviehelper/blob/561a98fb164a11afaad200372edff21ebff77dde/img/application_config.jpg">

## 3. Features

<div class="wrap-text">
Search movies by:
    <pre>
     <br>    category,
     <br>    platform,
     <br>    age rating,
     <br>    score IMDB,
     <br>    favourite actor.
    </pre>
</div>

## 4. Technologies Used
<div class="wrap-text">
    Spring Boot Framework: For developing RESTful APIs with basic authorization features.
     <br> Hibernate: For object-relational mapping and data storage.
     <br> Lombok: For reducing boilerplate code.
     <br> Open AI - Chat GPT 3.5: For search movies
     <br> Git: For version control.
</div>

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

    Open resources file index_form.html.
    Fill out the fields.
    Submit the form.
    Await the response.
    The response will be displayed as a list of the top 5 movies from the selected category.
    
</div>
<img alt="Response" src="https://github.com/nes211/moviehelper/blob/cf5c65740fea0657f5c51cdbec24da503f5b19ca/img/html_response.jpg">
<br>


## 7. Deployment

    Deploy the application to your preferred environment (local, cloud, etc.).
    Ensure proper configuration for the deployment environment.

## 8. Some problems during project
<div class="wrap-text">
    CORS filter dissable
    <br>
</div>

## 9. Troubleshooting

  ### 1. Application Fails to Start

Issue: The application fails to start, and an error message is displayed.

Solution:
<div class="wrap-text">
    Check if all required dependencies are installed and configured correctly.
    Verify that the security api Token in application.properties are accurate.
    Review the application logs for detailed error messages to pinpoint the issue.
</div>
 
 ### 2. Unable to Authenticate

Issue: Users are unable to authenticate and receive errors when attempting to log in.

Solution:
<div class="wrap-text">
    Ensure that the user is registered.
    <br>Ensure that the provided credentials are correct.
    <br>Ensure that you have sufficient funds in your account
</div>

## 10. Future Improvements
<div class="wrap-text">
    Roadmap for future development includes adding features such as small pics of movie and description.
   <br> Feature requests and suggestions are encouraged.
</div>

## 11. License
<div class="wrap-text">
    This project is licensed under the MIT License.
</div>

## 12. Contact

<div class="wrap-text">
    For support or inquiries, contact the project maintainers at nes211nes211nes@gmail.com.
    <br>Project repository: https://github.com/nes211/moviehelper
</div>
