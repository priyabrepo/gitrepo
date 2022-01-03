const express = require('express');
const path = require('path');
const url = require('url');

const rootDir = require('../util/path');


const shopRouts = express.Router();

shopRouts.get('/', (req, res, next) => { 
    console.log('shop');
   res.sendFile(path.join(rootDir,'views','shop.html') );
});

module.exports = shopRouts;