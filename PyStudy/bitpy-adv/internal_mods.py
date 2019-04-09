def sys_module():
    """
    sys 모듈 : 파이썬 인터프리터 관련
    """
    import sys
    print(sys.platform) # 플랫폼 정보 얻기
    print(sys.version)  # 파이썬 버전정보

    print(sys.path, type(sys.path)) # 파이썬 모듈 검색 디렉터리
    # import 할 때 모듈 위치 검색
    # 모듈 검색 디렉터리를 추가
    sys.path.append("D:\\PyStudy")  # 모듈 임포트시 이 디렉터리 안쪽


def math_module():
    import math
    print(math.pi, math.e)

    # 알고 갑시다!! : round(반올림), trunc(버림)
    print(round(3.56), math.trunc(3.56))
    print(round(3.5678, 2))    # 소수점 특정 자리까지 반올림해서 표시


def re_module():
    import re

    namecards = """
    Email: y00zl@naver.com
    Phone: 010-2399-7797
    
    Email: meajs@naver.com
    Phone: 010-6392-4035
    """

    email_ptrn = r"\w+[\w\.]*@\w+[\w\.\].[a-z]+"

    email_list = re.findall(email_ptrn, namecards)
    print(email_list, type(email_list))

    phone_ptrn = r"[0-9]{3}-[0-9]{4}-[0-9]{4}"
    phone_list = re.findall(phone_ptrn, namecards)
    print(phone_list, type(phone_list))


def random_module():
    import random

    print(random.random())  # 0~1 사이의 실수 난수
    print(random.randint(1,6))  # 1~6 사이의 난수

    print(random.random(100))   # 인자 1개면 끝값만 정의
    print(random.random(1, 100, 3)) # 1부터 100 사이의 step 3인 수 중

    seqver = ["짬뽕", "짜장면", "짬짜면"]
    random.shuffle(seqver)
    print(seqver)

    print(random.choice(seqver))    # 임의로 한개 객체 뽑기

    # 표본 추출 함수
    print(random.sample(range(1, 101), 10))




# sys_module()
# math_module()
# re_module()
random_module()