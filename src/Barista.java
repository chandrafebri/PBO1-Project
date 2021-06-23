public class Barista {
        public String mesin;
        public String grinder;
        public String ketel;
        public String steamer;
        public String bijikopi;
        public String susu;
        public String air;
        public String gula;

        public void grindBiji () {
            System.out.println("Menghancurkan biji kopi menjadi bubuk");
        }
        public void steamSusu () {
            System.out.println("Susu telah menjadi foam");
        }
        public void makeEspresso () {
            System.out.println("Espresso sudah siap");
        }
        public void makeKopisusu () {
            System.out.println("Kopi Susu sudah siap");
        }

    public Barista() {
    }

    public Barista(String mesin, String grinder, String ketel, String steamer, String bijikopi, String susu, String air, String gula) {
        this.mesin = mesin;
        this.grinder = grinder;
        this.ketel = ketel;
        this.steamer = steamer;
        this.bijikopi = bijikopi;
        this.susu = susu;
        this.air = air;
        this.gula = gula;
    }

    public Barista(String grinder, String steamer, String bijikopi, String susu) {
        this.grinder = grinder;
        this.steamer = steamer;
        this.bijikopi = bijikopi;
        this.susu = susu;
    }
}
