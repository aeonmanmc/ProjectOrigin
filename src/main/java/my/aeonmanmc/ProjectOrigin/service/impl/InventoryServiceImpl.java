package my.aeonmanmc.ProjectOrigin.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import my.aeonmanmc.ProjectOrigin.model.GamePojo;
import my.aeonmanmc.ProjectOrigin.model.Games;
import my.aeonmanmc.ProjectOrigin.repo.GameRepo;
import my.aeonmanmc.ProjectOrigin.service.InventoryService;

@Component
public class InventoryServiceImpl implements InventoryService {

	@Inject
	private GameRepo gameRepo;

	@Override
	public void addTitle(GamePojo title) {

		Games aGame = new Games();
		aGame.setName(title.getName());
		aGame.setReleaseDate(title.getReleaseDate());

		gameRepo.save(aGame);
	}

}
