// 주석
/*
    여러줄 주석
*/

// 내장 객체 console
console.info("정보 메세지");
console.debug("디버그 메세지");
console.warn("경고 메세지");
console.error("에러메세지");

console.log("Hello, JavaScript");

// 객체의 속성에 접근할 때는 .으로 접근할 수 있다.
console.log(Math.PI, Math.max(1,2,3,4,5)); // 속성과 메서드

console.log("----------");

// 변수 할당 :let, const, (<- ES6) var
var testVar = 10;   // ES6 이전 버전 : WEB에서는 당분간 이것만 사용하자.
let testlet = "let";    // mutable -> 재할당 가능
const testConst = "const";  // immutable -> 재할당 불가, 선언과 동시에 할당

// 변수 변경
testVar = "var changed";    // var 변경
testlet = "let changed";    // let 변경
// testConst = "const changed";    // const 변경 -> 불가

// 자바스크립트는 동적 타이핑 언어 -> 할당시 변수 타입이 결정
var v = "String";   // <- string으로 할당
console.log(v, typeof v);   //변수의 타입 확인
v = 2019;   // <- number
console.log(v, typeof v);
