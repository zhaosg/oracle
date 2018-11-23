package com.infosys.oracle;

import com.infosys.oracle.service.SyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=1)
public class StartupConfig implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(StartupConfig.class);

    @Autowired
    private SyncService syncService;
    @Value("${spring.datasource.url}")
    private String springDatasourceUrl;
    @Value("${spring.datasource.username}")
    private String springDatasourceUsername;
    @Override
    public void run(String... arg0) throws Exception {
        try {
            logger.info(springDatasourceUrl);
            logger.info(springDatasourceUsername);
            System.out.println(syncService.clear(arg0[1],arg0[0]));
        } catch (Exception e) {
            logger.error("",e);
        }
    }

}
