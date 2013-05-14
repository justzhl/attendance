<%@ page language="java" contentType="text/html; utf-8"    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/jquery.ui.core.min.js"></script>
<script type="text/javascript" src="js/jquery.ui.widget.min.js"></script>
<script type="text/javascript" src="js/jquery.ui.accordion.min.js"></script>
<script type="text/javascript" src="js/jquery.ui.menu.min.js"></script>
<link href="js/jquery-ui.min.css" rel="stylesheet" type="text/css" />
</head>

<body style="width:235px; font-size:62.5%">
<div id="accordion" class="ui-widget" style="margin-top:30px;">
    <h5 class="ui-accordion-header">
        <span class="ui-accordion-header-icon"></span>
        考勤
    </h5>
    <div>
    <ul id="top_menu">
    	<li><a href="#" value="/ajax/getmyattendance.html">出勤查询</a></li>
    	<li><a href="#" value="#">缺勤查询[紧张的开发中]</a></li>
    </ul>
    </div>
  <h5>请假申请</h5>
    <div>
    <ul id="sec_menu">
    	<li><a href="#">申请[紧张的开发中]</a></li>
    	<li><a href="#">状态[紧张的开发中]</a></li>
    	<li><a href="#">历史[紧张的开发中]</a></li>
    	<li><a href="#">补交[紧张的开发中]</a></li>
    </ul>
    </div>
  <h5>课程查询</h5>
    <div>
    <ul id="thr_menu">
    	<li><a href="#" value="/ajax/listpickedcourses.html">选课情况</a></li>
        <!--
    	<li><a href="#">状态</a></li>
    	<li><a href="#">历史</a></li>
    	<li><a href="#">补交</a></li>
        -->
    </ul>
    </div>
  	<h5>消息中心</h5>
    <div>
    <ul id="thi_menu">
    	<li><a href="#" value="/ajax/getteachmessages.html">教学通知</a></li>
        <!--
    	<li><a href="#">状态</a></li>
    	<li><a href="#">历史</a></li>
    	<li><a href="#">补交</a></li>
        -->
    </ul>
    </div>
   	<s:if test="#session.userinfo.getUsertype() == 2">
	  	<h5>教务中心</h5>
	    <div>
	    <ul id="teachersmessage">
	    	<li><a href="#" value="/teacher/showmessages.jsp">通知列表</a></li>
	    	<li><a href="#" value="/teacher/submit_messages.jsp">发布通知</a></li>
	        <!--
	    	<li><a href="#">历史</a></li>
	    	<li><a href="#">补交</a></li>
	        -->
	    </ul>
	    </div>
   	</s:if>
</div>

<script type="text/javascript">

$(document).ready(function(){
	$("#accordion").accordion({heightStyle:"content"});
	$("#top_menu").menu();
	$("#sec_menu").menu();
	$("#thr_menu").menu();
	$("#thi_menu").menu();
	$("#teachersmessage").menu();
	$("a").click(function(){
		var $target = $(this).attr("value");
		if(null == $target){
			$target = "/ajax/index.html";
		}
		$("#content_frame",parent.document.body).attr("src",$target);
		return false;
	});
});
</script> 
</body>

</html>