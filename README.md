# Gradle Multi-Project Test for Frogbot

This repository contains two **separate** Gradle projects to test Frogbot's multi-target handling.

## Structure

```
project1/
└── build.gradle  - Uses commons-io:2.7 (vulnerable)

project2/
└── build.gradle  - Uses jackson-databind:2.13.0 (vulnerable)
```

## Purpose

Tests that Frogbot:
1. Auto-detects both Gradle projects as separate targets
2. Processes each target independently using IncludeTargets filter
3. Package handlers only fix files in the current target (not siblings)
4. Each project gets correct fixes without cross-contamination

## Packages Being Tested

- **commons-io:2.7** (project1) - Has known CVEs, should upgrade to 2.11+
- **jackson-databind:2.13.0** (project2) - Has known CVEs, should upgrade to 2.13.4+
