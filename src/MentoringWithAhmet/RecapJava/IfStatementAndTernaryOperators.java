package MentoringWithAhmet.RecapJava;

public class IfStatementAndTernaryOperators {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1)The concepts are related with many of the technical questions



     */
    public static void main(String[] args) {
        int cat =20;
        int dog = 10;
        int rabbit=5;
        if(cat>dog&&rabbit<dog||cat<rabbit){
            System.out.println("I love the animals");
        }else{
            System.out.println("I do not like animal");
        }
        String name = (cat>dog&&rabbit<dog||cat<rabbit) ? "I LOVE ANIMALS":"I DON'T LIKE ANIMALS";
        String results =(cat>dog)? "yes":"no";
        System.out.println(results);
        System.out.println((cat<dog)? "yes":123);
    }

}
