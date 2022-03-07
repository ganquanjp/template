编辑配置文件mybatis-generator-config.xml以下项目
<host>
<port>
<DBName>
<user>
<schema>
<package>

commandline下run:
java -jar mybatis-generator-core-1.4.0.jar -configfile mybatis-generator-config.xml -overwrite


生成的文件在
src/main/java
src/main/resources