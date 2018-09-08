	<!DOCTYPE html>
	<html>
	<head>
		<title>Login | Pune Metro</title>
		<link rel="stylesheet" type="text/css" href="style-login.css">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet"href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<link href="https://fonts.googleapis.com/css?family=Fira+Sans" rel="stylesheet">
		<script src="lg.js"></script>

	</head>
	<body>
		<header>

			<div class="box">
		<h2>Login</h2>
			<form action="Login" method="post">				
				<div class="inputbox">
					<input type="text" name="email" id="username" required="">
					<label>Email</label>
				</div>
				<div class="inputbox">
					<input type="password" name="password" id="password" required="">
					<label>Password</label>
				</div>
				
				<p align="center"><input type="Submit" id="submit" name="submit" value="Login" onclick="validate()">	</p>

			</form>	
			<br>
			<p align ="center">
			Not yet registered? <br>
			<a href="signup.html">
			<input type="Submit" id="Signup" value="Sign Up"></a>
		</p>
		</div>

		</header>
				
	</body>
	</html>
