package personal.jeremyxu.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserMapperTests {

	@Autowired
	private UserMapper userMapper;


	@Test
    @Rollback
    @Transactional
	public void createUser() throws Exception {
        userMapper.insert("BBB", 20, "test");
	}

}
