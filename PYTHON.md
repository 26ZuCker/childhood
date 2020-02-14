特性：

1. range(生成式)
2. generator(生成器)
3. iterable(迭代)
4. lambda
5. decorator
6. 偏函数

库：

1. 操作图像：PIL
2. 爬虫：requests，bs4
3. 检测编码：chardet
4. 获取硬件信息：psutil
5. 处理日期：datatime
6. 多种序列：collections
7. 解析HTML：HTMLParser

面向对象：

1. 动态绑定允许我们在程序运行的过程中动态给class加上功能
2. 给实例绑定的属性和方法只是独有，加在类中才是所有实例共享
3. 变量：
   1. 全局变量：在模块内、在所有函数外面、在class外面
   2. 局部变量：在函数内、在class的方法内（未加self修饰的）
   3. 静态变量：在class内的，但不在class的方法内的
   4. 实例变量：在class的方法内的，用self修饰的变量
4. `__slots__ = ('name', 'age')` 用tuple在类中定义允许绑定的属性名称，且只对当前类有作用，无视继承
5. 