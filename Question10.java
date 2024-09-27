import java.util.Scanner;

class Game{
    public String Name;
    public int MaxNumPlayers;

    public Game(String name, int maxNumPlayers){
        Name = name;
        MaxNumPlayers = maxNumPlayers;
    }
    @Override
    public String toString(){
        return "maximum number of players for " + Name + ": " + MaxNumPlayers;
    }
}

 class GameWithTimeLimit extends Game{
    public int TimeLimit;
    public GameWithTimeLimit(String name, int maxNumPlayers, int timeLimit){
        super(name, maxNumPlayers);
        TimeLimit = timeLimit;
    }
    @Override
    public String toString(){
        return super.toString() + "Time Limit for " + Name + ": " + TimeLimit + "Minutes";
    }
}

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a game: ");
        String gameName = scanner.nextLine();
        System.out.println("Enter max number of players: ");
        int maxNumPlayers = scanner.nextInt();
        scanner.nextLine();

        Game game = new Game(gameName, maxNumPlayers);
        System.out.println(game.toString());
        System.out.println("Enter a game that has a time limit: ");
        String gameWithTimeLimitName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter maximum number of players: ");
        int maxNumPlayersWithTimeLimit = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter time limit in Minutes :");
        int timeLimit = scanner.nextInt();
        scanner.nextLine();

        GameWithTimeLimit gameWithTimeLimit = new GameWithTimeLimit(gameName, maxNumPlayersWithTimeLimit, timeLimit);
        System.out.println(gameWithTimeLimit.toString());
    }
}
