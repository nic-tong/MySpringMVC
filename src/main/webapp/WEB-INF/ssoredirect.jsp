<%@page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%> 
<html>
   <head>
		<script type="text/javascript"> 
		function countDown(secs){ 
	 //alert(surl); 
		 var jumpTo = document.getElementById('jumpTo');
	 	jumpTo.innerHTML=secs; 
	 	if(--secs>0){ 
	  	setTimeout("countDown("+secs+")",1000); 
		 }
		 else
	 	{  	
	  	location.href="http://192.168.21.53:8081/apphub/login"; 
		} 
} 
</script>
   </head>
   <body>
		<div class="container">
			<h2 class="text-center" style="color:#fcb759">账号或密码错误!</h2>
				<div class="col-lg-offset-2 col-lg-8 col-md-10">
				<div class="progress progress-striped active">
		  		<div class="bar" style="width: 40%;"></div>
			</div>
			<div  style="min-height:20em;">
				<p style="text-align:center; color:red;" >账号或密码错误!<span id="jumpTo">5</span>秒钟后跳转到
				<span style="text-decoration:underline"><a href="http://192.168.21.53:8081/apphub/login">统一登录门户网站</a></span></p>
				<script type="text/javascript">
					countDown(5);
				</script> 
			</div>
			</div>
			</div>
	</body>
</html>