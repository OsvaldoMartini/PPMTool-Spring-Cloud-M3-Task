### DataBase View

 In Eclipse
 
 Windows -> Show View -> Data Source Explorer 
 
 -> Data Connections -> New ->
 
 
 DatabaseName: DB_A418F0_profile
 URL: jdbc:sqlserver://sql6007.site4now.net;databaseName=DB_A418F0_profile
 User Name: DB_A418F0_profile_admin
 Password: martini383940
 
 
 Driver Class: com.microsoft.sqlserver.jdbc.SQLServerDriver
 
 Jar File Utilized -> Folder:   '.../MsSQL_jars'
	
	'mssql-jdbc-6.2.2.jre8.jar' 
	
	
	
	#######
	
	## Incopatible Versions between  Spring Boot Starter Parent and MsSQL JDBC Driver
	
	
	### Use 2.0.5.RELEASE
	
	Use:
	````
	
		<version>2.0.5.RELEASE</version>
	
	````
	
	Instead of:
	````
			
			<version>1.4.1.RELEASE</version>
	
	````