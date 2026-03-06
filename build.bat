@echo off
REM Script para compilar el proyecto en Windows

echo Compilando Conversor de Monedas...
call mvn clean compile

if %ERRORLEVEL% EQU 0 (
    echo.
    echo Compilacion exitosa
    echo.
    echo Para ejecutar la aplicacion:
    echo   mvn exec:java -Dexec.mainClass="Principal"
) else (
    echo.
    echo Error en la compilacion
    exit /b 1
)
