import java.util.Random;
import java.util.ArrayList;

public abstract class Starship {

protected String name;

    protected int Hull;
    protected int Shields;
    protected int Beamweapons;
    protected int Torpedoes;

    public void showStats() {
        System.out.printf("Hull: %3d\nShields: %3d\nBeam weapons: %3d\n Torpedoes: %3d\n",Hull,Shields,Beamweapons,Torpedoes);
    }



}
