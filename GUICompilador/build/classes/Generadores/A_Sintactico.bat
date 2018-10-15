SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_05\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\oscar\Documents\GUICompilador\src\Analizadores
java -jar C:\Users\oscar\Documents\GUICompilador\Fuentes\java-cup-11b.jar -parser analisis_sintactico -symbols Simbolos A_Sintactico.cup
pause
