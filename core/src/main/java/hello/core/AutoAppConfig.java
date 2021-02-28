package hello.core;


        import hello.core.member.MemberRepository;
        import hello.core.member.MemoryMemberRepository;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //현재 AppConfig에 수동으로 등록해준 것들을 제외 시키고 빈을 설정
        //충돌을 방지하기 위함.
)//자동으로 스프링빈으로 등록해줌
public class AutoAppConfig {
/*    @Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }*/
}
