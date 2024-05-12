public class Suma {
    private int x;
    private int y;
    public Suma(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getSuma(){
        return this.x + this.y;
    }
    public void incrementar(){
        this.x++;
        this.y++;
    }
}
