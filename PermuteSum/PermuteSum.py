## PermuteSum.py
def main():
    values = set()
    length = 3
    sum_value = 5
    value_set = [0, 1, 2, 3]
    empty = []
    permute_sum(value_set, length, sum_value, values, empty, length)

def permute_sum(value_set, length, sum_value, values, x, original_length):
    if (len(x) == original_length and sum(x) == sum_value):
        values.add(x.__str__())

    i = 0
    while i < len(value_set) and length > 0:
        y = list(x) + [value_set[i]]
        permute_sum(value_set, length - 1, sum_value, values, y, original_length)
        i += 1

main()

