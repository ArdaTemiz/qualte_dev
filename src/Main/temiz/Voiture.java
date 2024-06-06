package Main.temiz;

import java.util.Objects;

public class Voiture {

    private String marque;
    private double prix;

    public Voiture(){

    }

    /**
     *
     * @param marque
     * @param prix
     */
    public Voiture(String marque, double prix){
        this.marque = marque;
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture voiture = (Voiture) o;
        return Double.compare(getPrix(), voiture.getPrix()) == 0 && Objects.equals(getMarque(), voiture.getMarque());
    }

}
