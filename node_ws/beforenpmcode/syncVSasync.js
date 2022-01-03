//syncronous

/* console.log("1");
console.log("2");
console.log("3");
console.log("4");
console.log("5"); */

//sync async combined
/* 
console.log("1");
console.log("2");
setTimeout(()=>{console.log("5");},0);
console.log("3");
console.log("4");
 */

 //callbacks
  /* let one = ()=>{
      console.log("This is one.");
    };

 let two = (call_one)=>{ 
     console.log("This is Two.");
     call_one();
    };

 two(one);  // let one variable passed */

 //call back hell

 let stocks = {
    Fruits : ["strawberry", "grapes", "banana", "apple"],
    liquid : ["water", "ice"],
    holder : ["cone", "cup", "stick"],
    toppings : ["chocolate", "peanuts"],
 };
 
 let production = () =>{

    setTimeout(()=>{
      console.log("production has started")
      setTimeout(()=>{
        console.log("The fruit has been chopped")
        setTimeout(()=>{
          console.log(`${stocks.liquid[0]} and ${stocks.liquid[1]} Added`)
          setTimeout(()=>{
            console.log("start the machine")
            setTimeout(()=>{
              console.log(`Ice cream placed on ${stocks.holder[1]}`)
              setTimeout(()=>{
                console.log(`${stocks.toppings[0]} as toppings`)
                setTimeout(()=>{
                  console.log("serve Ice cream")
                },2000)
              },3000)
            },2000)
          },1000)
        },1000)
      },2000)
    },0000)
  
  };

 
  production();