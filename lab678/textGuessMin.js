const brain = require('brain.js')

const network = new brain.NeuralNetwork();

const trainingData = [
    {
        input: 'Ay pobre',
        output: { estela: 1 }
    },
    {
        input: 'Jajajjaja',
        output: { estela: 1 }
    },
    {
        input: 'a ver si entiendes algo',
        output: { estela: 1 }
    },
    {
        input: 'si quieres te paso como lo tengo hecho yo',
        output: { estela: 1 }
    },
    {
        input: 'ya, pero eso en java no funciona asi',
        output: { estela: 1 }
    },
    {
        input: 'hay que hacerlo pasico a paso',
        output: { estela: 1 }
    },
    {
        input: 'ni leches',
        output: { estela: 1 }
    },
    {
        input: 'de push',
        output: { estela: 1 }
    },
    {
        input: 'porque no entiendo la mitad de los metodos que has usado',
        output: { estela: 1 }
    },
    {
        input: 'no soy capaz de pasar tu código a java ni queriendo',
        output: { estela: 1 }
    },
    {
        input: 'xD',
        output: { estela: 1 }
    },
    {
        input: 'Por?',
        output: { alejandro: 1 }
    },
    {
        input: 'push es para añadir un elemento nuevo al final de un array',
        output: { alejandro: 1 }
    },
    {
        input: 'Y map ejecuta una funcion en cada elemento de un array',
        output: { alejandro: 1 }
    },
    {
        input: 'No sé si se oye algo',
        output: { alejandro: 1 }
    },
    {
        input: 'Pero el mensaje viene a decir que me ha dicho Aadrian que no le importa ayudarte de vez en cuando con alguna preguntilla',
        output: { alejandro: 1 }
    },
    {
        input: 'Siempre y cuando se la mandes en inglés y tenga tiempo :P',
        output: { alejandro: 1 }
    },
    {
        input: 'Por si le quieres mandar el código del ejercicio de las barajas y que mira a ver si hay algún fallo que él pueda ver',
        output: { alejandro: 1 }
    },
    {
        input: 'Dos semanas para hacer solo eso',
        output: { alejandro: 1 }
    },
    {
        input: 'Dos personas a 8 horas al día',
        output: { alejandro: 1 }
    },
    {
        input: 'He aquí la presentación de lo que hemos hecho hasta ahora',
        output: { alejandro: 1 }
    },
    {
        input: 'Lo que ha costado maja jaja',
        output: { alejandro: 1 }
    }
]

// supervised training

function encode(arg) {
    if(arg !== undefined){
        return Number(arg.split('').map(x => (x.charCodeAt(0) / 255)));
    }
}

function processTrainingData(data) {
    let processedData = []
    for (let i = 0; i < data.length; i++) {
            processedData.push({
                input: encode(data[i].input),
                output: data[i].output
            })
    }
    return processedData
}

network.train(processTrainingData(trainingData))

/*const resultTraining = network.run(processTrainingData(
    'Dos personas a 8 horas al día'))
console.log(resultTraining)*/

const result = brain.likely(encode('ni leches'), network)
console.log(`this whatsapp text is very likely to come from ${result}`)
