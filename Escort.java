import java.util.Random;


public class Escort extends Starship implements IsDefense{

    public Escort(String newName) {
        Random rand = new Random();


        name = newName;


        int Hull= 1000 + (rand.nextInt(1000)+1);
        int Shields= 2000 + (rand.nextInt(1000)+1);
        int Beamweapons= 2000 + (rand.nextInt(1050)+1);
        int Torpedoes= 12 + (rand.nextInt(11)+1);
    }

    public void showStats() {
        System.out.printf("%s, a Escort:\n", name);
        super.showStats();
    }
    }