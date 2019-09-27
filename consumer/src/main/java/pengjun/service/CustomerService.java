package pengjun.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pengjun.feign.BFeign;
import pengjun.mapper.TestMapper;


@Service
public class CustomerService {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private BFeign bFeign;



    @LcnTransaction //分布式事务注解
    @Transactional  //本地事务注解
    public String addMoney(String name) {
        testMapper.add("分布式事务A", "结果呢A");
        bFeign.sayHello();
        //根据标识，是否抛出异常
        if (name.equals("aa")) {
            return "操作成功，请查看一下数据库验证！";
        } else {
            return 1 / 0 + "";
        }
    }
}
