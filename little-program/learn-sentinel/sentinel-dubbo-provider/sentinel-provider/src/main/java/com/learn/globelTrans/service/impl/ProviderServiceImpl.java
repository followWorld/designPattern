package com.learn.globelTrans.service.impl;

import com.learn.globelTrans.service.SentinelDubboService;
import org.springframework.stereotype.Service;

/**
 * ClassName: pr <br/>
 * Description: <br/>
 * date: 2020/12/15 11:17<br/>
 *
 * @author WLSH<br />
 */
@Service
public class ProviderServiceImpl implements SentinelDubboService {

    @Override
    public String sayHello() {
        return "hello world!";
    }
}
