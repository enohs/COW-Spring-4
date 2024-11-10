package cow.hoya_jpa_crud.first_member;

import lombok.Getter;

@Getter
public class CreateMemberRequest {

	private String username;

	private String email;

	private String password;

	public Member toEntity() {
		return Member.builder()
			.name(username)
			.email(email)
			.password(password)
			.build();
	}
}
