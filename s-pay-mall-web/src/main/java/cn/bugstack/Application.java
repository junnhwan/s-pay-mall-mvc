package cn.bugstack;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zjh
 * @since 2025/11/30 14:14
 */
@SpringBootApplication
@Configurable
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}