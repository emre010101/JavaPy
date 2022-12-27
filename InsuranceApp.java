/*
 *InsuranceApp.java
 *@author Emre Kavak
 *4th November 2022
 */
 import java.util.Scanner;
 public class InsuranceApp{
	 public static void main (String args []){
		 //Declare variables
		 String name, cover="fully comprehensive";
		 Double price=0.00, average;
		 int cExcess, choice = 1, last;
		 int choice2, itt=0;
		 Boolean wScreen=true, hour24=true;
		 Scanner intruder;
		 Scanner homealone;

		 //Create objects
		 intruder = new Scanner(System.in);
		 homealone = new Scanner(System.in);
		 Insurance hdcs = new Insurance();
		 Insurance arr [] = new Insurance[999];  //Array is create with 999 number of space to avoid out of array errors
		 Calculation cal = new Calculation();
		 double numberTop [] = new double[999];


		 //Input
		 System.out.println("This application is designed to compare different car insurance companies which will be assigned by the user."
		 + "\n" + "The specifications that can added by user is listed below:" + "\n" +
		 "-Name" + "\n" + "-Price" + "\n" + "-Compulsary Excess" +
		 "\n" + "-Third Party Fire and Theft, or Fully Comprehensive" + "\n"
		 + "-Windscreen Cover" + "\n" + "-24 hour helpline");
		//Menu is displayed here
		while(true){
			System.out.println();
			System.out.println("Application Menu - Item Type: Car Insurance" + "\n" +
			"1 - Add an Insurance Company" + "\n" + "2 - Display the details of the first entered item " +
			"\n" + "3 - Display the details of the last entered item" + "\n" +
			"4 - Calculate and display the average value of the mandatory state of all the items entered until that point"
			+ "\n" + "5 - Calculate and display the Insurance with highest price" + "\n" +
			"6 - Exit application");

			do{    //input validition
				System.out.print("Enter your choice : ");
				while(!intruder.hasNextInt()){
					System.out.println("Please choose a valid number!");
					intruder.next();
				}
				choice = intruder.nextInt();
			 }while(choice <0);
			System.out.println();

			if(choice == 1){
				while(true){
					System.out.println("Please enter the name of the company");
					name = homealone.nextLine();
					if(!name.matches("[a-zA-Z ]*")){       //String validition including space
						System.out.println("Please enter a string");
							continue;
					}else{
						break;
					}
				}

				while(true){
					System.out.println("Please enter the insurance price (300-5000)");
					while(!intruder.hasNextDouble()){ //double validition
						System.out.println("Please enter a valid number");
						intruder.next();
					}
					price = intruder.nextDouble();
					if((price >= 300) && (price <= 5000)){  //price length validition
						break;
					}else{
						System.out.println("Unvalid primitive has entered, please try again");
							continue;
					}
				}

				while(true){
					System.out.println("Please enter the compulsarty excess amount(int)");
					while(!intruder.hasNextInt()){
						System.out.println("Please enter a valid number");
						intruder.next();
					}
					cExcess = intruder.nextInt();
							break;
				}

				do{
					System.out.println("Please enter cover policy of the company" + System.lineSeparator() +
					"Enter 1 for fully comprehensive, 2 for third-party fire and theft cover ");
					while(!intruder.hasNextInt()){
						System.out.println("Please enter a valid number");
						intruder.next();
					}
					choice2 = intruder.nextInt();
					if(choice2 == 1){
						cover = "fully comprehensive";
					}else if(choice2 == 2){
						cover = "third-party fire and theft cover";
					}else{
						System.out.println("Unvalid value has been typed");
						continue;
					}
				}while(choice2!=1 && choice2!=2);

				do{
					System.out.println("Does it have a windscreen cover? (for Yes:1, for No:2)");
					while(!intruder.hasNextInt()){
						System.out.println("Please enter a valid number");
						intruder.next();
					}
					choice2 = intruder.nextInt();
					if(choice2 == 1){
						wScreen = true;
					}else if(choice2 == 2){
						wScreen = false;
					}else{
						System.out.println("Unvalid value has been typed" + System.lineSeparator()
						+ "Please enter again.");
					}
				}while(choice2 != 1 && choice2 != 2);

				do{
					System.out.println("Does it have 24-hour helpline? (for Yes:1, for No:2)");
					while(!intruder.hasNextInt()){
						System.out.println("Please enter a valid number");
						intruder.next();
					}
					choice2 = intruder.nextInt();
					if(choice2 == 1){
						hour24 = true;
					}else if(choice2 == 2){
						hour24 = false;
					}else{
						System.out.println("Unvalid value has been typed" + System.lineSeparator()
						+ "Please enter again.");
					}
				}while(choice2 != 1 && choice2 != 2);

				arr[itt]=new Insurance();  //Creating new instance of the array
				arr[itt].setInsurance(name, price, cExcess, cover, wScreen, hour24); //seeting the values
				cal.setPrice(price);  //sending them over to instantiable class
				cal.compute1(); //to calculate the sum
				numberTop[itt] = price;  //to find the highest mandotary state
				cal.setNumberTop(numberTop); //setting the price

				itt = itt+1;
				cal.setItt(itt);

			}else if(choice == 2){
				if(itt > 0){
					System.out.println("Insurance company in index number: " + 0);
					arr[0].present(); //Array object index number 0 will be dispayed
				}else{
					System.out.println("Please insert some companies first");
					}

			}else if(choice == 3){
				if(itt > 0){ //checking whether menu option 1 have iterated before
					System.out.println("Insurance company in index number: " + (itt-1));
					arr[itt-1].present();
				}else{
					System.out.println("Please insert some companies first");
				}

			}else if(choice == 4){
				if(itt > 0){
					cal.compute2(); //Calculating the average of all the price inserted.
					average = cal.getAverage();
					System.out.println("The average price of items entered is :"+ average);
					System.out.println();
				}else{
					System.out.println("Please insert some companies first");
				}

			}else if(choice == 5){
				if(itt > 0){
					cal.compute3(); //finding the highest number in the array
					cal.compute4(); //finding which index number is the highest number is stored
					last = cal.getLast();
					System.out.println("The company with highest price details is below:");
					arr[last].present();
					System.out.println(); //another compute method
				}else{
					System.out.println("Please insert some companies first");
				}
			}else if(choice == 6){ //Terminates the program
				System.out.println("The system is terminating"+ System.lineSeparator()+
				"See you next time :)");
				break;
			}else{
				System.out.println("Please enter a valid number!"); //Checking whether any another number which is not menu option entered
					continue;
			}

		}


	 }
 }
