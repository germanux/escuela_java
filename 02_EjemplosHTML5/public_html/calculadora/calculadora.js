class Calculadora {
    constructor() {
        this.result = document.getElementById("resultado");
    }
    numeroPulsado(eventObj) {
        let valor = eventObj.currentTarget.innerHTML;
        // alert("Pulsado " + valor);
        if (valor ==="+/-") {
            calculadora.result.value = "" + (- (parseFloat(calculadora.result.value)));
        } else if (valor === "." ) {
            if ( ! calculadora.result.value.includes(".")) 
                calculadora.result.value += valor;
        } else {
            calculadora.result.value += valor;
        }
    }
};
let calculadora = null;

window.onload = function() {
    let botones = document.getElementsByClassName("num"); // array de botones
    calculadora = new Calculadora();
    for (let boton of botones) {
        boton.addEventListener("click", calculadora.numeroPulsado);
    }
};