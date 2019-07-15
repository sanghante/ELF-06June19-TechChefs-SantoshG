/* let name = document.getElementById('name');
console.log(name);
console.log(name.textContent); // To Access the text content
name.style.color = "blue";

var classCollection = document.getElementsByClassName('demo');
console.log(classCollection);
classCollection[0].style.fontSize="80px";

document.getElementById('myButton').className = 'button';
document.getElementById('myButton').classList = 'button button1'; //Applying multiple class names to an element

var quesrySelect = document.querySelector('p');
var quesrySelect = document.querySelectorAll('.demo'); // Use either tag ,classname or #id
console.log(quesrySelect);

let input = document.createElement('input'); //Creating the element
document.body.appendChild(input);

var demoClass = document.getElementsByClassName('demo');
console.log("By Class Name "+demoClass.length);

var demoClass1 = document.querySelectorAll('demo');
console.log("query selector "+demoClass.length);

//Change one elements class name to blue
document.getElementById("pele").className = "blue";

//write the number of elements in each array (values differ)
console.log("Number of elements with querySelector = "+demoClass1.length);
console.log("Number of elements with getelementByClassName = "+demoClass.length);

document.write("Writing to doument write method");
document.getElementById("div1").innerHTML = "<input type='text' value='AAAAAA'>"; */

var button =  document.getElementById("myButton");

var createNewElement = function(){
    document.getElementById("div1").innerHTML = "<a href='https://www.flipkart.com/'><h1><b>Flipkart</b></h1></a>"
};

/* button.onclick = function createElement(){
    document.getElementById("div1").innerHTML = "<a href='https://www.flipkart.com/'><h1><b>Flipkart</b></h1></a>"
} */

window.onload = function(){
    document.getElementById('myButton').textContent = "Change text";
}

button.addEventListener('click',()=>{
    document.getElementById("div1").innerHTML = "<a href='https://www.flipkart.com/'><h1><b>Flipkart</b></h1></a>"
});

