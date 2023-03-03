const btn = document.getElementById('btn');
var btn2 = document.getElementById('btn');
var rectangle = document.getElementById('rectangle');
var h1Elements = document.getElementsByTagName("h1");
var h2Elements = document.getElementsByTagName("h2");
var h3Elements = document.getElementsByTagName("h3");
var h4Elements = document.getElementsByTagName("h4");
var liElements = document.getElementsByTagName("li");


btn.addEventListener('click', function onClick(event) {
    document.body.style.backgroundColor = 'rgb(89, 125, 93)';
});

btn.addEventListener('click', function onClick(event) {
    rectangle.style.backgroundColor = 'rgb(222, 160, 135)';
});

btn.addEventListener('click', function onClick(event) {
    btn2.style.color = 'rgb(89, 125, 93)';
});

btn.addEventListener('click', function onClick(event) {
    for(var i = 0; i < h1Elements.length; i++) {
        h1Elements[i].style.color = "rgb(222, 160, 135)";
    }
});

btn.addEventListener('click', function onClick(event) {
    for(var i = 0; i < h2Elements.length; i++) {
        h2Elements[i].style.color = "rgb(240, 240, 240)";
    }
});

btn.addEventListener('click', function onClick(event) {
    for(var i = 0; i < h3Elements.length; i++) {
        h3Elements[i].style.color = "rgb(240, 240, 240)";
    }
});

btn.addEventListener('click', function onClick(event) {
    for(var i = 0; i < h4Elements.length; i++) {
        h4Elements[i].style.color = "rgb(240, 240, 240)";
    }
});

btn.addEventListener('click', function onClick(event) {
    for(var i = 0; i < liElements.length; i++) {
        liElements[i].style.color = "rgb(240, 240, 240)";
    }
});

btn.addEventListener('click', function onClick(event) {
    document.body.style.backgroundColor = 'rgb(89, 125, 93)';
});
