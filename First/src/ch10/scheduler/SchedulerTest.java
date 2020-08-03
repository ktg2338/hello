package ch10.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��ȭ ��� �Ҵ��� ����");
		System.out.println("R : �Ѹ�� ���ʴ��");
		System.out.println("L : ���� �ְų� ��Ⱑ �������� ����");
		System.out.println("P : �켱������ ���� ��");
		
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
			System.out.println("�������� �ʴ� ���");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
