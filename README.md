# spring-boot-eureka
This repository contains the template for using Eureka as a naming server with spring-boot microservices.


## Steps to run the application

1. There are 3 maven, spring-boot applications in this repository.
2. The application: **naming-server** is the eureka server. To run it open it in a terminal and run command **mvn clean spring-boot:run**.
3. Once the naming server starts you can view its UI at: **localhost:8761**.
4. The other 2 Applications: **demo-service & parent-demo-service** are the clients that will register to the Eureka server.
5. To run these applications go to their directory in a terminal and run command **mvn clean spring-boot:run**.
6. The **demo-service** would run at port **9000** & the **parent-demo-service** runs at port **8000**.
7. Once all the instances are up you can see them on the Eureka UI.
8. Now to see service registry work we need to create one more instance of the **parent-demo-service**, & let it run on port **8001**. We could set the configurations in our IDE to create another instance of the application. Refer to the steps mentioned in the blog: ***Add-Link-To-The-Blog***.
9. Once the instance is up it will register itself to the Eureka server and will be available on the UI as well.

## Steps to verify the application load balancing and service discovery

1. You just need to hit the endpoint exposed by the service *demo-service* which is **localhost:9000/demo/greet** and it will internally make a call to the service *parent-demo-service*. 
2. On multiple invocations of the endpoint mentioned above, you will notice that the port in the response message keeps on changing from ***8000 to 8001***. This proves that we were able to discover the new instance at port 8001 of *parent-demo-service* and that our application is working in a LoadBalanced manner.

## That is all about the working of this repository, suggestions and improvements are most welcome. :shipit:

### Here are some of the images supporting the working and implementation.

**-Naming server design:**

![Image of Naming server](https://github.com/Prashant1293/spring-boot-eureka/blob/master/images/NamingServerFeature.png)

**-Eureka Server UI**

![Image of Eureka server](https://github.com/Prashant1293/spring-boot-eureka/blob/master/images/EurekaServer.png)

**-Idea config setting for second instance of parent-demo-service**

![Image of Idea conf](https://github.com/Prashant1293/spring-boot-eureka/blob/master/images/idea-conf-param.png)

![Image of Idea conf](https://github.com/Prashant1293/spring-boot-eureka/blob/master/images/idea-conf-runner.png)

![Image of Idea conf](https://github.com/Prashant1293/spring-boot-eureka/blob/master/images/idea-run-instance.png)

**-Eureka server with all client instances up and running**

![Image of Eureka server final](https://github.com/Prashant1293/spring-boot-eureka/blob/master/images/Eureka-all-instance-up.png)

**-Results from Postman**

![postman result 1](https://github.com/Prashant1293/spring-boot-eureka/blob/master/images/server-response-8000.png)

![postman result 2](https://github.com/Prashant1293/spring-boot-eureka/blob/master/images/server-response-8001.png)
