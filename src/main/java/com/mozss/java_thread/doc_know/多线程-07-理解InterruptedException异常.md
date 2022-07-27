# 理解InterruptedException异常

## 可能会花费时间,但可以取消

当习惯Java多线程设计之后,我们会留意方法后面是否加了throws InterruptedException. 如果方法加了,则表明该方法(
或该方法进一步调用的方法中)可能会抛出InterruptedException异常.

这里包含两层意思:

- "花费时间"的方法
- "可以取消"的方法 换言之,加了throws InterruptedException的方法可能会花费时间,当可以取消.

## 加了throws InterruptedException的方法

- java.lang.Object类的wait方法
- java.lang.Thread类的sleep方法
- java.lang.Thread类的join方法

### 花费时间的方法

### 可以取消的方法

### sleep方法和interrupt方法

### wait方法和interrupt方法

### join方法和interrupt方法

### interrupt方法只是改变中断状态

### isInterrupted方法: 检查中断状态

### Thread.interrupted方法: 检查并清除中断状态

### 不可用使用Thread类的stop方法
