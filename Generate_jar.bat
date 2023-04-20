rmdir src\main\resources\assets /Q /S
xcopy resources\ src\main\resources /E /I /H /Y
@echo off
echo -----------------------------------------------------------------
echo Les resources sont bien chargees.
echo Le jar est pret a etre genere
echo -----------------------------------------------------------------
pause
.\gradlew jar
pause