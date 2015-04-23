## LinkedListNode.py
class LinkedListNode(object):
	data = 0
        next = None
    
    def __init__(self, data):
        self.data = data
        self.next = None

    def add(self, data):
        beginning = self
        add = new LinkedListNode(data)
        while (beginning.next != None):
            beginning = beginning.next
        beginning.next = add

    def delete(self):
        to_delete = self.next
        if self.next != None:
            data = self.next.data	
            self.next = self.next.next  
        to_delete = None 
