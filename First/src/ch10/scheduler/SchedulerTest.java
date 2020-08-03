package ch10.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("전화 상담 할당방식 선택");
		System.out.println("R : 한명식 차례대로");
		System.out.println("L : 쉬고 있거나 대기가 가장작은 상담원");
		System.out.println("P : 우선순위가 높은 고객");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch =='R' || ch == 'r') {
			scheduler =new RoundRobin();
		}
		else if(ch == 'L' || ch =='l') {
			scheduler = new LeastJop();
		}
		else if(ch == 'P' || ch =='p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원되지 않는 기능");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
