package la.bean;

public class FortuneBean {
	private int month;
	private String lcolor;
	private String litem;
	private int rank;

	public FortuneBean() {
	}

	public FortuneBean(int month, String lcolor, String litem, int rank) {
		super();
		this.month = month;
		this.litem = litem;
		this.lcolor = lcolor;
		this.rank = rank;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getLitem() {
		return litem;
	}

	public void setLitem(String litem) {
		this.litem = litem;
	}

	public String getLcolor() {
		return lcolor;
	}

	public void setLcolor(String lcolor) {
		this.lcolor = lcolor;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
