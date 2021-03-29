package ticketgui;

public class Member extends AbDecorator{ //Extend the properties of AbDecorator class
    
    AbOptions tickets;
    
    public Member(AbOptions b){
        
        this.tickets = b;
        
    }
    
    //Adding name of decorator onto the end of description of options
    
    public String getDescription(){
        
        return tickets.getDescription() + ", Member"; //Description of Ticket
        
    }
    
    //Adding cost of decorator to the cost of Member
    
    public double cost(){
        
        return 49.99 + tickets.cost(); //Cost of Ticket
        
    }
}
