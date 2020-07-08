package spring.day0625.anno;

import org.springframework.stereotype.Component;

@Component

public class MyDao implements DaoInter {

	@Override
	public void insertData(String str) {
		System.out.println("str데이타 db에 추가 성공!!!");

	}

	@Override
	public void deleteData(String num) {
		System.out.println("num에 해당하는 데이타 삭제 성공!!!");

	}

}
