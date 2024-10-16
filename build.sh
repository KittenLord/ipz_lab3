rm -rf ./out/*

find . -name "*.java" > .args
javac -d ./out @.args
rm .args

jar --create --file=./out/Build.jar --main-class=work3.Main -C ./out .

java -jar ./out/Build.jar $@
