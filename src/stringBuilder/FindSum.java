package stringBuilder;

public class FindSum {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("tusr4o_9_i_2");
        sum(stringBuilder);
    }

    // create a method to find sum of digits from a StringBuilder parameter
    // StringBuilder -> numbers = "tusr4o_9_i_2";

    public static void sum(StringBuilder builder){
        double sum =0;
        for (int i=0; i< builder.length(); i++){

            if (Character.isDigit(builder.charAt(i))){
//               String str = ""+ builder.charAt(i);
//              double num =  Double.parseDouble(str);
//                sum+= num;
                sum += Double.parseDouble(""+ builder.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
