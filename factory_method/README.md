## Factory Method Mode

#### 定义
> 定义一个用于生成对象的接口，让子类决定实例化哪一个类。Factory Method使一个类的实例化延迟到其子类。

#### UML类图
![image](https://github.com/kuanshang/DesginMode/blob/master/factory_method/image/factory_method.jpg)

#### 优点
> 1. 工厂方法不再将与特定应用有关的类绑定到你的代码中。
> 2. 为子类提供hook。
> 3. 连接平行的类层次。

#### 缺点
> 4. 客户可能仅仅为了创建一个特定的ConcreteProduct对象，就不得不创建Creator的子类。
