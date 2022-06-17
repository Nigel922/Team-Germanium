package GalaxyGames.Service;

import GalaxyGames.Model.Games;
import GalaxyGames.Repository.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class GameService{

    GameRepo gameRepo;

    /** AUTOWIRE - wires a bean to this class
     * useful in singleton beans
     * a single object can be shared by multiple objects
     * **/

    @Autowired
    public GameService(GameRepo gameRepo){
        this.gameRepo = gameRepo;
    }

    public List<Games> getAllGames() {
        return gameRepo.findAll();
    }

    public Games getGameByName(String name) {
        return gameRepo.findGamesByName(name);
    }

    public Games getLastGamesAlphabetically(){
        return gameRepo.findGamesAlphabetically();
    }



    public void deleteGameByName(String name) {
    }
}


