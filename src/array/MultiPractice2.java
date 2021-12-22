package array;

public class MultiPractice2 {
    public static void main(String[] args) {

        String[][] brands = {{"Apple", "Lenova", "HP", "Dell", "Acer"},{"Samsung", "LG", "Sony"},{"Alexa", "Google", "Logitec", "JBL"}};

        double[][] prices = {{2500,1600, 1800, 1900,1100}, {2199, 1799, 1599},{79.99, 89.99, 64.99, 55.99} };


        for (int i=0; i< brands.length; i++){

            for (int j=0; j< brands[i].length; j++){

                System.out.println(brands[i][j]+" is $"+prices[i][j]);
                if (prices[i][j] >1000){
                    System.out.println("This device "+brands[i][j]+" is less than $1000 >"+prices[i][j]);
                }
            }

        }


    }
}
