const fs = require('fs');
const path = require('path');


const productsArr = [];

module.exports = class Product {

    constructor(title){

        this.title = title;
    }

save(){
    //productsArr.push(this);
    const p = path.join(path.dirname(require.main.filename),'data','product.json') ;

    fs.readFile(p,(err,filecontent)=>{
        let products = [];
         // console.log(filecontent);

         if(!err){
            products = JSON.parse(filecontent);
         }
         products.push(this);
         fs.writeFile(p,JSON.stringify(products),(err)=>{
             console.log(err);
         })
    });
    
}

static fetchAll(){
    return productsArr;
}

}