package com.jdbc.example;

public class BussLayer {
	 private DBManager dbm;
	 
	 public BussLayer(){
		 dbm = new DBManager();
	 }
	 
	 public void showData(){
		 System.out.println("Showing Data");
		 dbm.selectRecords();
	 }
	 
	 //INSERTION
	 public void insertData(String name, int roll, String city){
		 String query = "insert into student(NAME, ROLL, CITY) values('"+name+"','"+roll+"','"+city+"')";
		 if(dbm.RecordsManipulation(query)){
			 System.out.println("Records has been inserted successfully");
		 }
		 else{
			 System.out.println("Records has not been inserted successfully!!");
		 }
	 }
	 
	 //UPDATION
	 public void updateData(int roll, String name){
		 String query = "update student set NAME='"+name+"' where ROLL='"+roll+"'";
		 if(dbm.RecordsManipulation(query)){
			 System.out.println("Records has been updated successfully");
		 }
		 else{
			 System.out.println("Records has not been updated successfully!!");
		 }
	 }
	 
	 //DELETION
	 public void deleteData(int roll){
		 String query = "DELETE FROM student WHERE ROLL='"+roll+"'";
		 if(dbm.RecordsManipulation(query)){
			 System.out.println("Records has been deleted successfully");
		 }
		 else{
			 System.out.println("Records has not been deleted successfully!!");
		 }
	 }
}
