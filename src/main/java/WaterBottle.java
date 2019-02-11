public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public void takeDrink(){
        if (this.volume == 0){
            return;
        }
        else {
            this.volume -= 10;
        }
    }

    public void empty(){
        this.volume = 0;
    }
}
