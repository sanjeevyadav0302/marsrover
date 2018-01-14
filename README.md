

Assumptions
===========

- When a Plateau is created, the bottom right co-ordinates are always (0, 0)
- The square directly North from (x, y) is (x, y + 1)
- The test input and output is always the same, clean and present, so this doesn't need to be validated

Development Environment
=======================

I developed this in the following application:

- Java SE 1.8
- IntelliJ IDEA 16.0 Community Edition
- MyEclipse Enterprise Workbench 2014 (Eclipse 4.3.1 Based)

3rd Party Libraries Used:
=========================

- Build Tool: Apache Maven 3.5
- Test Tool:  JUnit 4.11

Note - Apache Maven should handle the JUnit dependency, so there should be no need to manually do this. You will however
need to have Apache Maven downloaded locally and point your IDE to your 'M2_HOME' directory.

Execution
=========

To get up and running with the code:

- Import and setup the project in your chosen IDE
- Run the Maven 'clean' and 'install' life cycles, this will run all the tests in Maven and build you a .jar
- Run the MarsRover class, this will test the input and output in the command line

Alternatively you can run the code in the command line, from the root Project folder, in this case inside MarsRover:

Maven:
- This will run a clean, run all of the tests and package a .jar file.
    - mvn clean install

Java:
- This will run the executable .jar file you just packaged with Maven.
    - java -jar target\MarsRover-1.0-SNAPSHOT.jar


