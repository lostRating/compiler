all:
	mkdir -p bin
	cd src/compiler2014/ast && make
	javac src/compiler/*/*.java -classpath lib/antlr-3.5-complete.jar -d bin

clean:
	cd src/compiler/ast && make clean
	rm -rf bin
