package stringBuilder;

public class Practice {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        StringBuilder builder1 = new StringBuilder("Tectorial");

       // StringBuilder builder2 = "Java"; will not compile

        System.out.println(builder);
        builder.append("Winter");
        System.out.println(builder);

        builder.append(" is cold ");
        System.out.println(builder);//

        //=========
        String str = "";
        for (char ch = 'a'; ch <='z'; ch++){

            str +=ch;
            System.out.println(str);
        }
        System.out.println(str);

       StringBuilder builder2 = new StringBuilder();
        for (char ch = 'a'; ch <='z'; ch++){

            builder2.append(ch);
            System.out.println(builder2);
        }

    // ========================== "Winter is cold =====

        builder.append(33+" " );
        builder.append(" "+ false);
        System.out.println(builder);
        builder.append(" degree").append(" negative").append(" " + '&'+ " ");
        System.out.println(builder);

        StringBuilder success=new StringBuilder("Working Hard");
        success.append(" does not make you successful.");

        StringBuilder truth=success.append("Thinking hard makes you successful");
        System.out.println(success);
        System.out.println(truth);

        StringBuilder success1=new StringBuilder("Tech");
        success1.append("torial");

        StringBuilder truth1 = success1.append(" 2020");

        truth1.append(" Best").append(" Summer");

        success1.append("*****");

        System.out.println(success1);

        System.out.println(truth1);

    }


}
