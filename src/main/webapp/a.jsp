<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path+"/" ;
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>A页面</title>
<script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
<script type='text/javascript' src='<%=path %>/dwr/util.js'></script>

<script type='text/javascript' src='<%=path %>/dwr/interface/chatManager.js'></script>

<script type="text/javascript" src="main.js"></script>
</head>

<body onload="init()">
	<h3>A页面</h3>
	<input type="text" id="msg">
	<input type="button" id="btnSend" value="发送" onclick="send()">

	<ul id="messageList" style="list-style-type: none"></ul>
</body>
</html>
