package ch10.scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담전화 순서대로 대기열에서 불러옴");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("다음 상담원에게 배분");
	}

}
