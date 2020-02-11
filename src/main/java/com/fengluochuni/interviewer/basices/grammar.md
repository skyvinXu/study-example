##Java基础

###Java语法

####1.==和equals的区别
比较基本类型时，比较的是值是否相同  
比较引用类型时，比较的是引用是否相同  
####2. 两个对象的hashCode()相同，则equals()也一定为true么？
不对，hashCode相同，equals不一定也相同。  
在散列表中，hashCode相等 即两个键值对的哈希值相等，然而哈希值相等，并不一定得出键值对相等  
####3. java中 double、float类型运算为何会精度丢失？
因为double、float采用的二进制运算，无法精确的表示0.1  
应将double、float转化为String后，使用BigDecimal类运算  
####4. 基本数据类型都有哪些？
byte、float、double、int、short、char、long、boolean
####5. String、StringBuffer、StringBuilder的区别
String是不可变类。每次操作都会产生新的String对象  
StringBuffer是线程安全的  
StringBuilder是非线程安全的  
####6. String str = "i";与String str = new String("i");的区别
内存分配方式不同。String str = "i"; 虚拟机将值i分配到了常量池中  
而后者则在堆内存中  
####7. 接口与抽象类的区别
实现：接口用 implements来实现；抽象类用 extends来继承  
构造函数：接口不能用 构造函数；抽象类可以有  
main方法：接口不能有main方法；抽象类可以有  
实现数量：类可以实现多个接口；但只能继承一个类  
访问修饰符：接口中的方法默认使用 public ；抽象类可以使用任意的修饰符  
从设计层面来说，抽象是对类的抽象，是一种模版设计；接口是对行为的抽象，是一种行为的规范  
####8. BIO、NIO、AIO的区别
BIO：Block IO同步阻塞式IO，模式简单处理方便，但并发性能差  
NIO：New IO 同步非阻塞IO，客户端与服务端通过Channel通道通讯，实现了多路复用  
AIO：Asynchornous IO 异步非阻塞IO，异步IO的操作基于事件和回调机制  
[原理参见](https://blog.csdn.net/valada/article/details/96040288)
