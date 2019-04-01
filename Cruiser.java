import java.util.Random;


public class Cruiser extends Starship implements IsOffense{

    public Cruiser(String newName) {
        Random rand = new Random();


        name = newName;


        int Hull= 2000 + (rand.nextInt(500)+1);
        int Shields= 2000 + (rand.nextInt(2500)+1);
        int Beamweapons= 3000 + (rand.nextInt(1000)+1);
        int Torpedoes= 20 + (rand.nextInt(15)+1);
    }

    public void showStats() {
        System.out.printf("%s, a Cruiser:\n",name);
        super.showStats();
    }
}
