package com.coder520.mamabuyuserserver.common.constants;



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
    @Value("${redis.password}")
    private String redisAuth;
    @Value("${redis.node}")
    private String redisNode;

    /*****redis config end*******/

    /***zk config start ***/
    @Value("${zk.host}")
    private String zkHost;
}
