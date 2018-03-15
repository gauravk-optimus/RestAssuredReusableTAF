# RestAssured Reusable API Test Automation Framework

Main objective of this project is to create the API Test Automation Framework using RestAssured with TestNG test framework using Java Programming language

## Getting Started

These instructions will help to get a copy of the project and running on your local machine for development and testing purposes.

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

### How to incorporate this framework in your project
One can start the test automation of his APIs in few minutes. Just follow these simple steps:
* Update the property ‘hostUrl’ and ‘port’. (If there is not port, leave the field blank) in ‘config.properties’ at ‘src\test\resources\config.properties’
* Create a folder for your api module at ‘src\test\resources\testdata\’ and place the json request file inside it.
* Create POJO classes for your requests and response and place them inside ‘com.projectname.model.apirequest’ & ‘com.projectname.model.apiresponse’ packages. Don’t forget to rename ‘projectname’ to relevant name for all the packages.
* Create a test class similar to the ‘SampleTestClass1’ class inside the ‘com.projectname.apimodulename.testscripts’. Here, change the ‘apimodulename’ to relevant name. Update the endpoint URL property key in the constructor. Create test cases similar to sample which I have created.
* Add assertions as mentioned in the sample test cases.
* Update the testNG file.
* Run the test cases using Maven or TestNG as per the need of your project. Preferably Maven. 
* See the test execution results at ‘allure-results’ folder in the base directory. That's all!

Note: If you are new to create POJO classes, then for a quick start you can go to ‘http://pojo.sodhanalibrary.com/' URL to create them online. But best way is to create them manually.
