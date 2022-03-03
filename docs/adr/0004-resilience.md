# 4. resilience

Date: 2022-03-03

## Status

2022-03-03 proposed

## Context

Services don't always succeed. This can be due to several reasons: timeouts, resource depletion, temporary outage, ...
We should avoid that our application stops working - partly - because one of its services has a problem.

## Decision

Use resilience4j

## Consequences

- Almost no code
- Need to learn openfeign conventions
- Easy to configure