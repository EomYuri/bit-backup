// for, while 버전 각각

// 문제 1. 구구단 2단 ~ 9단까지
// for 버전
for(var i = 2; i<=9; i++){
    console.log(i+"단");
    for(var j=1; j<=9; j++){
        console.log(i+"*"+j+"="+(j*i));
    }
    console.log();
}

// while 버전
var dan = 2;
while(dan<=9){
    var num = 1;
    console.log(dan+"단");
    while (num<=9){
        console.log(dan+"*"+num+"="+(dan*num));
        num++;
    }
    console.log();
    dan++;
}
// 문제 2. 역삼각형 출력
/*

*****
****
***
**
*

*/
// for 버전
for(var row = 5; row >= 0; row--){
    var stars = "";
    for(var col = 1; col <= row; col++){
        stars += "*";
    }
    console.log(stars);
}

// while 버전
var row = 5;
while(row > 0){
    var stars = "";
    var col = 1;
    while(col <= row){
        stars += "*";
        col++;
    }
    console.log(stars);
    row--;
}