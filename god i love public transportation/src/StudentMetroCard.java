public class StudentMetroCard extends MetroCard
{
    // INSTANCE VARIABLES (if any)
    private int swipesLeft;


    // CONSTRUCTOR(S)
    public StudentMetroCard(){
        swipesLeft = 3;
    }


    // METHODS (if any), including overridden methods
    public void resetSwipes(){
        swipesLeft = 3;
    }

    @Override
    public boolean swipe(){
        if(swipesLeft > 0){
            swipesLeft--;
            return true;
        }
        else{
            return false;
        }
    }
}