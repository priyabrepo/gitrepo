const express = require('express');
const path = require('path');
const rootDir = require('../util/path');

const router = express.Router();
const results = [];
router.use(express.static(path.join(__dirname,'public')));

router.use('/test',(req,res)=>{

    
    console.log('test');
    return res.sendFile(path.join(rootDir,'views','test.html'));
});

module.exports = router;