/*
This program is able to calculate the number of leap years in between a starting and  ending year.
*/
public class main {
    public static void main(String[] args) {
      int year1 = 0;
      int year2 = 4;
      int count = 0;
      //set years and initiate count
  
      if (year1 > year2){
        // Checks to make sure that the starting year is less than the ending year
        System.out.println("The starting year can't be greater than the ending year!");
      }
  
    else if(year1 == year2){
      //just in case the starting year is the same as the ending year
      if (year1 % 4 == 0){
        System.out.println(year1+" is a leap year");
      }
  
      else{
        System.out.println(year1+" is not a leap year");
      }
    }
  
  
    else{
      //Loop for the program
      for(int i = year1; i <= year2; i++){
  
        if(i % 4 == 0){
         count ++;
       }
     
      }
  
      System.out.println("There have been " + count + " leap years between " + year1 + " and " + year2);
      
    }
  
  
  }
  }