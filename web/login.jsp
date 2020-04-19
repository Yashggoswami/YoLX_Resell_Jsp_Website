<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 17-04-2020
  Time: 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 17-04-2020
  Time: 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="css/signup.css">
</head>
<body>
<div class="logo"><h1>YOLX</h1>
    The best Re-selling Market
</div>
<div><h1>Sign-in</h1></div>
<div class="signupform" >

    <form action="Login" method="post">
        <div class="form-group">
            <label>Email</label>
            <input class="form-control form-control-lg inp" type="email" name="email" placeholder="Enter Email" >
        </div>
        <div class="form-group">
            <label>Password</label>
            <input class="form-control form-control-lg inp" type="password" name="pass" placeholder="Enter Password" >
        </div>
        <button class="btn btn-primary btn-lg btn-block">Login</button>
        <label>${message}</label>
    </form>

</div>

<div class="signupform" style="margin-top: 20px;"><label style="color:black">Don't have an Account?<a href="signup.jsp">Sign up</a> </label></div>
</body>
</html>

</body>
</html>
