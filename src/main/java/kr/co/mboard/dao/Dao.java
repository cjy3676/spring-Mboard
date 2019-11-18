package kr.co.mboard.dao;

import java.util.ArrayList;
import kr.co.mboard.dto.Dto;

public interface Dao {
	// 사용할 메소드를 추상메소드로 정의
	public void write(String name, String title, String content);
	
	public ArrayList<Dto> list(); 
	
	public Dto content(String id);
	
	public void delete(String id);
	
	public Dto update(String id);
	
	public void update_ok(String name, String title, String content, String id);
}
