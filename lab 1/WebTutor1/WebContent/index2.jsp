<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<style>
	#header1{
		height:70px;
		width:420px;
		padding:5px;
		text-align:center;
		position: absolute;
		font-family:华文行楷;
		left:50px;
		top:0; }
	#header2{
		height:100px;
		width:400px;
		padding:5px;
		text-align:right;
		position: absolute;
		font-family:隶书;
		left:150px;
		top:50px;
		}
	#inform {
		float: left;
		margin: 5px;
		padding: 15px;
		background-color:rgba(255, 255, 255, 0.3); 
		width: 300px;
		height: 300px;
		border: 1px solid black;} 
	#nav {
		line-height:30px;
		background-color:rgba(255, 255, 255, 0); 
		height:300px;
		width:100px;
		float:left;
		padding:5px; 
		top:50px;}
	</style>
</head>
<body background="images\主楼.jpg">
<img src="images\校徽.jpg" width="70" height="70" />
 
	<div id="header1";class="a";align="center">
	 <h1 style="font-size:50px ;text-align:center">哈尔滨工业大学</h1></div>
	 <div id="header2";class="a";align="center">
	  <p style="font-size:30px">家教服务系统</div>
	  <p style="text-align:center">
	  <br><br><br><br>教师搜索
		<input style="font-size:40px;font-family:宋体;background-color:rgba(255, 255, 255, 0.3)" type="text" class="form-control">
			<button class="btn btn-primary" style="font-size:35px;background-color: #7ED321;color: #FFFFFF" >搜索</button>
		</p>
	<div id="nav"></div>
	<div id="inform">
		<h2>London</h2>
		<p>London is the capital city of England.</p>
		<p>It is the most populous city in the United Kingdom,
		with a metropolitan area of over 13 million inhabitants.</p>
	</div>
	<div id="inform">
		<h2>London</h2>
		<p>London is the capital city of England.</p>
		<p>It is the most populous city in the United Kingdom,
		with a metropolitan area of over 13 million inhabitants.</p>
	</div>
	<div id="inform">
		<h2>London</h2>
		<p>London is the capital city of England.</p>
		<p>It is the most populous city in the United Kingdom,
		with a metropolitan area of over 13 million inhabitants.</p>
	</div>
</body>
</html>