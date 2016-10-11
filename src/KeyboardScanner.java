import java.util.Scanner;

class KeyboardScanner{

	public static void main(String[] args) {
	
	 int a;
	 Scanner scannerObject = new Scanner(System.in);
	 System.out.println("enter an integer");
     a =  scannerObject.nextInt();
     
     
     System.out.println("enter a float point number");
     double b;
     
     b= scannerObject.nextDouble();
     
     
     System.out.println("enter a word");
     String word1=scannerObject.next();
     
     double c;
     c=b*a;
    		 
     System.out.println("HI,"+word1 );
     System.out.println("the multiplication of "+a );
     System.out.println("and "+b );
     System.out.printf("is %e . ",c );
     
 
	}

}
