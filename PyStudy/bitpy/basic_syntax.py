# 파이선 기본 문법

def arith_oper():
    # 산술 연산자 관련 연습
    print("==== 사칙연산")
    # +, - ,* ,/

    print(7/3) # 정수/ 정수    실수
    print(7//3) # 정수/정수    몫
    print(7%3) # 정수/정수     나머지

    # 몫과 나머지를 함께 전달 divmod(a, b) (몫, 나머지)
    print(divmod(7,3))
    print("몫: ",divmod(7,3)[0])
    print("나머지: ",divmod(7,3)[1])

    # 제곱
    print(7**3)
    print(pow(7, 3))    # 함수 이용 제곱 구하기


def complex_ex():
    print("==== 복소수")
    print(3+4J)
    print(complex(7,3))

    print("실수부: ", 3+4j.real) # 실수부
    print("허수부: ", 3+4j.imag) # 허수부
    print("켤레복소수: ", 3+4j.conjugate()) # 켤레복소수


def rel_oper():
    print("==== 비교 연산자")

    print("1 > 3 ?", 1 > 3)
    s1 = "Python"; s2 = "Python"
    print("문자열 == : ", s1 == s2)

    # 복합 관계식
    a = 5
    print("a > 0 이고 a < 10 ?", 0 < a and a < 10)
    print("a > 0 이고 a < 10 ?", 0 < a < 10) # 복합 관계식


def variable_ex():
    # 변수
    print("==== 변수")
    # 변수명은 문자, 숫자, _의 조합
    # 숫자로 시작하면 안됨
    friend = 3
    a = 10
    name = "둘리"

    # 다른 구성은 사용 불가
    #3abc = 10 # 숫자로 시작불가
    #friend$ = 5 # _ 이외 다른 특수문자는 불허

    가격 = 120000
    print(가격 + 가격*0.1)  # 유니코드 문자 사용가능

    # 파이선의 키워드는 사용 불가
    import keyword
    print(keyword.kwlist)
    print(len(keyword.kwlist))

def assignment_ex():
    print("==== 변수 할당(치환")
    # 기본적인 치환문
    a=1
    b=a+1
    print(a,b)

    # 여러 변수를 한꺼번에 할당
    c,d = 7,3
    print(c,d)

    # 갑의 교환 손쉽게
    c,d = d,c
    print("SWAP: " ,c, d)

def bool_ex():
    print("==== bool 연습")
    # True, False
    # 내부적으로 False 0, 나머지는 True
    # 각 타입별 기본값 False, 값이 설정되었을 때는 True
    # boolean 판정
    print(bool(0),bool(1))
    # 주로 논리 연산 비교 연산의 결과 저장
    a = 10
    print(a, " > 10 ?", a > 10)

    b = a ==10
    print(b, type(b))

    print(b*3)
    print(b, "isinstance bool ?", isinstance(b,bool))
    print(b, "isinstance int ?",isinstance(b,int))

def logical_oper():
    print("==== 논리연산자")

    a=20; b=30
    print(a < b and a != b) # and 연산 -> 둘 다 True 여야 True
    print(a < b or a != b) # or 연산 -> 둘 중 하나만 True이면 True
    print(not(a < b or a != b))

    #bool 캐스팅 -> 값이 설정되어 있는지 판정할 때도 사용
    print(bool(0), bool(10))
    print(bool(""),bool("Python"))
    print(bool([]),bool([1,2,3]))

    # Circuit Break
    print("CB 1: ", [] or "Settings")
    print("CB 2: ", "Internal Settings" or "Outer Settings")

def int_ex():
    print("==== 정수형 연습")
    a= 23; b=int(23)
    print(a, type(a))
    print(b, type(b))
    print(isinstance(a,int), isinstance(b, int))

    # 2진, 8진, 16진 정수에 설정
    b= 0b1101
    o = 0o23
    h = 0xFF

    print(b, o, h)

    # 2진, 8진 16진 문자열 출력
    print(bin(b), oct(o), hex(h))

    # 3.x Long, int 묶어서 int
    # Long 형 저장 크기인 8바이트를 넘긴 수치도 저장
    i = 2**2048
    print(i)
    print(type(i))
    print(i.bit_length(),"bit")


def float_ex():
    print("==== 실수형 연습")
    a = 3.14159
    print(a, type(a))
    print(isinstance(a,float))

    b=float(3)
    print(b, type(b))
    print(isinstance(b,float))

    print(a.is_integer(),b.is_integer())  # 데이터가 정수 형태인지

    # 지수 형태로 표현 가능
    c = 3e3; d = -2E-5
    print(c, d)
    print(-2E-5 == -0.00002) # 같은 표현


def bit_oper():
    print("==== 비트 연산자")
    # 비트 NOT ~ : 1 <-> 0
    print(bin(5),bin(~5))
    # 비트 AND & 비트 OR |
    a = 0b101010
    print(bin(a))
    print(bin(a & 0b1111))
    print(bin(a | 0b1101))

    # 비트 시프트 <<, >>
    bits = 1
    print(bin(bits))
    print(bin(bits << 4))






#arith_oper()
#complex_ex()
#rel_oper()
#variable_ex()
#bool_ex()
#logical_oper()
#int_ex()
#float_ex()
bit_oper()

