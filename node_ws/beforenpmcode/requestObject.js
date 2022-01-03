const http = require('http');

const myServer = http.createServer((req,res)=>{

console.log(req.headers) ;// header contains meta data from client
console.log(req.method) ; // defould method type is GET
console.log(req.url) ; // default '/'
//process.exit(); // hard exit from server
});

myServer.listen(3000);