package MentoringWithAhmet;

import java.util.*;

public class PracticeArrayArrayListMap {
    public static void main(String[] args) {
        PracticeArrayArrayListMap object= new PracticeArrayArrayListMap();
        object.PrintDairy();
        object.PrintChips();
        object.CookiesPrint();
        object.DairNameAndPrice();
    }
    //LETS DO IT STEP BY STEP:

    //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein
    String[]dairy = {"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Casein"};
    //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles
    String[] chips={"Lays", "Fritos", "Cheetos", "Doritos", "Ruffles", "Pringles"};
    //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand
    String[] cookies={"Nabisco","Oreo", "Nestle", "Amos", "SnackWell" ,"MaryLand"};
    //TASK 1:
    //  Create three more arrays to store the prices for these products.
    //dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69,
    double[] dairyPrice={2.99, 1.99, 3.99, 2.49, 0.99, 1.69};
    //chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69,
    double[] chipsPrice={3.99,  2.99,  4.99,  3.49,  1.99,  2.69};
    //cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69
    double[] cookiesPrice={4.99,  3.99,  5.99,  4.49,  2.99,  3.69};



    //TASK 2:
//    Create the method to print the Dairy.(do it with the list, think about the reason why )
    public void PrintDairy(){
        List<String> dairyList= new ArrayList<>();
        for(String product:dairy){
            dairyList.add(product);
        }
        System.out.println(dairyList);
        List<String>shortway=new ArrayList<>(Arrays.asList(dairy));
        System.out.println(shortway);
    }



//    Create the method to print the Chips.(do it with the list, think about the reason why )
public void PrintChips(){
    List<String> chipsList= new ArrayList<>();
    for(String product:chips){
        chipsList.add(product);
    }
    System.out.println(chipsList);
}

//    Create the method to print the Cookies (do it with the list, think about the reason why )
public void CookiesPrint(){
    List<String> cookiesList= new ArrayList<>();
    for(String product:cookies){
        cookiesList.add(product);
    }
    System.out.println(cookiesList);
}
    //TASK 3:
 //    Create the method to print the DairyPrice.(do it with the list, think about the reason why )


//    Create the method to print the ChipsPrice.(do it with the list, think about the reason why )


//    Create the method to print the CookiesPrice (do it with the list, think about the reason why )


    //TASK 4:
//    Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why )
    public void DairNameAndPrice(){
        Map<String,Double> listoftheDairyPrice = new LinkedHashMap<>();
        for(int i=0;i<dairy.length;i++){
            listoftheDairyPrice.put(dairy[i],dairyPrice[i]);
        }
        System.out.println(listoftheDairyPrice);
    }


//    Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why )


//    Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why )

    //TASK 5:
    // Do all Task4 in a same method


    //TASK 6:

    //Create a method with the parameter String nameofItem and find the price of the product ?



    //Create a method with the parameter String nameofItem and remove it from the map



    //Create a method with the parameter String nameofItem and replace it with the new product





}
