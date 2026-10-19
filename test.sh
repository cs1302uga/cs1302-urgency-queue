#!/bin/bash

cd "$(dirname -- "${BASH_SOURCE[0]}")"

if [[ $# -ne 1 ]]; then
    printf 'Expected one implementation name.\n' >&2
    printf '$ %s %s\n' "${0}" "oracle" >&2
    printf '$ %s %s\n' "${0}" "custom-oracle" >&2
    printf '$ %s %s\n' "${0}" "linked" >&2
    printf '$ %s %s\n' "${0}" "custom">&2
    exit 1
fi

IMPLEMENTATION="${1}"

JAVA_OPTIONS="-cp cs1302-urgency-queue.jar:bin cs1302.test.QueueTester ${IMPLEMENTATION}"

set -e # exit on error
set -x # echo commands

./compile.sh
printf 'Running QueueTester with implementation: %s\n' "${IMPLEMENTATION}"
java ${JAVA_OPTIONS}
