<%@ page language="java" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
	<table dir="ltr" width="500" border="1" style="border-collapse:collapse">
	<caption>Here we assign header information to cells 
			by setting the scope attribute.
	</caption>
	<colgroup width="50%" />
	<colgroup id="colgroup" class="colgroup" align="center" 
			valign="middle" title="title" width="1*" 
			span="2" style="background:#ddd;" />
            <s:iterator value="entity" var="var">
	<thead>
		<tr>
			<th scope="col">Name</th>
			<th scope="col">Side</th>
			<th scope="col">Role</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><s:property value="#var.student_id"/></td>
			<td><s:property value="#var.student_name"/></td>
			<td><s:property value="#var.result"/></td>
		</tr>
	</tbody>
    </s:iterator>
</table>
</body>
</html>
