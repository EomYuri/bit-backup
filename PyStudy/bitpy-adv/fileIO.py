def create_home():
    dir = "D:\\PyStudy\\samples"

    import  os  #
    if not os.path.exists(dir):
        os.makedirs(dir)            # 디렉터리 생성
        print("created : ", dir)
    else:
        print("이미 존재합니다.")

def write_text():
    fname = "D:\\PyStudy\\samples\\test.txt"

    f = open(fname, "w")        # t는 생략 가능
    size = f.write("Life is too short , You need Python")
    print("written size : " , size)
    f.close()

    # 여러 줄을 write
    f = open("D:\\PyStudy\\samples\\multilines.txt", "w",encoding="utf-8")
    for i in range(100):
        f.write("Line %d\n" %i)
    f.close()


def read_text():
    f = open("D:\\PyStudy\\samples\\multilines.txt" , "rt",encoding="utf-8")
    text = f.read()
    print(text)
    f.close()

    # 줄단위로 불러오기     : 대량의 텍스트 파일처리에는 줄 단위로
    f=open("D:\\PyStudy\\samples\\multilines.txt" , "rt",encoding="utf-8")
    while True:
        line = f.readline()     # 파일로부터 한줄읽기
        if not line:    # 읽어온 값이 없으면 루프 탈출
            break
        print(line)
    f.close()

    # 편의 : 내용을 불러와서 자동으로 줄단위 리스트로 변환
    # readlines
    f = open("D:\\PyStudy\\samples\\multilines.txt", "rt", encoding="utf-8")
    lines = f.readline()
    # print(lines)

    for line in lines:
        print(line.strip())
    f.close()


def practice():     # 응용
    """
    sangbuk.csv 로부터 내용을 읽어와서 각 선수별 리스트로 만들어 출력
    """
    f = open("D:\\PyStudy\\samples\\sangbuk.csv", "rt", encoding="utf-8")
    members = []         # 빈리스트

    while True:
        line = f.readline()  # 파일로부터 한줄읽기
        if not line:  # 읽어온 값이 없으면 루프 탈출
            break
        #print(line)
        line = line.strip().replace(" ","")
        info = line.split(",")     # 문자열  ->  배열

        member = {"name" : info[0],"number" : info[1], "height" : info[2], "position" : info[3]}
        members.append(member)

    print(members)
    f.close()

def binary_copy():
    """
    이진 파일을 열어서 다른 이름으로 복사
    """
    f = open("D:\\PyStudy\\samples\\rose-flower.jpeg", "rb")
    data = f.read()
    f.close()

    f_dest = open("D:\\PyStudy\\samples\\rose-flower-copy.jpeg", "wb")
    f_dest.write(data)
    f_dest.close()

def using_with():
    with open("D:\\PyStudy\\samples\\multilines.txt") as f:
        for line in f.readlines():
            print(line.strip())

    print("is file closed?", f.closed)  # 파일이 자동으로 닫혔는지 확인


def using_pickle():
    f_name = "D:\\PyStudy\\samples\\players.bin"
    data = {"baseball": 9}

    import pickle

    # data를 피클로 저장해 봅시다.
    with open(f_name, "wb") as f:
        pickle.dump(data, f)
        pickle.dump({"soccer": 11}, f, 2)   # 프로토콜 버전 지정: 2
        pickle.dump({"basketball": 5}, f, pickle.HIGHEST_PROTOCOL)

    # 피클 데이터 불러오기
    with open(f_name, "rb") as f:
        print(pickle.load(f))
        print(pickle.load(f))
        print(pickle.load(f))
        # print(pickle.load(f)) # 불러올 때는 프로토콜 버전 필요 없음
        result = []
        while True:
            try:
                data = pickle.load(f)
                result.append(data)
            except EOFError:
                # 더이상 불러올 내용이 없는 경우
                break

        print(result)




# create_home()
# write_text()
# read_text()
# practice()
# binary_copy()
# using_with()
using_pickle()