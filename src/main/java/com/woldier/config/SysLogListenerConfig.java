package com.woldier.config;

import com.woldier.auth.log.event.SysLogListener;
import com.woldier.service.LogService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SysLogListenerConfig {

    @Bean
    @ConditionalOnMissingBean //没有该类才加载
    public SysLogListener getSysLogListener(LogService logService){
        return new SysLogListener((optLogDTO -> logService.save(optLogDTO)));
    }
}
