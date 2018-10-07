package my.aeonmanmc.origin.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import my.aeonmanmc.origin.model.GamePojo;
import my.aeonmanmc.origin.service.InventoryService;

@RestController
public class MainController {
	private Logger LOG = LoggerFactory.getLogger(MainController.class);

	private final InventoryService inventoryService;

	@Inject
	public MainController(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}	
    

	@GetMapping("/games")
	public ResponseEntity<?> retrieveAllGames() {
		return new ResponseEntity<>(inventoryService.retrieveAllGames(), HttpStatus.OK);
	}

	@PostMapping("/games")
	public ResponseEntity<?> addNewGame(@RequestBody GamePojo gamePojo) {
		LOG.info("Adding new game at MainController : {}", gamePojo.toString());

		inventoryService.addGame(gamePojo);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}