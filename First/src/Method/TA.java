package Method;

public class TA {
	public static void main(String[] args) {
	pa(1986);
	pa(1990);
	pa(2000);
	}
	  
	public static void pa(int Byear){
		String animal = "";
		switch (Byear %12) {
			case 0:
				animal = "������";
				break;
			case 1:
				animal = "��";
				break;
			case 2:
				animal = "��";
				break;
			case 3:
				animal = "����";
				break;
			case 4:
				animal = "��";
				break;
			case 5:
				animal = "��";
				break;
			case 6:
				animal = "ȣ����";
				break;
			case 7:
				animal = "�䳢";
				break;
			case 8:
				animal = "��";
				break;
			case 9:
				animal = "��";
				break;
			case 10:
				animal = "��";
				break;
			case 11:
				animal = "��";
				break;
			default:
				animal = "Errer";
				break;
		}
		System.out.printf("%d�� = %s��\n", Byear, animal);
	}
}

