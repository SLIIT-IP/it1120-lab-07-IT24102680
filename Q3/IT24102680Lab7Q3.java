import java.util.Scanner;

public class IT24102680Lab7Q3{
    public static void main(String[] args) {

	int i;
	double bill;
	char mode;

	Scanner input =new Scanner(System.in);

	for(i=1;i<=5;i++)
	{
		System.out.println("customer "+i);
		System.out.print("Enter total bill amount : ");
		bill=input.nextDouble();

		System.out.print("Enter the mode of payment : ");
		mode=input.next().charAt(0);

		if (mode=='c')
		 {
		    double discount=bill*(5/100.00);
		    System.out.println("Discount is : "+discount);
		    System.out.println("Amount to be paid : "+(bill-discount));
		 }

		else if(mode=='o')
		 {
		    System.out.println("No discount aplicatable");
		    System.out.println("Amount to be paid : "+bill);
		 }

		else
		 {
		     System.out.println("Payment mode is not valid");
		 }

		System.out.print("\n");	

	}

    }

}
