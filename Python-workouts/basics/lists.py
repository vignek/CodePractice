
"""
Lists Data type
can store variables in a sequence 
Square braces. Can store multiple data types
"""
car = [1,2,3,4]
# print(car[2])
empty = []

car.append("Benz") # appends to the end of the list
# print(car)

car.insert(1, "jeep") # Inserts at a particular index
# print(car)

# x = car.index("honda") # finds index of item in the list
# print(x)

cars = ["bmw", "honda", "audi"]

y = cars.pop() # removes from the end - returns output

# cars.remove('item') # does not return anything.

slicing = cars[0:2] # slices items 0,1 of the list

cars.count(2) # returns no of times items exist in a list