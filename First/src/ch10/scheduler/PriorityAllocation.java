package ch10.scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("등급이 높은 고객 먼저 전화");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 스킬 값이 높은 상담원에게 우선 배분");
	}

}
