package methods;

 abstract class TestBank {
	abstract int getInterestByBank();{
		
	}
	class HDFC extends TestBank{
		int getInterestByBank() {
			return 5;
		}
	}
	class SBI extends TestBank{
		int getInterestByBank() {
			return 7;
		}
	}
	class TestBank{
		public static void main(String[] args) {
			TestBank obj1=new HDFC();
			TestBank obj2=new SBI();
		}
	}

}
