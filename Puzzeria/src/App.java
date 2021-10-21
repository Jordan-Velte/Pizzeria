public class App {

    static Nutzer[] _nutzer;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        _nutzer = new Nutzer[10];
        _nutzer[0] = new Nutzer("Rainer", "Schmidt", "12345");
        _nutzer[1] = new Nutzer("Samuel", "L´Jackson", "1");
        _nutzer[2] = new Nutzer("Bent", "Fenske", "2");
        _nutzer[3] = new Nutzer("Alkira", "Leitz", "2,1");

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


}
