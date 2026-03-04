3.2 Hands-on 2: The Interrupted Counter

Why does the error happened? 

- The NullPointerException happened because counterDisplay was set to null, meaning it pointed to no object in memory and then .setText() was immediately called on it, causing Java to crash since you cannot invoke a method on something that doesn't exist.

Exercise 02: 3 Part 2: Interactivity & ViewBinding

Explanation on how I used Java String methods to validate.

-Now, for the password validation the app gets the user's entered password using .getText().toString(). Then the spaces in the password are removed using .trim() to prevent errors with leading/trailing spaces and checks if any field is empty with .isEmpty(). Next, the last two digits of the student ID are obtained by using .substring(studentId.length() - 2) which takes the last two digits and they are appended with "blue" + lastTwo. At the end, they are compared with the entered password using .equals() rather than the '==' as the '==' comparison is for memory address but .equals() compares strings.
