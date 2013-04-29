<%@ page language="java" pageEncoding="UTF-8"%>
<html>
 <head>
    <title>用户登录页面</title>
    <style src="css/main.css" type="text/css" ></style>
    <style src="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" type="text/css"></style>
    <script src="/js/jquery-1.9.1.min.js" type="text/javascript" ></script>
	<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js" type="text/javascript"></script>
	<script type="text/javascript">
	</script>

 </head>
 <body>
  <h2>用户入口</h2>
  <hr>
    <form action="login.action" method="post">
        <table border="1">
           <tr>
               <td>用户名：</td>
               <td><input type="text" name="userName"/></td>
           </tr>
           <tr>
               <td>密码：</td>
               <td><input type="password" name="password"/></td>
           </tr>
           <tr>
               <td colspan="2">
                  <input type="submit" value=" 确定 "/>
               </td>
           </tr>
        </table>
    </form>
 </body>
</html>