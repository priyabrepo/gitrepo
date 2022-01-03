const express = require('express');

const shopController = require('../controller/shopController');

const routs= express.Router();


const shop = routs.use('/shop',shopController.getShop);



exports.shop = shop;
