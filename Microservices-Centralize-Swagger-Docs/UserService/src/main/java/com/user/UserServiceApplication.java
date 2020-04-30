package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class UserServiceApplication {

  public static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(UserServiceApplication.class);


  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(UserServiceApplication.class);
    Environment environment = app.run(args).getEnvironment();
    String port = environment.getProperty("server.port");
    logger.info("Application Started with port {} ", port);
    logger.info("API Document :  http://localhost:{}/swagger-ui.html", port);
    logger.info(
        "Database Details: http://localhost:{}/h2-console  : access with URl : jdbc:h2:mem:emp_db , UserName:sa, password :  ",
        port);
  }


}
