const http = require ('http');


const myServer = http.createServer((req,res)=>{

    res.setHeader('Content-Type','text/html');

    res.write('<h1>Server 3000</h1>');

    res.end();
   

});

myServer.listen(3000);