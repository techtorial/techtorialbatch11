package array;
public class MultiPractice1 {
    public static void main(String[] args) {

        // states of different regions in US
        // print out every state one by one

        String[][] states = { {"IL","OH"},    {"NY", "FL", "NC"},     {"CA", "WA", "OR","UT"}};

        for (String[] state: states ){
            for (String st : state){
                System.out.println(st);

            }
        }

    }
}
