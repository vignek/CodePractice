# For anagram, another string would have the same characters present in the first string, but the order of characters can be different.

Example: True
str1 = "heater";
str2 = "rhheat";

Example: False
str1 = "heater1";
str2 = "2reheat"


def anagram(str1, str2):
  str1[] = str1
  str2[] = str2
	strlen = str1.len
	count = 0

  for(i = 0; i<= str1.len-1; i++ ) 
	for(j = 0; j<= str2.len-1; j++ )
	  if (str1[i] == str2[j])
	    count = count + 1
	      break
	    else
	      continue 
	return ( count == result )
