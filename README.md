# Gradle Single-Module Test Project

This is a test project for Frogbot's Gradle package handler.

## Structure

```
gradle-multi-module/
├── build.gradle              # Single module with dependencies
├── gradlew                   # Gradle wrapper
└── src/main/java/...
```

## Purpose

Tests if Frogbot can detect and fix vulnerabilities in a single-module Gradle project.

## Vulnerable Dependencies

- `junit:junit:4.7` (old vulnerable version)
- `commons-io:commons-io:2.5` (potentially vulnerable)

## Testing

This is a simplified single-module project (was previously multi-module).
Testing dependency scanning and vulnerability fixing.
