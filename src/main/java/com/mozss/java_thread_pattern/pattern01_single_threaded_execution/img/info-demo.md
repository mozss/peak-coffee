## demo_01

![img.png](demo-01-1.png)

```
    Gate类的这几句是线程不安全的：
    this.counter++;
    this.name = name;
    this.address = address;
    check();
```

![img.png](demo-01-2.png)

## demo_02

在demo_01的Gate类上两个方法上加上了synchronized字段

![img.png](demo-02-1.png)