const express = require('express');

const products = require('../controller/productController');
const routs= express.Router();


const addProd = routs.get('/add-products',products.getAddProduct);
const postaddProd = routs.post('/add-products',products.postAddProduct);

const prod = routs.use('/products',products.getProduct);

exports.addProd = addProd;
exports.prod = prod;
exports.postaddProd = postaddProd;