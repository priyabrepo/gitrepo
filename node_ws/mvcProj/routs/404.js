const express = require('express');

const routs= express.Router();


const defPage = routs.use('/',(req,res)=>{
 
     console.log('/defoult URL');
     return res.send('<h1>404: page not found</h1>');
});

exports.defPage = defPage;