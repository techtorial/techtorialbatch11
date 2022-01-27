package MentoringWithAhmet.RecapJava;

public class WrapperClasses {
    /*
    1)What is wrapper class?
    2)How many types of wrapper classes do you know?

   Wrapper Class: Once you start explaining something. Go WITH GENERAL TO DEEP:

   Is a process(way) to convert primitive data to object or object to primitive data.
   2)There are 2 ways of wrapper class
      *)Autoboxing:Once the data is converted from pirimitives to the object
      int a = 5;
      Integer number= new Integer(a);
      List<Integer> list = new ArrayList();
      list.add(a);

      *)Unboxing: Once the datya is converted from object to the primitives

       String number = String.Valueof(a)

     */
    public static void main(String[] args) {
        int a = 5;
        String fgg = String.valueOf(a);//Autoboxing
        int aghg = Integer.parseInt("123"); // unboxing
        System.out.println(aghg);

    }
}
