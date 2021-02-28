package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository {


    //저장소로 이용할 HashMap을 설정해준다...
//여러군데에서 동시성 Issue가 있어서 concurrentHashMap을 원래 사용해야 함.
//하지만 단순 개발용이니깐!
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findByID(Long memberId) {
        return store.get(memberId);
    }
}
