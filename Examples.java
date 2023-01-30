
package examples;
import java.util.Scanner;
public class Examples {
      public static void main(String[] args) {
      Scanner keyboard=new Scanner(System.in);
      double height;
      int choice;
      char gender;
      String input;
      double weight;
      System.out.print("Enter a distance in meters: ");
      height=keyboard.nextInt();
      while(height<0){
        System.out.print("no negtive value,Enter a distance in meters again: ");
        height=keyboard.nextInt();
      }
      keyboard.nextLine();
      input=keyboard.nextLine();
      System.out.println("your gender is:"+input);
      gender=input.charAt(0);
     do{
         manu();
         System.out.print("Enter your choice: ");
         choice=keyboard.nextInt();
         if(choice==1){
            weight=showKilometers(height,gender);
            System.out.println("the weight is"+weight);
         }
         else if(choice==2){
            weight=showInches(height,gender);
            System.out.println("the weight is"+weight);
         }
         else if(choice==3){
             weight=showFeet(height,gender);
             System.out.println("the weight is"+weight);
         }
         else if(choice==4){
             System.out.println("good bye");
         }
         else{
             System.out.println("wrong number");
         }
     }while(choice!=4);
    }
    
public static void manu() {
    System.out.println("""
                       1. Convert to kilometers
                       2. Convert to inches
                       3. Convert to feet
                       4. Quit the program"""); 
}
public static double showKilometers(double height,char gender){
    double kilometer;
    if(gender=='f' && gender=='F'){
        kilometer=22*(Math.pow(height-1, 2));
    }
    else{
        kilometer=22*(Math.pow(height, 2));
    }
    return kilometer;
}
    
public static double showInches(double height,char gender ){
    double inches=showKilometers(height,gender);
    double we=inches*2.2;
    return we;
}
public static double showFeet(double height,char gender){
    double feet=showKilometers(height,gender);
    double we=feet/5.60;
    return we;
}
}

 /*Scanner keyboard=new Scanner(System.in);
      int distance_in_meters;
      int choice;
      System.out.print("Enter a distance in meters: ");
      distance_in_meters=keyboard.nextInt();
      while(distance_in_meters<0){
        System.out.print("no negtive value,Enter a distance in meters again: ");
        distance_in_meters=keyboard.nextInt();
      }
     do{
         manu();
         System.out.print("Enter your choice: ");
         choice=keyboard.nextInt();
         if(choice==1){
            showKilometers(distance_in_meters);
         }
         else if(choice==2){
            showInches(distance_in_meters) ;
         }
         else if(choice==3){
             showFeet(distance_in_meters);
         }
         else if(choice==4){
             System.out.println("good bye");
         }
         else{
             System.out.println("wrong number");
         }
     }while(choice!=4);
    }
    
public static void manu() {
    System.out.println("""
                       1. Convert to kilometers
                       2. Convert to inches
                       3. Convert to feet
                       4. Quit the program"""); 
}
public static void showKilometers(int meters){
    double kilometers=meters*0.001;
    System.out.println(meters+" meters is "+kilometers+" kilometers");
    
}
public static void showInches(int meters){
    double inches=meters*39.37;
    System.out.println(meters+" meters is "+inches+" inches");
}
public static void showFeet(int meters){
    double feet=meters*3.281;
    System.out.println(meters+" meters is "+feet+" feet");
}*/


