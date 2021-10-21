import java.util.Scanner;

public class Menu {
    
    public Scanner scanner;
    public String[] groesse = {"S", "M" , "L"};

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

        System.out.println("Wählen Sie nun die Größe ihrer Pizza aus: ");
        System.out.println("1 -- Größe S (3 Beläge)");
        System.out.println("2 -- Größe M (4 Beläge)");
        System.out.println("3 -- Größe L (5 Beläge)");
        String eingabeGroesse = getScanner().nextLine();

        if (eingabeGroesse.equals("1")){
            groesseS();
        }
        if (eingabeGroesse.equals("2")){
            groesseM();
        }
        if (eingabeGroesse.equals("3")){
            groesseL();
        }




        // String  x = getScanner().nextLine();
        // int x_index = Integer.valueOf(x);
        // System.out.println(App.getAllNutzer()[x_index].getVorname() + " " + App.getAllNutzer()[x_index].getNachname() + " (" + App.getAllNutzer()[x_index].getNummer() + ")");

        
        System.out.println(" ");
        startMenu();
    }
    int i = 0;
    public void groesseS(){
        if (i >=0 && i <=3){
            System.out.print("Bitte wählen Sie ihre Beläge aus:");
            System.out.println(" ");
            for (Belag a : App.getAllBelage()) {
                if (a != null) {
                    System.out.println(i + " -- " + a.getBelag()); 
                }
            }
        i++;
        }
    }
    int c = 0;
    public void groesseM(){
        if (c >=0 && c <=3){
            System.out.print("Bitte wählen Sie ihre Beläge aus:");
            System.out.println(" ");
            for (Belag a : App.getAllBelage()) {
                if (a != null) {
                    System.out.println(c + " -- " + a.getBelag()); 
                }
                c++;
            }
        }
    }
    int b = 0;
    public void groesseL(){
        
        if (b >=0 && b <=3){
            System.out.print("Bitte wählen Sie ihre Beläge aus:");
            System.out.println(" ");
            for (Belag a : App.getAllBelage()) {
                if (a != null) {
                    System.out.println(b + " -- " + a.getBelag()); 
                }
                b++;
            }
        }
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
        System.out.println(App.getAllNutzer()[x_index].getVorname() + " " + App.getAllNutzer()[x_index].getNachname() + " (" + App.getAllNutzer()[x_index].getNummer() + ")");

        
        System.out.println(" ");
       
    }

}
