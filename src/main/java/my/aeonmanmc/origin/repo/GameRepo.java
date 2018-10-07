package my.aeonmanmc.origin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.aeonmanmc.origin.model.GameEntity;

public interface GameRepo extends JpaRepository<GameEntity, Long> {

}
