public class Barista {
        private String mesin;
        private String grinder;
        private String ketel;
        private String steamer;
        private String bijikopi;
        private String susu;
        private String air;
        private String gula;

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

        public String getMesin() {
            return mesin;
        }

        public void setMesin(String mesin) {
            this.mesin = mesin;
        }

        public String getGrinder() {
            return grinder;
        }

        public void setGrinder(String grinder) {
            this.grinder = grinder;
        }

        public String getKetel() {
            return ketel;
        }

        public void setKetel(String ketel) {
            this.ketel = ketel;
        }

        public String getSteamer() {
            return steamer;
        }

        public void setSteamer(String steamer) {
            this.steamer = steamer;
        }

        public String getBijikopi() {
            return bijikopi;
        }

        public void setBijikopi(String bijikopi) {
            this.bijikopi = bijikopi;
        }

        public String getSusu() {
            return susu;
        }

        public void setSusu(String susu) {
            this.susu = susu;
        }

        public String getAir() {
            return air;
        }

        public void setAir(String air) {
            this.air = air;
        }

        public String getGula() {
            return gula;
        }

        public void setGula(String gula) {
            this.gula = gula;
        }
}
