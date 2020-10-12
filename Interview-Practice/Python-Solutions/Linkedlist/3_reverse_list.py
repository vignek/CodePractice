"""
linked list
"""
# 1 [address of 10 ]---> 10 [address of 5]--> 5 [address of 16] --> 16 [None]

# Creating one single node
class Node():

    def __init__(self,data):
        self.data = data
        self.next = None
    

class LinkedList():

    def __init__(self):
        self.head = None
        self.tail = self.head
        self.length = 0

    # Adding values to the last
    def append(self, data):
        new_node = Node(data)
        if self.head == None:
            self.head = new_node
            self.tail = self.head
            self.length = 1
        else:  # How will the tail point to the head ?
            self.tail.next = new_node # address of the last node pointing to new node
            self.tail = new_node # value of last node updated
            self.length += 1

    # Adding values to the beginning of the list
    def prepend(self,data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        self.length += 1


    def insert(self, index, data):
        if (index >= self.length):
            self.append(data)
            return self.print_list()
        else :
            new_node = Node(data)
            leading_node = self.traverse(index-1)
            trailing_node = leading_node.next
            leading_node.next = new_node
            new_node.next = trailing_node
            self.length += 1
            
            return self.print_list()

    def delete_by_index(self,index):
        if( index > self.length  or  self.length == 0 ):
            print('cannot delete')
            return self.print_list()
        elif( self.length == 1 ):
            self.head = None
            self.tail = self.head
            self.length = 0
        else:
            head_node = self.traverse(index-1)
            trailing_node = head_node.next.next
            head_node.next = trailing_node
            self.length -= 1
        return self.print_list()

    
    def traverse(self, index):
        current_node = self.head
        for counter in range(index):
            current_node = current_node.next
        return current_node
        
    def print_list(self):
        an_array= []
        current_node = self.head
        while (current_node != None):
            an_array.append(current_node.data)
            current_node = current_node.next
        return an_array
    
    def reverse(self):
        if(self.length == 1):
            self.print_list()
        else:
            first = self.head
            second = first.next
            self.tail = self.head
            
            while(second):
                temp = second.next
                first = second
                second = temp
            
            self.head.next = None
            self.head = first

        return self.print_list()

new_linked_list = LinkedList()

new_linked_list.append(10)

new_linked_list.append(5)

new_linked_list.append(16)

new_linked_list.insert(2,7)

new_linked_list.delete_by_index(1)

print(new_linked_list.print_list())

new_linked_list.reverse()

