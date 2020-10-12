"""
 For anagram, another string would have the same characters present in the first string, 
 but the order of characters can be different.

 Anagrams
"""


#Example: True
# str1 = "heater";
# str2 = "rhrrrrreat";

#Example: False
str1 = "heater1";
str2 = "2reheat"

def simpleanagram(str1,str2):
    	return sorted(str1) == sorted(str2)


def anagram2(str1, str2):

	str1_dict = {i: 0 for i in str1}
	# print(str1_dict.items())
	str2_dict = {i: 0 for i in str2}
	# print(str2_dict.items())

	for char1,char2 in zip(str1_dict,str2_dict):
		str1_dict[char1] += 1
		str2_dict[char2] += 1
	
	# print(str1_dict.items())
	# print(str2_dict.items())
	
	return (str1_dict == str2_dict)
	
print(anagram2(str1,str2))