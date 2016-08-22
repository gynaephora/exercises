package exercises;

//created by Volodymyr Korzhovskyi 23.08.2016
/*
   Task: display a sequence of paired numbers
         from 0 to 20 at one string  
 */
public class DisplayPairNumber {
	 public static void main(String[] args) {
		 
		 	 
		 int i=11; //the counter
		 int n=20; //the largest number
		 String end=" ";
		 while(i>0){
			
			// 2 - arithmetic progression the difference 			 
	        System.out.print((n-2*(i-1))+end);
		    i--;
		 }
		 }
}
