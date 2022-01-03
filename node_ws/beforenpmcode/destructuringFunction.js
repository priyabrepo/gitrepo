
//array and function
function sumAndMultiplay(a,b){
 // return [a+b,a*b];
 return [a+b,a*b,a/b];
}

//convensonal
/*const arr = sumAndMultiplay(2,3); 
console.log(arr);*/

//destructuring
/*const[sum,multi] =sumAndMultiplay(2,3);
console.log(sum);
console.log(multi);*/

//setting default value
/*const[sum,multi,div ='no devision'] =sumAndMultiplay(2,3);
console.log(sum);
console.log(multi);
console.log(div);*/
/*-------------------------------------------------------------*/

//function and objects

const personOne = {
    name:"kyle",
    age:28,
    address:{
      city:"some where",
      state:"one of them"
    }
    };
//without destructuring
    /*const printuser =(user)=>{
        console.log('name is: '+user.name+'. Age is '+user.age);
    };
    printuser(personOne);*/


    //with destructuring
    const printuser =({name,age})=>{
        console.log('name is: '+name+'. Age is '+age);
    };
    printuser(personOne);

    // can set default value.