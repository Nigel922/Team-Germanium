package GalaxyGames.Controller;


import GalaxyGames.Model.Games;
import GalaxyGames.Model.Customer;
import GalaxyGames.Service.GameService;
import GalaxyGames.Service.PurchaseService;
import GalaxyGames.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {

    GameService gameService;
    CustomerService customerService;
    PurchaseService purchaseService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

//          --- CUSTOMER PAGE ---

    // TO ADD CUSTOMER

    // TO GET USER BY USERNAME

    //


//          --- GAMES PAGE ---

    // TO GET ALL GAMES
    @GetMapping(value = "")
    public List<Games> getAllGames(){
        return gameService.getAllGames();
    }

    // TO GET GAMES BY NAME
    @GetMapping(value = "games/{name}")
    public Games getGameByName(@PathVariable String name){
        return gameService.getGameByName(name);
    }

    // TO GET GAMES ALPHABETICALLY



//      --- PURCHASE PAGE ---

    // TO GET CUSTOMER
    @GetMapping("{id}")
    public Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    // TO POST...?

    // TO ADD GAMES


    // TO DELETE A GAME
    @DeleteMapping("{name}")
    public void deleteGameByName(@PathVariable String name){
        gameService.deleteGameByName(name);
    }


//      --- CHECKOUT PAGE ---

    // DO WE ACTUALLY NEED ONE? WE HAVE AN ORDER QUERY ALREADY

}
