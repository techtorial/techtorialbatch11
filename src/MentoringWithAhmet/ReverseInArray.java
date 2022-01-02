package MentoringWithAhmet;

public class ReverseInArray {

    /*
    print out each of the word and reverse them from array.

    String example= Hi guys how are you


    iH
    syug
    woh
    rea
    uoy
     */
    public static void main(String[] args) {
        //I need to access each of the words
        //I need to store these words and reverse them?
        String example= "Hi guys how are you";

       String []array= example.split(" ");

       for(int i=0 ; i<array.length;i++){
           String reverse="";
           for(int k=array[i].length()-1;k>=0;k--){
               reverse+=array[i].charAt(k);
           }
           System.out.println(reverse);
       }

    }

}
