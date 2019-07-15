var items = [
    {
        id:1,
        name:"book",
        price: 200
    },
    {
        id:2,
        name:"pen",
        price: 100
    },
    {
        id:3,
        name:"bag",
        price: 600
    },
    {
        id:4,
        name:"shirt",
        price: 1000
    },
    {
        id:5,
        name:"laptop",
        price: 15000
    }
];

var stringItems = JSON.stringify(items);
console.log(stringItems);

var objItems = JSON.parse(stringItems);
console.log(objItems);