package dungeon;


public class Main {


    public static void main(String[] args) {

        run();


        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
    }

    private static void run() {

        Player player = new Player();
        Dungeon dungeon = new Dungeon(5, 7, 5, 11, false);
        TextUI textUI = new TextUI(dungeon, player, dungeon.getVampireList());



        textUI.printTextUI();



    }
}
