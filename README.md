# mybatis generator分页插件 (mybatis generator pagination plugin)

## 使用方法(how to use)
按照原来使用mybatis generator的方法，只是多加了依赖    
as same as the way you use mybatis generator, besides, add one more dependency in your pom.   

一切需要手写mapper、DTO等复杂方式来实现分页的都是耍流氓;   
everything need to write mappers and DTOs by yourself is bullshit!

一切需要复杂配置的插件都是耍流氓;   
all complex configurations are bullshit.

此插件目标是使用最简单的方式实现物理分页，不需要手写代码！！！   
aim to provide the simplest way to carry out physical pagination!!!


1.在依赖中加入(in your dependency)：
```xml
<dependency>
    <groupId>com.rosegun</groupId>
    <artifactId>mybatis-generator-pagination</artifactId>
    <version>1.0.0</version>
</dependency>
```

2.在插件中加入(in your plugin dependency)：
```xml
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.5</version>
    <configuration>
        <configurationFile>src/main/resources/generatorConfig.xml</configurationFile>
        <verbose>true</verbose>
        <overwrite>true</overwrite>
    </configuration>
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.42</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.5</version>
        </dependency>
        <!-- only add this dependency -->
        <dependency>
            <groupId>com.rosegun</groupId>
            <artifactId>mybatis-generator-pagination</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
</plugin>
```

3.在generatorConfig.xml配置文件中加入分页插件(in your generatorConfig.xml)：
```xml
<plugin type="com.rosegun.plugin.MysqlLimitPlugin"/>
```

4.生成(generate)
```
mvn mybatis-generator:generate
```

## 唯一一个参数(one more parameter)
为了方便配合spring使用，插件生成的mapper会默认加入 ```@Repository```注解，这样可以避免在IDE中看到警告，
如果你不是处女座或者不需要这个注解，那么在```generatorConfig.xml```文件中加入如下参数：   
to integrate with Springframework and avoid warnings in IDE, this plugin will add ```@Repository```to mappers as default,
if you're not Virgo or you don't need this annotation, add a property in your ```generatorConfig.xml```：
```xml
<plugin type="com.rosegun.plugin.MysqlLimitPlugin">
    <property name="addRepositoryAnnotation" value="false"/>
</plugin>
```
