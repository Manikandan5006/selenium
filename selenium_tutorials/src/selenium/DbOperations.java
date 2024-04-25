package selenium;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
//		---------- ithu full and full java program than database oda interact pandrathuku ---------
		
		//step1: enna database use pana porannu sollanum , atha class.forname ndra method ahh use pabbi than sollanum, 
		//ithu entha maari nna selenium la enna webbrowswer use panna porannu driver ta soldramo antha maari tha
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step2: database oda connect pannanum , namma enna db use panna poramo athoda connect pannanum
		//athukku connection.sql la irunthu connection use pannanum
		 // driverManager la neraiya getconnection irukkum like getConnection(string) and getConnection(stringurl, property info) 
		//and getConnection(string url,string user, string password) ipdi neraiya irukkum, nan ennoda connection verum url mattum 
		//tharan so getConnection(null) nu eduthukuran, incase namma database ku user name and password set panniruntha namma athayum sethu than inga tharanum
		
		// getConnection(database name:localhost:port number/databasename,"username","password")
		//getConnection("jdbc:mysql:root$localhost:3303/myworkingdata","username,password");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/myworkingdata");
		
		//create a statement
		// namma database kku nnam sql statementsahh database ku send pannanunna intha createstatement Object thaan pannum
		
		//createStatement Object intha connection statement object la thaan irukku,so
		
		//intha craetestatement la than namma SQL queries ahh send panna poram
		
		
	 Statement statement = connection.createStatement();
	 
	 //intha statement ahh vachi thaan namma query ahh execute pannanum
	 
	   ResultSet result= statement.executeQuery("SELECT * FROM `table-admin`");
	   
	   // ippo nan antha table irukka ella recorsds yum edukkanum, athula evlo record irukkanun theriyathu so while loop
	   //use panni eduthukalam,  ethu varaikum loop run aaganunnaa, RESULTSET la NEXT() oru mthod irukku athu 
	   //table irukka last record varaikum eduthu kudukkum 
	 
	   while(result.next()) {
		   
		   System.out.println(result.getString(2) + result.getInt(1));
		   
	   }
	
		
		
		
		
	}

}
