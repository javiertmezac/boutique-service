## My Batis Generator
[mybatis generator quickstart](https://mybatis.org/generator/quickstart.html)

` java -jar mybatis-generator-core-x.x.x.jar -configfile /resources/mgb.xml -overwrite`

### generate Java Classes - Maven  - useful commands

`mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate`

`mvn -Dmybatis.generator.tableNames={table_name} mybatis-generator:generate`

### override default values into Java Types

`<columnOverride column="fecharegistro" javaType="java.time.Instant" />`
