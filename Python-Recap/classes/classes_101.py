"""
Classes and Objects
Everything in Python is an Object
Object is a datastructure
Objects have properties and methods
"""

a_string = "values" # is a string object

a_string.upper() # is a method in string class 

Declaration = "Somewhere, there exists a foo."
Definition = "...and here it is!"


class BikeModels(object): # Class Defenition
    """
    This class prints bike names and models
    """
    touring = True  # Attribute - class variable - Accessible to all instances

    def __init__(self, make, model): # constructor with self for this instance
        self.make = make
        self.model = model

    def put(self): # method of the class 
        print("Make of the bike is: " + self.make) 
        print("Model of the bike is: " + self.model)


refvariable = BikeModels(make='Honda', model='CBR') # Object instantiation 
refvariable.touring = 3

# Accessing class attributes 
# and method through objects 

print(refvariable) # prints the object name
print(refvariable.make)
print(refvariable.model)

print(refvariable.put())

print(refvariable.touring)
print(BikeModels.touring)