### @Autowired 和 @Bean  @Component的区别

@Autowired:

“请给我一个该类的实例，例如，我@Bean之前用注释创建的一个实例”。



@Bean:

告诉Spring’这是此类的一个实例，请保留该类，并在我询问时将其还给我’。

它会实例化、配置并初始化一个新的对象，这个对象会由spring IoC 容器管理。

```
	@Bean
​    public MyService myService() {
​        return new MyServiceImpl();
​    }
	就相当于
	<beans>
    <bean id="myService" class="com.acme.services.MyServiceImpl"/>
	</beans>
```

### **@Component注解和@Bean注解的作用，以及两者的区别：**

- **@Component注解表明一个类会作为组件类，并告知Spring要为这个类创建bean。**

    **两者的目的是一样的，都是注册bean到Spring容器中。**

  ***\*区别：\****

  **@Component（@Controller、@Service、@Repository）通常是通过类路径扫描来自动侦测以及自动装配到Spring容器中。**

  **而@Bean注解通常是我们在标有该注解的方法中定义产生这个bean的逻辑。**

  **@Component 作用于类，@Bean作用于方法。**

  ***\*总结：\****

  **@Component和@Bean都是用来注册Bean并装配到Spring容器中，但是Bean比Component的自定义性更强。可以实现一些Component实现不了的自定义加载类。**

