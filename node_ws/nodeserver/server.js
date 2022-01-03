
// for craeting a server and accesing request object
/* const http = require('http');

const myServer = http.createServer((req,res)=>{
console.log(req.url);
});

myServer.listen(3000); */
// run localhost:3000 in brouser

const http = require('http');

const routs = require('./routs');
 const a ="";

const server = http.createServer(routs);


server.listen(3000);