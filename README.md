# CS_7340_Lab2

# Database Setup

There is a mysqldump "Lab 2 Schema" that contains all of the information of all of the papers from "dblp-soc-papers.xml

To import the mysqldump open up MySql workbench and select the desired MySql Connection. Then click on the administration tab on the Navigator. Under management select the option for "Data Import/Restore". From there navigate to were you saved the "Lab 2 Schema" select it. Insure that all 3 schema objects are selected then press start import.

The Schema should now be properly imported. To insure this type a test query such as "SELECT * FROM papers WHERE bookt_tile = 'ICWS' and year = 2005;"

If for some reason the Schema or the Data fail to load here is the MySQL to create the tables:

CREATE TABLE papers ( paper_id int, title varchar(255) default NULL, book_title varchar(255) default NULL, pages varchar(255) default NULL, year int default NULL, url varchar(255) default NULL, ee varchar(255) default NULL, publisher varchar(255) default NULL, journal varchar(255) default NULL, volume int default NULL, number int default NULL, crossref varchar(255) default NULL, isbn varchar(255) default NULL, primary KEY(paper_id) );

CREATE TABLE authors ( author_id int, author_name varchar(255) default NULL, primary KEY(author_id) );

CREATE TABLE PapersToAuthors( paper_id int, author_id int, foreign KEY(paper_id) REFERENCES papers(paper_id), foreign KEY(author_id) REFERENCES authors(author_id) );

After creating those three tables you can run DatabaseSubmission.java file located in the "XMLParser/src" sub folder. 

**Remember to Change the username and passweord of the backeend at Lines 15 and 16 of the aplication.conf**

# Running the GUI

After running the backend and frontend Play 2 Java frameworks, you will be greeted with two screens in your localhost. The Frontend screen has the UI for the queries. There are Part 1 and Part 2 Queries with buttons for each of their respective queries. 

For Queries 1.3 and 1.4 the outputs are on the terminal of the backend as we could not figure out how to move them to the frontend without errors crashing the application.
