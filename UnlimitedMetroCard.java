public class UnlimitedMetroCard extends MetroCard {
    private int daysRemaining;

    public UnlimitedMetroCard(){
        daysRemaining = 7;
    }

    public void dayPassed(){
        daysRemaining--;
    }

    @Override
    public boolean swipe(){
        if(daysRemaining > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
