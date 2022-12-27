/*
 *Calculation.java
 *@author Emre Kavak
 *17th November 2022
 */

 public class Calculation{
	 //data members
	 private double price=0, highest;
	 private double average=0, sum=0;
	 private int itt=0, last;
	 double numberTop[] = new double [999];

	 //Setters
	 public void setItt(Integer itt){
	 	this.itt=itt;
	 }
	 public void setPrice(Double price){
	 	this.price = price;
	 }
	 public void setNumberTop(double [] numberTop){
		 this.numberTop=numberTop;
		 }

	 //Compute Methdos
	 public void compute1(){
		 sum = price + sum;
	 }
	 public void compute2(){
		 average = sum / itt;
	 }

	 public void compute3(){
		 highest = numberTop[0];
		 for(int i =0; i < numberTop.length; i++){
			 if(highest < numberTop[i]){
				 highest = numberTop[i];
			 }
		 }
	 }
	 public void compute4(){
		 for(int j=0; j<numberTop.length; j++){
			 if(highest == numberTop[j]){
			 	last = j;
				break;
			 }
		 }
	 }
	 //Getters
	 public int getLast(){
		 return last;
     }
	 public double getAverage(){
		 return average;
	 }


 }