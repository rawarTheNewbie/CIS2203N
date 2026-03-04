3.2 Hands-on 2: The Interrupted Counter

Why does the error happened? 

- The NullPointerException happened because counterDisplay was set to null, meaning it pointed to no object in memory and then .setText() was immediately called on it, causing Java to crash since you cannot invoke a method on something that doesn't exist.
