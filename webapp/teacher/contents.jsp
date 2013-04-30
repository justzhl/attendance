<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" type="text/css" href="../css/main.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>教务考勤系统</title>
    <style type="text/css">
    	@import "../css/demo_table.css";
    	@import "../css/demo_page.css";
    </style>
    <script src="../js/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script src="../js/jquery.dataTables.min.js" type="text/javascript"></script>
</head>

<body style="margin:0 auto;">
	<div id="container">
	<table width="500" id="students_list" class="display">
    	<thead>
            <tr>
                <td>学号</td>
                <td>姓名</td>
                <td>班级</td>
                <td>性别</td>
            </tr>
        </tfoot>
        <thead>
        <tbody>
        </tbody>
	</table>
    <script type="text/javascript">
    	$(document).ready(function(){
			$("#students_list").dataTable({"sPaginationType": "full_numbers","iDisplayLength":10,"bPaginate":true,"sAjaxSource":"http://myhost:8080/liststudents.action"});
		});
    </script>
    </div>
</body>
</html>