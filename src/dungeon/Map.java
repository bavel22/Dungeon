package dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {


    Dungeon dungeon;
    String[][] map;
    List<Vampire> vampireList;


    public Map(Dungeon dungeon) {
        this.dungeon = dungeon;
        this.map = new String[dungeon.lenght][dungeon.height];


        for (String[] row : map)
            Arrays.fill(row, ".");
        for (String[] column : map)
            Arrays.fill(column, ".");



       vampireList = dungeon.getVampireList();

        for (Vampire v:vampireList
             ) { map[v.vampX][v.vampY] = "v";

        }
        map[0][0] = "@";
    }

    public void addPlayerToMap(Player player) {


    }

    public void addVampirestoMap() {

    }

    public void printMap() {




        for (String[] row : this.map) {
            for (String s : row) {
                System.out.print(s);
            }
            System.out.println();
        }
        System.out.println();
    }


}






