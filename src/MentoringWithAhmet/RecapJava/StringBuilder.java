package MentoringWithAhmet.RecapJava;

public class StringBuilder {
   /*
   1)WHAT IS THE DIFFERENCE BETWEEN STRING BUILDER AND STRING
    They are pretty useful for the framework in terms of mutability and
    immutability.
     *String is immutable
     *String has more methods and special methods.(like, startswith
     ,endswith,concat...etc)

     *StringBuilder is mutable.
     *StringBuilder has also special methods(like append, reverse,insert..)


    2)WHAT IS THE DIFFERENCE BETWEEN STRING BUILDER AND STRING BUFFER?
    *String Buffer and Hashtable are synchronized.(you guys know the meaning
    of it. For reference remember the art work)
    *Hashmap and String are not synchronized.

    */
   public static void main(String[] args) {
       String name = new String("Ahmet");
       java.lang.StringBuilder str = new java.lang.StringBuilder("Ahmet");
       str.reverse();


        String name5= new String("Ahmet");
       String name1  = "Ahmet";
       System.out.println(name.equals(name5));//true
       String name2= "Ahmet";
       System.out.println(name.equals(name1));// true"Ahmet"
       System.out.println(name==name1);//false
       System.out.println(name1==name2);




       System.out.println(name.equals(str)); // false

       name.concat(" Loves Java");
       str.append(" Loves Java");
       System.out.println(name.equalsIgnoreCase(String.valueOf(str))); // false
       System.out.println(name); // Ahmet
       System.out.println(str); // Ahmet Loves Java

   }
}
