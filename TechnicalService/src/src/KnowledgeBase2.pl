/* BASE DE DATOS
 * Dominio: diagn�stico de servicio t�cnico de computadoras.
 * Modelo: conocimiento(Diagnostico, ListaSintomas).
*/

conocimiento('falla de la ram',
['el cpu da pitidos', 'la computadora se reinicia',
'muestra pantalla azul','sobrecalentamiento','drivers obsoletos']).
conocimiento('falla de la tarjeta madre',
['la computadora no enciende', 'muestra pantalla azul',
 'el cpu da pitidos','la computadora se apaga','disco fragmentado']).
conocimiento('falla de la tarjeta de video',
['el monitor no da se�al','el cpu da pitidos',
 'la imagen se ve borrosa en el monitor']).
conocimiento('virus',
['el cpu se reinicia', 'falta de informacion', 'lentitud en el uso de la computadora']).
