def main():
        values= [3, 2, 1, 0]
        parition(values, 3)
        print values

def parition(values, target):
    equal = 0
    small = 0
    great = len(values) - 1

    while (equal <= great):
        if (values[equal] > target):
            swap(values, equal, great)
            equal += 1
            small += 1
            great -= 1

        elif (values[equal] == target):
            equal +=1

        elif (values[equal] < target):
            swap(values, small, equal)
            equal += 1
            small += 1

def swap(values, one, two):
    temp = values[one]
    values[one] = values[two]
    values[two] = temp

main()
