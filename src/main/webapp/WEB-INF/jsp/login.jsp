<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<head>
<style>
/* Style all input fields */
input {
  width: 50%;
  align:"center";
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
}

/* Style the submit button */
input[type=submit] {
  background-color: #4CAF50;
  color: white;
}

/* Style the container for inputs */
.container {
  background-color: #f1f1f1;
  padding: 20px;
}

/* The message box is shown when the user clicks on the password field */
#message {
  display:none;
  background: #f1f1f1;
  color: #000;
  position: relative;
  padding: 20px;
  margin-top: 10px;
}

#message p {
  padding: 10px 35px;
  font-size: 18px;
}

/* Add a green text color and a checkmark when the requirements are right */
.valid {
  color: green;
}

.valid:before {
  position: relative;
  left: -35px;
  content: "✔";
}

/* Add a red text color and an "x" when the requirements are wrong */
.invalid {
  color: red;
}

.invalid:before {
  position: relative;
  left: -35px;
  content: "✖";
}
</style>
</head>
<body>
<br/>
<h3 style="margin-left:25px;">Bank Application Login :</h3>
<p style="color:red">${error}</p>
<div class="login">

<form action="welcome" method="post">
  <input type="text" placeholder="Username" name="firstName" id="firstName" required>  
  <input type="password" placeholder="password" name="lastName" id="lastName" required> 
  <br/> 
  <a href="#" class="forgot">forgot password?</a>
  <br/>
  <input type="submit" value="Sign In">
  
</form>
</div>


</body>
</html>