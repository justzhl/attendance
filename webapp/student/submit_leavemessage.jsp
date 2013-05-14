<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/js/jquery-1.9.1.min.js"></script>
<title>提交请假申请</title>
<script type="text/javascript">
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
	<form method="post" action="/student/SubmitLeaveMessage.action">
		请假时间：<input name="msg.time" type="text"/><hr/>
		课程：<select name="msg.instructor_id">
			<option value="1">大学物理I</option>
			<option value="2">大学物理II</option>
		</select><hr/>
		请假原因：<textarea name="msg.contents" cols="4" spans="4"></textarea><hr/>
		<input type="submit" value="提交" />
		
	</form>

</body>
</html>