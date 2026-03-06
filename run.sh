#!/bin/bash
# Script para ejecutar el proyecto compilado

echo "Ejecutando Conversor de Monedas..."
mvn exec:java -Dexec.mainClass="Principal"
