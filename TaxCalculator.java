import java.util.*;
class TaxCalculator{
	static int option;
	static String another;
	
	public static void withHoldingTax(){
		Scanner input=new Scanner(System.in);
		System.out.println("+----------------------------------------------");
		System.out.printf("|%50s","WITHHOLDING TAX               |\n");
		System.out.println("+----------------------------------------------\n");
		
		System.out.printf("%25s","[01] Rent Tax\n\n");
		System.out.printf("%33s","[02] Bank Interest Tax\n\n");
		System.out.printf("%31s","[03] Dividend Tax\n\n");
		System.out.printf("%22s","[04] Exit\n\n");
		
		System.out.print("Enter an option to continue - ");
		option=input.nextInt();
		
		switch(option){
			case 1:
				rentTax();
				break;
			case 2:
				bankInterestTax();
				break;
			default:
				System.out.println("Enter an valide option...");
		}
		
	}
	
	public static void bankInterestTax(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("+--------------------------------------------------------+");
		System.out.println("|                    BANK INTEREST TAX                  |");
		System.out.println("+--------------------------------------------------------+\n");
		
		System.out.printf("%-50s:"," Enter your bank interest per year\n");
	}
	
	public static void rentTax(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("+----------------------------------------------------+");
		System.out.println("|                RENT TAX                            |");
		System.out.println("+----------------------------------------------------+");
		
		System.out.println("\n");
		int rent;
		do{
			System.out.printf("%-20s:"," Enter your rent ");
			rent=input.nextInt();
		}while(rent<0);
		
		printPayableTax(rent);
	}
	public static void printPayableTax(int rent){
		Scanner input=new Scanner(System.in);
		double rentTax;
		if(rent >100000){
			rentTax=rent* 0.1;
			System.out.println("\n You should have to pay rent tax : "+rentTax);
		}else{
			System.out.println("\n You don't have to pay Rent Tax...");
		}
		System.out.print("\n\nDo you want to calculate another Rent Tax (Y/N) :");
		another=input.nextLine();
		
		AnotherProcess(another);
	}
	
	public static void AnotherProcess(String another){
		if(another.charAt(0)=='Y' || another.charAt(0)=='y'){
			rentTax();
		}else{
			homePage();
		}
	}
	
	public static void homePage(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("");
		System.out.println("\n\n=================================================================\n\n");
		
		System.out.printf("%33s","[1] Withholding Tax\n\n");
		System.out.printf("%29s","[2] Payable Tax\n\n");
		System.out.printf("%28s","[3] Income Tax\n\n");
		System.out.printf("%62s","[4] Social Security Contribution Levy (SSCL) Tax\n\n");
		System.out.printf("%33s","[5] Leasing Payment\n\n");
		System.out.printf("%22s","[6] Exit\n\n");
		
		System.out.print("Enter an option to continue - ");
		option=input.nextInt();
		
		switch(option){
			case 1: 
				withHoldingTax();
				break;
			default: 
				System.out.println("Enter an valid option!!!");
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		homePage();
		
		
	}
}
