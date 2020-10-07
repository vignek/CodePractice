# https://www.hackerrank.com/challenges/list-comprehensions/problem
# Get four integers from user
# Return a list of all possible values that does not sum up to fourth integer

if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())


print([[i,j,k] for i in range(x+1) for j in range(y+1) for k in range(z+1) if(i+j+k != n)])