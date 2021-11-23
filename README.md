# Cinema Shop

### Description:

An example of a REST WebServer developed using Spring Framework (MVC and Security).

This application represents shop, where users can buy tickets for the available movies.

- Main idea to create application is to show knowledge of Spring Core, Security and MVC, Hibernate, Java Core, as well as REST architectural style.
- Application implements 3 layer architecture with controller, service and DAO layers.
- Each user must login in order to access application.
- It implements Authentication using an existing DataSource configuration. Database used is MySQL.
- Each user has list of roles that define list of resources accessible for this user.
- JSON format is used to transmit data in a web application.

### Technologies:
- Java (JDK version 11)
- MySQL database
- Tomcat - web-server (version 9.0.54)
- Hibernate
- Spring (Spring Core, Spring Security, Spring Web)
- JSON
- Maven (version 3.6.3)

### To run this app locally:
- Fork this project to your repository
- Clone project locally and open it in IntelliJ IDEA
- Change properties for the folliwing line in db.properties file:

1. db.driver=YOUR_DRIVER
2. db.url=YOUR_URL
3. db.user=YOUR_NAME
4. db.password=YOUR_PASSWORD

- Simply run application on your computer. You should Postman API to send Get, Post, Delete, Put requests to the webserver.
