const express = require('express');
const path = require('path');

const router = express.Router();

router.use(express.static(path.join(__dirname,'public')));
router.post('/',(req,res)=>{
    console.log('404');
    return res.sendFile(path.join(__dirname,'./views','404.html'));
});
router.use((req,res)=>{
    console.log('404');
    return res.sendFile(path.join(__dirname,'./views','404.html'));
});

module.exports = router;