Feature: Realizacion de casos ingresando nombre de usuario y contrase�a
Scenario: Verificacion de ingreso de sesion
Given Abrir Chrome
When ingresar Username "Roly" y Password "1234"
Then inicia sesion