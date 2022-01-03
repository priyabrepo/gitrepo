const person ={
name:"Biswal",
score:10,
/*greet: ()=>{
    console.log("hello " +this.name); //in arrow function this refers to globla referance so comes as 'undefined 'here.
}*/
greet (){
    console.log("hello " +this.name); //in normal function this refers to element in wraping function .
     }

}

//person.greet()


// new for loop
const myArray = ["hello",27,true];
/*for(let ele of myArray)
{
    console.log(ele);
}*/

console.log(myArray);
console.log(myArray.map(eachele =>"ele: "+eachele));

