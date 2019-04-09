// 객체의 생성 1.

var person = {};
// person = new object();

// 프라퍼티 추가
person.name = "엄유리";
person.age = 24;
person.showInfo = function(){
    var message = "Name: " + this.name + ", Age: " + this.age;
    console.log(message);
}

person.showInfo();

// 방법 2. JSON 이용 -> 매우 중요!!
person = {
    name : "엄유리",
    age : 24,
    showInfo : function(){
        console.log("Name: " + this.name + ", Age: " + this.age);
    }
}

person.showInfo();

// 방법 3. function 이용 생성자 모방
var Member = function(name, position){
    this.name = name;
    this.position = position;
};

var m1 = new Member("강백호", "PF");
var m2 = new Member("서태웅", "SF");

console.log(m1, m2);

// JavaScript는 동적 스크립트 언어 -> 동적으로 속성 추가 가능
m1.sayHi = function(){
    console.log(this.name + "님이 당신에게 인사합니다.")
}
m1.sayHi();

// m2.sayHi(); // -> Error : sayHi는 m1에 동적으로 추가된 메서드이다.

Member.prototype.introduce = function(){
    console.log(this.name + "님이 자신을 소개합니다.");
};

m1.introduce();
m2.introduce();

console.log(m1.constructor);
console.log(Member.prototype);

// prototype을 이용한 동적 속성의 추가 -> 기존 기능의 확장
String.prototype.helloMessage = function(){
    return "Hello, " + this;
}
console.log("JavaScript".helloMessage());