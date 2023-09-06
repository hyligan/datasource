FROM postgres
ENV POSTGRES_USER myuser
ENV POSTGRES_PASSWORD mysecretpassword
EXPOSE 5432:5432
ENV POSTGRES_DB shopdb

#docker build -t pg/dev12:v1 .
#docker run --name pg_dev12 -d -p 5432:5432 pg/dev12:v1