from LinkedListNode import LinkedListNode

def main():
    test = LinkedListNode(0)
    test.add(0)
    test.add(1)
    test.add(2)
    test.printNodes()

    remove_duplicates(test)
    remove_duplicates_alt(test)

def remove_duplicates(node):
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


def remove_duplicates_alt(node):
    equal_to_this = node

    while(equal_to_this.next is not None):
        current_node = equal_to_this.next
        while (current_node.next is not None):
            if current_node.data == equal_to_this.data:
                current_node.delete()
            current_node = current_node.next
        equal_to_this = equal_to_this.next
    node.printNodes()
main()
