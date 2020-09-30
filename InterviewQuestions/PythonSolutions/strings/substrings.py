"""
Implement strstr

How do you find the length of the longest substring without repeating characters?
"""



def lengthOfLongestSubstring(s):
    seen = ''
    mx = 0
    for c in s:
        if c not in seen:
            seen+=c
        else:
            seen = seen[seen.index(c) + 1:] + c
        mx = max(mx, len(seen))
    print(seen)
    return mx

print(lengthOfLongestSubstring('abcabc'))


def check(string, sub_str): 
    if (string.find(sub_str) == -1): 
        print("NO") 
    else: 
        print("YES") 
            
# driver code 
string = "geeks for geeks"
sub_str ="geek"
check(string, sub_str) 


def check(s2, s1):  
    if (s2.count(s1)>0):      
        print("YES")  
    else:  
        print("NO")  
              
s2 = "A geek in need is a geek indeed"
s1 ="geek"
check(s2, s1)  

import re 
  
# Take input from users 
MyString1 =  "A geek in need is a geek indeed"
MyString2 ="geek"
  
# re.search() returns a Match object if there is a match anywhere in the string 
if re.search( MyString2, MyString1 ): 
    print("YES,string '{0}' is present in string '{1}' " .format(MyString2,MyString1)) 
else: 
    print("NO,string '{0}' is not present in string {1} " .format(MyString2, MyString1) ) 