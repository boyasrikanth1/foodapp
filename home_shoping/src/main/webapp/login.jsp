<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style type="text/css">
*{
margin: 0px
}
body{
background-color:#7ec7ec
}
#back{
height: 700px
}
#back{
width: 600px
}
#back{
background-image:  url("https://media.istockphoto.com/id/1301022916/photo/online-shopping-concept-laptop-and-shopping-cart-on-blue-background.jpg?s=612x612&w=0&k=20&c=NEHJuIKcIjq4GRAZ2NxtCRnqhKa0p4eZHtzdT3zqT7k=");
background-repeat: no-repeat;
background-size: 600px 700px
}
#back{
margin-left: 400px
}
#back{
margin-top: 100px
}
#back{
border-radius: 50px
}
#title{
margin-left: 50px
}
#title{
color: #d01679
}
#login{
margin-left: 200px
}
#login{
color: #ce510d
}
#uname{
margin-left: 200px
}
#sc{
margin-left: 40px
}
#sc{
color: #7065c3
}
#iuname{
border-radius: 20px
}
#iuname{
width: 300px
}
#iuname{
height: 25px
}
#blogin{
width: 70px
}
#blogin{
height: 30px
}
#blogin{
margin-left: 350px
}
#blogin{
border-radius: 10px
}
#you{
margin-left: 450px
}
#you
{
margin-top: 80px
}
#you{
font-size: 40px
}
#ioc
{
margin-left: 300px
}
#ioc
{
margin-top: 40px
}
#ioc{
font-size: 30px
}
#wo{
margin-left: 300px
}
#wo{
color: red
}
</style>
</head>
<body>

<form action="login" method="post">
<div id="back">
<br><br>
<h1 id="title">Shop Me More.Com</h1>
<br>
<h4 id="sc">Enter Your Details For Security Purpose Only... </h4>
<br><br><br>
<h1 id="login">Login...</h1>
<div id="uname">
<br><br><br>
  <span class="input-group-text" id="basic-addon1">UserName@</span>
  <input type="text" class="form-control" placeholder="UserEmail" name="UserEmail" aria-describedby="basic-addon1" id="iuname">
</div>
<div id="uname">
<br><br><br>
  <span class="input-group-text" id="basic-addon1">Password@</span>
  <input type="password" class="form-control" placeholder="UserPassword" name="UserPasssword" aria-describedby="basic-addon1" id="iuname">
</div>
<br>
<%
String message=(String)request.getAttribute("message");
if(message!=null){
%>

<h3 id="wo"><%=message%></h3>
<%
}
%>
<div>
<br><br><br>
<button id="blogin">Login...</button>
</div>
<i class="fa-brands fa-google-play" id="ioc"></i> -Available On PlayStore
<br><br><br><br><br><br>
Government e Marketplace is a 100 percent Government owned Section 8 company setup under the aegis of Department of Commerce,<br> Ministry of Commerce and Industry for procurement of common use goods..
</div>
</form>
</body>
</html>