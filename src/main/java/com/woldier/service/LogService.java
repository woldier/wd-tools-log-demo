package com.woldier.service;

import com.woldier.auth.log.entity.OptLogDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogService {
    public void save(OptLogDTO optLogDTO){
        log.debug("=========================================");
        log.debug(optLogDTO.toString());
        log.debug("=========================================");
    }
}
