package javaprogramming;

public class Task_9_2 {

	public static void main (String[] args) {
	       
        String str= "Guvi", rstr="";
        char chr;
         
      for (int i=0; i<str.length(); i++)
      {
        chr= str.charAt(i);
        rstr= chr+rstr;
      }
      System.out.println("Reversed String: "+ rstr);
    }
}
