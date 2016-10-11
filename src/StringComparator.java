import java.util.Scanner;

class StringComparator {

	public static void main(String[] args) {
		 Scanner scannerObject = new Scanner(System.in);
		  int flag;
		  String str1=scannerObject.next();
		  String str2=scannerObject.next();
		  flag = str1.compareTo(str2);
		  if (flag == 0){
		   System.out.println(" The two strings are the same.");
		   }
		  else{
		   System.out.println("The two strings are not the same.= ");
		   }
	}

}
