package loops.forLoop;

public class DigitalClock {
    public static void main(String[] args) {


        // print hours and minutes for 12 hours of a day
        // ex: 0:0  0:1 ... 0:59 1:0 1:1 1:2 ............ 11:59

        label:
        for (int hour = 0; hour < 12; hour++) {

            inner:
            for (int minutes = 0; minutes <= 59; minutes++) {

                if (minutes >=10 && minutes <=12){
                    continue;
                }

                if (minutes >= 30) {

                    break label;
                }

                for (int sec = 0; sec <= 59; sec++) {

                    System.out.println(hour + " : " + minutes + " : " + sec);
                    if (sec ==10)
                    break ;
                }

            }

        }

    }
}
