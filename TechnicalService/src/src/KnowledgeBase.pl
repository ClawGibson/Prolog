/* BASE DE DATOS
 * Dominio: diagn�stico de servicio t�cnico de computadoras.
 * Modelo: conocimiento(Diagnostico, ListaSintomas).
*/

conocimiento('Falla de la ram',
['El CPU da pitidos', 'La CPU se reinicia',
'Pantallazo azul']).
conocimiento('Falla de la tarjeta madre',
['Computadora no enciende', 'Pantallazo azul',
 'El CPU da pitidos','La PC se apaga']).
conocimiento('Falla de la tarjeta de video',
['Monitor sin se�al','El CPU da pitidos',
 'Imagen borrosa']).
conocimiento('Virus',
['La CPU se reinicia', 'Falta informacion', 'Lentitud']).