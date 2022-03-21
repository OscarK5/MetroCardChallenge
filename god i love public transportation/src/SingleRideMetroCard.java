public class SingleRideMetroCard extends MetroCard
{

    // INSTANCE VARIABLES (if any)
    private boolean usable;



    // CONSTRUCTOR(S)
    public SingleRideMetroCard(){
        usable = true;
    }



    // METHODS (if any), including overridden methods
    @Override
    public boolean swipe(){
        if(usable){
            usable = false;
            return true;
        }
        else{
            return false;
        }
    }

}
