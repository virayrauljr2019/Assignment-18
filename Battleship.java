import java.util.Random;


public class Battleship extends Starship implements IsOffense{

    public Battleship(String newName) {
        Random rand = new Random();


        name = newName;


        int Hull= 3000 + (rand.nextInt(2000)+1);
        int Shields= 1500 + (rand.nextInt(500)+1);
        int Beamweapons= 4000 + (rand.nextInt(1000)+1);
        int Torpedoes= 40 + (rand.nextInt(10)+1);
    }

    public void showStats() {
        System.out.printf("%s, a Battleship:\n",name);
        super.showStats();
    }
}
