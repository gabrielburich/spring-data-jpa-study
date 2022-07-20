# Spring-data-jpa-study

A simple Spring Data JPA example

## How to start

### Database

Start a postgres instance:

```bash
docker run --name dev-postgres -e "POSTGRES_PASSWORD=postgres" -p 5432:5432 -dt postgres
```

Create the database
```bash
docker exec dev-postgres psql -c "CREATE DATABASE spring_data_jpa_study" -U postgres
```

### Application

Make sure that you have a postgres instance with the created database and just run the application. 
