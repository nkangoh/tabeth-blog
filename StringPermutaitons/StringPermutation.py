def main():
    one = "Hello"
    two = "Mellow"

    print (str(one) + " is a permutation of "  + str(two) + " ? " + str(is_permutation(one, two)))

def is_permutation(string_one, string_two):
    if len(string_one) is not len(string_two):
        return False

    seen = {}
    for i in range(len(string_one)):
        if seen.has_key(string_one[i]):
            seen[string_one[i]] = seen[string_one[i]] + 1
        else:
            seen[string_one[i]] = 1

    for j in range(len(string_two)):
        if seen.has_key(string_two[j]):
            seen[string_two[j]] = seen[string_two[j]] - 1
            if seen[string_two[j]] < 0:
                return False
        else:
            return False

    return True

main()
