# Rest Assured Reusable API Test Automation Framework

Main objective of this proejct is to create the automation test cases for CC Gateway APIs using RestAssured with TestNG framework using Java Programming language

## Getting Started

These instructions will help to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

We would need following to setup in Windows machine

1. Java 1.8

* Download and install Java 1.8 JDK
* Configure environment variables and define Java_Home variable
* Launch command prompt and run “Java -version” command
* Java version information should be displayed

2. Maven

* Download Apache Maven zip file
* Setup environment variables for Maven
* Launch command prompt and run “mvn -version” command
* Maven version information should be displayed

### Test Automation Framework Execution

Following are the steps to run tests

1. Update the Host URL and Port for execution environment

* Navigate to "src\test\resources\config.properties"
* Update the 'hostUrl' to the desired IP
* Update the 'port' as per the 'hostUrl'

2. Test script execution in eclipse through Maven

* Download source code from Repository
* Import source code in Eclipse IDE as Maven project
* Right click on pom.xml file
* Execute pom.xml file as maven 'clean package' to create the build and run the tests
* Execute pom.xml file as maven 'clean test' to run the tests
* Execute pom.xml file as maven 'allure:report' to create the allure reports after running the tests
* Allure report will be generated in artifacts/allure-report folder/index.html
* Execute pom.xml file as maven 'clean test allure:report' to run the tests and create the reports simultaneously

3. Test script execution in eclipse through testng.xml

* Download source code from Repository
* Import source code in Eclipse IDE as Maven project
* Right click on testng-xml file
* Execute testng.xml file as testNG Suite
* Default testng report will be generated in the 'test-output' folder

4. Test script execution using command line interface

* Download source code from Repository
* Launch command prompt in Windows
* Navigate to root directory of Test Automation Framework
* Run 'mvn clean package' to create the build and run the tests
* Run 'mvn clean test' to run the tests
* Run 'mvn allure:report' to create the allure reports after running the tests
* Allure report will be generated in artifacts/allure-report folder/index.html
* Run 'mvn clean test allure:report' to run the tests and create the reports simultaneously

5. Execution of Regression and Smoke Test cases though Maven
* Test cases are grouped as per the 'Smoke' and 'Regression' purpose
* Right click on pom.xml file
* Execute pom.xml file as maven 'clean package -Dgroups=Smoke,Regression' to create the build and run the tests groups
* Execute pom.xml file as maven 'clean test -Dgroups=Smoke,Regression' to run the tests groups
Note: We can use one or multiple comma separated groups.
* Execute pom.xml file as maven 'allure:report' to create the allure reports after running the tests groups
* Allure report will be generated in artifacts/allure-report folder/index.html
* Execute pom.xml file as maven 'clean test -Dgroups=Smoke,Regression allure:report' to run the tests groups and create the reports simultaneously

 6. Execution of Regression and Smoke Test cases groups through command line interface or Jenkins
* Run 'mvn clean package -Dgroups=Smoke,Regression' to create the build and run the tests groups
* Run 'mvn clean test -Dgroups=Smoke,Regression' to run the tests groups
* Run 'mvn allure:report' to create the allure reports after running the tests groups
* Allure report will be generated in artifacts/allure-report folder/index.html
* Run 'mvn clean test -Dgroups=Smoke,Regression allure:report' to run the tests groups and create the reports simultaneously

Note: Allure report will open inly in Firefox and Microsft Edge browser when opened by clicking the 'index.html' file at 'artifacts/allure-report folder/index.html' location. But it will open in all browsers on clicking the report link generated by jenkins. 
