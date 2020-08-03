package CH12.collection;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberid, String memberName) {
		this.memberId = memberid;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName+"ȸ������ ���̵��"+memberId+"�Դϴ�";
	}
	
}