public class Test10 {

   public static void main(String[] args) {

       float v1;
       float v2;
       System.out.println("Introdueix el primer numero");
       v1 = Float.parseFloat(System.console().readLine());
       System.out.println("Introdueix el segon numero");
       v2 = Float.parseFloat(System.console().readLine());
       
       System.out.println("El resultat de la resta : "+(int)v1+" i "+(int)v2+" es: "+(int)(v1-v2));
       System.out.println("El resultat de la suma: "+(int)v1+" i "+(int)v2+" es: "+(int)(v1+v2));
       System.out.println("El resultat de la divisió: "+(int)+v1+" i "+(int)v2+" es: "+(int)(v1/v2));
       System.out.println("El resultat de la multiplicació : "+(int)v1+" i "+(int)v2+" es: "+(int)(v1*v2));
    }

        
    

}