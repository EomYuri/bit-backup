# 문자열 연습
def define_str():
    """
    이 함수는 문자열 정의에 대한 도움말 문자열입니다.
    """

    # 한 줄 문자열의 정의
    s1 = "Hello Python" # 직접 리터럴
    s2 = str('Hello Python')
    s3 = str(3.14159)

    print(s1, s2, s3)
    print(type(s1), type(s2), type(s3))

    print(s1, "is str instance?", isinstance(s1, str))

    #  여러 줄 문자열
    s4 = """Life is too short, you need Python.
여러 줄 문자열
여러 줄 문자열은 함수 docstring으로도 활용
여러 줄 문자열은 여러 줄 주석으로도 활용
"""
    print(s4)

def sting_oper():
    """
    문자열 연산 연습
    """
    print("==== 문자열 연산 연습 함수")
    s = "Life is too short, you need Python!"

    # 시퀀스형의 길이
    print("str length: ", len(s))
    # 인덱스를 이용한 접근
    print(s[0], s[1], s[2], s[3])  # 정방향 인덱스
    print(s[-7], s[-6], s[-5])  # 역인덱스

    # 문자열은 immutable(변경 불가) 자료형
    # str[0] = "l" -> 내부 자료 변경 불가

    # 슬라이싱
    print(s[12:17])
    print(s[-7:-1])
    print(s[ :17]) # 처음부터 슬라이싱
    print(s[-7:])  # 끝까지 슬라이싱
    print(s[:])    # 모두 생락하면 시퀀스 전체

    # 연결 (+)
    print("Python"+" "+"Programming")
    print("Python" + str(3))

    # 반복 (*)
    print("Python"*3)

    # 포함 여부 : in, not in
    print("p" in s)
    print("p" not in s)

def transform_methods():
    """
    대소문자 변환관련 메서드들
    """

    print("==== 변환메서드")

    s = "i like Python"
    print("upper:",s.upper())   # 모두 대문자
    print("lower:",s.lower())   # 모두 소문자
    print("swapcase:", s.swapcase())    # 대문자 <-> 소문자
    print("capitalize:", s.capitalize())    # 문장의 첫 글자만 대문자로
    print("title:", s.title())  # 각 단어의 첫 글자 대문자로


def search_methods():
    """
    검색 메서드 관련
    """
    s = "I Like Python, I Like Java"
    print("count:", s.count("Like"))    # 검색어 개수 반환
    print("find:", s.find("Like"))      # 정방향 검색
    print("find:", s.find("Like", 3))   # 3번 인덱스 이후의 검색
    print("find:", s.find("JS"))        # 없는 객체의 검색 -1

    print("index:", s.index("Like"), s.index("Like", 3))
    # print(s.index("JS"))  # 없으면 ValueError
    if "JS" in s : print("index:", s.index("JS"))

    # 역방향 검색 : r
    print("rfind:", s.rfind("Like"))
    print("rfind:", s.rfind("Like",0,17))   # 역방향 검색을 위한 범위 설정

    # 특정 문자열로 시작하거나 끝나는지 검색
    url = "http://naver.com"    # 일반 접속
    surl = "https://google.com"     # 보안 접속
    ftp = "ftp://ftp.naver.com"

    print("startswith url:", url.startswith("http://"))
    print("startswith surl:", surl.startswith("https://"))
    print("endswith url:", url.endswith("naver.com"))
    print("endswith surl:", surl.endswith("naver.com"))

    # 범위 지정가능
    print("startwith frp:", ftp.startswith("ftp", 6, 20))


def modify_replace_methods():
    """
    수정 및 치환 메서드
    """
    s = "   Alice and the Heart Queen   "
    print("strip:[", s.strip(), "]", sep="")    # 양쪽의 공백문자 제거
    print("lstrip:[", s.lstrip(), "]", sep="")  # 왼쪽 공백문자 제거
    print("rstrip:[", s.rstrip(), "]", sep="")  # 오른쪽 공백문자 제거

    s = "=============Alice and the Heart Queen============"
    print("strip =:[", s.strip("="), "]", sep="")   # = 문자를 제거

    s = "I Like Java Language"
    print("replace:", s.replace("Java", "Python"))

    print("original:", s)   # 원본은 바뀌지 않는다


def align_methods():
    """
    문자열 정렬 관련 메서드
    """
    s = "Alice and the Heart Queen"

    print("center:", s.center(60), "J", sep="")
    print("ljust:[", s.ljust(60, "*"), "]", sep="")
    print("rjust:[", s.rjust(60, "*"), "]", sep="")

    print("zfill:[", "123".zfill(5), "J", sep="")
    print("zfill:[", "12345678".zfill(5), "J", sep="")


def split_join_methods():
    """
    자르기와 합치지
    """

    s = "Ham and Cheese and Bread and Ketchup"
    ingredients = s.strip(" and ")
    print(ingredients, type(ingredients))
    print("join:", ",".join(ingredients))   # 합치기

    # 자르기를 할 때 자를 객체의 수를 지정
    print(s.split(" and ", 2))
    print(s.rsplit(" and ", 2))

    lines = """
    Java
    Python
    HTML
    """

    print("lines split:", lines.split())
    print("lines splitlines:", lines.splitlines())
    print("lines splitlines:", lines.splitlines(True))


def check_methods():
    """
    is 계열 메서드: 특정 포맷인지 판단
    """
    print("1234".isdigit()) # 숫자 형태인가
    print("Python".isalpha())   # 알파벳 형태인가
    print("Python3".isalnum())  # 알파벳 + 숫자 형태인가
    print("Python 3".isalnum())  # -> False

    print("PYTHON".isupper())   # 대문자 형태인가
    print("python".islower())   # 소문자 형태인가
    print("Python Programming".istitle())   # 제목 형태인가


def string_format():
    """
    문자열 포맷 연습
    """
    # C스타일의 포맷 문자열
    print("현재 이자율은 %f 입니다." %1.24)
    print("현재 이자율은 %.2f 입니다." % 1.24)   # f 포맷 문자열의 지정

    fmt = "%d개의 %s 중 %d개를 먹었다"
    print(fmt % (10, "사과", 3))  # 튜플로 포매팅

    # named formatting
    fmt = "%(total)d개의 %(fruit)s 중에 %(eat)d 개를 먹엇다."
    print(fmt % {"total": 10, "fruit": "사과", "eat": 3})
    print(fmt % {"fruit": "오렌지", "eat": 5, "total": 12})

    # format 메서드 이용
    fmt = "{}개의 {} 중에 {}개를 먹었다."    # 플레이스 홀더
    print(fmt.format(10, "사과", 3))
    fmt = "{0}개의 {1} 중에 {2}개를 먹었다."
    print(fmt.format(10, "사과", 3))

    fmt = "{total} 개의 {fruit} 중에 {eat} 개를 먹었다."
    # 인자값을 이용한 포매팅
    print(fmt.format(total=10, eat=3, fruit="귤"))
    # 사전을 이용한 named 포매팅
    print(fmt.format_map({"total": 10, "fruit": "사과", "eat": 3}))







# define_str()
# sting_oper()
# transform_methods()
# search_methods()
modify_replace_methods()
# align_methods()
# split_join_methods()
# string_format()