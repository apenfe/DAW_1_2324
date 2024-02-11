/* 
 *  prueba2.js
 *
 *  Crear un programa con una variable en la que se guarde un texto solicitado al usuario 
 *  y se muestre como una alerta y por consola. Luego, en esa misma variable se debe pedir 
 *  un número y guardarse como valor númerico (convertir a número) y mostrar el resultado 
 *  como alerta y por consola.
 * 
 *  Posteriormente, en esa misma variable, se debe preguntar al 
 *  usuario si quiere continuar o no (ver función confirm()) y guardar el resultado de la 
 *  pregunta en la variable y mostrar el valor por consola. 
 * 
 *  Después, si el usuario ha marcado 
 *  el botón de confirmar de la pregunta, se debe guardar en la variable un objeto JSON simple
 *  con dos propiedades, nombre y edad, las cuales contendrán una cadena de texto y un valor 
 *  entero respectivamente, para después, mostrar por mensaje y por consola la información que
 *  contiene el objeto JSON.
 * 
 *  24/10/2023
 * 
 *  Adrián Peñalver Fernández
 */

var texto
var nombre
var edad

texto=prompt('Ingrese el texto: ',texto)
nombre=texto

console.log(texto)
window.alert(texto);

texto=prompt('A continuación ingrese un número: ',texto)
edad=texto

console.log(texto)
window.alert(texto);

texto=confirm("¿Desea continuar?");

    if(texto){

        console.log(texto)

        texto  = [];
        var objeto = {};
        
            texto.push({ 
                "nombre"    : nombre,
                "edad"  : edad,
            });
        
        objeto.texto = texto;
        console.log(JSON.stringify(objeto));
        window.alert(JSON.stringify(objeto));

    }else{

        console.log(texto)

    }
