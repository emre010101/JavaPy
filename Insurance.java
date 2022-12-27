/*
 *4th of November 2022
 *author: Emre Kavak
 *Insurance.java
 */
 public class Insurance{
	 //data members
	 private double price;
	 private String name, cover;
	 private int cExcess;
	 private Boolean wScreen, hour24;



	 //Constructor
	 public void setInsurance(String name, double price, int cExcess, String cover, boolean wScreen, boolean hour24){
		 this.name = name;
		 this.price = price;
		 this.cover = cover;
		 this.cExcess = cExcess;
		 this.wScreen = wScreen;
		 this.hour24 = hour24;
	 }

	 //the method to display the company details which is stored in the array
	 public void present(){
		 System.out.println("The name: " + name);
		 System.out.println("The price: " + price);
		 System.out.println("The compulsarty excess: " + cExcess);
		 System.out.println("Cover policy of the company: " + cover);
		 System.out.println("Windscreen cover: " + wScreen);
		 System.out.println("24-hour helpline: " + hour24);
	 }

 }