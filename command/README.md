## Command Mode

#### 定义
> 将一个请求封装成一个对象，从而使你可用不同的请求对客户进行参数化。对请求排队或记录请求日志，以及支持可撤销的操作。

#### UML类图
![image](https://github.com/kuanshang/DesginMode/blob/master/command/image/command.jpg)

###### Command
> - 声明执行操作的接口。
###### ConcreteCommand
> - 将一个接收者对象绑定于一个动作。
> - 调用接收者相应的操作，以实现Exceute。
###### Client
> - 创建一个具体命令对象，并设定它的接收者。
##### Invoker
> - 要求该命令执行这个请求。
##### Receiver
> - 知道如何实施与执行一个请求相关的操作。任何类都可能作为一个接收者。


#### 优点
> 1. 将调用操作的对象与知道如何实现该操作的对象解耦
> 2. Command是头等的对象，他们可像其他的对象一样被操纵和扩展
> 3. 可将多个命令装配成一个复合命令
> 4. 增加新的Command很容易，无需改变已有的类。

#### 缺点
