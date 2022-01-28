package MentoringWithAhmet.RecapJava;

import immutable.Phone;

public class StaticInstanceBlock {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1)What is static keyword and why do you use it?
    is a keyword(way) to make the methods etc.. belongs to the class.
    ***** the advantage of having static keyword is that you do not need to create an object
    to access the variables or methods.
    ***** the disadvantages of having static keywods is that you cannot override the methods
    once you call it.
    2)What is static block?
    is the block that can be called once(1 time it works) , it always executed first.
    3)What is static variable?
    **it makes the variables belongs to the class
    **it is shareable(changeable) --> common for each object
    **it can be accessed by other classes without creating an object.

     */

    {
        System.out.println("I am a instance block");
    }
    {
        System.out.println("I am a second instance block");
    }
    static{
        System.out.println("I am a static block");
    }
    static{
        System.out.println("I am the second static block");
    }
    public static void run(){
        System.out.println("people are running");

    }


}
