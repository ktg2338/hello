package ch08;

public class WizardTest{
	  public static void main(String[] args) {
	    // ��ü ����
	    GreatWizard gandalf = new GreatWizard("������", 100, 100, 100);
	    // ���� ���
	    System.out.println(gandalf.toString());
	    // ��������Ʈ
	    gandalf.energeVolt();
	  }
	}

	class Novice {
	  // �ʵ�
	  protected String name;
	  protected int hp;

	  // ������
	  public Novice(String name, int hp) {
	    this.name = name;
	    this.hp = hp;
	  }

	  // toString
	  public String toString() {
	    return String.format("[Novice] %s(HP: %d)", this.name, this.hp);
	  }
	}

	class Wizard extends Novice {
	  // �ʵ�
	  protected int mp;

	  // ������
	  public Wizard(String name, int hp, int mp) {
	    super(name, hp);
	    this.mp = mp;
	  }

	  // ��������Ʈ
	  public void energeVolt() {
	    System.out.printf("%s�� ��������Ʈ!\n", this.name);
	  }
	}
	class GreatWizard extends Wizard {
	  /* 1. ��ȣ�� �Ӽ��� �ʵ忡 �߰��Ͻÿ�. */
		protected int shield;
	  /* 2. �����ڸ� �ϼ��Ͻÿ�. */
		public GreatWizard(String name, int hp, int mp, int shield) {
			// TODO Auto-generated constructor stub
			super(name, hp, mp);
			this.shield = shield;
		}
		/* 3. toString() �޼ҵ带 �������̵� �Ͻÿ�.*/ 
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("[GreatWizard] %s(HP: %d, MP: %d, shield: %d)", this.name, this.hp, this.mp, this.shield);
		}
		
	  /* 4. ��������Ʈ ������ �������̵� �Ͻÿ�.*/
		@Override
		public void energeVolt() {
			// TODO Auto-generated method stub
			int buff = 30;
			System.out.printf ("%s�� ��������Ʈ! �븶���� ������ ������ +%d�߰�", this.name, buff);
		} 
	}