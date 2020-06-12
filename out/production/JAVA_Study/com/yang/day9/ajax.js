var f1 = String.fromCharCode(198);
var f2 = String.fromCharCode(199);

function ajax(url, send, postback, f, moth) {
    moth = moth ? "GET" : "POST";
    var ajx = new XMLHttpRequest();
    ajx.open(moth, url, !f);
    ajx.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    if (postback) ajx.onreadystatechange = function () {
        if (ajx.readyState == 4 && ajx.status == 200) postback(ajx.responseText)
    };
    ajx.send(send)
}

function $(id) {
    return id ? document.getElementById(id) : document.body
}

function $1(dom) {
    return dom ? document.querySelector(dom) : document.body
}

function $a(dom) {
    return dom ? document.querySelectorAll(dom) : document.body
}