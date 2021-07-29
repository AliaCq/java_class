window.addEventListener("load", function () {
  var h1 = document.querySelector("h1");
  var a = document.querySelector("a");
  var ol = document.querySelector("ol");

  var aid = getParameter("aid")
  if (!aid) {
    alert("aid 是必须的")
    return
  }

  ajax("get", `/api/edit-album-detail.json?aid=${aid}`, function (result) {
    if (!result.success) {
      alert("错误: " + result.reason);
      return;
    }

    var album = result.data;
    h1.innerText = album.name;
    a.href = `/new-story.html?aid=${album.aid}`

    for (var story of album.storyList) {
      var html = `<li>${story.name}</li>`
      ol.innerHTML += html
    }
  })
})