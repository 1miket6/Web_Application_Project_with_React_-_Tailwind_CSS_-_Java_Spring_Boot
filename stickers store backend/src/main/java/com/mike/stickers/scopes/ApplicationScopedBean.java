package com.mike.stickers.scopes;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;

@Component
@ApplicationScope @Getter
@Slf4j
public class ApplicationScopedBean {

    private int visitCount;

    public void increaseVisitCount(){
        visitCount ++;
    }

    public ApplicationScopedBean() {
        log.info("ApplicationScopedBean initialized");
    }
}
