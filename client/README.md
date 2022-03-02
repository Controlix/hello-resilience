# Wat
De client voorziet een aantal endpoints die tonen hoe je resilience kan gebruiken om andere services - rest services in dit geval - aan te roepen.

## OpenFeign
Alle REST client implementaties steunen op OpenFeign.

## /hello
Roept de `/greeting` service aan, en maakt gebruik van een fallback methode als de service een fout teruggeeft.

