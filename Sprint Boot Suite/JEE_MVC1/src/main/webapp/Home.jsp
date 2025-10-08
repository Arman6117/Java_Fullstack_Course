<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Welcome</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Poppins", sans-serif;
}

body {
	font-family: Arial, sans-serif;
	background: linear-gradient(to right, #74ebd5, #acb6e5);
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.container {
	text-align: center;
	background: rgba(255, 255, 255, 0.4);
	padding: 40px 60px;
	border-radius: 20px;
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
}

h1 {
	font-size: 2.5rem;
	margin-bottom: 30px;
	color: white;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
}

.btn {
	background: white;
	color: #2575fc;
	border: none;
	padding: 12px 25px;
	margin: 10px;
	border-radius: 30px;
	font-size: 1rem;
	font-weight: 600;
	cursor: pointer;
	transition: 0.3s;
}

.btn:hover {
	background: #2575fc;
	color: white;
	transform: translateY(-2px);
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome to Our Website</h1>
		<div>
			<button class="btn" onclick="location.href='Login.jsp'">Sign
				In</button>
			<button class="btn" onclick="location.href='Registration.jsp'">Sign
				Up</button>
		</div>
	</div>
</body>
</html>
