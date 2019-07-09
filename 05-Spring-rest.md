
## JSON Values

1. String: in double quotes
2. Numbers: no quotes
3. Boolean: true false
4. Nested JSON object
5. Array
6. null
   
-------

## Data binding

> Data binding is the process of converting JSON data to a Java POJO.


Jackson Data binding--project

behind the spring is Jackson (Integration). it will call the setXXX,getXXX method of POJO.


> Jackson most import class is **ObjectMapper**

[01-jackson-data-binding](./05-spring-rest/01-jackson-data-binding)
```java
// create object mapper
ObjectMapper mapper = new ObjectMapper();

// read JSON file and map/covert to Java POJO
// data/sample-lite.json
Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);
// print fisrt name and last name
System.out.println("firstName: " + student.getFirstName());
System.out.println("lastName: " + student.getLastName());
```
 
1. JSON data being passed to REST controller is converted to POJO
2. Java object being returned from REST controller is converted to JSON.


----------

7.6 
