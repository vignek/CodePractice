
"""
Order of Operations 
()  **  * / % // + - << >> & ^ |   <= < >= >
"""

# Arithmetic Order of operations example : 
a = 20
b = 10
c = 15
d = 5
e = 0

e = a + (b * c) / d;  # 20 + ( 10 * 15 ) / 5  = 20 + 150 / 5 = 20 + 30 = 50
e = ((a + b) * c) / d;  # ( (20+30) * 15 ) / 5 = (30 * 15) / 5 = 600 / 5 = 120

# ** exponent. one raised to the power of the over.
# % is Modulo and it return remainder