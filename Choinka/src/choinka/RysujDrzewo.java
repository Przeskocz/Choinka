package choinka;

public class RysujDrzewo extends Drzewo {

    public char[][] tablica;
    private int wiersze = 0;
    private int kolumny = 0;
    
    public RysujDrzewo(){
        super();
    }
    
    public RysujDrzewo(Kierunek k, int p){
        super(k,p);
    }
    
    public RysujDrzewo(Kierunek k, int p, char z){
        super(k,p,z);
    }
    

    private void buforujDrzewo() {
        switch (this.getKierunek()) {
            case UP:
            case DOWN:
                wiersze = this.getPoziomy();
                kolumny = this.getPoziomy() * 2 - 1;
                break;
            case LEFT:
            case RIGHT:
                wiersze = this.getPoziomy() * 2 - 1;
                kolumny = this.getPoziomy();
                break;
        }
        tablica = new char[wiersze][kolumny]; 
    }

    public void rysuj() {
        buforujDrzewo();
        switch (this.getKierunek()) {
            case UP:
            case DOWN:
                int upOrdown = (this.getKierunek()==Kierunek.DOWN) ? 1 : -1;
                int step = (this.getKierunek()==Kierunek.DOWN) ? 0 : wiersze - 1;
                for (int i = 0; i < wiersze; i++) {
                    for (int j = kolumny - 1; j >= 0; j--) {
                        if ((j > step && j < kolumny-step) || j==step) {
                            tablica[i][j] = this.getZnak(); 
                        }else
                            tablica[i][j] = ' ';
                    }
                    step=step+upOrdown;//
                }
                break;

            case LEFT:
            case RIGHT:
                int rightOrleft = (this.getKierunek()==Kierunek.RIGHT) ? 1 : -1;
                step = (this.getKierunek()==Kierunek.RIGHT) ? 0 : kolumny - 1;
                
                for(int i=0 ; i<kolumny; i++){
                    for(int j=wiersze-1; j>=0; j--){
                        if ((j > step && j < wiersze-step) || j==step) {
                            tablica[j][i] = this.getZnak(); 
                        }else
                            tablica[j][i] = ' ';
                    }
                    step=step+rightOrleft;//
                }
                break;
        }
        
        //wyswietla zawartosc tablicy
        for (char[] tablica1D : tablica) {
            // dopiero pętla wewnętrzna pobiera znaki
            for (char znak : tablica1D) {
                System.out.print(znak);
            }
            System.out.println("");
        }
    }
}
