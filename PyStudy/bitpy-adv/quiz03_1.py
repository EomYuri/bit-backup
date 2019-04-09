total = 0
while True:
    num = input("수를 입력하세요:")
    if num.isdigit()==True:
        num = int(num)
        for i in range(1, num):
            if i % 3 == 0:
                total += i
        print("1부터 ", num,"까지의 3의 배수의 합 = ",total)
        break
    else:
        print("정수가 아닙니다. 다시 입력하세요.")


