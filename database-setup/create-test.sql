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
(1,1,125000,"San Francisco","Use various Machine Learning techniques to do cool stuff.");

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
("EMPLOYED_AND_SEARCHING", "John Ode", 1)
