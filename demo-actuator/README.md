# Actuator Demo

## Build & run

### local run
```shell script
./mvnw spring-boot:run
```

## run on K8s
- install skaffold
```shell script
curl -Lo skaffold https://storage.googleapis.com/skaffold/releases/latest/skaffold-linux-amd64
sudo install skaffold /usr/local/bin/
```
- update config
```shell script
kubectl create configmap demo-actuator-config --from-file=src/main/resources/application.yml -o yaml --dry-run > src/main/k8s/demo-actuator-config-map.yml
```
- deploy
```shell script
skaffold dev --trigger notify
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