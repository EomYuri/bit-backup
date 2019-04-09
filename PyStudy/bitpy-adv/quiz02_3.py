total= 0
while True:
    message = input("method:")
    if message == "q":
        break
    elif message == "d":
        money = int(input("Amount:"))
        total += money
        print("Balance:", total)
    elif message == "w":
        money = int(input("Amount:"))
        total -= money
        print("Balance:",total)
    else:
        print("?")