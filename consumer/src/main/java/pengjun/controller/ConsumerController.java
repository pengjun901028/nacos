package pengjun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pengjun.service.CustomerService;

/**
 * 创建服务的消费者
 */
@RefreshScope
@RestController
public class ConsumerController {


    @Autowired
    private CustomerService customerService;

    @Value("${name}")
    private String name;

    /**
     * 消费服务
     */
    @RequestMapping("/callSayHello")
    public String services(@RequestParam("name") String name) {
        //customerService.addMoney(name);
        return name;
    }

    /**
     * 消费服务
     */
    @RequestMapping("/add")
    public String add(@RequestParam("name") String name) {
        customerService.addMoney(name);
        return "事务发起方";
    }
}