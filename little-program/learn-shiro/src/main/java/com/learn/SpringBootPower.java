package com.learn;

import org.apache.shiro.spring.boot.autoconfigure.ShiroAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication(exclude = {ShiroAutoConfiguration.class},
        scanBasePackages = {"com.learn"})
public class SpringBootPower {
    private static final Logger log = LoggerFactory.getLogger(SpringBootPower.class);

    public static void main(String[] args) throws UnknownHostException {

        ConfigurableApplicationContext application = SpringApplication.run(SpringBootPower.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        log.info("-------application DONE----------\n");
        log.info("\n----------------------------------------------------------\n\t"
                + "Application Base-Boot is running! Access URLs:\n\t" + "Local: \t\thttp://localhost:" + port + path
                + "/\n\t" + "External: \thttp://" + ip + ":" + port + path + "/\n"
                + "----------------------------------------------------------");

    }

}
