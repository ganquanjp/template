编辑配置文件mybatis-generator-config.xml以下项目
<host>
<port>
<DBName>
<user>
<schema>
<package>

在当前配置文件所在目录下新建文件夹：
java
resources

commandline下run:
java -jar mybatis-generator-core-1.4.0.jar -configfile mybatis-generator-config.xml -overwrite


生成的文件夹copy到工程目录src/main/下
java
resources

