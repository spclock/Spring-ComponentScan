


在正常情况下在网站输入`localhoast:8080`会网页显示出`hello`
```java
    @RequestMapping("/")
    public String index() {
        return "hello!";
    }
```

#  添加@ComponentScan
但是我在Application类上加了一个注解`@ComponentScan(basePackages = {"test.service","test.mapper"})`  
情况就不一一样了  
网站输入`localhoast:8080`会网页404

#  static下新建index
* static上是没有index.html，请自行新建

当我在`src/main/resources/static`上新建一个index.html  
神奇的事情出现了，当我在网站输入`localhoast:8080`会网页显示出index的页面出来（而不是`http://localhost:8080/index.html`）

# 注释@ComponentScan

当我把Application类上的`@ComponentScan`注释掉
```java
@SpringBootApplication
//@ComponentScan(basePackages = {"test.service","test.mapper"})
public class Application {
}
```
在网站输入`localhoast:8080`网页正常出现`hello`


#  我的猜测
* 难道它和@RequestMapping("/")和index.html绑定了？？？

但实际上并不是
