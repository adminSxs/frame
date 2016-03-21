<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
<div class="container">

	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="form-group">
				<div class="display-1 text-warning text-center">用户登录</div>
			
			</div>
			<form action="user" method="post">
				<div class="form-group">
					<input type="text" name="username" id=""  class="form-control" placeholder="username:" required/>
				
				</div>
				<div class="form-group">
				<input type="password" name="password" class="form-control" placeholder="password:" id=""  required/>
				
				</div>
				<div class="form-group">
					<input type="submit" value="success" class="btn btn-success-outline btn-block" />
				
				</div>
			
		
			</form>
		</div>
		<div class="col-md-4">
		</div>
	</div>

</div>

<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/angular.js"></script>
</body>
</html>