> AJAX:

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

4. 触发事件一般是`onchange`某些内容发生改变

5. 

6. 获取信息的方式:

   - 获取头部：

     1. 所有：`document.getElementById("demo").innerHTML = this.getAllResponseHeaders();`
     2. 特定标签：`document.getElementById("demo").innerHTML = this.getResponseHeader("Last-Modified");`

   - 获取所有：

     1. 文本：`document.getElementById("myDiv").innerHTML=xmlhttp.responseText;`

     2. 可解析：

        ```javascript·
        xmlDoc=xmlhttp.responseXML;
        txt="";
          x=xmlDoc.getElementsByTagName("title");
            for (i=0;i<x.length;i++)
              {
              txt=txt + x[i].childNodes[0].nodeValue + "<br />";
              }
         document.getElementById("myDiv").innerHTML=txt;.
        ```

> PHP:

1. PHP 脚本在服务器上执行，然后向浏览器发送回纯 HTML 结果，PHP 脚本可放置于文档中的任何位置`<?php PHP语句 ?>`

2. PHP 语句以分号结尾（;）

3. 变量以 $ 符号开头

4. PHP 有三种不同的变量作用域：

   - local：函数内声明，外则无法使用

   - global：函数外声明，内也无法使用，需用`global $变量`声明，

     `$GLOBALS[索引] `数组中存储了所有的全局变量

   - static：函数内为局部变量声明，每当函数被调用时，这个变量所存储的信息都是函数最后一次被调用时所包含的信息  

5. 字符串中能包含 HTML 标签，其中的变量为`{$变量}`

6. 数据类型：

   1. 字符串、整数、浮点数、逻辑（布尔）、数组（`$变量=array(,)`）、对象、NULL
   2. `var_dump($变量) `会输出变量的数据类型和值
   3. 

7. 