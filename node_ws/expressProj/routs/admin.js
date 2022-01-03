const express = require('express');
const path = require('path');

const rootDir = require('../util/path.js');

const router = express.Router();

// admin/add-product
router.get('/add-product', (req, res, next) => {
    console.log('admin - add product');
    res.sendFile(path.join(rootDir,'views','add-product.html') );
   
}); 
//admin/product
router.post('/product', (req, res) => {

    console.log('admin - redirect to /');
    console.log(req.body);
    res.redirect('/');
}); 

module.exports = router;