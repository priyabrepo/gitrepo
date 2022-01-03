const express = require('express');

const adminRouts = require('./routs/admin');
const shopRouts = require('./routs/shop');
const errrorRouts = require('./routs/404');

const app =express();


app.use(express.urlencoded({extended:true}));

app.use(adminRouts.addProd);
app.use(adminRouts.postaddProd);
app.use(adminRouts.prod);
app.use(shopRouts.shop);

app.use(errrorRouts.defPage);

app.listen(3000);