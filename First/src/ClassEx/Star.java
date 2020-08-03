package ClassEx;

public  class Star {
	public static void main(String[] args) {
		Marine ma1 = new Marine("¸¶¸°1", 80);
		Marine ma2 = new Marine("¸¶¸°2", 80);
		Marine ma3 = new Marine("¸¶¸°3", 80);
		Marine ma4 = new Marine("¸¶¸°4", 80);
		Marine ma5 = new Marine("¸¶¸°5", 80);
		
		Medic me1 = new Medic("¸Þµñ1", 60);
		Medic me2 = new Medic("¸Þµñ2", 60);
		Medic me3 = new Medic("¸Þµñ3", 60);
		
		ma1.stimpack();ma2.stimpack();ma3.stimpack();ma4.stimpack();ma5.stimpack();
		me1.heal(ma1);me2.heal(ma3);me3.heal(ma5);
	} 
}
	class Marine {
		String name; 
		int hp;
		
		public Marine(String name, int hp) {
			this.name = name;
			this.hp = hp;
		}
		
		public void stimpack(){
			System.out.printf("[%s]ÀÇ ½ºÆÀÆÑ ! HP : %d > ", name, hp);
			hp -= 10;
			System.out.printf("%d\n", hp);
		}
	}	
	
	class Medic {
		String name;
		int hp;
		
			public Medic(String name, int hp) {
				this.name = name;
				this.hp = hp;
			}
			
			public void heal(Marine target){
				System.out.printf("[%s]ÀÇ [%s] Ä¡À¯ ! HP : %d > ", name,target.name, target.hp);
				target.hp += 10;
				System.out.printf("%d\n", target.hp);			
		    }	
    }