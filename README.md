# Strings

>This repository was created for homework in lessons №9 - "Strings".
## Tasks

### Mandatory tasks:
0. Write a program with the following functionality:  
   Pass a string as input (we will assume that this is the document number).  
   The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter.  
   Display the first two blocks of 4 digits on one line.  
   Display the document number, but replace blocks of three letters with " "(each letter will be replaced with " ").  
   Display only one letter from the document number in the format yyy/yyy/y/y in lowercase.  
   Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase (implemented using the StringBuilder class).  
   Check whether the document number contains the sequence abc and whether the message contains it or not (and abc and ABC are considered the same sequence).  
   Check if the document number begins with the sequence 555.  
   Check whether the document number ends with the sequence 1a2b.  
   Implement all these methods in a separate class in static methods, which will take as input (input parameter) the string entered as input to the program.  \
   
1. Given a string of arbitrary length with arbitrary words.  
   Find the shortest word in a line and display it on the screen.  
   Find the longest word in a line and display it on the screen.  
   If there are several such words, then print the last one.
   
2. Given a string of arbitrary length with arbitrary words.  
  Find a word in which the number of distinct characters is minimal. The word can contain letters and numbers. If there are several such words, find the first one.  
  For example, in the string "fffff ab f 1234 jkjk" the word found should be "fffff".
 
3. Given a string of arbitrary length with arbitrary words.  
   Write a program to check whether any selected word in a string is a polyndrome.  
   For example, there is a line, the number 3 is entered, which means you need to check whether the 3rd word in this line is a polyndrome.  
   Provide warning messages in case of error situations: for example, there are 5 words in a line, and the number 500 was passed to the program input, etc. situations.

4. An arbitrary string is given.  
   Print a new line to the console, which duplicates each letter from the initial line.  
   For example, "Hello" -> "HHeelllloo".  
