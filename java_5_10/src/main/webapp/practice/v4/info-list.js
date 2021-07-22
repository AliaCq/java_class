var request = new XMLHttpRequest();
request.open("get", "/practice/v4/info-list");
request.addEventListener("load", function () {
  var table = document.querySelector("table");
  var lines = this.responseText.split("\n");
  for (var line of lines) {
    var s = line.split(":");
    var name = s[0];
    var gender = s[1];
    var html = "<td>" + name + "</td><td>" + gender + "</td>";
    var trE = document.createElement("tr");
    trE.innerHTML = html;

    table.appendChild(trE);

    console.log(name);
    console.log(gender);
    console.log("=============");
  }
});
request.send();