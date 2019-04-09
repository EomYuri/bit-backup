# 정규 표현식에 관한 예제

# 모듈 임포트
import re

#사용법
# 1. 패턴 컴파일 후 사용
# 2. 패턴 객체가 가진 메서드로 작업 수행

source = "Life is too short, You need Python"

# 방법 1: 패턴 컴파일 후 매칭
p = re.compile(r"P[a-z]+") # 대문자 p로 시작하고 a-z 사이 글자가 1개 이상 존재하는지
print(p.match("Life")) # match는 처음부터 일치하는지를 확인

print(p.match("Python"))

# 방법 2: 축약형 - 컴파일과 매칭을 동시에 수행
# 처음 해당하는 단어만 추출
print(re.match(r"[a-z]+", source))
print(re.match(r"[A-Za-z]+",source))

# 안쪽에 매칭된 내용을 추출 : group()
print(re.match(r"[A-Za-z]+", source).group())

# Search
print(re.search(r"Python", source))
print(re.search(r"python", source)) # 정규표현식은 대소문자 구분
print(re.search(r"python", source, re.IGNORECASE)) # 정규표현식의 옵션

# 문자 클래스의 예
pattern = "birth|choice|death"  # 문자열을 |로 묶는 것
print(re.match(pattern, "birth"))
print(re.match(pattern, "choice"))
print(re.match(pattern, "death"))

pattern = r"[B-Db-c][A-Za-z]+"
print(re.match(pattern, "birth"))

# 한국어 무자열 패턴을 매칭
source = "English 대한민국 Japan"
p = re.compile(r"[가-힣]+")   # 유니코드
print(p.findall(source))

# 전화번호 매칭
tel = re.compile(r"(\d{2,3})-(\d{3,4})-(\d{4})") # {2,3} => 2자리, 3자리
m = tel.search("나의 전화번호는 010-2399-7797")
print(m)

print(m.group())
print(m.groups())

tel = re.compile(r"(?P<area>\d{2,3})-(?P<exchange>\d{3,4})-(?P<number>\d{4})")
m = tel.search("나의 전화번호는 010-2399-7797 입니다.")
print(m)

teldict = m.groupdict() # 사전으로 받아올 수 있음
print(teldict)
