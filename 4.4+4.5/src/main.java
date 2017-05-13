
public class main {
		public static void main(String[] args)
		{
			Student account1 = new Student("jane green", 93.5);
			Student account2 = new Student("jane blue", 72.75);
			
			System.out.printf("%s letter grade is %s%n",account1.getname(), account1.getlettergrade());
			
			System.out.printf("%s letter grade is %s%n",account2.getname(), account2.getlettergrade());
			}
			
	}
