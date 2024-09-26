package com.example.finance

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class FinanceDashboardApplicationSpec extends Specification {

    @Autowired (required = false)
    FinanceDashboardApplication application

    def "application context loads"() {
        expect: "the application is created"
        application
    }
}