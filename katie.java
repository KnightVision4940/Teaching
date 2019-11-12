import java.util.Scanner; 
public class Katie{
  
 public static Scanner in=new Scanner(System.in);
  static int num1;
  static String oper;
  static int num2;
  public static void main(String[] args) {
    System.out.println("What number would you like to use?");
    num1=in.nextInt();
    System.out.println("What operation would you like to use?");
    oper=in.next();
    System.out.println("What number would you like to also use?");
    num2=in.nextInt();
    op();
 

  }
  public static void op(){
    if(oper.equals("+")){
      System.out.println(num1+num2);
       }
      else if(oper.equals("-")){
      System.out.println(num1-num2);
       }
      else if(oper == "*"){
      System.out.println(num1*num2);
       }
      else if(oper == "/"){
      System.out.println(num1/num2);
       }
  }
}
  