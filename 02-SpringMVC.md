
## SpringMVC

> Model View Control
 
![](imgs/mvc-1.PNG)


> Behind the scenes

- Front Controller: DispathcherServlet

---
- Controller: business logic
- Model: store/retrieve data
- View Template: jsp thym



## Set up environment

- eclipse(JavaEE)
- tomcat
- connect to tomcat


### springmvc configuration process

- [web.xml](03-Spring-MVC-demo/WebContent/WEB-INF/web.xml)
- [spring-mvc-demo-servlet.xml](03-Spring-MVC-demo/WebContent/WEB-INF/spring-mvc-demo-servlet.xml)

1. 配置web.xml 经典的servlet配置,我们使用springmvc的DispatcherServlet 参照官网 [spring docs web.xml配置DispatcherServlet](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-servlet-context-hierarchy)
```xml 
  <servlet>
  	<servlet-name>dispatcher</servlet-name>
  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  	<init-param>
  		<param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/spring-mvc-demo-servlet.xml</param-value>
  	</init-param>
  	<load-on-startup>1</load-on-startup>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>dispatcher</servlet-name>
  	<url-pattern>/</url-pattern>
  </servlet-mapping>
```

2. 配置DispatcherServlet,也就是Spring配置 参照 [spring mvc配置](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-config)和[spring xml configure](https://docs.spring.io/spring/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:mvc="http://www.springframework.org/schema/mvc"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/mvc
        https://www.springframework.org/schema/mvc/spring-mvc.xsd
        http://www.springframework.org/schema/context 
        http://www.springframework.org/schema/context/spring-context.xsd">

    <!-- enable MVC configuration -->
    <mvc:annotation-driven/>

</beans>
```

3. Spring的配置，在spring-mvc-demo-servlet.xml文件中，允许Ioc annotation
```xml
    <!--Step 3: Add support for component scanning  -->
    <context:component-scan base-package="edu.cau.hzz" />
    <!-- Step 4: enable MVC configuration and support for conversion,formatting and validation-->
    <mvc:annotation-driven/>

    <!-- Step 5: Define Spring MVC View resolver -->
    <bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/view/"/>
        <property name="suffix" value=".jsp"/>
    </bean>
```




**生成web.xml问题**
 Dynamic Web Project –> RightClick –> Java EE Tools –> Generate Deployment Descriptor Stub.






## SpringMVC Docs

[spring mvc doc](http://www.luv2code.com/spring-mvc-docs)

[spring mvc doc](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc)


[Oracle Develop Servlet官网->web.xml Descriptor Element](https://docs.oracle.com/cd/E24329_01/web.1211/e21049/web_xml.htm#WBAPP502)

[spring docs web.xml配置DispatcherServlet](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-servlet-context-hierarchy)


[spring mvc配置](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-config)


[spring mvc jsp InternalResourceViewResolver](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-view-jsp)