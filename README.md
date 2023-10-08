# Informacion del Systema

# Documentacion de Spring Boot

https://code.visualstudio.com/docs/java/java-spring-boot

# Documentacion de API RESTful con Spring Boot

Para la documentación, Una vez inicializado este API accede a :

http://127.0.0.1:8080/getSystemInfo

# Temas grupos

# Proyecto 1: Desarrollo de una API RESTful con Spring Boot

Creación de el api para un block de notas

Requerimientos Funcionales:

Registro de Usuarios:

Los usuarios deben poder registrarse en la aplicación proporcionando un nombre de usuario y una contraseña segura.
Inicio de Sesión de Usuarios:

Los usuarios registrados deben poder iniciar sesión utilizando sus credenciales.
Creación de Tareas:

Los usuarios autenticados deben poder crear nuevas tareas especificando un título, una descripción, una fecha de vencimiento y una prioridad.
Listado de Tareas:

La API debe proporcionar una forma de recuperar la lista de tareas creadas por un usuario específico.
Actualización de Tareas:

Los usuarios deben poder editar y actualizar sus tareas existentes, incluyendo la modificación del título, la descripción, la fecha de vencimiento y la prioridad.
Eliminación de Tareas:

Los usuarios deben poder eliminar tareas de su bloc.
Filtros y Ordenación de Tareas:

Proporcionar funcionalidades de filtrado y ordenación para que los usuarios puedan ver sus tareas de acuerdo a diferentes criterios, como prioridad o fecha de vencimiento.

** bono ** Autenticación y Autorización:

Implementar autenticación basada en tokens (por ejemplo, JWT) para proteger las rutas y recursos de la API.
Establecer reglas de autorización para garantizar que un usuario solo pueda acceder y modificar sus propias tareas.

** bono ** Manejo de Errores y Validaciones:

Validar los datos de entrada del usuario y proporcionar mensajes de error claros en caso de problemas.
Implementar un manejo adecuado de errores, como errores 404 para recursos no encontrados y errores 401 para acceso no autorizado.
Requerimientos No Funcionales:

** bono ** Seguridad:

Garantizar que la API sea segura mediante prácticas de seguridad como el almacenamiento seguro de contraseñas y la prevención de ataques comunes, como la inyección SQL.
Documentación:

** bono ** Pruebas:

Realizar pruebas unitarias y de integración para garantizar la calidad y estabilidad de la API.

# Proyecto 2: JAVA ETL con Sprintboot.

Simular un ETL que extraiga datos de un archivo csv, los procese y los guarde en una base de datos.

Requerimientos Funcionales:

Proceso de Extracción de Datos:

Implementar un proceso que extraiga datos de una fuente externa, como una cola (por ejemplo, RabbitMQ) o un archivo CSV.
Configurar la lógica de extracción para leer los datos de manera eficiente y confiable.
Transformación de Datos:

Diseñar una lógica de transformación que aplique cambios y enriquezca los datos extraídos según las necesidades del negocio.
Realizar validaciones y limpieza de datos para garantizar la integridad.
Carga de Datos en una Base de Datos:

Establecer la conexión con una base de datos (por ejemplo, PostgreSQL o MySQL) donde se cargarán los datos transformados.
Implementar la lógica de carga para insertar, actualizar o eliminar registros en la base de datos de destino.
Planificación y Programación de Procesos en Lote:

Configurar y programar los trabajos de procesamiento en lote utilizando Spring Batch.
Establecer horarios o activadores para ejecutar los trabajos de manera regular o bajo demanda.
Manejo de Errores y Retransmisión:

Implementar estrategias de manejo de errores para lidiar con situaciones como datos incorrectos o interrupciones en el proceso.
Habilitar la retransmisión de trabajos o pasos fallidos para garantizar que no se pierdan datos críticos.
Monitoreo y Reportes:

Configurar el monitoreo y registro de eventos clave durante el procesamiento en lote.
Generar informes y registros de actividad para facilitar la auditoría y la solución de problemas.
Escalabilidad:

Diseñar el sistema de manera que permita la escalabilidad horizontal para manejar grandes volúmenes de datos si es necesario.

Requerimientos No Funcionales:

Seguridad:

Implementar medidas de seguridad adecuadas para proteger los datos durante el proceso ETL, incluyendo la autenticación y autorización de usuarios.
Documentación:

Proporcionar documentación detallada de la arquitectura ETL, los flujos de datos y las configuraciones.
Rendimiento:

Optimizar el rendimiento del proceso ETL para garantizar un procesamiento eficiente incluso con grandes conjuntos de datos.
Logging y Monitoreo:

Configurar registros (logs) para el seguimiento de actividades y errores durante el proceso ETL.
Implementar herramientas de monitoreo para supervisar la salud y el rendimiento del proceso.

Pruebas:

Realizar pruebas unitarias, de integración y de rendimiento para garantizar la calidad y la estabilidad del sistema ETL.
