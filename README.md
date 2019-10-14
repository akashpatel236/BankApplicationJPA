# BankApplicationJPA
Springboot application - API for deposit/withdrawal 



1) Run the application

	Do mvn clean install (if running from command prompt) 
			or else run directly from IDE
			
2) Application port

	Tomcat server will be used to run application on Port 8090
	
	URL : http://localhost:8090/ (login page)
	
3) Login details

	3.1) First you need to load the customer data 
	
			-> Use SOAP UI or Postman to load the Customers data (using JPA)
			
			Url : http://localhost:8090/add
			content-type: application/json
			Method: Post
			
			Data 1:
			{
				"firstName":"Akash",
				"lastName":"Patel",
				"balance":"10000"
			}
			Data 2:
			{
				"firstName":"Test",
				"lastName":"test user",
				"balance":"100"
			}
	
	3.2) Once customers data is available, try to login with firstname, password can be anything
	
		-> if username(firstname) does not exist in Customer base then you will not be permmitted for login
	
	
4) After login, you can do withdraw/deposit operations



