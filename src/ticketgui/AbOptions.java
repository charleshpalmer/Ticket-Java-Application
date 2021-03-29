package ticketgui;

public abstract class AbOptions {
    
    String description = "Unknown Option";
    
    
    //Using this for description of options
    
    public String getDescription(){
        
        return description;
        
    }
    
    //Using this for cost of options
    
    public abstract double cost ();  
    
}
