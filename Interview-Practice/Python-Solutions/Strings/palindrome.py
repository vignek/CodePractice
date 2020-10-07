"""
Longest Palindrome in a String

Given a number, find the next largest palindrome.  

Find if the string is a palindrome
"""


def isPalindrome1(s):
    return s == s[::-1]
 
 
# Driver code
s = "malayalam"
# ans = isPalindrome(s)
 
# if ans:
#     print("Yes")
# else:
#     print("No")



def isPalindrome2(str):
     
    # Run loop from 0 to len/2 
    for i in range(0, int(len(str)/2)): 
        if str[i] != str[len(str)-i-1]:
            return False
    return True
 
# main function
s = "malayalam"
# ans = isPalindrome(s)
 
# if (ans):
#     print("Yes")
# else:
#     print("No")


"""
Palindrome w/o special characters
"""

sample_input = 'malayal#am2'


def firstPos(str, start, end): 
  
    firstChar = -1
  
    for i in range(start, end + 1): 
        if (str[i] >= 'a' and str[i] <= 'z') : 
            firstChar = i 
            break
  
    return firstChar 
  
def lastPos(str, start, end): 
  
    lastChar = -1
  
    for i in range(start, end - 1, -1) : 
        if (str[i] >= 'a' and str[i] <= 'z') : 
            lastChar = i 
            break
  
    return lastChar 

def isPalindrome(a_string):

    firstChar = 0
    lastChar = len(sample_input)-1
    ch = True

    for i in range(lastChar+1):
        firstChar = firstPos(a_string, firstChar,lastChar)
        lastChar = lastPos(a_string, firstChar, lastChar)

        if(lastChar < 0 or firstChar < 0):
            break

        if(a_string[firstChar] == a_string[lastChar]):
            firstChar += 1
            lastChar += 1
            continue

        ch = False
        break

    return(ch)
