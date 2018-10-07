package my.aeonmanmc.origin;

import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.any;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import my.aeonmanmc.origin.service.InventoryService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

	@Value("${anotherservice.url}")
	private String anotherServiceUrl;

	@Inject
	private InventoryService testService;

	@MockBean
	private RestTemplate restTemplate;

	@Test
	public void testA() {

		//final Object dto = new Object();
		// testService.doSomething(dto);

		//verify(restTemplate).postForObject(eq(anotherServiceUrl), anyObject(), anyObject());
	}
}