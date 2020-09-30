"""
Print duplicate characters in a string
CONFIDENT
"""

# import string


# alphabets = string.ascii_lowercase

a_string = 'abchelloworldtest'

count = {}

for s in a_string:
    if s in count:
        count[s]+=1
    else:
        count[s]=1

print(count.items())