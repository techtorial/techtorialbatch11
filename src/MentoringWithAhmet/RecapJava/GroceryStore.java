package MentoringWithAhmet.RecapJava;

public class GroceryStore {
   int numberofapplessoldperyear;
   double retailpriceofeachapple;
    int numberoforangessoldperyear;
    double retailpriceofeachorange;

    GroceryStore(int numberapple,double retailapple,int numbersoldorange,double retailorange){
       this.numberofapplessoldperyear= numberapple;
       this.retailpriceofeachapple=retailapple;
       this.retailpriceofeachorange=retailorange;
       this.numberoforangessoldperyear=numbersoldorange;
    }
    private GroceryStore(){

    }

    public void grossRevenue(String city){
        double revenue= (numberofapplessoldperyear*retailpriceofeachapple)
                +(numberoforangessoldperyear*retailpriceofeachorange);
        System.out.println("The revenue of the"+city+ " is " + revenue);
    }
    public double grossRevenue1(){
        double revenue= (numberofapplessoldperyear*retailpriceofeachapple)
                +(numberoforangessoldperyear*retailpriceofeachorange);
        return revenue;
    }
}
