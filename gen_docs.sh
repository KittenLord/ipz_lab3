rm -rf ./docs/*

find . -name "*.java" > .docs_args
javadoc -d ./docs @.docs_args
rm .docs_args

firefox ./docs/index.html
