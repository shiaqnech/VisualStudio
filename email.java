
public class email{

    public static void main(String[] args) {
        
        String nom; 
        String cognom;
        String domini;

        System.out.println("Introduiex el teu nom");
        nom = (System.console().readLine());
        System.out.println("Introduiex el teu cognom");
        cognom = (System.console().readLine());;
        System.out.println("Introdueix el domini que vols fer servir");
        domini = (System.console().readLine());

        System.out.println(""+nom+""+cognom+"@"+domini);

    }
}