.DEFAULT_GOAL := run

CPP      := g++
CFLAGS   := -Wall -Wextra -O2 -std=c++17
CODE     ?=                    # pass like CODE=123
SRC      := $(shell ls $(CODE)-*.cpp 2>/dev/null | head -n1)
OUT      := /tmp/$(CODE)
ARGS     ?=                    # optional: arguments to your program

.PHONY: run build

## run: compile then execute
run: build
	@echo "→ Running $(OUT) $(ARGS)"
	@$(OUT) $(ARGS)

## build: compile source into /tmp
build:
	@if [ -z "$(CODE)" ]; then \
		echo "Usage: make CODE=<number>"; exit 1; \
	fi
	@if [ -z "$(SRC)" ]; then \
		echo "No file matching '$(CODE)-*.cpp' found"; exit 1; \
	else \
		echo "Compiling $(SRC) → $(OUT)"; \
		$(CPP) $(CFLAGS) $(SRC) -o $(OUT); \
	fi
