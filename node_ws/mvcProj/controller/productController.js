const Products = require('../model/product');

const myProducts = [];
exports.getAddProduct = (req,res)=>{

    console.log('admin : /add-products GET');
    return res.send(' <form action="/add-products" method="POST"><h1> What is your name?</h1><input type="text" name="title" id="title" placeholder="Full Name" /><button type="submit">Submit</button></form>');
   
};

exports.postAddProduct = (req,res)=>{

    console.log('admin : /add-products post');
    const product = new Products(req.body.title);
    product.save();
    console.log(req.body.title);
    //Products.produ .push(product);
     return res.send(' <form action="/add-products" method="POST"><h1> What is your name?</h1><input type="text" name="title" id="title" placeholder="Full Name" /><button type="submit">Submit</button></form>');
   
};

exports.getProduct = (req,res)=>{

    console.log('admin : /products');
    return res.send(Products.fetchAll());
    

};