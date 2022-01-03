     let myPromise = new Promise((resolve,reject)=>{
    let x = 0;
        x= 1
        if (x == 0) {
            resolve("resolve text");
          } else {
            reject("eror text");
          }
    });

     myPromise.then(
      (x)=>{console.log(x);},
      (y)=>{console.log(y);}
    ); 
  

/* function myDisplayer(some) {
    console.log(some);
  }
  
  let myPromise = new Promise(function(myResolve, myReject) {
    let x = 1;
  
  // The producing code (this may take some time)
  
    if (x == 0) {
      myResolve("OK");
    } else {
      myReject("eror text");
    }
  });
  
  myPromise.then(
    function(value) {myDisplayer(value);},
    function(error) {myDisplayer(error);}
  ); */



 