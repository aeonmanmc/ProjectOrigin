package my.aeonmanmc.origin;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import my.aeonmanmc.origin.controller.MainController;
import my.aeonmanmc.origin.model.GamePojo;
import my.aeonmanmc.origin.service.InventoryService;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

	private MockMvc mockMvc;
	private ObjectMapper mapper;

	@InjectMocks
	private MainController mainController;

	@Mock
	private InventoryService testService;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
		mapper = new ObjectMapper();
	}

	@Test
	public void testA() throws Exception {

		// given
		GamePojo pojo = new GamePojo();
		pojo.setName("Dark Souls");
		pojo.setReleaseDate("2011");
		final String json = mapper.writeValueAsString(pojo);

		// when
		//Mockito.when(repo.findAll).thenReturn(list).andDo(print())
		//.andExpect(jsonPath("$.data.size()").value(1))
		//.andExpect(jsonPath("$.error").value("error"));
		
		// For void methods
		//Mockito.doNothing().when(testService).doSomething(pojo);
		
		
		// then
		mockMvc.perform(post("/games").contentType(MediaType.APPLICATION_JSON).content(json))
				.andExpect(status().isOk());
	}

	
	

}
