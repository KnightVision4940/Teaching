import java.util.Scanner;

public class Evan{
 static Scanner in = new Scanner(System.in);
 double number1 = in;
 String operation; = in;
 double number2; = in;
public static void main(String[] args) {

  System.out.println("list one of the numbers that you would like to be calculated!?!?!");
 number1=in.nextDouble();
  System.out.println("now i need to know the operation to use on your numbers");
 operation=in.next();
  System.out.println("now i neeeeedz your next number on which to be calculated!!!");
number2=in.nextDouble();

   
    calculated();
    //Put everything below in a method 
}
static void calculated(){

  double sadboybrad = 0;

  if(operation.equals("*")){
    sadboybrad = number1 * number2;
  }
  if(operation.equals("+")){
    sadboybrad = number1 + number2;
  }
  if(operation.equals("-")){
    sadboybrad = number1 - number2;
  }
  if(operation.equals("/")){
    sadboybrad = number1 / number2;
  }


  System.out.println(sadboybrad);
  
  System.out.println("this is thanks to the all new sadboybrad tech!!!!!!");

}


}