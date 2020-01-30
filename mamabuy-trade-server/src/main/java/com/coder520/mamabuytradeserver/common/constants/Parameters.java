package com.coder520.mamabuytradeserver.common.constants;



import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Data
public class Parameters {

//    @Value("#{'${security.noneSecurityPath}'.split(',')}")
//    private List<String> noneSecurityPath;



    /*****redis config start*******/
    @Value("${spring.redis.url}")
    private String redisNode;
    @Value("${spring.redis.password}")
    private String redisAuth;

    /*****redis config end*******/

    /***zk config start ***/
    @Value("${zk.host}")
    private String zkHost;

    @Value("${es.host}")
    private String esHost;
}
