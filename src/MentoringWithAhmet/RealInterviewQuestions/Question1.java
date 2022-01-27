package MentoringWithAhmet.RealInterviewQuestions;

public class Question1 {
    /*
    1-Create a method which accepts number1 and number parameters(int)
    2-Get the sum of two digits and return true(if it matching) or false(if it is not matching)
    Example positive Scenario : num1=45767
             num2=12
       Output=True;
   Example Negative Scenario:  num1=54342
                               num2=21
    Output=False;
     */
    //First of all I will need to reach out each of the number1
    //I need to add them and then compare with number2
    public static void main(String[] args) {
        int number1=54342;
        int number2=21;
        System.out.println(Results(number1,number2));
    }
    public static boolean Results(int number1,int number2){
        String[] numbers=(""+number1).split("");//54342.spl
        int[] nums = new int[numbers.length];
        for(int i = 0; i<numbers.length;i++){
            nums[i]=Integer.parseInt(numbers[i]);//54342
        }
        for(int j = 0 ; j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++ ){
                if(nums[j]+nums[k]==number2){
                    return true;
                }
            }
        }
        return false;
    }


}
