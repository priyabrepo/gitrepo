

const http = require('http');


const myServer = http.createServer((req,res)=>{

    const url= req.url;
    const method = req.method;

    if(url === '/')
    {
     res.setHeader('Content-Type', 'text/html');
    res.write('<html>');
    res.write('<h>Select user</h>');
    res.write(' <ul><li>user 1</li><li>user 2</li><li>user 3</li></ul>');
   
    res.write('<body><form action="/user-name" method="POST"><input type="text" name="username"><button type="submit">Send</button></form></body>');
    res.write('</html>');
    return res.end();
    }else if(url === '/user-name' && method==="POST"){

         const body = [];
        req.on('data',resdata =>{
          // console.log('data recived',resdata);
           body.push(resdata);
        });

         req.on('end',()=>{
           const parseBody = Buffer.concat(body).toString();
          const filetxt = parseBody.split('=')[1];
          console.log(filetxt);
         
        });  
        
        res.setHeader('Content-Type', 'text/html');
        res.write('<html>');
        res.write('<h>Select user</h>');
        res.write(' <ul><li>user 1</li><li>user 2</li><li>user 3</li></ul>');
       
        res.write('<body><form action="/user-name" method="POST"><input type="text" name="username"><button type="submit">Send</button></form></body>');
        res.write('</html>');
        return res.end();
    }
   
});

myServer.listen(3000);