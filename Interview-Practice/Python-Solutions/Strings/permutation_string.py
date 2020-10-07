"""
Permutations of a given string

Find if the permutations of a given string can be a palindrome
"""

from itertools import permutations


a_string = 'ABC'

result = set([''.join(x) for x in permutations(a_string)])

print(result)



counter = 0
length = len(a_string)
resultset = []
def permute(a_string, counter, length):
    if counter == length:
        print(''.join(a_string))
    else:
        for j in range(counter, length):
            a_string[counter], a_string[j] = a_string[j], a_string[counter]
            permute(a_string, counter+1, length)
            a_string[counter], a_string[j] = a_string[j], a_string[counter]

permute(list(a_string), counter, length)


