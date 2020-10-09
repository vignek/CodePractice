"""
Find Duplicate Characters 
"""
example = 'interview'
# output: 
# i=2
# e=2

# example = testing
# output: t = 2

# example = heellooo

# output:
# e=2
# l=2
# o=3

result = {}

duplicate = []

def duplicate_characters(word):

    for char in word: 
        
        # [i] nterview
        # if result.get(char,None) != None:
        #     result[char]+=1
        # else:
        #     result[char]=1
        
        if char in result: #  i in {} false , {i:1}
                        
             result[char] += 1 # {i:2} 
        
        else:
             result[char] = 1 # {i:1}
        
        # print(result)
    
    for key, value in result.items():
        print (result[key])
        print (result[value])

print(duplicate_characters(example))