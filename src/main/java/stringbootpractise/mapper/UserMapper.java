package stringbootpractise.mapper;

import org.apache.ibatis.annotations.*;
import stringbootpractise.models.UserModel;

import java.util.List;

/**
 * Created by Mazexal on 2017/7/27.
 */
public interface UserMapper {
    @Select("seelct * from user")
    @Results({
            @Result(property = "userSex",column = "user_sex"),
            @Result(property = "nickName", column = "nick_name")
    })
    List<UserModel> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex"),
            @Result(property = "nickName", column = "nick_name")
    })
    UserModel getOne(Long id);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);

}
