import java.util.Random;


public class Escort extends Starship implements IsDefense{

    public Escort(String newName) {
        Random rand = new Random();


        name = newName;


        int Hull= 1000 + (rand.nextInt(250)+1);
        int Shields= 2500 + (rand.nextInt(1000)+1);
        int Beamweapons= 3000 + (rand.nextInt(500)+1);
        int Torpedoes= 10 + (rand.nextInt(10)+1);
    }

    public void showStats() {
        System.out.printf("%s, a Escort:\n", name);
        super.showStats();
    }
    }
