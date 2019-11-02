package com.itmuch.cloud;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
public class PreZuulFilter extends ZuulFilter {

    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器优先级 ，越大越往后
     *
     * @return
     */
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否使用此过滤器
     *
     * @return
     */
    public boolean shouldFilter() {
        return true;
    }

    public Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();

        String remoteHost = request.getRemoteHost();
        log.info("请求的host：" + remoteHost);

        return null;
    }
}
