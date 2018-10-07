package my.aeonmanmc.origin.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import my.aeonmanmc.origin.model.GameEntity;
import my.aeonmanmc.origin.model.GamePojo;
import my.aeonmanmc.origin.repo.GameRepo;

@Component
public class InventoryServiceImpl implements InventoryService {

	private final GameRepo gameRepo;

	@Inject
	public InventoryServiceImpl(GameRepo gameRepo) {
		this.gameRepo = gameRepo;
	}

	@Override
	public List<GameEntity> retrieveAllGames() {
		return gameRepo.findAll();
	}

	@Override
	public void addGame(GamePojo title) {

		GameEntity aGame = new GameEntity();
		aGame.setName(title.getName());
		aGame.setReleaseDate(title.getReleaseDate());

		gameRepo.save(aGame);
	}

}
