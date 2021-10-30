Prerequisites to run the project:
- Any IDE (Eclipse, Intelli J, NetBeans)
- JDK 11
- Latest Maven
- Git (if the project is in github)
- Docker

Commands to run the project - 
- If the project is in project, clone the project using git clone command `git clone <url>`
- Run the following `mvn` command on the root of the project >`mvn clean install`. This will clean, compile and prepare the package
- OR `mvn spring-boot:run` will perform the above operation along with starting of the application.

To run the project locally, 
- Open `http://localhost:8080/` in the new browser to view the swagger with all the APIs.
- Open `http://localhost:8080/h2` to view in-memory database tables associated with the project

To build a docker image - 
- Execute `docker build -t xyz-shows:latest .` command from root of the project where "xyz-shows:latest" being the name of the image

To run the container from image
- Execute `docker run -d -p 80:8080 -t xyz-shows:latest` command.