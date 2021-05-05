package cn.zm.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "school")
@Data
public class ConfigInfo {
    private String name;
    private String website;
}
