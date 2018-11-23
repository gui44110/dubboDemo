package com.dyl.comsumer;

import com.dyl.dubbo.demo.DubboDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dongyuliang@meicai.cn
 * @Date: 2018/11/23 11:38
 */
public class Comsumer {

        public static void main(String[] args) {
            //测试常规服务
            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("consumer.xml");
            context.start();
            System.out.println("consumer start");
            DubboDemoService demoService = (DubboDemoService) context.getBean(DubboDemoService.class);
            System.out.println("consumer");
            System.out.println(demoService.sayHello("world"));
        }

}
