#Autor: Alejandro Almentero
  #languaje: es

@Login
Feature: Loguearse en el sistema

  # Este bloque de Background define los pasos comunes que se repiten en todos los escenarios
  Background:
    Given el usuario ingresa a la página de login

  Scenario Outline: Ingresar con diferentes credenciales
    When el usuario ingresa su nombre de usuario "<user>" y contraseña "<clave>"
    Then el usuario valida el mensaje "<Dashboard>"

    Examples:
      | user   | clave     | Dashboard   |
      | Admin  | admin123  | Dashboard   |

  # Escenario 2: Registro de un candidato
  @Registro
  Scenario Outline: Registrar un candidato
    When el usuario ingresa su nombre de usuario "Admin" y contraseña "admin123"
    When el usuario ingresa los datos del candidato
      | fullname | middle | lastname | vacancy   | email                | contactnumber | keywords    | notes   |
      | <fullname> | <middle> | <lastname> | <vacancy> | <email>               | <contactnumber> | <keywords>  | <notes>  |
    Then el sistema valida los datos del candidato

    Examples:
      | fullname | middle | lastname | vacancy    | email                | contactnumber | keywords     | notes   |
      | Pedro      | Pablo  | Smith     | Payroll Administrator  | pedro@email.com  | 30089898       | Automatización    | Automatizando con selenium     |
