package loops.forLoop;

public class PerfectNumber {
    public static void main(String[] args) {
        //perfect number
        //  if sum of the divisors (except number itself) equals to number, it is called perfect number > ex: 28

        // 1,2,4,7,14
        int number =496;
        int sum= 0;
        for (int divisor =1; divisor <= number/2; divisor++ ){


            if (number % divisor ==0){

                sum += divisor;
            }
        }
        if (number == sum){
            System.out.println(number + " is a perfect number");
        }else {
            System.out.println(number + " is NOT a perfect number");
        }


    }
}
