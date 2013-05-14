<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <title>教务考勤系统</title>
    <style type="text/css">
    	@import "/css/demo_page.css";
    	@import "/css/demo_table.css";
		@import "/css/jquery-ui-1.7.2.custom.css";
		@import "/css/demo_table_jui.css";
    </style>
    <script src="/js/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script src="/js/jquery.dataTables.min.js" type="text/javascript"></script>
</head>

<body style="margin:0 auto;">
<div  id="dt_example">
    <div id="container" class="ui-toolbar ui-widget-header ui-corner-tl ui-corner-tr ui-helper-clearfix">
<table cellpadding="0" cellspacing="0" border="0" class="display" id="example">
	<thead>
		<tr>
        	<th>课程名</th>
        	<th>通知时间</th>
        	<th>提交时间</th>
        	<th>状态</th>
        	<th>内容</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td colspan="5" class="dataTables_empty">Loading data from server</td>
		</tr>
	</tbody>
</table>
    </div></div>
    <script type="text/javascript">
    	$(document).ready(function(){
			$("#example").dataTable({
				"bJQueryUI": true,
				"sPaginationType": "full_numbers",
				"bProcessing":true,
				"sAjaxSource":"/json/LeaveMessagesByStuSession.action",
				"aoColumns":[{"mData":"course_name"},
				             {"mData":"time"},
				             {"mData":"submit_time"},
				             {"mData":"checked"},
				             {"mData":"contents"}]
			});
		});
    </script>
</body>
</html>