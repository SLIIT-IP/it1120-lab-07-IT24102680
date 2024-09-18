import java.util.Scanner;

public class IT24102680Lab7Q1A{

  public static void main(String[] args){

Scanner input = new Scanner(System.in);

int mark,sum = 0;
double average;
int count = 1;

System.out.println("Enter marks for four subjects:");

while(count<=4)
{
System.out.print("Enter subject mark " + count +": ");
mark = input.nextInt();
count++;
sum +=mark;
}

average = sum / 4.0;
System.out.println("\nAverage is : " + average);

if(average>=75 && average <= 100)
{
System.out.print("Overall Grade is : Distinction");
}
else if(average >= 50)
{
System.out.print("Overall Grade is : Credit");
}
else
{
System.out.print("Overall Grade is : Fail");
}

 }
}