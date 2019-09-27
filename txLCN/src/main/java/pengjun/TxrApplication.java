package pengjun;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableTransactionManagerServer
public class TxrApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxrApplication.class, args);
    }
}
