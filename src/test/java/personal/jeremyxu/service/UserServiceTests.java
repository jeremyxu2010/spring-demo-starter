package personal.jeremyxu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceTests {

	@Autowired
	private UserService userService;

	@Test
    @Rollback
    @Transactional
	public void createUser() throws Exception {
        userService.createUser("BBB", 20, "test");
	}

}
