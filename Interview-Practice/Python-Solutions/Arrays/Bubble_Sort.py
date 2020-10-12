"""
Bubble Sort
"""


an_array = [0,3,-5,7,11,-1,9,10]

def bubblesort(array):
    
    length = len(array)

    for i in range(length):

        for j in range(length-i-1):

            if array[j] > array[j+1]:
                array[j],array[j+1] = array[j+1], array[j]

    return array

print(bubblesort(an_array))