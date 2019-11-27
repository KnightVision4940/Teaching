public class Example{
    public static void main(String[] args) {
       int x = 12;
       double var = 123.434;
       String bar = "hello";
       System.out.println("hello world");
       System.out.println(var);
       System.out.println(bar);
       var = 14;
       System.out.println(var);
       if(x==12){ 
           x=78;
       }
       if(x==12){
            System.out.println("Yo");
       }else if(x==23){
           System.out.println("to");
       }
       System.out.println(perimeter(23,3));
       world("Hello");
       world("bye");
       world("good");
    }
    static int perimeter(int l, int w){
        return (2*l)+(2*w);
    }
    static void world(String i){
        System.out.println(i);
    }
}