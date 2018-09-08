<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <h1>hey</h1>
        <meta charset="utf-8">
        <title>Transparent Login Form</title>
        <link rel="stylesheet" href="style1.css">
    </head>

    <body>
        <div class="loginBox">
            <img src="user.png" class="user">
            <h2>Log In Here</h2>
            <form action="Login" method="post">
                <p>Email</p>
                <input type="text" name="email" placeholder="Enter Email" id="text1">
                <p>Password</p>
                <input type="password" name="password" placeholder="••••••" id="text2">
                <input type="submit" name="signin" value="Sign In">
                <a href="#">Forget Password</a>
            </form>
   
        </div>
    </body>
</html>
