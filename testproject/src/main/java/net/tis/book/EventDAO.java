package net.tis.book;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class EventDAO  { 
   
	@Autowired
	SqlSessionTemplate temp ;
	
	public void dbInsert(EventDTO dto) {
	  temp.insert("board.add", dto); 
	}//end	
	
	
	

}//BoardDAO class END
