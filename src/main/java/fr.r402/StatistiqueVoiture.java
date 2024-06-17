import java.util.ArrayList;

public class StatistiqueVoiture implements Statistique{

    private ArrayList<Voiture> voitures;

    public StatistiqueVoiture(){
        voitures = new ArrayList<>();
    }

    @Override
    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    @Override
    public int prix() throws ArithmeticException {
        if (voitures.isEmpty()) {
            throw new ArithmeticException("Il n'y a pas de voiture.");
        }

        int totalPrix = 0;
        for (int i = 0; i < voitures.size(); i++) {
            Voiture voiture = voitures.get(i);
            int remise = (i / 5) * 5; // 5% de remise supplémentaire pour chaque groupe de 5 voitures
            remise = Math.min(remise, 20000); // La remise maximale est de 20 000 euros
            int prixAvecRemise = (int) (voiture.getPrix() - (voiture.getPrix() * remise / 100));
            totalPrix += prixAvecRemise;
        }

        return totalPrix;
    }

}