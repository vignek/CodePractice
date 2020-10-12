"""
Reverse String
"""

a_string = "I like this"

# Solution 1

def reverse_one(a_string):
    result = []
    str_list = []
    str_list.extend(a_string)
    
    for i in range(len(str_list)-1, 0, -1):
        result.append(str_list[i])
    
    return ''.join(result)


# print(reverse_one(a_string))

# Solution 2 

def reverseString(input):
    result = []
    return (''.join([result.extend(input)][::-1]))

# Solution 3

def resverseBuiltIn(input):
    return input[::-1]


# Solution 4 - Reverse Word

def reverse_result(a_string):
    result_str = ' '
    rev_array = a_string.split(' ')
    result_str.join(rev_array)
    return rev_array[::-1]


# Solution 5 - Reverse using Recursion

def recursive_reverse(a_string):

    def helper(left, right):
        # if left == right:
        #     return
        if left < right:
            a_string[left], a_string[right] = a_string[right], a_string[left]
            helper(left+1, right-1)
    
    helper(0, len(a_string)-1)


# print(recursive_reverse(['hello world!']))


def reverseString(s):
    def helper(left, right):
        if left < right:
            s[left], s[right] = s[right], s[left]
            helper(left + 1, right - 1)

    helper(0, len(s) - 1)

input = ['h','e','l','l','o']

reverseString(input)

print(input)

# print(resverseBuiltIn('hello world!'))

# print(reverseString(a_string))