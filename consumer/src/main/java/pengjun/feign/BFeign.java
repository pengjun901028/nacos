package pengjun.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "spring-cloud-nacos-producer")
public interface BFeign {

    //分布式事务测试
    @RequestMapping("hello")
    void sayHello();
}

