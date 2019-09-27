package pengjun;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pengjun.mapper.TestMapper;


import java.time.LocalDate;
import java.util.List;

@Service
public class serviceB {


    @Autowired
    private TestMapper testMapper;

    //事物的参与方
    @LcnTransaction //分布式事务注解
    @Transactional  //本地事务注解
    public void txlcn() {
        // 当前日期yyyy-MM-dd
        LocalDate localDate1 = LocalDate.now();
        testMapper.add("分布式事务"+localDate1, "结果呢B"+localDate1);
        System.out.print("xxx");
    }
}
