"""
Reverse the words in a string
Confident
"""

a_string = "I like this"

def reverse_result(a_string):
    result_str = ' '
    rev_array = a_string.split(' ')
    result_str.join(rev_array)
    return rev_array[::-1]

print(reverse_result(a_string))