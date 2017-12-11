package choinka;
import java.util.*;
public class Choinka {
    
    public static String k;
    public static Scanner in = new Scanner(System.in);
    public static int poziomy;
    public static char znak;
    public static Kierunek kierunek=Kierunek.UP;
    
    public static RysujDrzewo podaj() throws Exception{
        System.out.print("Podaj kierunek choinki (1-UP, 2-DOWN, 3-LEFT, 4-RIGHT): ");
        k= in.next();

        if(k.length()>1 && !Character.isDigit(k.charAt(0)))
            kierunek=kierunek.getKierunek(k);
        else if(Character.isDigit(k.charAt(0))){
            int liczba = Integer.parseInt(k);
            kierunek=kierunek.getKierunek(liczba);
        }
        else{
            throw new Exception("Bledny kierunek");
        }

        System.out.print("\nPodaj ilośc poziomów choinki: ");
        poziomy = in.nextInt();
        
        System.out.print("\nPodaj znak do rysowania: ");
        znak=in.next().charAt(0);
        
        return new RysujDrzewo(kierunek,poziomy,znak);
    }

    public static void main(String[] args) throws Exception {
        
        RysujDrzewo ch1 = podaj();                
        ch1.rysuj();
        
    }
    
}
