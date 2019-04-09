students = [
    {
        "name": "Kim",
        "kor": 80,
        "eng": 90,
        "math": 80
    },
    {
        "name": "Lee",
        "kor": 90,
        "eng": 85,
        "math": 85
    }
]

# •두 학생의 kor, eng, math 합계 점수와 평균을 사전 데이터에 "total", "average" 키값으로 넣어 봅시다.
for i in range(0, 2):
    s = students[i].values()
    s = list(s)
    total = s[1] + s[2] + s[3]
    average = total / 3
    students[i]["total"] = total
    students[i]["average"] = average

print(students)