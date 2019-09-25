import javax.print.attribute.ResolutionSyntax;

/**
 * Grassacorporal
 */
public class Grassacorporal {

    public static void main(String[] args) {
         float alçada ; 
         float pes ;
         float grasacorporal;

       System.out.println("Introdueix la teva alçada");
       alçada  = Float.parseFloat(System.console().readLine());
       System.out.println("Introdueix el teu pes");
       pes = Float.parseFloat(System.console().readLine());
       grasacorporal = pes/(alçada*alçada);

       if (grasacorporal<=18.5)
       System.out.println("El teu imc es "+grasacorporal+" necessites pujar de pes");
        else if (grasacorporal<=24.9)
        System.out.println("El teu imc es "+grasacorporal+" tens un pes normal");
        else if (grasacorporal<=26.9)
        System.out.println("El teu imc es "+grasacorporal+" tens sobrepes de grau I");
        else if (grasacorporal<=29.9)
        System.out.println("El teu imc es "+grasacorporal+"  tens sobrepes de grau II");
        else if (grasacorporal<=34.9)
        System.out.println("El teu imc es "+grasacorporal+" tens obesitat de tipus I");
        else if (grasacorporal<=39.9)
        System.out.println("El teu imc es "+grasacorporal+" tens obesitat de tipus II ");
        else if (grasacorporal<=49.9)
        System.out.println("El teu imc es "+grasacorporal+" obesitat de tipus III");
        else if (grasacorporal>=50)
        System.out.println("El teu imc es "+grasacorporal+" obesitat tipus IV");


       
       

    }
}