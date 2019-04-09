 # 제어문 연습
def if_statement():
     """
     if문 예제
     """
     # 금액을 입력 받고
     # 10000 이상이면 by taxi
     # 1000 이상이면 by bus
     # 그 미만이면 on foot
     money = input("얼마 가지고 있어?")
     money = int(money)

     message = ""

     if money >= 10000:
         message = "by taxi"
     elif money >= 1000:
         message = "by taxi"
     else:
         message = "on foot"

     print("money:", money, message)

def cond_expr():
    """
    조건 표현식 예제
    """
    money = int(input("얼마 가지고 있어?"))
    message = "by taxi" if money >= 10000 else \
                                        "by bus" if money > 1000 else "on foot"
    print("money:", money, message)


def for_ex():
    """
    for loop 연습
    """
    for animal in ["dog", "cat", "cow", "tiger"]:
        print(animal, end=" ")
    else:   # for 루프가 정상적으로 끝났을 때
        print()

    # 반복과 함께 인덱스도 받아와야 할 경우 enumerate
    for index, animal in enumerate(animal):
        print(index, animal)

    # 복합 자료형
    lst = [("홍길동", 90), ("전우치", 80), ("장길산", 95)]
    for item in lst:
        # print(item)
        print("이름:%s, 점수:%d" % item)

    lst = [{"name": "홍길동" , "score": 90}]
    lst = [{"name": "전우치" , "score": 80}]
    lst = [{"name": "장길산" , "score": 95}]
    for item in lst:
        # print(item)
        print("이름:%(name)s, 점수:%(score)d" % item)

    # for문의 else 블록
    r1 = list(range(1, 12, 2))
    print(r1)
    r2 = r1+[12, 13, 15]

    print(r2)
    # 내부에 짝수가 있으면 break
    for i in r2:
        if i % 2 == 0:
            print("짝수를 찾았습니다.")
            break
    else:   # 루프가 안전하게 종료되었을때
        print("짝수는 없습니다.")

    print("삼각형 그리기")
    for i in range(1, 11):
        for j in range(1, i + 1):
            print("*", end="")
        else:
            print()

    for i in range(1,11):
        print("*"*i)





# if_statement()
# cond_expr()
for_ex()