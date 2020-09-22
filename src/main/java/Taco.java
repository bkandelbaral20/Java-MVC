public class Taco {
    private String tortillas;
    private  String salsa;
    private String grill;

    public Taco(String tortillas, String salsa, String grill) {
        this.tortillas = tortillas;
        this.salsa = salsa;
        this.grill = grill;
    }

    public String getTortillas() {
        return tortillas;
    }

    public void setTortillas(String tortillas) {
        this.tortillas = tortillas;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getGrill() {
        return grill;
    }

    public void setGrill(String grill) {
        this.grill = grill;
    }
}
