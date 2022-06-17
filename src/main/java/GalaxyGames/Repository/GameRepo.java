package GalaxyGames.Repository;

import GalaxyGames.Model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface GameRepo extends JpaRepository<Games, Integer> {

    @Query("from Games where name = :name")
    public Games findGamesByName(@Param("name") String name);

    @Query("from Games where name = (select max(name) from Games)")
    public Games findGamesAlphabetically();



}
