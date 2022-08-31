# GeeksforGeeksStrings
                                   Navie Soultion for Palindrome Checking
Take the string and creata a temp string of it.
Reverse the temp string.
Compair the temp strng and the main string.


                                    Efficient Soultion for Palindrome Checking
Get the being of the string 
    int being = 0;
Get the last char of the string
    int end = "the string name".length()-1 //this will give you the end of the string
While loop to compair the being string and the end string.
if being string and the end string are not the same >> return false;
if the being string and teh end string are the same we check the next char
    by movings the being pointing to the right. 
    by movings the end pointing to the left.
