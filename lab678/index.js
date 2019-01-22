const brain = require('brain.js')

const network = new brain.NeuralNetwork();


// supervised training

network.train([
  //{input: [kilograms, cm], output: [ 1 adult, 0 child]}
    {input: [68, 178], output: {adult: 1}},
    {input: [54, 158], output: {adult: 1}},
    {input: [54, 158], output: {adult: 1}},
    {input: [64, 174], output: {adult: 1}},
    {input: [43, 150], output: {child: 1}},
    {input: [29, 135], output: {child: 1}},
    {input: [34, 147], output: {child: 1}},
    {input: [58, 161], output: {adult: 1}},
    {input: [68, 82], output: {child: 1}},
])

const resultTraining = network.run([74, 195])
console.log(resultTraining)
/*
let children = 0
let adults = 0
for( let i = 0; i < 10000; i++){
    let weight = Math.floor(Math.random() * 100)
    let height = Math.floor(Math.random() * 210)
    console.log(weight, height)

    const result = brain.likely([weight, height], network)
    result == 'child' ? children++ : adults++
    console.log('children: ', children, 'adults :', adults)
}*/

// non-supervised training

