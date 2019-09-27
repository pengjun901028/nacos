package pengjun.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {


    @Insert("INSERT INTO t_test1(app_name,app_version)VALUES(#{appName},#{appVersion}) ")
    void add(@Param("appName") String appName, @Param("appVersion") String appVersion);

}
