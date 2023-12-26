package com.dot.springbootinit.manager;

import javax.annotation.Resource;

import com.wwcr.springbootinit.manager.CosManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Cos 操作测试
 *
  * @author <a href="https://github.com/a-bleak-morning"dot</a>
 * 
 */
@SpringBootTest
class CosManagerTest {

    @Resource
    private CosManager cosManager;

    @Test
    void putObject() {
        cosManager.putObject("test", "test.json");
    }
}