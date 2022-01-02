package object;

public class PhoneTest {

    public static void main(String[] args) {

        Phone phone = new Phone();
//       phone.brand = "I-Phone";
//       phone.call(11111);

        System.out.println("******** "+phone.color);
       Phone phone1 = new Phone();


       Phone phone2 = new Phone("Pink");

        System.out.println(phone2.color);
        System.out.println(phone1.color);

        Phone phone3 = new Phone("Black","Samsung");


    }
}
