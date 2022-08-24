@echo off
color C
title S.O. .bat
echo -------------------------------------------------
echo           Escolha uma opcao
echo.
echo -------------------------------------------------
echo.

echo O que voce deseja fazer?
echo 1 - Abrir programa
echo 2 - Criar arquivo
echo 3 - Esvaziar lixeira

pause

set /p choice= 

if /I "%choice%" EQU "--help" GOTO help
if /I "%choice%" EQU "--version" GOTO version

if /I "%choice%" EQU "1" GOTO abrir
if /I "%choice%" EQU "2" GOTO arquivo
if /I "%choice%" EQU "3" GOTO lixeira

GOTO END

:help
echo.
echo --help	Mostra os comandos
echo --version	Mostra a versão do DoS
echo.
pause
GOTO END

:version
echo.
ver
echo.
pause
GOTO END

:abrir
echo.
echo Abrir programa
echo.
echo Programas possiveis:
echo calc       -       Calculadora
echo notepad    -       Bloco de notas
echo chrome     -       Calculadora
echo mspaint    -       Paint
echo.
set /p programa= Digite o nome do programa : 
start %programa%.exe
pause
GOTO END

:arquivo
echo.
echo "Aqeuivo .txt criado no desktop!"
echo. > NovoArquivo.txt
echo.
pause
GOTO END

:lixeira
echo.
echo %~dp0
rd /s c:\$Recycle.Bin
echo.
pause
GOTO END

:END