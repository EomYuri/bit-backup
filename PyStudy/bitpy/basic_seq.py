# 시퀀스형 도움 객체, 함수
# range, enumerate, zip
def using_range():
    """
    range 객체
    """

    # 범위의 생성
    seq = range(10)    # 인자값 1개 -> 끝 경계, 10은 포함 x
    print(seq, type(seq))
    print(list(seq))    # 내부 값들의 확인

    seq = range(2,10)   # 인자값 2개 -> 시작 인덱스, 끝 경계
    print(list(seq))

    seq = range(2, 10, 2)   # 인자값 3개 -> 시작 인덱스, 끝 경계, 증감값
    print(list(seq))

    # 길이 산정 가능
    print(seq, "length:", len(seq))

    # 포함 여부
    print("5 in seq?", 5 in seq)

    # 인덱스 접근
    print(seq[0], seq[1], seq[2])   # 정방향 인덱스
    print(seq[-3], seq[-2], seq[-1])    # 역방향 인덱스

    # 슬라이싱
    print(seq[1:3])
    # seq[1:2] = range(3) # 치환은 불가능 (immutable)

    # for in
    for i in range(2,9):
        print(i, end=" ")
    else:
        print()

def using_enumerate():
    """
    enumerate :  순차 자료형에서 현재 아이템과 내부 인덱스를 함께 사용할 때
    """
    colors = ["red", "green", "blue", "white", "gray"]

    # i = 0
    for index, color in enumerate(colors):
        print("COLOR: {0}, {1}".format(index, color))
        # i += 1

def using_zip():
    """
    zip : 여러 순차형을 함께 다루는 객체
    """
    english = ["red", "green", "blue", "white", "gray"]
    korean = ["빨강", "초록", "파랑", "하양", "회색", "검정"]
    engkor = zip(english, korean)
    print(engkor, type(engkor))

    # zip 객체의 순회
    for pair in engkor:
        print(pair)

    engkor = zip(english,korean)

    # 내부 인덱스와 함께 확인
    for index, (eng, kor) in enumerate(engkor):
        print(index, eng, kor)

    # zip 객체를 이용한 사전 만들기
    print(dict(zip(english, korean)))





# using_range()
# using_enumerate()
using_zip()