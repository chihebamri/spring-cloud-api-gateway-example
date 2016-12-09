package configuration

import feign.Logger
import feign.codec.ErrorDecoder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HelloClientConfiguration {
    @Bean
    ErrorDecoder errorDecoder() {
        new ErrorResponseDecoder()
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        Logger.Level.BASIC
    }
}
