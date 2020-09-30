"""
Longest Palindrome in a String

Given a number, find the next largest palindrome.  

Find if the string is a palindrome
"""


def isPalindrome1(s):
    return s == s[::-1]
 
 
# Driver code
s = "malayalam"
ans = isPalindrome(s)
 
if ans:
    print("Yes")
else:
    print("No")



def isPalindrome(str):
     
    # Run loop from 0 to len/2 
    for i in range(0, int(len(str)/2)): 
        if str[i] != str[len(str)-i-1]:
            return False
    return True
 
# main function
s = "malayalam"
ans = isPalindrome(s)
 
if (ans):
    print("Yes")
else:
    print("No")