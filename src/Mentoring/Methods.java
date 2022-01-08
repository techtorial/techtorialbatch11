package Mentoring;

public class Methods {

     Methods() {
        System.out.println("This is from constructor");

    }

    public static void Methods(){
        System.out.println("This is method");

    }

    static public  void  main(String... dd) {
        Methods();
        // Every time you create an object it calls the constructor .
        // Constructor is a method without a return type with class name
        // We cannot make the constructor static.
        Methods methods = new Methods();
        Methods methods1 = new Methods();
        System.out.println(methods.equals(methods1));
        //
        System.out.println(methods==methods1);

        //
        // == sign it looks for where object is pointed .
        // Using new keyword creates a new pointer.
        // Pointing means with which object it saved into memory
        // It also looks for value of the both objects.
        // Equals method looks for value of object only
        int [] num = new int[]{1};
        int [] num1 = new int[]{1};
        System.out.println(num.equals(num1));
        System.out.println(num==num1);
    }
   public void trial ( int [] aa,int... y){

   }
}
