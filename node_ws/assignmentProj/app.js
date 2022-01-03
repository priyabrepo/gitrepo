const express = require('express');


const testRouts = require('./test/test');
const resultRouts = require('./result/result');
const errorRouts = require('./404');
const { urlencoded } = require('express');


const app = express();

app.set('view engine','pug');
app.set('views','views');

app.use(express.urlencoded({extended:true}));

app.use(testRouts);
app.use(resultRouts.routes);
app.use(errorRouts);


app.listen(3000);