# Makefile for Java project

# Directories
SRC_DIR := src
OUT_DIR := out

# Compiler and compiler flags
JC := javac
JCFLAGS := -d $(OUT_DIR) -sourcepath $(SRC_DIR)

# Sources and classes
SRCS := $(wildcard $(SRC_DIR)/*.java)
CLS := $(SRCS:$(SRC_DIR)/%.java=$(OUT_DIR)/%.class)

# Targets
.PHONY: all clean run

# Default target
all: $(CLS)

# Compile Java source files
$(CLS): $(OUT_DIR)/%.class: $(SRC_DIR)/%.java
	@$(JC) $(JCFLAGS) $<

# Clean up compiled files
clean:
	rm -rf $(OUT_DIR)

# Run the program
run: all
	@java -cp $(OUT_DIR) Main
