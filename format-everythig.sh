#!/bin/bash

prettier . --write

find . -name "*.c" -exec clang-format  -i {} +

echo "Formatting complete."
