 const express = require('express');
 const path = require('path');
 //const bodyparser = require('body-parser');

 const adminRouts = require('./routs/admin.js');
 const shopRouts = require('./routs/shop.js');
 const rootDir = require('./util/path');

const app = express();

app.use(express.static(path.join(__dirname,'public')));
app.use(express.urlencoded({extended:true}))

app.use('/admin',adminRouts);

app.use(shopRouts);

app.use((req,res)=>{
    console.log('appjs - pagenot found');
    res.sendFile(path.join(__dirname,'views','404.html'));
    //sendStatus(404)
  
});

app.listen(3000); 