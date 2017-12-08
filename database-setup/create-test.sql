CREATE DATABASE findmeajob;
USE findmeajob;

CREATE TABLE Postings
(
 postingID int,
 companyID int,
 salary int,
 location text,
 description text
);

INSERT INTO Postings (postingID, companyID, salary, location, description)
 VALUES
(1,1,100000,"Denver","Machine Learning job, work with various types of NN for computer vision applications.");
INSERT INTO Postings (postingID, companyID, salary, location, description)
 VALUES
(2,2,125000,"San Francisco","Use various Machine Learning techniques to do cool stuff.");
INSERT INTO Postings (postingID, companyID, salary, location, description)
 VALUES
(3,3,50000,"Washington","Sales manager.");

CREATE TABLE Jobseeker
(
 jobStatus varchar(22),
 username text,
 userID int
);

INSERT INTO Jobseeker (jobStatus, username, userID)
 VALUES
("UNEMPLOYED", "John Doe", 1);
INSERT INTO Jobseeker (jobStatus, username, userID)
 VALUES
("EMPLOYED_AND_SEARCHING", "John Ode", 2);
INSERT INTO Jobseeker (jobStatus, username, userID)
 VALUES
("UNEMPLOYED", "Elvis Presley", 3);
INSERT INTO Jobseeker (jobStatus, username, userID)
 VALUES
("EMPLOYED", "Queen Elizabeth", 4);

CREATE TABLE Company
(
 username text,
 companyID int
)

INSERT INTO Company (username, companyID)
 VALUES
("Websales Incorporated", 1);
INSERT INTO Company (username, companyID)
 VALUES
("FindMeAJob Development", 2);
INSERT INTO Company (username, companyID)
 VALUES
("Tech Startup CO", 3);
