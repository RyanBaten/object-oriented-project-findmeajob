#!/usr/bin/env bash

function usage {
    echo "Expects one argument, the user to connect as"
    echo "./setup.sh mysqluser"
}

if [[ $# != 1 || $1 == "-h" || $1 == "--help" ]]; then
    usage
    exit
fi

mysql -u $1 -p < create-test.sql
