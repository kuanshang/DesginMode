## Proxy Mode

#### 定义
> 为其他对象提供一种代理以控制对这个对象的访问。

#### UML类图
![image](https://github.com/kuanshang/DesginMode/blob/master/proxy/image/proxy.jpg)

#### 优点
> 1. Remote Proxy可以隐藏一个对象存在于不同地址空间的事实。
> 2. Virtual Proxy可以进行最优化，例如根据要求创建对象。
> 3. Protection Proxies和Smart Reference都允许在访问一个对象时有一些附加的内务处理（Housekeeping task）。
> 4. Proxy模式还可以对用户隐藏两外一种称之为copy-on-write的优化方式，该方式与根据需要创建对象有关。

#### 缺点
