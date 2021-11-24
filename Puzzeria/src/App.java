public class App {

    static Nutzer[] _nutzer;
    static Belag[] belag;
    

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        _nutzer = new Nutzer[10];
        _nutzer[0] = new Nutzer("Rainer", "Schmidt", "12345");
        _nutzer[1] = new Nutzer("Samuel", "L´Jackson", "1");
        _nutzer[2] = new Nutzer("Bent", "Fenske", "2");
        _nutzer[3] = new Nutzer("Alkira", "Leitz", "2,1");

        /* MEGA */ 
        
        belag = new Belag[8];
        belag[0] = new Belag("Pepperoni", true);
        belag[0] = new Belag("Käse", true);
        belag[0] = new Belag("Tomaten", true);
        belag[0] = new Belag("Bananen", true);
        belag[0] = new Belag("Gürkchen", true);
        belag[0] = new Belag("Sülze", true);
        belag[0] = new Belag("Schinken", true);
        belag[0] = new Belag("Kabeljau", true);
        



        Menu a = new Menu();
        a.startMenu();
    }

    public static void addObject(Object a, Object[] array){
        int i = 0;
        for (Object b :array){
            if(b == null){
                array[i] = a;
                break;
            }
            i++;
        }
    } 
    public static void addNutzer(Nutzer nutzer){
        addObject(nutzer, getAllNutzer());
    }


    public static Nutzer[] getAllNutzer() {
        return _nutzer;
    }
    public static Belag[] getAllBelage() {
        return belag;
    }


}
