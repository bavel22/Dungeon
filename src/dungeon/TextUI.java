package dungeon;

import java.util.Arrays;
import java.util.List;

public class TextUI {

    Dungeon dungeon;
    Player player;
    List<Vampire> vampires;
    Map map;

    public TextUI(Dungeon dungeon, Player player, List<Vampire> vampires) {
        this.dungeon = dungeon;
        this.player = player;
        this.vampires = vampires;
        map = new Map(this.dungeon);

    }

    public void printTextUI() {

        System.out.println(this.dungeon.moves + "\n");
        System.out.println("@ " + player.currentX + " " + player.currentY);

        for (Vampire v : this.vampires
        ) {
            System.out.println("v " + v.vampX + " " + v.vampY);
        }
        System.out.println("\n");
        System.out.println();

        map.printMap();


    }

}
