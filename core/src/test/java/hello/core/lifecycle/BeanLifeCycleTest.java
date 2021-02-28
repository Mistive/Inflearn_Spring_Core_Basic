package hello.core.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleTest {

    @Test
    public void lifeCycleTest(){
        //ApplicationContext 밑에 ConfigurableApplicationContext가 있고, 그 밑에 AnnotationConfigApplicationContext가 있다.
        ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        NetworkClient client = ac.getBean(NetworkClient.class);
        ac.close();
    }

    @Configuration
    static class LifeCycleConfig{
        @Bean
        public NetworkClient networkClient(){
            NetworkClient networkClient = new NetworkClient(); //처음 생성자를 호출 할 때 url이 없으므로 url = null. 따라서 connect = null.
            networkClient.setUrl("https://hello-spring.dev");   //객체를 다 생성한 다음에 url을 넣어줌...
            return networkClient;
        }
    }
}
