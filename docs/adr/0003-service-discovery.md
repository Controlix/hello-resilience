# 3. service-discovery

Date: 2022-03-02

## Status

2022-03-02 proposed

## Context

Feign needs to discover the url of the service that it needs to call. This can happen in several ways:
- static url
- url based on dynamic properties
- service discovery based on the client name

## Decision

We will use spring-cloud simple discovery client which allows us to define the service urls in the application properties.

## Consequences

Dependency on spring-cloud