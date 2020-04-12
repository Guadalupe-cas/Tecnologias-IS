# Tecnologias-IS
Sistema Web Agencia Autobus  http://34.207.215.173:8080/Autobus1.wsdl



# Agencia de Autobus

![Autovías - Empresa, venta de boletos de autobus, descuento de ...](https://www.autovias.com.mx/application/public/img/empresa/empresa_header.png)

## *Descripcion:*

creacion de un sistema para una agencia de autobus, los datos relevantes se muestran en las descripciones de abajo.

## Requerimientos 

- [ ] Agregar Ruta				

- [ ] Consultar Ruta                

- [ ] Modificar Ruta                  

- [ ] Eliminar Ruta       

      ​
      $$
      Cliente
      $$
      ​           



- [ ] Agregar Cliente                   
- [ ] Consultar Cliente             
- [ ] Modificar Cliente                
- [ ] Eliminar Cliente



$$
Boleto
$$



- [ ] Agregar Boleto
- [ ] Consultar Boleto
- [ ] Cancelar Boleto                 





## **Variables**

| Nombre de las variables Ruta | Tipo     |
| ---------------------------- | -------- |
| IdRuta                       | Cadena   |
| NombreRuta                   | *Cadena* |
| Destino                      | *Cadena* |
| TipoBoleto                   | *Cadena* |
| Costo                        | *Entero* |



| Nombre de las variables Cliente | Tipo     |
| ------------------------------- | -------- |
| NombreCliente                   | *Cadena* |
| Apellidos                       | *Cadena* |
| IdCliente                       | *Cadena* |



| Nombre de las variables Boleto | Tipo     |
| ------------------------------ | -------- |
| IdBoleto                       | *Cadena* |
| NombreRuta                     | *Cadena* |
| Destino                        | *Cadena* |
| NombreCliente                  | *Cadena* |
| TipoBoleto                     | *Cadena* |
| Costo                          | *Entero* |
| NumAsiento                     | *Entero* |



## <u>Mensajes del sistema :</u>

$$
Ruta
$$



###### Agregar Ruta

Si  el usuario llena los datos que se solicitan  los cuales se muestran en la parte de arriba.

​				El mensaje dira "Ruta Agregada con exito".

###### Consultar Ruta

Una vez que los datos de las rutas se han ingresado , el usuario podra consultar todas las rutas del sistema,

la cual se desglozaran los diferentes datos que fueron agregados anteriormente.

​				"Ingrese Nombre de la ruta que desee consultar"

###### Modificar Ruta

Ya que los datos están en el sistema el usuario podrá modificar los datos ingresado.

​							"Datos Modificados"

###### Eliminar Ruta

Una vez que todos los datos de las rutas están en el sistema el usuario podrá eliminar la ruta seleccionada 				

​					“Ingrese el Nombre de la ruta que dese eliminar”






$$
Cliente
$$

###### Agregar Cliente

Si  el usuario llena los datos que se solicitan  los cuales se muestran en la parte de arriba.

​				El mensaje dira "El cliente a sido agregado con exito".

###### Consultar Cliente

Una vez que los datos del los clientes se han ingresado , el usuario podra consultar todos los datos en el  sistema, el  cual se desglozaran los diferentes datos que fueron agregados anteriormente.

​							"El cliente que consulto es:"

###### ModificarCliente

Ya que los datos están en el sistema el usuario podrá modificar los datos ingresado

​							"El cliente a sido modificado"

###### Eliminar Cliente

Una vez que todos los datos de los clientes están en el sistema el usuario podrá eliminar el cliente.												

​					“El Cliente a sido eliminado del sistema”





$$
Boleto
$$

###### Agregar Boleto

Se llenan los datos del boleto ,los cuales se describen en la parte superior  del documento.

​						El mensaje dira "El boleto  a sido agregado con exito".

###### Consultar Boleto

Una vez que los datos del los boletos  se han ingresado , el usuario podra consultar todos los datos en el  sistema, el  cual se desglozaran los diferentes datos que fueron agregados anteriormente.

​						"El Boleto  consultado tiene los siguientes datos:"

###### Cancelar Boleto

Una vez que todos los datos de los boletos están en el sistema el usuario podrá cancelar  el boleto.												

​						“El Boleto  a sido  Cancelado con exito:”
