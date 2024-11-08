package practice.kimsioncrudapi.member;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Member {

  private String name;
  private String email;
  private String password;

  @Builder // new 키워드
  private Member(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

}
