import java.util.Scanner;

public class Menu {
    
    public Scanner scanner;

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public Scanner getScanner() {
        return scanner;
    }

    public Menu(){
        setScanner(new Scanner(System.in));
    }

    public void startMenu(){

        System.out.println("Sind Sie bereits Kunde oder nicht?");
        System.out.println("1 -- Bereits bestehender Kunde");
        System.out.println("2 -- Neukunde");
        System.out.println("3 -- Alle Kunden ausgeben");
        String eingabe = getScanner().nextLine();

        if (eingabe.equals("1")){
            auswahlNutzer();
        }
        if (eingabe.equals("2")){
            createNutzer();
        }
        if (eingabe.equals("3")){
            showNutzer();
        }
        else {
            System.out.println("Ihre Eingabe ist nicht vergeben");
        }
        startMenu();
    }

    public void createNutzer(){
        System.out.println("Bitte gebe Sie einen Vornamen ein: ");
        String nutzerVorname = getScanner().nextLine();
        System.out.println("Bitte geben Sie einen Nachnamen ein: ");
        String nutzerNachname = getScanner().nextLine();
        System.out.println("Bitte geben Sie eine Nummer ein: ");
        String nutzerNummer = getScanner().nextLine();
        App.addNutzer(new Nutzer(nutzerVorname, nutzerNachname, nutzerNummer));

        System.out.println("Hallo " + nutzerNummer + " " + nutzerNachname + " ("+ nutzerNummer + ")");
        System.out.println(" ");
    }
    public void showNutzer(){
        for (Nutzer a : App.getAllNutzer()){
            if (a != null){
                System.out.println(a.getVorname() + " " + a.getNachname() + " " + a.getNummer());
            }
        }
    }

    public void auswahlNutzer(){
        System.out.print("Bitte wählen Sie ihren Benutzer aus:");
        int i = 0;
        System.out.println(" ");
        for (Nutzer a : App.getAllNutzer()) {
            if (a != null) {
                System.out.println(i + "  " + a.getVorname() + " " + a.getNachname() + " (" + a.getNummer() + ")"); 
                i++;
            }
        }
        String  x = getScanner().nextLine();
        int x_index = Integer.valueOf(x);
       System.out.println(x_index);

        
        System.out.println(" ");
       
    }

}
