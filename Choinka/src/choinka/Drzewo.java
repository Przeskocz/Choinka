package choinka;

public class Drzewo {

    private Kierunek kierunek;
    private int poziomy;
    private char znak;
    
    public Drzewo(){
        this.kierunek=kierunek.UP;
        this.poziomy=5;
        this.znak='*';
    }
    
    public Drzewo(Kierunek k, int p){
        this.kierunek=k;
        this.poziomy=p;
        this.znak='*';
    }
    
    public Drzewo(Kierunek k, int p, char z){
        this.kierunek=k;
        this.poziomy=p;
        this.znak=z;
    }
    
    
    public Kierunek getKierunek() {
        return kierunek;
    }

    public int getPoziomy() {
        return poziomy;
    }

    public char getZnak() {
        return znak;
    }
}
