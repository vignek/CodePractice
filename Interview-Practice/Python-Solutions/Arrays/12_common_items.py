"""
Array of two items 
Common items exist or not
"""
def isItemPresent(array_1, array_2):
    for i in range(len(array_1)):
        for j in range(len(array_2)):
            if array_1[i] in array_2[j]:
                return True
    return False 


print(isItemPresent(['a','b','c','x'], ['z','y','i']))

print(isItemPresent(['a','b','c','x'], ['z','y','x']))

print()

def isItemPresentusingDictionaries(array_1, array_2):
    result = {}

    for i in array_1:
        if i not in result.keys():
            result[i] = True

    for item in array_2:
        if item in result.keys():
            return result[item]
    
    return False

print(isItemPresent(['a','b','c','x'], ['z','y','i']))

print(isItemPresentusingDictionaries(['a','b','c','x'], ['z','y','x']))
