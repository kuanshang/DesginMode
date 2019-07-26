## Adapter Mode

#### 定义
> 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

#### 类适配器UML类图
![image](https://github.com/kuanshang/DesginMode/blob/master/adapter/image/adapter_class.jpg)

#### 类适配器
> 1. 用一个具体的Adapter类对Adaptee和Target进行匹配。当我们想要匹配一个类以及所有它的子类时，类Adapter将不能胜任工作。
> 2. 使得Adapter可以重定义Adaptee的部分行为，因为Adapter是Adaptee的一个子类。
> 3. 仅仅引入了一个对象，并不需要额外的指针以间接得到adptee。

#### 对象适配器UML类图
![image](https://github.com/kuanshang/DesginMode/blob/master/adapter/image/adapter_object.jpg)

#### 对象适配器
> 1. 允许一个Adapter与多个Adaptee同时工作。Adapter可以一次给所有的Adaptee添加功能。
> 2. 使得重定义Adaptee的行为比较困难。这就需要Adaptee的子类并且使得Adapter引用这个子类而不是引用Adaptee本身。

#### 缺点
