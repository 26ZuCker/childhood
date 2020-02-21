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

2. **canvas:**

   -  `<canvas id width height>`HTML只是规定id和尺寸
   - 绘制工作在JS内完成：先寻找该元素>再创建对象`变量=该元素.getContext("2d")`>进行绘制`变量.属性`
   
3. 

+++

> ***CSS:***

1. 使用外部CSS：`<link type="text/css" rel="styleSheet"  href="路径" />`

2. 过渡和动画区别：

   - 过渡需要事件才能触发（点击可加上onclick并在JS内加上样式，用setTimeout函数），动画除非JS绑定，否则只能一开始就触发（写好动画，但不在需要动画的元素上绑定animation属性，事件触发的时候绑上，事件结束后再删除掉，下次点击就能重新绑上，重现动画效果）

     ```javascript
     test.onclick = function(){
         test.style.width = '300px';
         setTimeout(function(){
             test.style.width = '100px';
         },3000);
     }
     ```

   - **点击触发动画：**

     ```javascript
     <style>
     		@keyframes wlk{
     			100%{
     				left: 300px;
     				background-color: blue;
     				transform: rotate(45deg);
     			}
     		}
     		.transi1{
     			position: absolute;
     			top: 60px;
     			left:10px;
     			width: 200px;
     			height: 200px;
     			background-color: red;
     		}
     		.transi2{
     			animation: wlk 2s;
     			animation-fill-mode: forwards;
     		}
     	</style>
     </head>
     <body>
      <button>执行动画</button>
      <div id="di1" class="transi1">第二个过渡动画</div>
      
      <script>
      	var btn  = document.getElementsByTagName("button")[0];
     btn.addEventListener("click",function(){
     var di = document.getElementById("di1");
     di.setAttribute("class","transi1 transi2");
      	});
      </script>
     ```

   - 过渡只有一组（开始-结束），动画则多组，相当于多个过渡

3. `box-sizing:模式`：

   -   由于直接设置高和宽，元素块盒子模型实际不为该尺寸，而进行，设置的高和宽即为实际所占空间

   - 模式：`content-box`宽度和高度分别应用到元素的内容框

     `border-box`为元素设定的宽度和高度决定了元素的边框盒（常用）

4. `word-wrap:break-word;`允许您允许文本强制文本进行换行 - 即使这意味着会对单词进行拆分

5. `text-decoration:none;`去掉链接下划线

6. 伪类（用于设置什么时候显示该样式，比如动画，过渡）：

   - `:hover`
   - `:active`
   - `:link`
   - `:visiter`

7. `background-color`规定链接的背景色

8. `<link rel="shortcut icon" href="图片路径" />`添加网页logo，且图片文件类型必须为.ico

9. 设置边框为圆角：`border-radius:百分比或px;`

10. 表格块可横跨的列数：`colspan='列数'`

   表格块可竖跨的行数：`rowspan='行数'`

11. 改变鼠标在上方的指针形式:`<标签 style="cursor:形式">`
12. 滚动条设置或隐藏某个坐标轴的:`overflow:scroll`或`overflow-x:hidden`
13. 隐藏超出框的内容：`overflow:hidden`
14. 自己拖动框大小：`resize:both;overflow:auto`
15. 不可见：

    - 隐藏但不占空间：`display="none"`
    - 隐藏但仍占空间：`visibility="hidden"`
    - 透明程度：`opacity:程度数字`
16. 字体：

    -   粗细：`font-width`
    -   大小：`font-size:%` 
17. 背景：

    - 背景不受滚动影响一直可视：`background-attachment:fixed`
    - 是否重复：`background-repeat:repeat`后面可带-x或-y
    - 设置行内背景：`background-image:url()`
    - 设置图片大小：`background-size:cover或contain或高，宽的百分比或具体数值`
18. `z-index`**重叠仅能用于使用了position的元素上**
19. **块居中**(前提每个块宽度足够大足以占据横轴)：`margin: 0px auto`
20. 多列：
    - 列之间的规则：`column-rule:列间宽，列间分割线样式，列间分割线颜色`
    - 分隔列数：`column-count: 数`
21. 滤镜：`filter:属性`

    -  `blur:px`模糊程度
    - `brightness:百分比`明暗程度
    - `contrast:百分比`对比度，越高相当于老照片
    - `grayscale:百分比`灰度，越高就是黑白效果
    - `opacity:百分比`不用filter里的，直接用，0~1，越小越透明
22. **flex弹性布局：**

    -  `display:flex`设为 Flex 布局以后，子元素的`float`、`clear`和`vertical-align`属性将失效
    - `flex-direction:row或row-reverse或column或column-reverse`主轴方向，不反转则默认起点为上或左
    - `flex-wrap:wrap或wrap-reverse`项目默认一行过多不换行，设置该属性则从上至下换，反转则从下 往上
    - `justify-content:flex-start或flex-end或center或space-between或space-around`在主轴上项目的对齐方式，后二分别为：项目之间的间隔都相等，每个项目两侧的间隔相等
    - `align-items:flex-start或flex-end或center或baseline或stretch(px，默认占据全部)`在交叉轴上的对齐方式，后三分别为交叉轴的中点对齐，项目的第一行文字的基线对齐，占据程度
    - 
23. **选择器：**
    -   选择器是一种模式，用于选择需要添加样式的**元素**
    - 
24. 
+++

> JS:

1. 语法：

   1. 可被放置 <body> 或 <head> 部分中，或兼而有之
   2. 把脚本置于<body>元素的底部，可改善显示速度
   3. 使用外部JS:`<script src="路径"></script>`
   4. 在 HTML 文档完全加载后通过事件使用`document.write()`将*删除所有已有的 HTML* 
   5. `window.alert()`额外输出警告框，一般不用`window.`
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
      
      3. `splice()`
      
      4. `slice()`
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
        2.   onmousedown
        3.   onmousemove
        4.   onmouseout
        5.   onmouseover
        6.   onmouseup   
   2.   
   
6. **鼠标悬停显示坐标**

7. 
