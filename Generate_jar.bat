rmdir src\main\resources\assets /Q /S
xcopy resources\ src\main\resources /E /I /H /Y
.\gradlew jar
pause