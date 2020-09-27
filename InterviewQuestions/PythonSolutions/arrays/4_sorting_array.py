"""
Sorting an array of numbers without sort function
Confident
"""


unsorted_number = [11,7,3,0,-6,-1,-12]

sorted_number = []

def sort_list(unsortedNumbers):

    while unsortedNumbers:

        minium = unsortedNumbers[0]

        for value in unsortedNumbers:
            if value < minium:
                minium = value

        sorted_number.append(minium)
        unsortedNumbers.remove(minium)

sort_list(unsorted_number)

print(sorted_number)
