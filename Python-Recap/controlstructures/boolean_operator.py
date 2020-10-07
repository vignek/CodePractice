"""
Boolean Operatos

and , or , not
"""
 # and returns true if both conditions return true
 # or returns true if one of the condition returns true
 # not is a negating operator

"""
 Order of operastions for Boolean operators

 Tip : Break down the expression to True or False and then apply this Precedence Logic
 
"""
# () takes precedence
# not is evaluvated first 
# and is evaluvated second
# or is evealuvated last

truthy = True or not False and False # returs true. 

print(10 < 20 > 30)