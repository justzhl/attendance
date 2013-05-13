<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/teacher.css">
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
</head>
<body>
	<table cellpadding="0" cellspacing="0" border="1" class="submit_table">
	<s:action name="GetMyInstructorId" namespace="/teacher"></s:action>
    	<thead>
        	<tr><th colspan="3">&nbsp;</th></tr>
        </thead>
        <tbody>
            <select >
	            <s:iterator value="#request.myinstructorid" var="var">
	            	<s:property value="var"/>
	            </s:iterator>
            </select>
            <select>
	            <s:iterator value="#request.mytest" var="var1">
	            	<option value="<s:property value="var1"/>"><s:property value="var1"/></option>
	            </s:iterator>
            </select>
            <tr>
            	<td>通知时间</td>
                <td><input type="text"/></td>
                <td></td>
            </tr>
            <tr>
            	<td>通知内容</td>
                <td><textarea cols="20" rows="10" ></textarea></td>
                <td></td>
            </tr>
            <tr>
            	<td></td>
                <td><button type="submit" >提交</button></td>
                <td></td>
            </tr>
        </tbody>
    </table>
</body>
</html>