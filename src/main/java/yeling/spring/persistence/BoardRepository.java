package yeling.spring.persistence;

import org.springframework.data.repository.CrudRepository;
import yeling.spring.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

	
}
