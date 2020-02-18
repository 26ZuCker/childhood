- 学习路线：HTML+CSS+JS

  VUE+NODE+AJAX

  PHP+BOOTSTRAP+移动WEB开发
  
  ![前端路线](C:\Users\16404\Desktop\前端路线.jpg)


- 布局：colum，float，flex，position，grid

  绝对，弹性

+++

> **HTML:**

1. `input`的type属性如下

   `range` 显示为滑动条控制输出数字大小，您还能够设定对所接受的数字的限定

   `<input type="range" name="points" min="1" max="10" />`

   `date` 选取日、月、年 

   `month` 选取月、年 

   `week` 选取周和年

   `color`选取颜色

2. 

   

+++

> ***CSS:***

1. 使用外部CSS：`<link type="text/css" rel="styleSheet"  href="路径" />`

2. `word-wrap:break-word;`允许您允许文本强制文本进行换行 - 即使这意味着会对单词进行拆分

3. `text-decoration:none;`去掉链接下划线

4. `a:link` 普通的、未被访问的链接

   `a:visited`  用户已访问的链接

   `a:hover` 鼠标指针位于链接的上方

   `a:active`  链接被点击的时刻

5. `background-color`规定链接的背景色

6. `<link rel="shortcut icon" href="图片路径" />`添加网页logo，且图片文件类型必须为.ico

7. 设置边框为圆角：`border-radius:25px;`

8. 表格块可横跨的列数：`colspan='列数'`

9. 表格块可竖跨的行数：`rowspan='行数'`

10. 改变鼠标在上方的指针形式:`<标签 style="cursor:形式">`

11. 滚动条设置或隐藏某个坐标轴的:`overflow:scroll`或`overflow-x:hidden`

12. 自己拖动框大小：`resize:both;overflow:auto`

13. 不可见：

    - 隐藏但不占空间：`display="none"`
    - 隐藏但仍占空间：`visibility="hidden"`
    - 透明程度：`opacity:程度数字`

14. 字体：

    -   粗细：`font-width`
    - 大小：`font-size:%`

15. 

+++

> JS:

1. 语法：

   1. 可被放置 <body> 或 <head> 部分中，或兼而有之
   2. 把脚本置于<body>元素的底部，可改善显示速度
   3. 使用外部JS:`<script src="路径"></script>`
   4. 在 HTML 文档完全加载后通过事件使用`document.write()`将*删除所有已有的 HTML* 
   5. `window.alert()`额外输出警告框
   6. `console.log()`通过F12进入浏览器控制台输出
   7. 表达式结果是值，语句结果是可执行
   8. 
   
2. 数据：

   1. `var person = "Bill Gates",
      price = 15000;`声明可多行，逗号分隔
   2. `"8" + 3 + 5`和`3 + 5 + "8"`结果不同，因为结合性从左到右
   3. **动态类型**
   4. 数字、字符串、布尔类型的为原始类型，是值引用
      数组、对象类型为地址引用
      值引用 可以深拷贝
      地址引用 循环到原始类型方可进行深拷贝
   5. **字符串：**
      1.   `Number()`返回数字`toString()`返回字符串
      2. 
   6. **数组：**
      1. 数组使用数字索引，对象使用命名索引
      
         希望元素名为字符串（文本）则应该使用对象，为数字则应该使用数组
      
         用`isArray()`判断
      
      2. `新字符串=数组.join('分隔符')`结合数组内元素为一个字符串
      
      3. 
   7. 随机数：`Math.floor(Math.random()*(最大-最小))+最小`返回不包括区间，包括需要`最小+1`
   8. 

3. 对象：

   1. ​    

   2. ```javascript
      var person = {
        fullName：function() {
          return this.firstName + " " + this.lastName;
        }
      };
      document.getElementById("demo").innerHTML = person.fullName();//注意括号
      ```

      ```javascript
      var person = {
        get fullName() {
          return this.firstName + " " + this.lastName;
        }//等价上面代码，添加get关键字简化为对象访问器
      };
      document.getElementById("demo").innerHTML = person.fullName;
      ```

   3. 

4. DOM：

   1. 通过id，标签，类名，选择器>查找元素>改变，新增，删除元素

      `var x = document.querySelectorAll("p.intro");`返回 class="intro" 的所有 <p> 元素列表

   2. 

5. 事件：
   1.   鼠标：
      1.   onclick
      2. onmousedown
      3. onmousemove
      4. onmouseout
      5. onmouseover
      6. onmouseup   
   2.  
   5.    
