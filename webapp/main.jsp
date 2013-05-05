<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>教务考勤系统</title>
    <script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
    	$(document).ready(function(){
			$("#contents").height="1000";
		});
    </script>
</head>

<body style="width:1200px;margin:0 auto;">
    <div class="main_top">
    	<iframe name="top_frame" src="./top.jsp" frameborder="0" width="100%" scrolling="no" ></iframe>
    </div>
    <div class="main_menu">
		<iframe name="menu_frame" src="./menu.html" frameborder="0" width="100%" height="1000px" ></iframe>
    </div>
    <div class="main_content">
		<iframe name="content_frame" src="/ajax/index.html" frameborder="0" width="100%" height="1000px" ></iframe>
    </div>
</body>
</html>