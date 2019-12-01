package app;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import javax.tools.Diagnostic;

public class App {
    public static void main(String[] args) {
        int posició = 0;

        String arraytaulausuaris[][] = new String[7][30];
        String arraydades[] = new String[7];
        String datadenaixament[] = new String[3];
        int edadusuaris[] = new int[30];

        arraydades[0] = "Nom";
        arraydades[1] = "Cognom";
        arraydades[2] = "Adreça";
        arraydades[3] = "Població";
        arraydades[4] = "Data de Naixament(dd/MM/yyyy)";
        arraydades[5] = "Usuari";
        arraydades[6] = "Contrasenya";

        Boolean inici = false;

        for (int j = 0; j < arraytaulausuaris[0].length; j++) {
            for (int i = 0; i < arraytaulausuaris.length; i++) {

                arraytaulausuaris[i][j] = " ";

            }
        }

        while (!inici) {
            System.out.println(
                    "Si vols fer login selecciona l'opcio(1), si vols crear un compte selecciona la opcio (2), si vols sortir selecciona l'opcio (3) i si vols cercar selecciona l'opcio (4) - Si vols endreçar les edats dels usuaris prem (5) ");

            int opcio = Integer.parseInt(System.console().readLine());
            switch (opcio) {

            case 1:

                arraycomprova(arraytaulausuaris, edadusuaris);
                break;

            case 2:
                System.out.println("Has escollit l'opcio 2, ara crearas un compte");

                System.out.println("---------------------------------------------------");
                System.out.println("Introdueix el teu nom");
                arraytaulausuaris[0][posició] = System.console().readLine();

                System.out.println("Introdueix el teu cognom");
                arraytaulausuaris[1][posició] = System.console().readLine();
                System.out.println("---------------------------------------------------");

                System.out.println("Introdueix la teva Adreça");
                arraytaulausuaris[2][posició] = System.console().readLine();
                System.out.println("---------------------------------------------------");

                System.out.println("Introdueix la teva poblacio");
                arraytaulausuaris[3][posició] = System.console().readLine();
                System.out.println("---------------------------------------------------");

                boolean datacorrecta = false;
                String datanaixament = " ";

                while (!datacorrecta) {
                    datacorrecta = true;
                    System.out.println("Introdueix la teva Data de Naixament(dd/MM/yyyy)");
                    System.out.println("---------------------------------------------------");
                    datanaixament = System.console().readLine();

                    if (datanaixament.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                        datadenaixament = datanaixament.split("/");
                    } else {
                        System.out.println("Xiusplau introdueix la data amb els parametres correctes");
                        datacorrecta = false;
                    }
                }
                arraytaulausuaris[4][posició] = datanaixament;

                Date date = new Date();
                SimpleDateFormat dataparametre = new SimpleDateFormat("dd/MM/yyyy");
                String[] dataAvui = dataparametre.format(date).split("/");

                int edad = Integer.parseInt(dataAvui[2]) - Integer.parseInt(datadenaixament[2]);

                int mesavui = Integer.parseInt(dataAvui[1]);
                int mesusuari = Integer.parseInt(datadenaixament[1]);
                int dia = Integer.parseInt(dataAvui[0]);
                int diausuari = Integer.parseInt(datadenaixament[0]);

                if (mesusuari > mesavui) {
                    edad--;
                } else if (mesusuari == mesavui) {
                    if (diausuari > dia) {
                        edad--;
                    }
                }
                edadusuaris[posició] = edad;
                System.out.println(edad);

                System.out.println("Introdueix el teu usuari");
                String nomusuari = System.console().readLine();
                boolean nomrepe;

                nomrepe = true;

                while (nomrepe) {
                    nomrepe = false;

                    for (int j = 0; j < arraytaulausuaris[0].length; j++) {
                        if (nomusuari.equals(arraytaulausuaris[5][j])) {
                            System.out.println("Introdueix un altre nom d'usuari");
                            nomusuari = System.console().readLine();
                            nomrepe = true;
                        }
                    }
                }
                arraytaulausuaris[5][posició] = nomusuari;
                System.out.println("---------------------------------------------------");

                System.out.println("Introdueix la teva contrasenya ");
                String contrasenyaregistre = System.console().readLine();
                boolean contrasenyano = true;

                while (contrasenyano) {
                    contrasenyano = false;
                    
                    if (contrasenyaregistre.matches("(?=.*[a-z])(?=.*[A-Z]).{8,}")) {
                        arraytaulausuaris[6][posició] = contrasenyaregistre;

                    } else {
                        System.out.println("Contrasenta incorrecte, introdueix una altre");
                        contrasenyaregistre = System.console().readLine();
                        contrasenyano = true;
                    }
                }

                arraytaulausuaris[6][posició] = contrasenyaregistre;

                posició++;

                break;

            case 3:
                System.out.println("Has escollit l'opcio 3, ara sortiràs");
                inici = true;
                break;

            case 4:
                System.out.println("Cercador");
                String patro = System.console().readLine();
                Pattern patrosearch = Pattern.compile(patro);
                for (int j = 0; j < arraytaulausuaris[0].length; j++) {
                    for (int i = 0; i < arraytaulausuaris.length; i++) {
                        Matcher matched = patrosearch.matcher(arraytaulausuaris[i][j]);
                        if (matched.find()) {
                            System.out.println();
                            for (int x = 0; x < arraytaulausuaris.length; x++) {
                                System.out.println(arraytaulausuaris[x][j]);
                            }
                            break;
                        }

                    }
                }
                break;
            default:
                System.out.println("Opció incorrecta");
            }
        }
    }

    public static void arraycomprova(String[][] comprova, int[] edats) {
        System.out.println("Introdueix el teu nom d'usari");
        String usuari = System.console().readLine();
        System.out.println("Introdueix la teva contrasenya");
        String contrasenya = System.console().readLine();
        boolean inici = false;

        for (int j = 0; j < comprova[0].length; j++) {
            if (usuari.equals(comprova[5][j]) && contrasenya.equals(comprova[6][j])) {
                System.out.println("Has iniciat sesió, les teves dades seràn printades");
                for (int i = 0; i < comprova.length; i++) {
                    System.out.println();
                    System.out.print(comprova[i][j] + "\t");

                }
                inici = true;
                System.out.print(edats[j] + "\t");
            }

        }
        if (!inici) {
            System.out.println("Dades de sessió incorrectes");
        }
    }
}