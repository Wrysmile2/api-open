package com.yjw.apiclientsdk;

import com.yjw.apiclientsdk.client.ApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("api.client")
@Data
@ComponentScan
public class ApiConfigClient {

    private String accessKey;
    private String secretKey;

    @Bean
    public ApiClient apiClient(){
        return new ApiClient(accessKey,secretKey);
    }
}
