## Strategy Mode

#### 定义
> 定义一系列的算法，把他们一个个封装起来，并且使它们可互相替换。本模式使得算法可独立于使用它的客户变化而变化。

#### UML类图
![image](https://github.com/kuanshang/DesginMode/blob/master/strategy/image/Strategy.jpg)

#### SampleCode类图

#### Sample Code
```
public class desginModeBase {
	
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

```


#### 优点
> 1. 相关算法系列
> 2. 一个替代继承的方法
> 3. 消除了一些条件语句
> 4. 实现的选择（可以选择不同的算法）

#### 缺点
> 1. 客户必须了解不同的Strategy
> 2. Strategy和Context之间的通信开销（算法需要数据）
> 3. 增加了对象的数目