package com.makeorder.pack;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTest2Application {
    private static Logger logger = Logger.getLogger(SpringBootTest2Application.class);

    public static void main(String[] args) {
        logger.info("makeOrder Spring boot 启动开始!");
        SpringApplication.run(SpringBootTest2Application.class);
        logger.info("makeOrder Spring boot 启动完成!");
    }
}
