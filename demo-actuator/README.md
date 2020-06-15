# Actuator Demo

## Build & run
```shell script
./mvnw spring-boot:run
```

## Test 
Check `actuator-requests.http` file for sample requests.

## Features
* CustomCheckHealthIndicator
* CustomEndpoint

Turn the custom health indicator to unhealthy 
```shell script
POST {{host}}/actuator/custom
Content-Type: application/json

{
  "healthy": false
}
```

check responses for the different endpoints
```shell script
### GET request to /actuator/health
GET {{host}}/actuator/health
Accept: application/json

### GET request to /actuator/health/readiness
GET {{host}}/actuator/health/readiness
Accept: application/json

### GET request to /actuator/health/liveness
GET {{host}}/actuator/health/liveness
Accept: application/json
```