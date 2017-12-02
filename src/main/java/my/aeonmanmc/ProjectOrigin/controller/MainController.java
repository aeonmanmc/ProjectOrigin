package my.aeonmanmc.ProjectOrigin.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import my.aeonmanmc.ProjectOrigin.model.GamePojo;
import my.aeonmanmc.ProjectOrigin.service.impl.InventoryServiceImpl;

@RestController
public class MainController {
	private Logger LOG = LoggerFactory.getLogger(MainController.class);

	@Inject
	private InventoryServiceImpl inventoryService;

	@GetMapping("add")
	public void addTitle() {
		LOG.info("Adding title at MainController");

		GamePojo title = new GamePojo();
		title.setName("Dark Souls");
		title.setReleaseDate(2011);

		inventoryService.addTitle(title);
	}
}
