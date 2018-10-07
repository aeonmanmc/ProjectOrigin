package my.aeonmanmc.origin.service;

import java.util.List;

import my.aeonmanmc.origin.model.GameEntity;
import my.aeonmanmc.origin.model.GamePojo;

public interface InventoryService {

	List<GameEntity> retrieveAllGames();

	void addGame(GamePojo title);

}
