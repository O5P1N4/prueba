#!/bin/bash

echo "BIENVENIDO A LA PAPELERIA"
echo "lista de productos"
echo "Lápiz HB $ 1000 " 
echo "Borrador de nata $ 1200 " 
echo "Cuaderno 100 hojas $ 5500 " 
echo "Esfero azul $ 1500 " 
echo "Marcador resaltador $ 3000 " 
echo "Regla 30 cm $ 2000 "
echo "Tijeras escolares $ 4000 " 
echo "Colbon 60 ml $ 3500 " 
echo "Carpeta carta $ 2500 " 
echo "Block hojas blancas $ 6000 " 
echo 
echo "Escriba cuantas unidades desea comprar"
echo
read -p "Lápiz HB  " lapiz
read -p "Borrador de nata  " borrador
read -p "Cuaderno 100 hojas  " cuaderno
read -p "Esfero azul  " esfero
read -p "Marcador resaltador  " resaltador
read -p "Regla 30 cm " regla
read -p "Tijeras escolares  " tijeras
read -p "Colbon 60 ml  " colbon
read -p "Carpeta carta  " carpeta
read -p "Block hojas blancas " block


lapiz_total=$((lapiz * 1000))
borrador_total=$((borrador * 1200))
cuaderno_total=$((cuaderno * 5500))
esfero_total=$((esfero * 1500))
resaltador_total=$((resaltador * 3000))
regla_total=$((regla * 2000))
tijeras_total=$((tijeras * 4000))
colbon_total=$((colbon * 3500))
carpeta_total=$((carpeta * 2500))
block_total=$((block * 6000))

total=$((lapiz_total + borrador_total + cuaderno_total + esfero_total + resaltador_total + regla_total + tijeras_total + colbon_total + carpeta_total + block_total))

echo

echo "PRECIO"
echo "Lapiz: $lapiz_total"
echo "Borrador: $borrador_total"
echo "Cuaderno: $cuaderno_total"
echo "Esfero: $esfero_total"
echo "Resaltador: $resaltador_total"
echo "Regla: $regla_total"
echo "Tijeras: $tijeras_total"
echo "Colbon: $colbon_total"
echo "Carpeta: $carpeta_total"
echo "Block: $block_total"


echo "TOTAL: $total pesos"
