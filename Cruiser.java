import java.util.Random;


public class Cruiser extends Starship implements IsOffense{

    public Cruiser(String newName) {
        Random rand = new Random();


        name = newName;


        int Hull= 4000 + (rand.nextInt(500)+1);
        int Shields= 1000 + (rand.nextInt(1000)+1);
        int Beamweapons= 4000 + (rand.nextInt(1000)+1);
        int Torpedoes= 40 + (rand.nextInt(50)+1);
    }

    public void showStats() {
        System.out.printf("%s, a Cruiser:\n",name);
        super.showStats();
    }
}
