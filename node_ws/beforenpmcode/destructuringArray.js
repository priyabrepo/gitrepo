
//Array destructuring 
const Alphabet =["A","B","C","D","E","F","G"];
const Numbers =[1,2,3,4,5,6];

//without destructuring
/*const a = Alphabet[0];
const b = Alphabet[1];*/

//creating constants from rightside Object. according to position
//const[a,b,c] = Alphabet;


//to skip a position
//const[a,,c] = Alphabet;

//to get rest of elements: rest function(...)
//const[a,,c,...remaining] = Alphabet;

//console.log(a);
//console.log(b);
//console.log(c);
//console.log(remaining);

//to combine two arrays in rest function(...)
const combArr =[...Alphabet,...Numbers];

console.log(combArr);
