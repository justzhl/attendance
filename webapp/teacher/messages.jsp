<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.9.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="../css/teacher.css">
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<script type="text/javascript">
	$(document).ready(function(){
		var $option = $("option");
		for(i=0;i<$option.size();i++){
			var param = $option[i].innerHTML.split('-');
			$("option")[i].value=param[0];
		}
	});
	<s:if test="hasFieldErrors()">
		$(function(){
			var errorstr = "";
			<s:iterator value="fieldErrors">
				<s:iterator value="value">
					errorstr+="<s:property/>"
				</s:iterator>
			</s:iterator>
			alert(errorstr);
		});
	</s:if>
</script>
</head>
<body>
	<table cellpadding="0" cellspacing="0" border="1" class="submit_table">
	<s:action name="GetMyInstructorId" namespace="/teacher"></s:action>
    	<thead>
        	<tr><th colspan="3">&nbsp;</th></tr>
        </thead>
        <tbody>
        <s:form action="/teacher/TeachMessage.action" method="post">
            <select name="record.instructor_id">
	            <s:iterator value="#session.myInstructorId" var="var1">
	            	<option value=""><s:property value="var1"/></option>
	            </s:iterator>
            </select>
            <tr>
            	<td>通知时间</td>
                <td><s:textfield name="record.time"></s:textfield></td>
                <td></td>
            </tr>
            <tr>
            	<td>通知内容</td>
                <td><s:textarea name="record.contents"></s:textarea>
                </td>
                <td></td>
            </tr>
            <tr>
            	<td> <s:fielderror name="record.contents"></s:fielderror></td>
                <td><button type="submit" >提交</button></td>
                <td></td>
            </tr>
        </s:form>
        </tbody>
    </table>
</body>
</html>