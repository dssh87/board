package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Setter(onMethod_= {@Autowired})
	private BoardService service;
	
	@Test
	public void testServiceList() {
		
		service.list(new Criteria(3));
		
	}
	
	@Test
	public void testView() {
		log.info("나오나~~~~~~~~~~~~~~"+service.view(3));
	}
	
	@Test
	public void testRemove() {
		
		service.remove(1507337);
	}
	
	@Test
	public void testModify() {
		BoardVO vo = new BoardVO();
		
		vo.setBno(1507377);
		vo.setTitle("원기");
		vo.setContent("원기");
		vo.setWriter("바보");
				
		service.modify(vo);
	}
}
