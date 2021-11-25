package primitives;

public class TruthTable1 {
    public static void main(String[] args) {
        // visa and ticket

        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean canTravel = visa == myVisa && ticket == myTicket;

        System.out.println(canTravel);

        // ask question
        boolean online = false;
        boolean campus = false;

        boolean student = true;

        boolean askQuestion = student == online || student == campus;

        System.out.println("Can I ask question? " + askQuestion);

        // 90% or more attendance and score of 80 or more to pass this class

        int reqAttendance = 90;
        int reqScore = 80;

        int yourAttendance = 100;
        int yourScore = 79;

        boolean pass = yourAttendance >= reqAttendance && yourScore >= reqScore;
        System.out.println("Can I pass the course? >> " + pass);




    }
}
