import java.util.Scanner;

public class IT24102680Lab7Q1B{
    public static void main(String[] args) {

	int i;
        int j;
        String grade;
        int total = 0;

        int mark[][] = new int[3][4];
        Scanner input = new Scanner(System.in);


        for (j = 0; j < 3; j++) 
	{
		for (i = 0; i < 4; i++)
		{
                    System.out.print("Enter subject mark : ");
                    mark[j][i] = input.nextInt();
                }

		for (i = 0; i < 4; i++)
		{
                     total = total + mark[j][i];
		}

                int avg = total / 4;

                if (avg > 74)
		{
		     grade = "destinction";
                } 
		else if ((75 > avg) && (avg > 49)) 
		{
                     grade = "credit";
                } 
		else 
		{
                     grade = "fail";
                }

                System.out.println("avarage is : " + avg);
                System.out.println("Grade is : " + grade);
	}
	

        }
    }
