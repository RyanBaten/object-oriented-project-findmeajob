# FindMeAJob

## Project Contributors

Zaid Alali, Justin Chin, Ryan Baten

## Demo Requirements

java-8-openjdk-amd64

mysql java library (libmysql-java is the apt-get package name on ubuntu)

mysql 5.7.20

## Setting up the demo database:

cd database-setup

./setup.sh mysqlUser

(mysqlUser must have permission to create a database)

All sql commands executed by the setup can be seen in 
database-setup/create-test.sql
