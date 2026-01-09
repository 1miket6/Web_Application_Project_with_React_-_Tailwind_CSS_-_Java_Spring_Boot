package com.mike.stickers.controller;

import com.mike.stickers.scopes.ApplicationScopedBean;
import com.mike.stickers.scopes.RequestScopedBean;
import com.mike.stickers.scopes.SessionScopedBean;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/scope")
@RequiredArgsConstructor
public class ScopeController {

    private final RequestScopedBean requestScopedBean;
    private final SessionScopedBean sessionScopedBean;
    private final ApplicationScopedBean applicationScopedBean;

    @GetMapping("/testRequest")
    public ResponseEntity<String> testRequestMapping() {
        requestScopedBean.setUserName("Request Mike Ting");
        return ResponseEntity.ok(requestScopedBean.getUserName());
    }

    @GetMapping("/test")
    public ResponseEntity<Integer> getApplicationVisitCount() {
        return ResponseEntity.ok(applicationScopedBean.getVisitCount());
    }

    @GetMapping("/testSession")
    public ResponseEntity<String> getSessionScope() {
        sessionScopedBean.setUserName("Session Mike Ting");
        return ResponseEntity.ok(sessionScopedBean.getUserName());
    }

    @GetMapping("/testApplication")
    public ResponseEntity<Integer> getApplicationScope() {
        applicationScopedBean.increaseVisitCount();
        return ResponseEntity.ok(applicationScopedBean.getVisitCount());
    }
}
