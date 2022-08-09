package yeling.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import yeling.spring.domain.Board;
import yeling.spring.domain.Member;
import yeling.spring.persistence.BoardRepository;
import yeling.spring.persistence.MemberRepository;

@SpringBootTest
public class DataInitializeTest {
	@Autowired
	private MemberRepository memberRepo;
	@Autowired
	private BoardRepository boardRepo;
	@Test
	public void testDataInsert() {
		Member member1 = new Member();
		member1.setId("aaaa");
		member1.setName("손오공");
		member1.setPassword("1111");
		member1.setRole("ROLE_USER");
		memberRepo.save(member1);
		Member member2 = new Member();
		member2.setId("bbbb");
		member2.setName("사오정");
		member2.setPassword("2222");
		member2.setRole("ROLE_ADMIN");
		memberRepo.save(member2);
		for(int i=1; i<=3; i++) {
			Board board = new Board();
			board.setWriter("손오공");
			board.setTitle("손오공이 등록한 게시글 : " + i);
			board.setContent("손오공이 등록한 게시글 내용 : " + i);
			boardRepo.save(board);
		}
		for(int i=1; i<=3; i++) {
			Board board = new Board();
			board.setWriter("사오정");
			board.setTitle("사오정이 등록한 게시글 : " + i);
			board.setContent("사오정이 등록한 게시글 내용 : " + i);
			boardRepo.save(board);
		}
	}
}