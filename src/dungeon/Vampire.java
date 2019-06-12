package dungeon;

import java.util.List;
import java.util.Random;

public class Vampire {

    int vampX;
    int vampY;

    Dungeon dungeon;


    public Vampire(Dungeon dungeon) {

        this.dungeon = dungeon;
        this.vampX = new Random().nextInt(dungeon.lenght);
        this.vampY = new Random().nextInt(dungeon.height);



    }

    @Override
    public String toString() {
        return "v " + this.vampX + " " + this.vampY +"\n";
    }
}
