import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = scan.nextLine();
		System.out.print("Enter Your Age : ");
		int age = scan.nextInt();
		System.out.print("Enter Your City : ");
		String city = scan.next();
		
		System.out.println();
		
		System.out.println("!!WELCOME TO LALAZA CAMERA SHOP!!");
		System.out.println("!!!!! BIG SALES !!!!! ");
		System.out.println("ITEM 1 ****Fujifilm X-T4   -RM 1500****");
		System.out.println("ITEM 2 ****Canon EOS R6    -RM 2000****");
		System.out.println("ITEM 3 ****Nikon Z6 II     -RM 1750****");
		
		System.out.println();
		
		System.out.print("Enter the item number (1,2,3)  : ");
		int number = scan .nextInt();
		double price = 0,dis,output;
		String camera = null;
		String choice;
		
		if(number==1) {
			 camera ="Fujifilm X-T4";
			price=1500;
		}else if(number==2) {
			camera ="Canon EOS R6";
			price=2000;
		}else if(number==3){
			 camera ="Nikon Z6 II";
			price=1750;
		}else {
			System.out.println("WRONG ITEM NUMBER !ENTER AGAIN ~");
		}
		
		System.out.print("Enter the quantity : ");
		int quantity = scan .nextInt();
		
		double total = price*quantity;
		if(total>3000) {
			dis = (total*20)/100;
		}else {
			dis = (total*10)/100;
		}
		
		
		
		
		output = total -dis;
		
		System.out.println();
		System.out.println("Thank You "+name+ " , "+age+" years old from "+city+" for buying "+camera);
		System.out.printf("Total price : RM%.2f%n",total);
		System.out.printf("Discount received : RM%.2f%n",dis);
		System.out.printf("Price to be paid : RM%.2f%n",output);
		System.out.println();
		
		System.out.println("THANK YOU AND PLEASE COME AGAIN !");
		
		
		
		
		
	}

}
