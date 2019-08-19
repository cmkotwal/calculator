package chetan_model;

public class Calcimodel {

	private int fno,sno;

	public int getFno() {
		return fno;
	}

	public void setFno(int fno) {
		this.fno = fno;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public int addNo()
	{
		return fno+sno;
	}
	
	public int subNo()
	{
		return fno-sno;
	}
	
	public int multNo()
	{
		return fno*sno;
	}
	
	public int divNo()
	{
		return fno/sno;
	}
}
