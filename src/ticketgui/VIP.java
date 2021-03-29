package ticketgui;

public class VIP extends AbOptions { //Extend the properties of AbOptions class
    
    //Description of option
    
    public VIP(){
        
        description = "VIP Package";  //Name of selected package
        
    }
    
    //Cost of Stalls Sitting
    
    public double cost(){
        
        return 140.65; //Cost of selected package
        
    }
}
