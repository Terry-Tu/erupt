package xyz.erupt.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.erupt.auth.interceptor.LoginInterceptor;
import xyz.erupt.core.config.EruptProp;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * @author liyuepeng
 * @date 2018-12-20.
 */

@Configuration
public class MvcInterceptor implements WebMvcConfigurer {

    @Resource
    private LoginInterceptor loginInterceptor;

    @Resource
    private EruptProp eruptProp;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] allowFileType = {"js", "css", "svg", "eot", "woff", "woff2", "ttf", "png", "jpg", "gif", "pdf"};
        Set<String> types = new HashSet<>();
        for (String s : allowFileType) {
            types.add("/**/**." + s);
        }
        if (null != eruptProp.getAllowRequestFileType()) {
            for (String s : eruptProp.getAllowRequestFileType()) {
                types.add("/**/**." + s);
            }
        }
        types.add("/#/**");
        registry.addInterceptor(loginInterceptor).excludePathPatterns("/error")
                .excludePathPatterns(types.toArray(new String[0])).addPathPatterns("/**");
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/erupt/**").addResourceLocations("classpath:/erupt-web/");
//    }
}
