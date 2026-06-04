import java.util.*;
class TaxCalculator{
	static int option;
	
	public static void withHoldingTax(){
		Scanner input=new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("|                 WITHHOLDING TAX              |");
		System.out.println("-----------------------------------------------");
		
		System.out.printf("%30s","[01] Rent Tax\n");
		System.out.printf("%30s","[02] Bank Interest Tax\n");
		System.out.printf("%30s","[03] Dividend Tax\n");
		System.out.printf("%30s","[04] Exit\n\n");
		
		System.out.print("Enter an option to continue - ");
		option=input.nextInt();
		
	}
	
	public static void RentTx(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("------------------------------------------------------");
		System.out.println("|                RENT TAX                             |");
		System.out.println("------------------------------------------------------");
		
		System.out.printf("%15-6s:","Enter your rent ");
		int rent=input.nextInt();
		
		if(rent>0){
			
		}
		//validateRent(rent);
	}
	
	public static void HomePage(){
		Scanner input=new Scanner(System.in);
		System.out.println("");
		System.out.println("\n\n=================================================================\n\n");
		
		System.out.printf("%50s","[1] Withholding Tax\n");
		System.out.printf("%50s","[2] Payable Tax\n");
		System.out.printf("%50s","[3] Income Tax\n");
		System.out.printf("%50s","[4] Social Security Contribution Levy (SSCL) Tax\n");
		System.out.printf("%50s","[5] Leasing Payment\n");
		System.out.printf("%50s","[6] Exit\n\n");
		
		System.out.print("Enter an option to continue - ");
		option=input.nextInt();
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		HomePage();
		
	}
}
