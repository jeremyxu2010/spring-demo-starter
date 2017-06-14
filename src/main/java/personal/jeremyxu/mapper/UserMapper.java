package personal.jeremyxu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;
import personal.jeremyxu.entity.User;

/**
 * Created by jeremy on 2017/6/14.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(NAME, AGE, ADDRESS) VALUES(#{name}, #{age}, #{address})")
    int insert(@Param("name") String name, @Param("age") Integer age, @Param("address") String address);
}
