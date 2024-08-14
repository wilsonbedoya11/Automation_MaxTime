

Feature: Reporte de horas pagina Max time de choucair

  Scenario Outline: Reporte de horas laboradas
    Given El usuario está en la página de max time
    When El usuario realiza el login satisfatorio
    When El usuario realiza el reporte de las actividades realizadas durante el dia
      | proyecto   | proyecto_vacas   | tipo_hora   | tipo_hora_vacas   | servicio   | actividad   | actividad_vacas   | horas   | comentario   | comentario_vacas   | fecha_vacaciones_inicio   | fecha_vacaciones_fin   |  |
      | <proyecto> | <proyecto_vacas> | <tipo_hora> | <tipo_hora_vacas> | <servicio> | <actividad> | <actividad_vacas> | <horas> | <comentario> | <comentario_vacas> | <fecha_vacaciones_inicio> | <fecha_vacaciones_fin> |  |
    Then El usuario finaliza el reporte correctamente

    Examples:
      | proyecto | proyecto_vacas | tipo_hora   | tipo_hora_vacas | servicio | actividad            | actividad_vacas | horas | comentario                   | comentario_vacas | fecha_vacaciones_inicio | fecha_vacaciones_fin |
      | EVC      | Varios         | H. Proyecto | H. Choucair     | auto     | EJECUCIÓN DE PRUEBAS | NOV-VACACIONES  | 8     | Ejecución de casos de prueba | Vacaciones       | 1/7/2024                | 16/7/2024            |
