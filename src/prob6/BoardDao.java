package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		
		// DB에서 데이터를 가져옴
		// Board 객체를 만들고 리스트에 저장	
		Board board1 = new Board("제목1","내용1");
		Board board2 = new Board("제목2","내용2");
		Board board3 = new Board("제목3","내용3");
		
		
		list.add(board1);
		list.add(board2);
		list.add(board3);
		
		
		return list;
	}
}
