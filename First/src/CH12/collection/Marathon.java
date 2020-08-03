package CH12.collection;

import java.util.HashMap;

public class Marathon {
	public static void main(String[] args) {
		System.out.println(solution2(new String[]{"����","����","�¾�"}, new String[]{"����","�¾�"}));
		System.out.println(solution2(new String[]{"����","����","�¾�","�۱�"}, new String[]{"����","����","�۱�"}));
		System.out.println(solution2(new String[]{"����","����","�¾�","����"}, new String[]{"����","����","�¾�"}));
	}

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        /*�ؽ��� hm�� �����Ѵ�. ������ �̸��� �Բ� �ο����� �԰� ������ �ֵ��� �ڷ����� �����.*/
        HashMap<String, Integer> hm = new HashMap<>();
        
        /*������ �迭���� �̸��� �ϳ��� ������ �̸��� ���� 1�� �ؽ��ʿ� �߰��Ѵ�.*/
        /*�̶� �ߺ��Ǵ� �̸��� �ߺ��Ǵ¸�ŭ ���ڸ� ���Ѵ�.*/
        for (String name : participant) {
            if(hm.get(name) == null) { // �ؽ��ʿ� �̸��� ���ٸ�
                hm.put(name, 1);	// �̸��� �Բ� 1�� �߰��Ѵ�.
            } else {				// �̹� �̸��� �ִٸ�
                int value = hm.get(name) + 1; // �ؽ����� �� �̸��� �ش��ϴ� ���� ������ + 1�Ѵ�.
                hm.put(name, value);  // �̸��� �ߺ��� ��� ������Ʈ
            }
        }
        
        for (String name : completion) {
            /*������ ������ �̸��� �ؽ��ʿ��� -1 ���ش�.*/
        	int value = hm.get(name) -1;
        	hm.put(name, value);
        }

        for (String name : hm.keySet()) { //�ؽø� ��Ҹ� ��ü �ݺ�
            if(hm.get(name) == 1) answer = name; //�̸��� �ش��ϴ� ���� 1�̸� ���ϰ����� �Ѵ�.
        }
        
        return answer;
    }



public static String solution2(String[] participant, String[] completion) {
	String answer = "";
	HashMap<String, Integer> hm = new HashMap<>();
	for (String player : participant) 
		hm.put(player, hm.getOrDefault(player, 0) + 1);
	
	for (String player : completion) 
		hm.put(player, hm.getOrDefault(player, 0) - 1);
	
	for (String key : hm.keySet()) {
		if (hm.get(key) != 0) answer = key;
	}
	return answer;
}
}