
const requestHandeler =(req,res)=>{

    const url = req.url;
    const method = req.method;

if(url === '/') {
    res.write('<html>');
    res.write('<head>');
    res.write('<title>Home</title>');
    res.write('</head>');

    res.write('<body>');
    res.write('<h1>Greetings!2</h1>');
    res.write('<form action="/create-user" method="POST">');
    res.write('<input type="text" name="username">');
    res.write('<button type="submit">Add user</button>');
    res.write('</form>');
    res.write('</body>');
    res.write('</html>');

    return res.end();
}

if(url === '/users') {
    res.write('<html>');
    res.write('<head>');
    res.write('<title>Users</title>');
    res.write('</head>');

    res.write('<body>');
    res.write('<ul><li>User1</li>');
    res.write('<li>User2</li>');
    res.write('<li>User3</li></ul>');
    res.write('</body>');
    res.write('</html>');

    return res.end();
}

if(url === '/create-user' && method === "POST") {
    const body = [];

    req.on('data', (chunk) => {
        body.push(chunk);
    });

    return req.on('end', (err) => {
        const parsedBody = Buffer.concat(body).toString();
        const username = parsedBody.split('username=')[1];
        
        console.log(username);

        res.statusCode = 302;
        res.setHeader('Location', '/');
        res.end();
    });
}
}

module.exports = requestHandeler;