/*
console.log("*********************** Primitive Example ");
var a = 10;
console.log(a);
var b = a;
console.log(b);
b = 20;
console.log(a);
console.log(b);
console.log("*********************** Object Example ");

var person = {
    name: "Ramith",
    age: 29,
};

console.log("Name = "+person.name);
var person1 = person;
console.log("P1 Name "+person1.name);
person1.name = "Sourabh";
console.log("P Name = "+person.name);
console.log("P1 Name = "+person1.name);

console.log("**************************************** ");

var personnew = {
    firstName: "Ramith",
    lastName: "koyambrath",
    age: 29,
    eyeColor: "blue",
    getFullName: function(){
        return this.firstName+" "+this.lastName;
    },
    address: {
        city: 'Bangalore',
        state: 'Karnataka',
        pincode: 560088
    },
    hobbies: ['sleeping','oversleeping','watching tv','lookin girls']
};

console.log("First Name "+personnew.firstName);
console.log("city "+personnew.address.city);
console.log("First Name "+personnew.lastName);

console.log(" ******STORING Object in Arrays************************* ");
var library = [
                {
                    id : 1,
                    author: "Steve Jobs",
                    name : "Steve"
                },
                {
                    id : 2,
                    author: "bill gates",
                    name : "bill"
                },
                {
                    id : 3,
                    author: "narayana moorthy",
                    name : "moorthy"
                }
            ];

console.log("Object 1 "+library[0]);
console.log("Object 1 author "+library[0].author);

console.log(" ************* Date Objects ****************** ");

var date = new Date();
var date1 = new Date(2018,11,24,10,33,30);
var date2 = new Date(0);

console.log("Date "+date);
console.log("Date1 "+date1);
console.log("Date2 "+date2);
console.log("Year "+date.getFullYear());
console.log("Month "+date.getMonth()); //get the month as 0 -11

var hobbies = ['cricket','volleyball','football','reading books'];
document.getElementById('demo').innerHTML = hobbies;

console.log(" *************for of and for in****************** ");

for(var val of hobbies){
    console.log("Hobbies "+val);
}
console.log(" *************ES6 feature on Array****************** ");
hobbies.forEach((val,index) =>{
    console.log("Value = "+val);
    console.log("Index = "+index);
});

//Works for array of object
for(var obj of library){
    console.log(obj);
}

//does not Works for array of object
/*for(var obj of personnew){
    console.log(obj);
}*/

//Works for objects
/*
var person = {
    
    firstName: "Ramith",
    lastName: "koyambrath",
    age: 29,
    eyeColor: "blue"
};
/*
for(var ind in person){
    console.log(" Person ==>"+person[ind]);
}

for(var ind in personnew){
    console.log("For in support objects")
    console.log(personnew[ind]);
}
*/
/*
console.log(" ==== for loop ====");
console.time("forof");

for(var i of hobbies){
    var a = [];
}
console.timeEnd("forof");
console.log("for of ended");

(function(){
    alert("This is IIFE "); //executes without the function is called ,usually called when the page loads
})();

function alertMessage(val,number){
    alert(`This is Named Function value =${val} number = ${number} `);
}
alertMessage("Ramith",29);

hobbies.splice(0,2,"gggg","Ramith");

function first(){
    setTimeout(()=>{
        console.log("This is First function");
    },0);
}

function second(){
    console.log("This is second function");
}
first();
second();

const items = [
    {
        id:1,
        name:"book",
        price: 200
    },
    {
        id:2,
        name:"pen",
        price: 100
    },
    {
        id:3,
        name:"bag",
        price: 600
    },
    {
        id:4,
        name:"shirt",
        price: 1000
    },
    {
        id:5,
        name:"laptop",
        price: 15000
    }
];
console.log(items);
let mappedIds = items.map((value)=>{
                    return value. name;
                });
console.log(mappedIds);

let filterValues = items.filter((value)=>{
    return value.price > 200;
});
console.log(filterValues);


var items = [
    {
        id:1,
        name:"book",
        price: 200
    },
    {
        id:2,
        name:"pen",
        price: 100
    },
    {
        id:3,
        name:"bag",
        price: 600
    },
    {
        id:4,
        name:"shirt",
        price: 1000
    },
    {
        id:5,
        name:"laptop",
        price: 15000
    }
];
*/
/*
var stringItems = JSON.stringify(items);
console.log(stringItems);

var objItems = JSON.parse(stringItems);
console.log(objItems);
*/

/* let num = prompt('enter a small number');
function factorial(num) {
    if(num == 1 || num == 0) {
        return 1;
    } else {
        return num * factorial(num-1);
    }

}

alert(factorial(num));
console.log(factorial(num)); */

// function counter() {
//     var counter = 0;
//     function getCount() {
//         counter++;
//         return counter;
//     }

//     return getCount;
// }

// var count = counter();
// let value = count();

// console.log(value);

// let value1 = count();
// console.log(value1);

// var ramithSalary = (function() {
//     var salary = 45000000;
//     function changeBy(amount) {
//         salary += amount;
//     }

//     return {
//         raise : function() {
//             changeBy(1000000);
//         },
//         lower : function() {
//             changeBy(-5);
//         },
//         currentAmount: function() {
//             return salary;
//         }

//     };
// })();

// alert(ramithSalary.currentAmount());
// ramithSalary.raise();
// alert(ramithSalary.currentAmount());
// ramithSalary.lower();
// alert(ramithSalary.currentAmount());


// var promise = new Promise((res, rej) => {

//     if(10 > 20) {
//         rej();
//     } else {
//         res(); //jsondata
//     }

// });

// promise.then (() =>
// {

// }).catch(() => 
// {

// });

let promise = new Promise((res, rej) => {

        const items = [{id:1, name:'Santosh'}, {id:2, name:'Sharath'}];
        if(items.length > 0) {
            res(items);
        } else {
            rej("rejected");
        }
});

promise.then((data) => {
    console.log(data);
}).catch((reason) => {
    console.log(reason);
});