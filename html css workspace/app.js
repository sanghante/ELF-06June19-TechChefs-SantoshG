/*
var a = 10;
console.log(a);
var  b = a;
console.log(b);
b = 20;

console.log(a);
console.log(b);

console.log("-------------------------------------")


var person  = {
    name : 'Santosh',
    age : 37
};

console.log("Name = "+person.name);

var person1 = person;
console.log("P1 Name = "+person1.name);
person1.name = 'Sourabh';

console.log("Name = "+person.name);
console.log("P1 Name = "+person1.name);

var number1 = 10;
var number2 = 10;

*/


var person = {

    firstName : 'Santosh',
    age : 37,
    lastName : 'Ghante',
    eyeColor : 'dark brown',

    getFullName : function() {

        return this.firstName + " " + this.lastName;
    },

    address: {
        city : 'Bangalore',
        state : 'Karnataka',
        pincode : 56008
    },

    hobbies : ['sleeping', 'oversleeping', 'binging prime shows']

};

console.log(person.lastName);
console.log("City : "+person.address.city);
console.log(person.getFullName);
console.log(person.getFullName());
console.log("Hobbies :"+person.hobbies);

console.log("Trying forEach on array")
person.hobbies.forEach( (v,i) => { console.log(v), console.log(i)});

console.log("Trying for of")
for (var val of person.hobbies) {
    console.log(val)
}

console.log("Trying for in")
for (var inex in person.hobbies) {
    console.log(inex);
    console.log(person.hobbies[inex]);
}

console.log("Trying for in")
for (var inex in person) {
    console.log(inex);
    console.log(person[inex]);
}

var hobbies = ["eating", "sleeping", "tv","walking","reading"];

document.getElementById('demo').innerHTML = hobbies;

var abc = (a,b) => a*b;
console.log(abc(45,20));

/*
function alertMessage(val, number) {
    alert(`This is named function value = ${val} number = ${number}`);
}

alertMessage("aa", 12);

(function() {
    alert('This is IIFE');
}());


(function() {
    alert('This is IIFE01');
}());
*/

//hoisting

//a = 10;
//console.log(a);
//var a = 10;

//console.log(b);
//let b = 10;

// fname();

// function fname() {
//     console.log("hi");
// }

// fname1();

// var fname1 = function() {
//     console.log("fname1");
// }



/*

function varKey() {
    console.log("aaa = "+a);
    var a = 20;
    console.log("aaa = "+a);
}

console.log("aaa = "+a);

varKey();

/*

function letKey() {
    a = 20;
    console.log("bbb = "+b);
}
console.log("bbb = "+b);

*/
function constKey() {
    c = 20;
    console.log("ccc = "+c);
}
//console.log("ccc = "+c);



console.log(typeof hobbies);
console.log(Array.isArray(hobbies));

console.log(hobbies.includes("cricket"));

hobbies.push("three");
hobbies.push("tv");

console.log(hobbies);

var a = hobbies.pop();
console.log(hobbies);

console.log(a);

hobbies.shift();
console.log(hobbies);
hobbies.unshift("eating");
hobbies.unshift(constKey);

//var d = hobbies.shift();
//console.log(hobbies);
//d();


var arr = ['a','b','c','d'];
let temp = arr.slice(0,2);
console.log(temp);
console.log(arr);

hobbies.unshift(person);
hobbies.join('--');
console.log(hobbies.join('--'));


function first(sec){
    setTimeout(() => {
        console.log("This is first");
        sec();
    },2000);
    //console.log("this is first");    
}

function second(){
    console.log("this is second");
}

//first(second());
//second(first());

first(second);
//second();


const items = [
{

    id : 1,
    name : 'book',
    price : 200

},

{

    id : 2,
    name : 'radio',
    price : 2000

},

{

    id : 3,
    name : 'tv',
    price : 20000

},

{

    id : 4,
    name : 'laptop',
    price : 80000

},

{

    id : 5,
    name : 'house',
    price : 2000000

}
];

console.log(items);

let mappedIds = items.map((value) => {
    return value.name;
});

// let mappedIds1 = items.forEach((value) => {
//     //return value.name;
//     console.log(value.name);
// });

let filteredValue = items.filter( a =>  a.price > 200 );

var str = "Name";

var str1 = str.toLowerCase();

console.log(str);
console.log(str1);


console.log(mappedIds);
console.log(filteredValue);
