package choinka;

public enum Kierunek {
    UP, DOWN, LEFT, RIGHT;
      
    public Kierunek getKierunek(int nr) throws Exception{ 
        switch(nr){
            case 1: return UP;
            case 2: return DOWN;
            case 3: return LEFT;
            case 4: return RIGHT;
            default: 
                throw new Exception("Błąd! \nPodano zły kierunek!");
        }
    }
    
    public Kierunek getKierunek(String nazwa) throws Exception{
        Kierunek name=null;
        nazwa = nazwa.toUpperCase();
        try{             
            name = Kierunek.valueOf(nazwa);
        }
        catch(IllegalArgumentException ex){
            System.out.println("Nieprawidlowy kierunek! "+ex.getMessage());
        }
        if(name!=null)
                return name;
            else
                throw new Exception("Błąd! \nPodano zły kierunek!");
    }
}
