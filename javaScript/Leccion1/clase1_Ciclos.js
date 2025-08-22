// CICLO WHILE
let contador = 0;
while(contador <4){
    console.log(contador);
    contador++;
}
console.log("Finalizo el ciclo while")

//CICLO DO WHILE
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);

console.log("Finalizo el ciclo do while");

//CICLO FOR
for(let contando = 0 ; contando < 3 ; contando ++){
    console.log(contando);
}
console.log("Finalizo el ciclo for");

//PALABRA RESERVADA BREAK
for(let contando = 0;contando <= 10; contando++){
    if (contando % 2 == 0){
        console.log(contando);// muestra todos los pares
        break;
    }
}
console.log("Termino el ciclo al encontrar los pares")

// PALABRA RESERVADA CONTINUE y ETIQUETAS LABELS
inicio:
for(let contando = 0;contando <= 10; contando++){
    if (contando % 2 !== 0){
        break inicio; // continua a la siguiente iteración
    }
    console.log(contando);
}
console.log("Termino el ciclo");


