public class GameManager implements GameService{
    private Gamer gamer;
    private Game game;

    @Override
    public void addGameToGamerLibrary(Gamer gamer,Game game) {

    }

    @Override
    public void addGame(Game game) {
        System.out.println("Oyun eklendi :"+game.Name);
    }
}
