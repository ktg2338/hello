package CH12.collection.arrayList;

import java.util.ArrayList;

import CH12.collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<member>();
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberid) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempid = member.getMemberId();
			if(tempid == memberid) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberid+"가 존재하지 않습니다.");
		return true;
	}
	public void showAllMember() {
}
