public class Belag {
    String _belag;
    boolean vegetarisch;

    public Belag(String belag, boolean vegetarisch){
        this.setBelag(belag);
        vegetarisch = true;
    }

    public void setBelag(String belag) {
        this._belag = belag;
    }
    public String getBelag() {
        return _belag;
    }
}
