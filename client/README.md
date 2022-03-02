# Wat
De client voorziet een aantal endpoints die tonen hoe je resilience kan gebruiken om andere services - rest services in dit geval - aan te roepen.

## OpenFeign
Alle REST client implementaties steunen op OpenFeign.

## Resilience4j

## Actuator
Naast de standaard actuator endpoints, kunnen we ook gebruik maken van deze
- [/actuator/circuitbreakers](http://localhost:8080/actuator/circuitbreakers)
- [/actuator/circuitbreakerevents](http://localhost:8080/actuator/circuitbreakerevents)

En dan verder door de naam toe te voegen, meer details over één enkele circuitbreaker.

## /hello
Roept de `/greeting` service aan, en maakt gebruik van een fallback methode als de service een fout teruggeeft.

