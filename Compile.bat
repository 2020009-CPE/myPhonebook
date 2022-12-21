cd phonebook
javac emenemsinter.java
javac -d . emenemsinter.java
javac emenemsmain.java
javac -d . emenemsmain.java
javac olivaPhonebook.java
javac -d . olivaPhonebook.java
echo Main-Class: phonebook.olivaPhonebook > manifest.mf  
jar -cvfm olivaPhonebook.jar manifest.mf phonebook/ *.class
jar -cvfm ../olivaPhonebook.jar manifest.mf phonebook/ *.class    
cd ..
java -jar olivaPhonebook.jar
