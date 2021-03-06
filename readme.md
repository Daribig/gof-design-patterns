Implementing the Gang of Four Design Patterns in Java

Where's the logbook (google doc) for what's covered here?
- https://docs.google.com/document/d/1R67WUWk6Mt4WFksgfRQESyo8ScqkzSCfzEQzngBCIII/edit

What tutorial am i going through?
- following the following tutorial: https://gitlab.com/Daribig/design-patterns-for-humans
- the above link is an indirect pointer - it's, ultimately, pointing to https://github.com/kamranahmedse/design-patterns-for-humans

How can i run this program from the command line (using a shell language)?

- go to the project's root directory
- "rm -rf bin && find . -name "*.java" > sources.txt && javac -d bin @sources.txt && rm sources.txt" - compile to bin folder
- "java -classpath bin/ {entry point package name (can be nothing - if not nothing, then end with a '.')}{entry point class name}" - runs Program; need to pass itno the java program the root/entry point

Example workflow for when you want to compile and run your Java Program through the command line (using a 'shell' language):
- "rm -rf bin && find . -name "*.java" > sources.txt && javac -d bin @sources.txt && rm sources.txt" - running bash command to compile .java files and place into the 'bin' folder. Note: the tree of files/folders within the 'bin' folder are created based on the packages that each '.java' file in the 'src' folder are set to; it's nothing to do with the file/folder structure within the 'src' folder, it's to do with the tree-of-packages setup within the 'java' files (in the 'src' folder).
- "java -classpath bin/ creational.simplefactory.Program" - runs the (compiled) java program that's entry point, in our source (.java) code), package-and-class 'address' was at "creational.simplefactory.Program" - so the entry point (class with a 'main' method) was within the 'creational.simplefactory' package, and the class name was 'Program'... cool!

Misc:
- https://stackoverflow.com/questions/3915961/how-to-view-hierarchical-package-structure-in-eclipse-package-explorer
