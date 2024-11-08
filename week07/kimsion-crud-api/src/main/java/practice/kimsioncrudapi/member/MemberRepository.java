package practice.kimsioncrudapi.member;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

  // name은 하나만 있어야 한다.
  private final Map<String, Member> memberRepository = new ConcurrentHashMap<>();

  public void save(Member member) {
    memberRepository.put(member.getName(), member);
  }

}
