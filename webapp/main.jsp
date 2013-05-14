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
			$("#content_frame").attr("height","1000");
		});
    </script>
</head>

<body>
	<table cellspacing="0" class="main_table" border="0">
        <thead>
        	<tr>
				<td colspan="2" style="border:0; padding:0; margin:0">
                	<iframe name="top_frame" src="./top.jsp" frameborder="0" width="100%" scrolling="no" height="120"></iframe>
                </td>
			</tr>
        </thead>
        <tbody>
            <tr>
                <td width="25%">
                    <iframe name="menu_frame" src="./menu.jsp" frameborder="0" width="100%" height="1000px" ></iframe>
                </td>
                <td style="border-left:10px solid #eee;">
                    <iframe name="content_frame" id="content_frame" src="/ajax/index.html" frameborder="0" width="100%" height="1000px" ></iframe>
                </td>
            </tr>
        </tbody>
	</table>
</body>
</html>