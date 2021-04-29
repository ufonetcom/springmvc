package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        //로그를 절대 +로 붙여서 쓰면 안됀다!
        System.out.println("name = " + name);

        log.trace(" trace log={}", name);
        log.debug(" debug log={}", name); //개발서버에서 주로 출력

        //운영서버 에서는 이렇게 세개를 돌린다.
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);

        return "ok";
    }
}
