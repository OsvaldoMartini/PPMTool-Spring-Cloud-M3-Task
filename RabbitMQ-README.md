### RabbitMQ Instructions

Source:

 https://www.youtube.com/watch?v=x9wwZAuub1w


Instal "otp_win64_22.1.exe" -> Earling Program Language

Install "rabbitmq-server-3.8.0.exe"


Execute the Management Pluggin

Folder:


C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.0\sbin\ 

 "rabbitmq-plugins.bat enable rabbitmq_management"
 
 Result Expected:
 ````
 
	Enabling plugins on node rabbit@DESKTOP-TO61OP8:
	rabbitmq_management
	The following plugins have been configured:
	  rabbitmq_management
	  rabbitmq_management_agent
	  rabbitmq_web_dispatch
	Applying plugin configuration to rabbit@DESKTOP-TO61OP8...
	The following plugins have been enabled:
	  rabbitmq_management
	  rabbitmq_management_agent
	  rabbitmq_web_dispatch

	set 3 plugins.
	Offline change; changes will take effect at broker restart.
	
````

  Restart the RabbitMQ Service
  
  Access: 
  
  http://localhost:15672/
  
  User: guest
  Password: guest