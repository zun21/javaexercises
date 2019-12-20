// set values
var myFirstName ='Pan';
var myLastName ='Zun';
var myCountry = 'Myanmar';
var myAge = 22;

//select HTML elements
var greetingSpace = document.getElementById('greeting');
var nameSpace =document.getElementById('name');
var countrySpace = document.getElementById('country');
var ageSpace = document.getElementById('age');

//Add values to HTML elements
nameSpace.innerHTML += myFirstName+' '+myLastName;
countrySpace.innerHTML += myCountry;
ageSpace.innerHTML += myAge;

//create a selection of greetings
var greetingSelection = ['Hello!',"what's up!?",'おはよう','こんにちは'];

var colorSelection = ['red', 'pink','blue','yellow'];
//random picker
var random = Math.floor(Math.random()*4);
console.log(greetingSelection[random]);

greetingSpace.innerHTML += greetingSelection[random];


nameSpace.style.color = colorSelection[random];
countrySpace.style.color = colorSelection[random];
ageSpace.style.color = colorSelection[random];