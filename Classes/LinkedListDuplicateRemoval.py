from LinkedListNode import LinkedListNode

def main():
    test = LinkedListNode(0)
    test.add(0)
    test.add(1)
    test.add(2)
    test.printNodes()

    removeDuplicates(test)

def removeDuplicates(node):
    seen = {} 
    temp = node
    print_node = temp

    while (temp.next is not None):
        if seen.has_key(temp.data):
            temp.delete()
        else:
            seen[temp.data] = True

        temp = temp.next

    print_node.printNodes()


main()
