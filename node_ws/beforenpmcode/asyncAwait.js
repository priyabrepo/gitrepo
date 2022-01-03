/*  async function myFunction() {
    return "Hello";
  }  */

 // same as

/*  function myFunction() {
    return Promise.resolve("Hello");
  } */

//console.log(myFunction());

// await makes a function wait for a promis to return.


 /* const asyFun = async () =>{   
    let myPromise = new Promise(resolve =>{
        setTimeout( ()=>{ resolve("love you"); }
            ,3000)
    });
    
    return await myPromise;
}

 
 asyFun();  */

  /* async function myDisplay() {
    let myPromise = new Promise(function(resolve) {
      setTimeout(function() {resolve("I love You !!");}, 3000);
    });
    return   await myPromise;
  };
  myDisplay(); */

  /* ----------------------------------------------------------------------- */

  function toppings_choice (){
    return new Promise((resolve,reject)=>{
      setTimeout(()=>{
  
        resolve( console.log("which topping would you love?") )
  
      },3000)
    })
   
    
  };
  
  async function kitchen(){

    console.log("A")
    console.log("B")
    console.log("C")
    
   // await toppings_choice()
   toppings_choice()
    console.log("D")
    console.log("E")
  
  };

  kitchen()
  .then()
  .catch()
  {

  }
  