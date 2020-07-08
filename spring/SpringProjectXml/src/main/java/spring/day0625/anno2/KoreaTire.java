package spring.day0625.anno2;

import org.springframework.stereotype.Component;

@Component
public class KoreaTire implements Tire {

	@Override
	public String getTire() {
		// TODO Auto-generated method stub
		return "한국타이어";
	}

}
