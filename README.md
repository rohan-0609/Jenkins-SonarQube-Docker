**Jenkins-Sonarqube-Docker**

This project sets up Jenkins and SonarQube using Docker, streamlining the process for CI/CD (Continuous Integration/Continuous Deployment) and code quality analysis.

Project Structure
Dockerfile: This file contains the instructions to build the Docker image for Jenkins and SonarQube.
index.html: Frontend web interface, possibly used for interacting with Jenkins or SonarQube.
prepros.config: A configuration file for preprocessing tasks.
vendor/: Contains external dependencies or third-party libraries.
Test.txt: A placeholder file for testing purposes.

Prerequisites
Docker: Ensure Docker is installed and running on your machine.

Setup Instructions


- Clone the Repository:
git clone <repository-url>
cd Jenkins-Sonarqube-Docker

- Build the Docker Image: Run the following command to build the Docker image using the provided Dockerfile:
docker build -t jenkins-sonarqube .
Run the Docker Container: After building the image, run the container:

- Access Jenkins and SonarQube:
docker run -d -p 8080:8080 -p 9000:9000 jenkins-sonarqube


- Run the Docker Container. After building the image, run the container. 
Jenkins: Go to http://localhost:8080
SonarQube: Go to http://localhost:9000


- Testing
The Test.txt file can be used for testing Jenkins and SonarQube integrations.
