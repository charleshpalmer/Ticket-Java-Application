package ticketgui;

public class Kids extends AbDecorator { //Extend the properties of AbDecorator class
    
    AbOptions tickets;
    
    public Kids(AbOptions b){
        
        this.tickets = b;
        
    }
    
    //Adding name of decorator onto the end of description of option
    
    public String getDescription(){
        
        return tickets.getDescription() + ", Kids"; //Description of Ticket
        
    }
    
    //Adding cost of decorator to the cost of Kids
    
    public double cost(){
        
        return 29.99 + tickets.cost(); //Cost of Ticket
        
    }
}
