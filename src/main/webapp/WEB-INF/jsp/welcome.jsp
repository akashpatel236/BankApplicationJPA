<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
	<div>
		<div>
			<h2>Welcome ${c_name},</h2>
			
			<p> Your account balance is : ${balance}</p>
			
			<form action="processBalance" method="post">
			  <b>
			  <input type="hidden" value="${c_name}"  name="username"/>
			  <input type="hidden" value="${balance}"  name="balance"/>
			  
			  Please enter money to withdraw : <input type="number" step="any"  placeholder="1000" value="0" name="withdraw" id="withdraw">
			  <br/>  <br/>
  			  Please enter money to Deposit : <input type="number" step="any"  placeholder="50" value="0" name="deposit" id="deposit">
  			 </b>
  			 <br/><br/>
  			  <input type="submit" value="Update Balance">
  			</form>
  			
		</div>
	</div>
	<br/>
	<br/>
	<span><a href="/">Logout</a></span>
	
</body>
</html>
