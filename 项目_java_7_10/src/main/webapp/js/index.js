function checkLogged() {
  var userElement = document.querySelector(".user");

  // GET /api/current-user.json
  var xhr = new XMLHttpRequest();
  xhr.open("GET", "/api/current-user.json");
  xhr.onload = function () {
    // 响应返回
    // 1. 数据反序列
    var result = JSON.parse(xhr.responseText);
    if (result.logged === true) {
      var currentUser = result.user;

      // 用户已经登录
      var html = `<a href="/new-album.html">新建专辑</a>
                  <a href="/my-album-list.html">我的专辑</a>
                  <span>${currentUser.nickname}</span>`;
      userElement.innerHTML = html;
    }
  };
  xhr.send();
}

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

function fetchAlbumList() {
  var olElement = document.querySelector("ol.album-list");

  var url = "/api/album-list.json";
  var keyword = getParameter("keyword");
  if (keyword) {
    url += `?keyword=${encodeURIComponent(keyword)}`;
  }

  var xhr = new XMLHttpRequest();
  xhr.open("GET", url);
  xhr.onload = function () {
    var result = JSON.parse(xhr.responseText);
    if (result.success === true) {
      var albumList = result.data;
      for (var album of albumList) {
        var html = `<li class="album-item">
          <a href="/album.html?aid=${album.aid}">
            <img src="${album.cover}">
            <span class="name">${album.name}</span>
            <span class="count">播放量 ${album.count}</span>
          </a>
        </li>`

        olElement.innerHTML += html;
      }
    }
  };
  xhr.send();
}

// 把我们要执行的代码放在 window.load 事件发生后执行，保证代码的执行发生在所有资源都已经加载完成后
window.addEventListener("load", function () {
  // 1. 检查用户登录状态
  checkLogged();

  // 2. 拉取专辑列表并显示
  fetchAlbumList();
});