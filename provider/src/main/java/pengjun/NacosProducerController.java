package pengjun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建服务
 */
@RestController
public class NacosProducerController {

    @Autowired
    private serviceB serviceB;
    @RequestMapping("/hello")
    public void sayHello() {
        serviceB.txlcn();
    }
}
