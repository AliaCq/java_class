function getParameter(name) {
    var query = window.location.search.substring(1);
    var params = query.split("&");
    for (var param of params) {
        var pair = param.split("=");
        if (pair[0] === name) {
            return decodeURIComponent(pair[1]);
        }
    }
    return undefined;
}

function ajax(method,url,onloadFn) {
    var xhr = new XMLHttpRequest();
    xhr.open(method,url);
    xhr.onload = function () {
        var result = JSON.parse(xhr.responseText);
        onloadFn(result);
    };
    xhr.send();
}