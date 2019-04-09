// Boolean
console.log(10>5);

// null과 undefined
var v1;
var v2 = null;

console.log(v1, typeof v1);
console.log(v2, typeof v2);

// 개발자가 undefined를 할당 할 수 있기는 하다.
v2 = undefined;
console.log(v2, typeof v2);

if (typeof v2 == "undefined"){
    console.log("v2는 undefined");
}else{
    console.log("v2는 undefined가 아님");
}

// ==, ===
// === 은 값과 함께 타입도 비교
console.log(123 == "123");
console.log(123 === "123"); // false