package object;
public class NetFlix {
    /*
    `create following instance fields in the NetFlix-Class
        -accountName, userName, monthlyData
    `create a method that will update monthlyData for every usage
    `make sure this method takes parameter for data usage
    `run your code in a Test-Class
     */

    String accountName;
    String userName;
    static int monthlyData =  100;

    public static void usage(int usedData){
        monthlyData = monthlyData - usedData;
        System.out.println("you have left "+monthlyData+ " GB of monthly data");
    }



}
