public class Resta {
    private int x;
    private int y;
    public Resta(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getDiferencia(){
        return this.x - this.y;
    }
    public void decrementar(){
        this.x--;
        this.y--;
    }
}
