<html>
<Head>
<Title></Title>
<style>
body {
	background-image: url("Images/index.jpg");
	height: 100%;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}
.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #f4511e;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 28px;
  padding: 10px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}

input[type=text] {
  width: 20%;
  padding: 15px ;
  margin: 8px 0;
  box-sizing: border-box;
  border: 1px solid #555;
  outline: none;
}

input[type=text]:focus {
  background-color: lightblue;
}
</style>
</Head>
<body>
<br />
<form action="view">  
	<input type="text" id="name" name="name" value=""><a href="view"><button type="submit" name="submit" class="button" style="vertical-align:middle"><span>Login </span></button></a>
</form>	
	<br />
	<!-- <a href="final"><button class="button" style="vertical-align:middle"><span>Final </span></button></a> -->
</body>
</html>