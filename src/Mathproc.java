import java.util.*;

class Mathproc {
     Random Xval = new Random();
     Random Yval = new Random();
     Random Divhel = new Random();
     Random Arithsymb = new Random();
     int Arith;
     int y;
     int x; 
     int Canswer;
     int Divnum;
     double percentC; // Percentage value correct
     int numbC = 0;
     
     public void setX(){
     	x = Xval.nextInt(10) + 1;
     }
     
     public void setY() {
     	y = Yval.nextInt(10) + 1;
     }
     
     public void setArith() {
     	Arith = Arithsymb.nextInt(4) + 1;
     }
     public void setYdiv(){
     	y = Divhel.nextInt(4) + 1;
     	x = x * y;
     	
     }
     public void PC() {
     	percentC = (numbC*10);
     	System.out.println("\nYou have gotten " + percentC + "% correct");
     	if(percentC < 30){
     		System.out.println("your brain age is 7-10");
     	} else if (percentC > 30.0 && percentC < 50.0){
     		System.out.println("Your brain age is 11-15");
     	} else if (percentC > 50.0 && percentC < 75.0) {
     		System.out.println("Your brain age is 16-21");
     	} else if (percentC > 75) {
     		System.out.println("Your brain age is 25+");
     	}
     	
     }
     
     public void Mathrun() {
     	Scanner sc = new Scanner(System.in);
     	if(Arith == 1) {
     	System.out.print(x + "+" + y);
     	Canswer = (x + y);
     	System.out.println("=?");
     	}
     	else if(Arith == 2) {
     	System.out.print(x + "-" + y);
     	Canswer = (x - y);
     	System.out.println("=?");
     	}
     	else if(Arith == 3) {
     	setYdiv();
     	System.out.print(x + "/" + y);
     	Canswer = (x / y);
     	System.out.println("=?");
     	}
     	else {
     	System.out.print(x + "*" + y);
     	Canswer = (x * y);
     	System.out.println("=?");
     	}
      String Answer = sc.next();
         try {
         int i = Integer.parseInt(Answer.trim());
         if (i == Canswer){
         	System.out.println("Correct!");
         	numbC= numbC + 1;
         } else {
         	System.out.println("incorrect!");
         }
      } catch (NumberFormatException nfe) {
         System.out.println("NumberFormatException: " + nfe.getMessage());
      }


     }
    
}
