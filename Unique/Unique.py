def main():
    message = "Do I have repeat characters?"
    print "Am I unique?"
    print is_unique(message)

def is_unique(message):
    seen = {} ## Python dictionary
    for i in range(0, len(message)):
        if seen.has_key(message[i]):
            return False
        else:
            seen[message[i]] = 0
    return True  

main()
