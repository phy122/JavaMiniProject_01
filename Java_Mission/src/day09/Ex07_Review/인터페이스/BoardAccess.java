package day09.Ex07_Review.인터페이스;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardAccess implements BoardInterface {
	static final int su=1000;
	int count=0;
	Board[] boardList = new Board[su];
	
	@Override
	public int create(String a,String b,String c) {
		if(count>=su) {
			System.out.println("꽉참");
			return 0;
		}
		Board abc = new Board(a, b, c);
		int boardNo = ++count;
		abc.setNo(boardNo);
		Date nowDate = new Date();
		//System.out.println("포맷 지정 전 : " + nowDate);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일"); 
        	//원하는 데이터 포맷 지정
		String strNowDate = simpleDateFormat.format(nowDate);
		abc.setRegDate(strNowDate);
		abc.setUpdDate(strNowDate);
		
		boardList[count-1]=abc;
		System.out.println(abc);
		System.out.println("게시글이 등록되었습니다.");
		return 0;
	}

	@Override
	public void list() {
		if(count==0) {
			System.out.println("텅 비었다");
		}
		for (int i = 0; i < boardList.length; i++) {
			if(boardList[i]==null) {
				break;
			}
			System.out.println(boardList[i]);
		}
	}

	@Override
	public Board read(int no) {
		if(count<no) {
			System.out.println("ㅗ");
			return null;
		}
		else {
			System.out.println(boardList[no-1]);
			return boardList[no-1];
		}
	}

	@Override
	public int update(Board board) {
		if(count==0) {
			return 0;
		}
		for (int i = 0; i < boardList.length; i++) {
			if(boardList[i].getNo()==board.getNo()) {
				Date nowDate = new Date();
				//System.out.println("포맷 지정 전 : " + nowDate);
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일"); 
		        	//원하는 데이터 포맷 지정
				String strNowDate = simpleDateFormat.format(nowDate); 
		        	//지정한 포맷으로 변환 
				board.setUpdDate(strNowDate);
				boardList[i]=board;
				return 1;
			}
		}
		return 0;
	}

	@Override
	public int delete(int no) {
		if(count==0) {
			return 0;
		}
		for (int i = 0; i < boardList.length; i++) {
			
			if(boardList[i].getNo()==no) {
				boardList[i]=null;
				count--;
				i+=1;
				while(boardList[i]!=null) {
					boardList[i].setNo((boardList[i].getNo()-1));
					boardList[i-1]=boardList[i];
					i++;
				}
				boardList[i-1]=null;
				return 1;
			}
		}
		return 0;
	}
	
}
