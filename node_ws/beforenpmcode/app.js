/*const amount = 12

if(amount < 10)
	{
	console.log("Small number");
	}
else{
	console.log("large number");
}

console.log("My first node app");*/

//console.log(__dirname);
//console.log(__filename);

/*setInterval(()=>{
	console.log("Hello World!!")
},1000
		)*/
		
/*		setTimeout(()=>{
	console.log("Hello World!!")
},5000
		)*/

const os = require('os')
const file = require('fs')

const user = os.userInfo()
//console.log(user)

//console.log("System up for "+os.uptime()+"seconds")

const currentOS={
	name: os.type(),
	release:os.release(),
	totalMem:os.totalmem(),
	freeMem:os.freemem(),
	host: os.hostname()
}


console.log(currentOS);
//console.log(file.)








