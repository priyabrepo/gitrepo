const express = require('express');
const path = require('path');
const rootDir = require('../util/path')

const router = express.Router();
const results = [];
router.use(express.static(path.join(__dirname,'public')));
router.use('/result',(req,res)=>{

   
    console.log('/result');
    results.push({'title':req.body.title});
    console.log(results);
    return res.render('result',{res:results,title:'Final Result'});
   // return res.sendFile(path.join(rootDir,'views','result.html'));
});

exports.routes = router;
exports.results = results;