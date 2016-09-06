# Titanic
CMIS 141 Final Project

This assignment demonstrates your understanding of the concepts from the CMIS 141 class.
Before attempting this project, be sure you have completed all of the reading assignments, hands-on
labs, discussions, and assignments to date.
1. (25 points) Design, implement and test a Java application that will read a file containing data
related to the passengers on the Titanic. The description of the file is shown below. The
application should provide statistical results on the passengers including:
a. Total number of passengers on the Titanic
b. Percentage of passengers who perished on the Titanic
c. Percentage of Passengers who survived the sinking of the Titanic
d. Percentage passengers who survived the sinking of the Titanic as a function of the
passenger class (e.g. 1,2,3)
e. A list of the names of passengers who were less than 10 years old who perished on the
Titanic
f. The count of the number of passengers as a function of the first letter of their last name.
(e.g., A: 13, B:33 …)
g. At least one additional statistical results you add to enhance the functionality
The following are some design criteria and specific requirements that need to be addressed:
a. Use command line arguments to send in the name of the Titanic file.
b. Use a 2D array to store the Titanic data. (Hint: You will probably need to store the array
as String values and then convert to other types as needed since some data is null)
c. You should create at least 2 Java classes – Titanic and TestTitanic. You are welcome to
create additional classes if you want to further separate the functionality.
d. You should create separate methods for each of the required functionality. (e.g.
getTotalPassengers() will return the total number of passengers on the Titanic.)
e. A user-friendly and well-organized menu should be used for users to select which data
to return. A sample menu is shown in run example. You are free to enhance your design
and you should add additional menu items and functionality.
f. The menu system should be displayed at the command prompt, and continue to
redisplay after results are returned or until Q is selected. If a user enters an invalid menu
item, the system should redisplay the menu with a prompt asking them to enter a valid
menu selection
g. The application should keep track of the elapsed time (in seconds) between once the
application starts and when the user quits the program. After the program is exited, the
application should provide a prompt thanking the user for trying the Titanic program
and providing the total time elapsed.
Here is sample run:
java TestTitanic Titanic.txt
2
********** Welcome to the Titanic Statistical Application **************************
Enter the number of the question you want answered. Enter ‘Q’ to quit the program :
1. How many passengers were on the Titanic?
2. What percentage of passengers perished on the Titanic?
3. What percentage passengers survived the sinking of the Titanic?
4. What percentage of passengers survived for each of the three classes?
5. What specific passengers who were less than 10 years old survived the sinking of the titanic?
6. For each letter in the alphabet, how many passengers last names started with that letter?
Q. Quit the program
Enter your selection: 1
There were 1310 Passengers on the Titanic.
Enter the number of the question you want answered. Enter ‘Q’ to quit the program :
1. How many passengers were on the Titanic?
2. What percentage of passengers perished on the Titanic?
3. What percentage passengers survived the sinking of the Titanic?
4. What percentage of passengers survived for each of the three classes?
5. What specific passengers who were less than 10 years old survived the sinking of the titanic?
6. For each letter in the alphabet, how many passengers last names started with that letter?
Q. Quit the program
Enter your selection: Q
Thank you for trying the Titanic Program.
Elapsed time in seconds was: 95
