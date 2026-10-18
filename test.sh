#!/usr/bin/env bash
# Verify the project, then run the reusable tester with the selected implementation.
set -euo pipefail

main() {
    case "${1:-}" in
        -h|--help)
            printf '%s\n' \
                'Usage: test.sh [oracle | custom-oracle | linked | custom]' \
                '       test.sh --help | --version' \
                'Run compile.sh, then QueueTester. The default mode is oracle.' \
                'Requires Java 25 from the CSCI 1302 shell profile.' \
                'oracle: natural-order oracle; custom-oracle: comparator oracle.' \
                'linked: student natural-order queue; custom: student comparator queue.' \
                'Unimplemented student stubs fail with UnsupportedOperationException.'
            return 0
            ;;
        -v|--version)
            printf '%s\n' 'test.sh (cs1302-urgency-queue starter 1.0.0)'
            return 0
            ;;
    esac
    if [[ $# -gt 1 ]]; then
        printf 'Expected at most one implementation name. Use --help for usage.\n' >&2
        return 2
    fi
    local implementation=${1:-oracle}
    case "$implementation" in
        oracle|custom-oracle|linked|custom) ;;
        *)
            printf 'Unknown implementation: %s\nUse --help for usage.\n' \
                "$implementation" >&2
            return 2
            ;;
    esac

    local project_dir
    project_dir=$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)
    cd -- "$project_dir"
    if ! command -v java >/dev/null 2>&1; then
        printf 'Required command missing: java. Enable the CSCI 1302 shell profile.\n' >&2
        return 1
    fi
    ./compile.sh
    printf 'Running QueueTester with implementation: %s\n' "$implementation"
    java -cp cs1302-urgency-queue.jar:bin cs1302.test.QueueTester "$implementation"
}

if [[ "${BASH_SOURCE[0]}" == "$0" ]]; then
    main "$@"
fi
