# 2. feign-fallback

Date: 2022-03-02

## Status

2022-03-02 proposed

2022-03-02 accepted

## Context

Rest calls do not always succeed. Openfeign allows an easy way to handle failure, by defining fallback implementations.

## Decision

Implement openfeign fallback.

## Consequences

Must stick to the openfeign conventions for defining fallback methods.
