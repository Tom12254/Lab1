<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="UTF-8">
<!-- Head -->
<head>

	<title>家教服务系统</title>

	<!-- Meta-Tags -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- //Meta-Tags -->

	<!-- Style --> <link rel="stylesheet" href="css/style.css" type="text/css" media="all">



</head>
<!-- //Head -->

<!-- Body -->
<body>

	<h1>å®¶ææå¡ç³»ç»</h1>

	<div class="container w3layouts agileits">

		<div class="login w3layouts agileits">
			<h2>ç» å½</h2>
			<form action="query" method="post">
				<input type="text" Name="username" placeholder="ç¨æ·å" required="">
				<input type="password" Name="secretkey" placeholder="å¯ç " required="">
			
			<ul class="tick w3layouts agileits">
				<li>
					<input type="checkbox" id="brand1" value="">
					<label for="brand1"><span></span>è®°ä½æ</label>
				</li>
			</ul>
			<div class="send-button w3layouts agileits">
				
					<input type="submit" value="ç» å½">
				
			</div>
			</form>
			<a href="#">è®°ä½å¯ç ?</a>
			
			<div class="clear"></div>
		</div><div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >ä¼ä¸ç½ç«æ¨¡æ¿</a></div>
		<div class="register w3layouts agileits">
			<h2>æ³¨ å</h2>
			<form action="adduser" method="post">
				<input type="text" Name="username" placeholder="ç¨æ·å" required="">
				<input type="password" Name="secretkey" placeholder="å¯ç " required="">
				<input type="text" Name="email" placeholder="é®ç®±" required="">
				<input type="text" Name="phonenum" placeholder="ææºå·ç " required="">
			
			<div class="send-button w3layouts agileits">
			
					<input type="submit" value="åè´¹æ³¨å">
				
			</div>
			</form>
			<div class="clear"></div>
		</div>

		<div class="clear"></div>

	</div>

	
</body>
<!-- //Body -->

</html>