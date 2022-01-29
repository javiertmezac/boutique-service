## My Batis Generator
[mybatis generator quickstart](https://mybatis.org/generator/quickstart.html)

` java -jar mybatis-generator-core-x.x.x.jar -configfile /resources/mgb.xml -overwrite`

### generate Java Classes - Maven  - useful commands

`mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate`

`mvn -Dmybatis.generator.tableNames={table_name} mybatis-generator:generate`

### override default values into Java Types

`<columnOverride column="fecharegistro" javaType="java.time.Instant" />`

## docker sql_server

Base sql image with no schema
```
docker run -d --name sql_server \
-e 'ACCEPT_EULA=Y' \
-e 'SA_PASSWORD=Password123!' \
-e TZ='America/Tijuana' \
-p 1433:1433 mcr.microsoft.com/mssql/server:2019-latest
```

Mount volume to easy access any backup
```
docker run -d --name sql_server \
-e 'ACCEPT_EULA=Y' \
-e 'SA_PASSWORD=Password123!' \
-e TZ='America/Tijuana' \
-e 'MSSQL_DATA_DIR=/var/opt/mssql/oasis-data' \
-v ~/localhost/mystuff/oasis/github/oasis-service/oasis-db:/var/opt/mssql/oasis-data \
-p 1433:1433 mcr.microsoft.com/mssql/server:2019-latest
```