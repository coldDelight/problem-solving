n = int(input())

books = {}

for _ in range(n):
    book = input()
    if book not in books:
        books[book] = 1
    else:
        books[book] += 1

target = max(books.values())
arr = []

for book, number in books.items():
    if number == target:
        arr.append(book)

print(sorted(arr)[0])
