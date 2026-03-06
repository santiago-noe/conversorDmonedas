#!/bin/bash
# Script para compilar el proyecto en Linux/Mac

echo "Compilando Conversor de Monedas..."
mvn clean compile

if [ $? -eq 0 ]; then
    echo ""
    echo "✓ Compilación exitosa"
    echo ""
    echo "Para ejecutar la aplicación:"
    echo "  mvn exec:java -Dexec.mainClass='Principal'"
else
    echo "✗ Error en la compilación"
    exit 1
fi
