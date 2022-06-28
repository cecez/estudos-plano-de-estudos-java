- folders inside "src" =~ "packages", that must be declared in its subfiles
- Full Qualified Name - FQN = package.class_name
- common practice / convention for FQN = (reverse domain).project = f.i.: br.com.company.project

- visibility / access modifier:
  - public (everywhere)
  - protected (class and subclasses)
  - << package private >> (default, package only)
  - private (class only)

- JAR
  - export compiled files
  - import them to a specific directory (libs), add to buildpath, import them in code

- java.lang (main Java package)
- java.lang.String is immutable
- StringBuilder to perform operations with Strings
- java.lang.Object is the super class of all classes