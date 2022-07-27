# final

## final类

表示该类无法扩展。也就是说，无法创建final类的子类。 由于无法创建final类的子类，所以final类中声明的方法也不会被重写。

## final方法

表示该方法不会被子类的方法重写。 如果在静态方法的声明上加上final，则表示该方法不会被子类的方法隐藏（hide）。如果试图重写或隐藏final
方法，编译时会提示错误。

在设计模式的Template Method中，有时候模板方法会声明为final方法。

## final字段

表示该字段只能赋值一次。

```
final字段赋值有两种方式：
    1.字段声明的时候赋值
        class Something{
            final int value = 123;
        }
    
    2.字段在构造方法中赋值
        class Something{
            final int value;
            Something{
                this.value = 123;
            }
        }
        
final静态字段赋值两种方法：
    1.字段声明时赋值
        class Something{
            static final int value = 123;
        }
    2.静态代码块中赋值
        class Something{
        static final int value;
        static {
            value = 123;
        }
```

注意: final字段不可用setValue这样的setter方法再次赋值.

## final与创建线程安全的实例

从创建线程安全的角度来说,将字段声明为final是非常重要的。

## final变量和final参数

局部变量和方法的参数也可用声明为final。final变量只可以赋值一次。 而final参数不可以赋值，因为在调用方法时，已经对其赋值了。