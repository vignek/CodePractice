"""
Log Array Pairs
1 / 3 
"""

# Input : [1,2,3,4,5]
# Output : 1,1 1,2 1,3, 1,4 1,5, 2,1 2,2 ... so on.


def logArrayPairs(an_array) :
    
    a_len = len(an_array)
    res = []
    for i in range(a_len-1):
        for j in range(a_len-1):
            temp = (an_array[i],an_array[j])
            res.append(temp)

    return res

an_array = [1,2,3,4,5]

print(logArrayPairs(an_array))

