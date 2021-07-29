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

/*
<div class="album-meta">
      <h1></h1>
      <p></p>
      <img class="cover">
      <img class="header">
      <span class="count"></span>
      <span class="createdAt"></span>
    </div>
 */
var meta = document.querySelector(".album-meta");

function updateAlbumMeta(album) {
  meta.innerHTML = `<h1>${album.name}</h1>
  <p>${album.brief}</p>
  <img class="cover" src="${album.cover}">
  <img class="header" src="${album.header}">
  <span class="createdAt">${album.createdAt}</span>
  <span class="count">${album.count}</span>`;
}

var ol = document.querySelector(".story-list");

function appendStory(storyList) {
  for (var story of storyList) {
    ol.innerHTML += `<li>
    <a href="/story.html?sid=${story.sid}">
       <span class="name">${story.name}</span>
       <span class="count">${story.count}</span
       <span class="createdAt">${story.createdAt}</span>
    </a> 
</li>`;
  }
}

function fetchAlbumDetail() {
  // 1. 从 url 中取出 aid
  var aid = getParameter("aid");
  if (!aid) {
    alert("必须有 aid，否则该页面合法");
    return;
  }

  var url = `/api/album-detail.json?aid=${aid}`;
  var xhr = new XMLHttpRequest();
  xhr.open("get", url);
  xhr.onload = function () {
    var result = JSON.parse(xhr.responseText);
    if (!result.success) {
      alert(result.reason);
      return;
    }

    var album = result.data;

    updateAlbumMeta(album);
    appendStory(album.storyList);
  }
  xhr.send();
}

window.addEventListener("load", function () {
  // 1. 拉取用户在线情况，同 index.js 中
  // 2. 拉取当前专辑的详情
  fetchAlbumDetail();
});