CSD402 - Module 8 ArrayList Assignment
Student: Jadon Argo
Source file: JadonArrayListTest.java

Overview:
The program prompts the user for integer values until 0 is entered.
It includes the terminating 0 in the ArrayList, passes the list to the
required public static Integer max(ArrayList list) method, and displays
the largest value. An empty list returns 0.

To compile and run (JDK 21):
  javac JadonArrayListTest.java
  java JadonArrayListTest

Example input: 5, 12, -3, 0
Expected list: [5, 12, -3, 0]
Expected maximum: 12

Additional automatic tests:
  Empty list -> 0
  [-8, -3, -12] -> -3

Note: Because the assignment requires 0 to be included, a user-entered
list of negative values will have a maximum of 0. The negative-only
automatic test verifies that the max method also works without a zero.

Repository: https://github.com/FliporFlop1/csd-402
Suggested location in repository: module-8/JadonArrayListTest.java
Module 8 Git documentation: Verified ArrayList program and repository submission.
