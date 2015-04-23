## LinkedListNode.py
class LinkedListNode(object):
    def __init__(self, data):
        self.data = data
        self.next = None

    def add(self, data):
        beginning = self
        add = LinkedListNode(data)
        while (beginning.next != None):
            beginning = beginning.next
        beginning.next = add

    def delete(self):
        to_delete = self.next
        if self.next is not None:
            self.data = self.next.data
            self.next = self.next.next
        to_delete = None 

    def printNodes(self):
        node = self
        while (node != None):
            print node.data,
            node = node.next
        print "null \n"

