1. 初始化：

   ```javascript
   //创建一个载入函数，负责AJAX的前四步：创建实例，规定完成时的状态，规定请求形式，发送请求
   function loadDoc(网址的参数, 自定义获取信息的方式的函数的参数) {
     var xhttp = new XMLHttpRequest();
     xhttp.onreadystatechange = function() {
   //检测请求状态，是否完成
       if (this.readyState == 4 && this.status == 200) {
        自定义获取信息的方式的函数(this);
       }
     };
     xhttp.open("GET", XML或PHP或ASP, true);
     xhttp.send();
   }
   
   //执行
   loadDoc("网址", 自定义获取信息的方式的函数);
   
   //自定义获取的形式
   function 自定义获取信息的方式的函数(xhttp) {
   // 获取信息形式，完成后端负责所有操作
    } 
   ```

2. **innerHTML赋值获取的转义标签不会忽略：**

   `var table="<tr><th>艺术家</th><th>曲目</th></tr>";`

   `document.getElementById("demo").innerHTML = table;`

   用于新增一个HTML元素

3. **流程：**事件触发>判断函数>若出现有效数据，执行初始化>将获取的数据赋值给目的标签

4. 触发事件一般是`onchange`

5. 获取信息的方式:

   - 获取头部：

     1. 所有：`document.getElementById("demo").innerHTML = this.getAllResponseHeaders();`
     2. 特定标签：`document.getElementById("demo").innerHTML = this.getResponseHeader("Last-Modified");`

   - 获取所有：

     1. 字符串：`document.getElementById("myDiv").innerHTML=xmlhttp.responseText;`

     2. 文本：

        ```javascript
        xmlDoc=xmlhttp.responseXML;
            txt="";
          x=xmlDoc.getElementsByTagName("title");
            for (i=0;i<x.length;i++)
              {
              txt=txt + x[i].childNodes[0].nodeValue + "<br />";
              }
         document.getElementById("myDiv").innerHTML=txt;
        ```

