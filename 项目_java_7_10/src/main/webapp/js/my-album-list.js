window.addEventListener("load",function () {
    var colElement = document.querySelector("ol");
    //判断用户是否登录
    ajax("get","/api/current-user.json",function (result) {
      if (!result.logged){
         alert("页面要求用户必须登录")
         window.location="/login.html";
         return;
      }
      ajax("get","/api/my-album-list.json",function (result) {
         if (!result.success) {
             alert("获取资源失败" + result.reason)
             return;
         }
         var albumList = result.data;
         for(var album of albumList){
             var html = `<li><a href="/album-editor.html?aid=${album.aid}">${album.name}</a></li>`
             colElement.innerHTML += html;
         }
      })
    })
})