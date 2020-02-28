package hhz.springboot.provider;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @ClassName: Demo1Application
 * @Description: TODO(概况)
 * @Author: huanghz
 * @Date: 2019/12/12 15:17
 */
@SpringBootApplication
@EnableServiceComb
public class ProviderApplication
{
    public static void main(String[] args) {
        new SpringApplicationBuilder().web(WebApplicationType.NONE).sources(ProviderApplication.class).run(args);
    }
}
