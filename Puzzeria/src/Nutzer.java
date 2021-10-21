public class Nutzer {
    String _vorname;
    String _nachname;
    String _nummer;
    
    
    public Nutzer(String vorname, String nachname, String nummer){
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setNummer(nummer);

    }     
    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public void setNummer(String nummer) {
        this._nummer = nummer;
    }
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public String getNachname() {
        return _nachname;
    }
    public String getNummer() {
        return _nummer;
    }
    public String getVorname() {
        return _vorname;
    }

}
