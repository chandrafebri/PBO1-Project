public class Makelatte extends Barista {
    private String es;
    private String krimer;
    private String taro;

    public void latte () {
        System.out.println ("Membuat Kopi Latte");
    }
    public void taroLatte () {
        System.out.println ("Membuat Kopi Taro Latte");
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getKrimer() {
        return krimer;
    }

    public void setKrimer(String krimer) {
        this.krimer = krimer;
    }

    public String getTaro() {
        return taro;
    }

    public void setTaro(String taro) {
        this.taro = taro;
    }

    @Override
    public void makeEspresso() {
        super.makeEspresso();
    }

    @Override
    public void makeKopisusu() {
        super.makeKopisusu();
    }
}
