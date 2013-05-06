<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>top-menu</title>
<link rel="stylesheet" type="text/css" href="css/main.css"/>
</head>

<body bgcolor="#eee">
    <div class="top_html">
    <table cellpadding="0" cellspacing="0" border="0" height="120" width="100%">
    	<tr><td>
        	<img src="images/logo.png" width="190" border="0" height="40" alt="logo" />
        </td></tr>
    	<tr><td>
        	<table cellpadding="0" cellspacing="0" border="0" class="top_table">
            	<tbody>
                	<tr><th background="images/angel.png" ></th><td>&nbsp;</td><th background="images/angel-2.png"></th></tr>
                	<tr><td></td>
                    	<td>
                        	<a href="/main.jsp" target="_parent"><img src="images/home.png" width="33" height="26" alt="home" /></a>
                        	<s:property value="#session.username" />
                        </td>
                        <td></td></tr>
                </tbody>
            </table>   
        </td></tr>
    </table>
    </div>
</body>
</html>
