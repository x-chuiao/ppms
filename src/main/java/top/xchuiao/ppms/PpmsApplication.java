package top.xchuiao.ppms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "top.xchuiao.ppms.dao")
@SpringBootApplication
public class PpmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PpmsApplication.class, args);
    }

}
