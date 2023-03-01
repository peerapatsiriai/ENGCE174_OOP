package Project;
abstract class ClassicTank{
	int  Str, Vit, BaseDamage;
	double HP , point_A , point_B  ;
	public abstract void setHP();
	public abstract void getHP();
	public abstract void attank();
}

public class LAB11 {
	public static void main(String[] atgs) {
		class normalTankA extends ClassicTank{
			public void setHP() {
				HP = 200;
				Str = 12;
				Vit = 9;
				BaseDamage = 11;
			}
			public void getHP() {
				System.out.println("|-- Tank A --|");
				System.out.println(" HP : " + HP);
				System.out.println(" Str : " + Str);
				System.out.println(" Vit : " + Vit);
				System.out.println(" BaseDamage : "+ BaseDamage);
			}
			public void attank() {
				double min = 0.7 ;
				double max = 0.9 ;
				double number = (double)(Math.random()*(max-min+1)+min);
				double DamagePoint = BaseDamage *( 1.3 ) * number;
				System.out.println(" DamagePoint_tankA : "+DamagePoint);
				point_A = DamagePoint;
				
			}
		}
		class normalTankB extends ClassicTank{
			public void setHP() {
				HP = 250;
				Str = 8;
				Vit = 10;
				BaseDamage = 10;
			}
			public void getHP() {
				System.out.println("|-- Tank B --|");
				System.out.println(" HP : "+HP);
				System.out.println(" Str : "+Str);
				System.out.println(" Vit : "+Vit);
				System.out.println(" BaseDamage : "+ BaseDamage);
			}
			public void attank() {
				float min = (float) 0.7 ;
				float max = (float) 0.9 ;
				float number = (float)(Math.random()*(max-min+0.1)+min);
				double DamagePoint = BaseDamage *( 0.8 ) * number;
				System.out.println(" DamagePoint_tankB : "+ DamagePoint);
				point_B = DamagePoint;
				
			}
		}
		
		normalTankA tankA = new normalTankA();
		normalTankB tankB = new normalTankB();
		
		tankA.setHP();
		tankA.getHP();
		System.out.println("-------------------------------------------------------------");
		tankB.setHP();
		tankB.getHP();
		System.out.println("-------------- ROUND 1 ---------------");
		tankA.attank();
		tankB.attank();
		tankA.getHP();
		tankB.getHP();
		System.out.println("-------------- ROUND 2 ---------------");
		tankA.attank();
		tankB.attank();
		tankA.getHP();
		tankB.getHP();
	}
}