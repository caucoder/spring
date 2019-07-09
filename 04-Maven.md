
1. maven能够管理jar包
2. 自动构建build path
3. 构建的目录结构清晰
4. 无关乎IDE,任何IDE都可以打开maven项目



----------


## pom.xml

> shopping list

dependency coordinates:

city(groupId)->street(artifactId)->House Number(version)


maven use java version

```
<properties>
    <maven.compiler.target>1.8</maven.compiler.target>
    <maven.compiler.source>1.8</maven.compiler.source>
</properties>
```

## repository

1. [https://search.maven.org/](https://search.maven.org/)
2. [https://mvnrepository.com/](https://mvnrepository.com/)


----------

+ **Maven local repository**

C:\Users\username\.m2\repository

+ **Maven central remote repository**

[http://repo.maven.apache.org/maven2/](http://repo.maven.apache.org/maven2/)