package ticketgui;

public class ConcertTicket {

    public static void main(String[] args) {
        //Prints out Sitting price, then prints out Sitting price with Meet N' Greet
        AbOptions ex1;
        ex1 = new MeetNGreet();
        System.out.println(ex1.getDescription());
        System.out.println(ex1.cost());
        ex1 = new Member(ex1);
        System.out.println(ex1.getDescription());
        System.out.println(ex1.cost());
        
        //Prints out Stalls Standing price, then prints out Stalls Standing price with Meet N' Greet + Sound Check added
        AbOptions ex2;
        ex2 = new VIP();
        System.out.println(ex2.getDescription());
        System.out.println(ex2.cost());
        ex2 = new Member(ex2);
        System.out.println(ex2.getDescription());
        System.out.println(ex2.cost());
        ex2 = new Kids(ex2);
        System.out.println(ex2.getDescription());
        System.out.println(ex2.cost());
    }
    
}
