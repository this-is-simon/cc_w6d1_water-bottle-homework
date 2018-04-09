public class waterBottle {

    private int volume;

    public waterBottle(int volume) {
        this.volume = volume;
    }

    public int hasWater() {
        return this.volume;
    }

    public void drink() {
        this.volume -= 10;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }

}
