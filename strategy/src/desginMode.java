
public class desginMode {
	
	public static void main(String[] args) {
        System.out.println("Desgin Mode -- Strategy");
        
        int paramA = 10;
        int paramB = 12;
        int result = 0;
        
        System.out.println("paramA:"+paramA+" paramB:"+paramB);
        
        Context context = new Context(new addStrategy());
        result = context.method(paramA, paramB);
        System.out.println("add strategy reuslt:"+result);
        
        context.setStrategy(new subStrategy());
        result = context.method(paramA, paramB);
        System.out.println("sub strategy reuslt:"+result);
    }

	public interface Strategy{
	    public int method(int paramA, int paramB);
	}
	
	public static class addStrategy implements Strategy{
		public int method(int paramA, int paramB){
			return (paramA + paramB);
		}
	}
	
	public static class subStrategy implements Strategy{
		public int method(int paramA, int paramB){
			return (paramA - paramB);
		}
	}

	public static class Context{
		private Strategy strategy;
		
		public Context(Strategy strategy){
			this.strategy = strategy;
		}
		
		public void setStrategy(Strategy strategy){
			this.strategy = strategy;
		}
		
		public int method(int paramA, int paramB){
			return strategy.method(paramA, paramB);
		}	
	}
}

