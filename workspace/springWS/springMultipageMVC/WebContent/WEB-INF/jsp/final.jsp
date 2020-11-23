<html>
<Head>
<Title></Title>
<style>
body {
	background-image: url("Images/final.jpg");
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
	padding: 20px;
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

div {
	border: 1px solid gray;
	padding: 8px;
	background-color: #f4511e
}

h1 {
	text-align: center;
	text-transform: uppercase;
	color: white;
}
</style>
</Head>
<body background="Images/final.jpg">
	<div>
		<h1>${user}</h1>
	</div>
	<a href="index"><button class="button"
			style="vertical-align: middle">
			<span>Index </span>
		</button></a>
	<br />

</body>
</html>
