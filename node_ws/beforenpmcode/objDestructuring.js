const personOne = {
name:"kyle",
age:28,
address:{
  city:"some where",
  state:"one of them"
}
};

const personTwo = {
    name:"sally",
    age:32,
    address:{
      city:"somewhere else",
      state:"Another one of them"
    }
    };

    // destructuring
// in object destructuring, const name takes key name from write side object unlike array destructuring(position)
/*const{name,age} = personOne;
console.log(name);
console.log(age);*/

// to rename or give alias name to a const
/*const{name : FirstName,age} = personOne;
console.log(FirstName);
console.log(age);*/

// to give default value
/*const{name : FirstName,age,favFood = 'fish'} = personOne;
console.log(FirstName);
console.log(age);
console.log(favFood);*/

// rest function on objects
// to get all remaining keys in an onject

/*const {name,...restOfOne} = personOne
console.log(restOfOne);*/
//restOfOne contains all keys of personOne except 'name'

//destructuring nested objects
/*const{name,address:{city}} = personOne
console.log(city);*/

//combining two objects
// here the common keys of first gets overriden by 2nd. i.e. common filds show value from 2nd
const allPersons = {...personOne,...personTwo}

console.log(allPersons);
