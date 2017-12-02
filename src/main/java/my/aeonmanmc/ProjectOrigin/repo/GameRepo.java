package my.aeonmanmc.ProjectOrigin.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import my.aeonmanmc.ProjectOrigin.model.Games;

@Component
public interface GameRepo extends CrudRepository<Games, Integer> {

}
