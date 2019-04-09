# 람다 : 익명함수
def myfunc(x):
    return x ** 2


print(myfunc(5))

for i in range(10):
    print("{0}:{1}".format(i, myfunc(i)), end=" ")
else:
    print()

print(lambda x: x ** 2(5))


for i in range(10):
    print("{0}:{1}".format(i, (lambda x: x**2)(i)), end=" ")
else:
    print()


strings = "Life is too short, you need Python".upper().replace(",","").split()
print(strings)

strings.sort(key = lambda  s:len(s))
print("SORT by length:", strings)

