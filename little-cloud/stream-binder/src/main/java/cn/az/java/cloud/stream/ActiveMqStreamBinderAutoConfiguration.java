package cn.az.java.cloud.stream;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.stream.binder.Binder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author az
 */
@Configuration
@ConditionalOnMissingBean(Binder.class)
public class ActiveMqStreamBinderAutoConfiguration {

    @Bean
    public ActiveMqMessageChannelBinder activeMqMessageChannelBinder() {
        return new ActiveMqMessageChannelBinder();
    }
}
