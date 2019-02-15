# Project-1
First in my project I made a HammingDist class. The purpose of this class was to read the file given and to compare the
chars of the given cities. First I initialized variables for the first and second city, along with an ArrayList. 
I then made a bufferedreader in order to read in the file and I used a while loop to save the contents of the file into 
the hammingArray ArrayList.

I then created four different boolean methods that would compare each of the chars in the cities given and it would return
true if the two chars being compared were equal. Otherwise it would return false.

In the toString method I inititalized the distance and other variables that I used to compute the different nodes for the
different cities. I started off by finding the distance between the two given cities. I did this by using the previous boolean
methods, which ever methods had returned false would then be added up, and that total would be the distance between them.

I then created a for loop that would compare city 1 to the other cities that were in the hammingArray ArrayList.
I did this by creating a count variable that would keep track of how many differences there were in the chars of the cities
being compared, it would then be reset to 0 at the beginning of the next loop. I had each char of city 1 compared to the char
in the same position of the other cities in the ArrayList. If the char was the same then the count would stay the same, if the
char was different then count would increase by one. This was used for all 4 chars. At the end of each loop I used if 
statements to determine how many of the chars were different between the cities that were being compared, that would give me
the number of nodes for city 1 that would be shown in the formatted string. I used this same method to find the nodes for city
2.

I used the format given and used String.format to write the output and the variables that would replace it's corresponding 
part in the output. This allowed for the output to be formatted correctly with the right information in the correct
positions.
