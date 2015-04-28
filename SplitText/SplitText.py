# SplitText.py

def main():
    dictionary = set()
    dictionary.add('hell')
    dictionary.add('hello')
    dictionary.add('other')
    dictionary.add('there')
    word = 'hellother'
    answer = split_text(word, dictionary, len(word))
    print answer

def split_text(word, dictionary, length):
    if dictionary.__contains__(word):
        return word + str(" ")

    for i in range(1, len(word)):
        candidate = split_text(word[:i], dictionary, length) + \
                split_text(word[i:], dictionary, length)

        if value_sum(candidate) == length:
            return candidate

    return ""

def value_sum(word):
    value = 0
    for i in range(len(word)):
        if word[i] != " ":
            value += 1

    return value

main()
