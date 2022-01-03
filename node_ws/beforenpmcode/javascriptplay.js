const name = "Biswal";
//name = "priyab";  // error: assignment to constant

//old way function anonimous

/*function Welcome(name) {
    return "Welcome to node "+name;
}*/

//old way variable function
/*
//var greeting = // storing in variable
const greeting = 
function Welcome(name) {
    return "Welcome to node "+name;
}*/



//new way (arrow function)
/*const greeting =  (name) => {
    return "Welcome to node "+name;
}
console.log(greeting(name));*/

//arrow function: shorter for single logic
const add = (a,b) =>a+b;

console.log(add(1,2));

//arrow function: shorter for single logic and single param

const addOne = a => a+5;

console.log(addOne(1));

//arrow function: no argument

const addRandom = ()=> 1+4;

console.log(addRandom());









