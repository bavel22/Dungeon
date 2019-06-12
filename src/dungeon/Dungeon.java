package dungeon;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {

     int lenght;
     int height;
     int vampires;
     int moves;
     boolean vampiresMove;

    int vampX;
    int vampY;

    int playerX;
    int playerY;

    private List<Vampire> vampireList;
    private Vampire vampire;


    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.lenght = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        createVampiresList();
        for (int i = 0; i < vampires; i++) {
            addVampires();

        }


    }

    public void createVampiresList() {

        this.vampireList = new ArrayList<Vampire>();


    }

    public void addVampires() {

        this.vampireList.add(new Vampire(this));
    }

    public List<Vampire> getVampireList() {
        return this.vampireList;
    }


}
