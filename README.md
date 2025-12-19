# Gradle Multi-Module Test Project

This is a test project for Frogbot's Gradle package handler.

## Structure

```
gradle-multi-module/
├── settings.gradle           # Defines modules
├── build.gradle              # Root build config
├── app/
│   ├── build.gradle          # App module dependencies (junit:junit:4.+)
│   └── src/main/java/...
└── core/
    ├── build.gradle          # Core module dependencies (junit:junit:4.+)
    └── src/main/java/...
```

## Purpose

Tests if Frogbot reports vulnerabilities separately for each module, or aggregated.

## Vulnerable Dependencies

Both modules contain:
- `junit:junit:4.+` (dynamic version, old vulnerable version)
- Different versions of `commons-io` (potentially vulnerable)

## Test Questions

1. Does scan report junit vulnerability once or twice (once per module)?
2. Does UpdateDependency get called once or twice?
3. Is the file path included in vulnerability details?
