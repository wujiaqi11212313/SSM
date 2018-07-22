<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>

</head>

<body>
<form action="/user/login">
    <table>
        <tr>
            <td><label>登录名:</label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>密码:</label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" id="login" value="登录"></td>
        </tr>
    </table>
</form>

</body>
</html>
