package com.aizz.mindmingle;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.jasypt.util.text.AES256TextEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

@Import(EnableEncryptableProperties.class)
public class TokenTest {

    @Test
    void generate(){
        String txt = "";
        AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
        // 指定算法
        // 指定秘钥，和yml配置文件中保持一致
        textEncryptor.setPassword("");
        // 生成加密数据
        String encrypt = textEncryptor.encrypt(txt);
        System.out.println(encrypt);
    }
}
