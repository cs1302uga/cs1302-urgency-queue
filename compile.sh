#!/usr/bin/env bash
# Compile and verify the starter project using the CSCI 1302 shell profile.
set -euo pipefail

main() {
    case "${1:-}" in
        -h|--help)
            printf '%s\n' \
                'Usage: compile.sh [--help | --version]' \
                'Compile all src/ Java files, check style, and regenerate doc/.' \
                'Requires Java 25 javac/java/javadoc and check1302 from the course profile.' \
                'Removes the previous bin/ and doc/ outputs before compiling.'
            return 0
            ;;
        -v|--version)
            printf '%s\n' 'compile.sh (cs1302-urgency-queue starter 1.0.0)'
            return 0
            ;;
    esac
    if [[ $# -ne 0 ]]; then
        printf 'Unknown argument: %s\nUse --help for usage.\n' "$1" >&2
        return 2
    fi

    local project_dir
    project_dir=$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)
    cd -- "$project_dir"

    local tool
    for tool in javac javadoc check1302; do
        if ! command -v "$tool" >/dev/null 2>&1; then
            printf 'Required command missing: %s. Enable the CSCI 1302 shell profile.\n' \
                "$tool" >&2
            return 1
        fi
    done
    local jar_file=cs1302-urgency-queue.jar
    if [[ ! -f "$jar_file" ]]; then
        printf 'Required file missing: %s\n' "$jar_file" >&2
        return 1
    fi
    if [[ ! -d src ]]; then
        printf 'Required directory missing: src\n' >&2
        return 1
    fi

    local source_file
    local sources=()
    while IFS= read -r -d '' source_file; do
        sources+=("$source_file")
    done < <(find src -type f -name '*.java' -print0)
    if [[ ${#sources[@]} -eq 0 ]]; then
        printf 'No Java source files found under src/.\n' >&2
        return 1
    fi

    printf 'Removing old bin/ and doc/ outputs.\n'
    rm -rf -- bin doc
    mkdir -- bin doc
    printf 'Compiling all Java sources, including the tester.\n'
    javac --release 25 -d bin -cp "$jar_file:bin" \
        -Xlint:rawtypes -Xlint:unchecked -Werror "${sources[@]}"
    printf 'Checking Java code style.\n'
    check1302 src
    printf 'Generating API documentation in doc/.\n'
    javadoc -d doc -cp "$jar_file:bin" -sourcepath src -subpackages cs1302
    printf 'Compilation, style checks, and API documentation completed.\n'
}

if [[ "${BASH_SOURCE[0]}" == "$0" ]]; then
    main "$@"
fi
