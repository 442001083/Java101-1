import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	Scanner xyz = new Scanner(System.in);
		System.out.println("enter yar of birth");
        int year = xyz.nextInt();
        xyz.nextLine();
        System.out.println("name");
        String name =xyz.nextLine();
        
        int age =(2021 - year);
        if (age >=  40)
        System.out.println("hi old man ("+name+"), your age is about "+age);
        else if (age <= 30 && age >=39 )
        System.out.println("hi golden aged man ("+name+"), your age is about "+age);
        else 
        System.out.println("hi young man ("+name+"), your age is about "+age);
        
        
        
        
        
	
     

	
		
		
	}
}
