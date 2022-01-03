const fs = require('fs');

const http = require('http');

/* const myFile = ()=>{

    fs.writeFileSync('myfile.txt','hello');
    
}
myFile(); */

const myServer = http.createServer((req,res)=>{

    const url= req.url;
    const method = req.method;

    if(url === '/')
    {
     res.setHeader('Content-Type', 'text/html');
    res.write('<html>');
    res.write('<head><title>Enter Message</title><head>');
    res.write('<body><form action="/message" method="POST"><input type="text" name="message"><button type="submit">Send</button></form></body>');
    res.write('</html>');
    return res.end();
    }else if(url === '/message' && method==="POST"){

         const body = [];
        req.on('data',resdata =>{
           console.log('data recived',resdata);
           body.push(resdata);
        });

         req.on('end',()=>{
           const parseBody = Buffer.concat(body).toString();
          const filetxt = parseBody.split('=')[1];
          console.log(parseBody);
          fs.writeFileSync('myfile1.txt',filetxt);
        });  
        /* req.on('end', () => {
            const parsedBody = Buffer.concat(body).toString();
            const message = parsedBody.split('=')[1];
            console.log(parsedBody);
            fs.writeFileSync('message.txt', message);
          }); */

       /*  res.statusCode = 302;
        res.setHeader('Location', '/'); */
        res.setHeader('Content-Type', 'text/html');
        res.write('<h1>Done!</h1>');
        return res.end();
      
       
    }
});

myServer.listen(3000);