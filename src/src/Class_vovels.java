package src;
import java.util.Scanner;
 class Class_vovels {
 public static void main(String[] args) {
	 Scanner input =new Scanner(System.in);
	 System.out.print("type the letter");
	 char ch = input.next(). charAt(0);
 
if(ch == 'a' || ch =='e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'  ) {
	System.out.println("it is a vovel");
}
else
{ System.out.println("it is a constant");
}
}
}