package yeling.spring.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="MYBOARD")
public class Board {
	@Id
	@GeneratedValue
	private Long seq;
	private String title;
	@Column(updatable=false)
	private String writer;
	private String content;
	@Column(insertable=false, updatable=false, columnDefinition="date default sysdate")
	private Date regDate;
	@Column(insertable=false, updatable=false, columnDefinition="number default 0")
	private Long cnt;
	
}
