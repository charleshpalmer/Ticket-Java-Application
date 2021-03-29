package ticketgui;

public class Adult extends AbDecorator{ //Extend the properties of AbDecorator class
    
    AbOptions tickets;
    
    public Adult(AbOptions b){
        
        this.tickets = b;
        
    }
    
    //Adding name of decorator onto the end of description of options
    
    public String getDescription(){
        
        return tickets.getDescription() + ", Adult"; //Description of Ticket
        
    }
    
    //Adding cost of decorator to the cost of Adult
    
    public double cost(){
        
        return 79.99 + tickets.cost(); //Cost of Ticket
        
    }
}
