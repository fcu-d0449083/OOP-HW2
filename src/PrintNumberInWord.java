import java.util.Scanner;

class PrintNumberInWord{

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
	
	int a;
	String b;
	
	  a =  scannerObject.nextInt();
	  
	if(a==1){b="ONE";}
	else if(a==2){b="TWO";}
	else if(a==3){b="THREE";}
	else if(a==4){b="FOUR";}
	else if(a==5){b="FIVE";}
	else if(a==6){b="SIX";}
	else if(a==7){b="SEVEN";}
	else if(a==8){b="EIGHT";}
	else if(a==9){b="NIGHT";}
	else{b="OTHER";}
	 System.out.println("The input integer is "+b);
	 
	}
}