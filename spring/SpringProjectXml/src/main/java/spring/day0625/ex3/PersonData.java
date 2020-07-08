package spring.day0625.ex3;

public class PersonData {
	
	private String sawonname;
	private int pay;
	private String ipsaday;
	
	//디폴트생성자
	PersonData() {
		
	}
	
	
	//사원명은 생성자로 주입
	PersonData(String sname) {
		sawonname=sname;
				
	}


	//페이, 입사데이는 setter로 주입
	
	public int getPay() {
		return pay;
	}


	public String getSawonname() {
		return sawonname;
	}


	public void setSawonname(String sawonname) {
		this.sawonname = sawonname;
	}


	public void setPay(int pay) {
		this.pay = pay;
	}


	public String getIpsaday() {
		return ipsaday;
	}


	public void setIpsaday(String ipsaday) {
		this.ipsaday = ipsaday;
	}
		

}
