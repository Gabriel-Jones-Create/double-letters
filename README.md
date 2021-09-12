# Double Letters

Write a program in a single class called DoubleLetters that does the following:
The program should read in a single line of text from the keyboard. It should then print to the console the same line of text with these changes: Letters should be doubled. Exclamation points (!) should be tripled. All other characters appear as they do in the input string.

The objectives of this assignment are to:

- Be able to read text input from the keyboard using a Scanner object.
- Be able to traverse the characters in a String using String class methods and a for loop.
- Be able to use an if statement in a loop.

Example 1: if the input text is:

`Hey! My car can't move!!`

Then your program should print:

`HHeeyy!!! MMyy ccaarr ccaann'tt mmoovvee!!!!!!`

Example 2: if the input text is:

`Hello, I have 9 of them!`

Then your program should print:

`HHeelllloo, II hhaavvee 9 ooff tthheemm!!!`

note: concatenating a char onto a String requires that you add an empty String so the char is treated as a character and not a number. Example: newStr = newStr + "" + curChar;

Another approach: simply print the answer character by character as you traverse the input string.
Hint:
When is a character a letter? There is more than one way to tell.

Look up the Character class in the [Java API](https://docs.oracle.com/javase/7/docs/api/). There is a method that would be very helpful.

## Tip: Scanner

Use [Scanner](https://www.w3schools.com/java/java_user_input.asp) to read from the keyboard.

If
`scan`

is a Scanner object, then
`String inputStr = scan.nextLine();`

will read an entire line from the keyboard, and copy it to the String inputStr.
