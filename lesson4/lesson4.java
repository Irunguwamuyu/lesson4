package lesson4;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		System.out.println("Enter your Name:");
		Scanner in=new Scanner(System.in);
	     String a=in.next();
		System.out.println("Enter your Roll No:");
		String b=in.next();
		System.out.println("Enter the semester you are in:");
		double c=in.nextDouble();
		
		int marks[]=new int[4];
		int i;
		float total=0,avg;
		Scanner scanner=new Scanner(System.in);
		String unitNames[] = new String[4];
        int j;
        Scanner scanner2 = new Scanner(System.in);

        for(j=0; j<4; j++) {
            System.out.print("Enter Unit Names of Subjects in Order"+(j+1)+":");
            unitNames[j] = scanner2.next();
        }

        String unitCodes[] = new String[4];
        int k;
        Scanner scanner3 = new Scanner(System.in);

        for(k=0; k<4; k++) {
            System.out.print("Enter Unit Codes of Subjects"+(k+1)+":");
            unitCodes[k] = scanner3.next();
        }

        for(i=0; i<4; i++) {
            System.out.print("Enter Marks of the four Subjects"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
//        scanner.close();

        //Calculating average here

        avg = total/4;

        String grade;

        if(avg>=80)
        {
            System.out.print(grade = "A");
        }
        else if(avg>=60 && avg<80)
        {
            System.out.print(grade = "B");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.print(grade = "C");
        }
        else
        {
            System.out.print(grade = "D");
        }
        System.out.print("The student Grade is: "+ grade+"\n");

       

		System.out.println("\t\t\t\tDepartment of Computer Science");
		System.out.println("\t\t\t\t\tEnd semester Results");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Name:"+a+"\t\t\tRoll_No:"+b+"\t\t\tSemester:"+c);
		System.out.println("____________________________________________________________________________________");
		System.out.println("|"+"Unit Code\t\t\t"+"|"+"Unit name\t\t\t"+"|"+"Score");
		System.out.println("____________________________________________________________________________________");
		
		for(int z = 0; z<4; z++) {
			System.out.println("|"+unitCodes[z]+"\t\t\t\t"+"|"+unitNames[z]+"\t\t\t\t"+"|"+marks[z]);
			
		}
		
		
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("|Total:\t\t\t\t\t\t\t\t\t\t"+total);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("|Avarage:\t\t\t\t\t\t\t\t\t"+avg);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("|Grade:\t\t\t\t\t\t\t\t\t\t"+grade);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\tRecommendation|PASS");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Grading creteria\t\t\tOverall Grade(A-D)\t\t\tRecommend Pass");
		System.out.println("70-100\t\tA");
		System.out.println("60-70\t\tB");
		System.out.println("50-60\t\tC");
		System.out.println("40-50\t\tD");
		
		
		

	}

	}
