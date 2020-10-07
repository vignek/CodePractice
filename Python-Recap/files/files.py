"""
File Object
w - write only mode
r - ready only mode
r+ - read and write mode
a - Append Mode
"""

my_list = [1,2,3]


my_file = open('sample.txt','w')

for items in my_list:
    my_file.write(str(items))

my_file.close()


"""
File Demo 2
.read() -> will read the file
.readline() -> will read the file line by line - use loop and conditions
"""

my_file = open('sample2.txt', 'w')

print(str(my_file.read()))

my_file.close()


"""
With Open - no need to close explicitly
"""

with open('sample2.txt', 'w') as writing:
    writing.write('More text')

print('reading complete')

with open('sample.txt', 'r') as reading:
    print(str(reading.read()))

print('writing complete')