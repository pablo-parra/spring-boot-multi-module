# spring-boot-multi-module
Spring Boot project based on several spring boot modules (sub-projects) each one pointing to different DBs and configured with different Flyway instances






# DBs with docker

## Drivers db (MySQL)

### Creation of the db container with Docker (first time)
C:\...\_db\docker-MySQL-drivers> docker build -t drivers_db_img:0.0.1 .

C:\...> docker run -d --name drivers_db -p 3306:3306 drivers_db_img:0.0.1

### Start the db container (rest of the times)

C:\...> docker start drivers_db

## Cars db (PostgreSQL)

### Creation of the db container with Docker (first time)
C:\...\_db\docker-postgreSQL-cars> docker build -t cars_db_img:0.0.1 .

C:\...> docker run -d --name cars_db -p 6543:6543 cars_db_img:0.0.1

### Start the db container (rest of the times)

C:\...> docker start cars_db



