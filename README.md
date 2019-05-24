# ProximitySearcher




Algorithm:

Create variables for the following:

Step 1:
input string val- The String that will be passed as input
search variables ss1 and ss2 - the 2 search strings which are used for the proximity search.
range - the distance between the 2 strings withing the range
counter - to store the value of number of times the keywords exist in the document within the given range

Step2:
Use split function to breakdown the words into array items.

Step3:
The for loop i iterates for each word in the array. For each word, compares and finds if it matches the ss1. 
the for loop j finds the match pair ss2 from the current location of ss1 until the range is met. When a match is found, then increment the counter by 1 . 

Ste4:
the same steps from Step3 are repeated for the viceversa case. When the first search element is ss2, then look for the matching ss1 withing the range. When a match is found, then increment the counter by 1 

Step5:
the for loop  k is to repeat step4 and 5 for all the elements in the array

Step6: 
When Counter is 0, which means No match was found. 
When Counter > 0, which means match was found

