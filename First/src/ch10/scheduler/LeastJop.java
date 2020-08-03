package ch10.scheduler;

public class LeastJop implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 전화를 순서대로 대기열에서 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("상담업무가 없거나 대가가 작은 상담원 할당");
	}

}
