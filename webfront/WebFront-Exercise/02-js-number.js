// JavaScript의 Number
var n1 = 5; // Niteral (소스에 직접 입력)
var n2 = Number(5); // Number 객체 이용

console.log(n1, "==", n2, "?", n1 == n2);
console.log(n1, typeof n1);
console.log(n2, typeof n2);

// 다양한 형태의 수치 데이터 입력
var red = 0xFF0000; // 16진수
var oct = 0o10;     // 8진수
console.log(red, oct);

// 수치 함수의 활용
console.log(Math.PI);   // 수학 상수들
console.log(Math.max(1,2,3,4,5), Math.min(1,2,3,4,5));  // 최대값, 최소값
console.log(Math.round(3.567), Math.round(Math.PI), Math.floor(3.567));

// Number 객체의 상수들
console.log("표현할 수 있는 최대 정수", Number.MAX_SAFE_INTEGER);
console.log("표현할 수 있는 가장 작은 정수", Number.MIN_SAFE_INTEGER);
console.log("표현할 수 있는 가장 큰 수", Number.MAX_VALUE);
console.log("표현할 수 있는 가장 작은 수", Number.MIN_VALUE);

// Casting
console.log("---- Casting ----");
// parseInt, parseFloat
console.log("011", parseInt("011"));    // String 011 -> number
console.log("011", parseInt("011", 2));    // String 011 -> 2진수 -> number
console.log("123.456", parseInt("123.456"));    // 정수 변환
console.log("123.456", parseFloat("123.456"));    //  실수 변환

console.log(Math.PI, parseInt(Math.PI));    // 실수 -> 정수 변환

// 변환할 수 없는 형태의 문자열 캐스팅
var v = "abcd1234";
console.log(v, parseInt(v));

console.log(isNaN(parseInt(v)));
console.log(parseInt(v) * 10);  // NaN와의 산술 연산은 NaN

// Infinity
v = 1/0;
console.log("1/0 = ", v);

// Finite인지 확인 : isFinite()
console.log("1/0", isFinite(1/0));
console.log("2019", isFinite(2019));
console.log("abcd1234", isFinite(parseInt("abcd1234")));

var result = 1/0 + 10;
console.log("Infinity + 10", result);   // Infinity 산술연산 Infinity
