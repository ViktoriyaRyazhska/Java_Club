<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login user</title>
</head>
<body>
<div class="container">
    <form class="form-signin" method="post" action="/login">
        <h2 class="form-signin-heading">Login</h2>
        <p>
            <label for="username">Username</label>
            <input type="text" id="username" name="username" class="form-control" placeholder="Username" required>
        </p>
        <p>
            <label for="password">Password</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
        </p>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
    <form action="/create">
        Don't have an account? <br>
        <button type="submit">Sing up</button>
    </form>
</div>
</body>
</html>
