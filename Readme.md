# Getting Started

This service provides apis to manage survey and support following features :
* analyse the submitted surveys.

### Code Usage 
**Build it** : *mvnw.cmd clean install*

**Run It** : *java -jar target\survey-analysis-service-0.0.1-SNAPSHOT.jar*

**API Documentation** http://localhost:8082/api/swagger-ui.html

**API Usage (via Postman)**
 * Retrieve Analysis 
     * Request URL : http://localhost:8082/api/survey/analysis/{surveyId}
     * Response Body:
        ```
        {
            "surveyId": {surveyId},
            "totalResponses": 2,
            "questionAnalysis": {
                "{questionId}": {
                    "{answerId}": 2
                }
            }
        }
        ```

**Publish Sonar Results** : *mvnw.cmd clean install sonar:sonar -Dsonar.projectKey={projectKey}  -Dsonar.organization={organization}  -Dsonar.host.url={host}  -Dsonar.login={login}*

**Build Docker Container** : *mvnw.cmd clean install dockerfile:build*

### Dev Operations
[Survey Analysis Service Travis CI Build](https://travis-ci.org/MLS-CS/survey-analysis-service)
: Have integrated code repo with Travis CI which builds the app does following :

* perform and publish, code analysis and code coverage result to sonar cloud.
    * [Survey Analysis Service Sonar Report](https://sonarcloud.io/dashboard?id=MLS-CS_survey-analysis-service)
* build and publish docker container to docker hub
    * [Survey Analysis Service Docker Hub](https://cloud.docker.com/u/mlscs/repository/docker/mlscs/survey-analysis-service)
* deployment of docker container is done manually as of now.

### Guides
Refereed following guide's for development:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Spring Boot with Docker](https://spring.io/guides/gs/spring-boot-docker/)
