# mallLearning
mall练习

# mallLearning
mall练习

# mall-tiny-01
mall学习代码1


与原代码中不一样的地方
在pom文件中，将Mybatis生成器 版本改成1.3.7 ,如果是1.3.3并且在 generatorConfig.xml中使用下面这段 xml时覆盖原文件  则会在生成代码的时候报错，报错原因：UnmergeableXmlMappersPlugin 类找不到
        <!--生成mapper.xml时覆盖原文件-->
        <plugin type="org.mybatis.generator.plugins.UnmergeableXmlMappersPlugin" />
        
        <!-- MyBatis 生成器 -->
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.7</version>
        </dependency>
        
        

在 generatorConfig.xml中的 targetProject 路径修改如下
        <!--指定生成model的路径-->
        <javaModelGenerator targetPackage="com.macro.mall.tiny.mbg.model" targetProject="..\mall-tiny-01\src\main\java"/>
        <!--指定生成mapper.xml的路径-->
        <sqlMapGenerator targetPackage="com.macro.mall.tiny.mbg.mapper" targetProject="..\mall-tiny-01\src\main\resources"/>
        <!--指定生成mapper接口的的路径-->
        <javaClientGenerator type="XMLMAPPER" targetPackage="com.macro.mall.tiny.mbg.mapper" targetProject="..\mall-tiny-01\src\main\java"/>
如果写成  mall-tiny-01\src\main\java 则会在生成mybatis代码代码时，会出现  mall-tiny-01\src\main\java 目录不存在的问题
