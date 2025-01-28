package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //저장소에 회원이 저장되는것
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name); // 그 다음부터는 저장소에서 findById나 findByName 으로 찾아올 수 있는 거임
    List<Member> findAll(); // 지금까지 저장된 모든 회원 리스트를 다 반환해줌

}
