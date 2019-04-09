// JavaScript의 날짜/시간
var now = new Date();   // 현재 시간
console.log(now);
var d2 = new Date(2019, 1, 20); // 월은 0부터 -> 2019, 2, 20
console.log(d2);
var d3 = new Date(2019, 1, 20, 15, 40);
console.log(d3);

console.log("년도: ", now.getFullYear());
console.log("월: ", now.getMonth() +1); // 월은 0부터 시작!
console.log("일: ", now.getDay());
console.log("요일: ", now.getDate());   //  요일은 0 - 일

d3.setFullYear(2012);
console.log(d3);
