> **自定义：**

1. 查看命令更多选项：`完整指令 --help`
2. 设置别名：`git config --global alias.st status`用st表示status，即`git st`表示`git status`

+++

> **分支管理：**

1. 查看分支：`git branch`

2. 创建分支：git branch name`

3. 切换分支：`git switch name`

4. 合并某分支到当前分支：`git merge name`

5. 删除分支：`git branch -d name`

6. master分支是主分支，因此要时刻与远程同步

   dev分支是开发分支，团队所有成员都需要在上面工作，所以也需要与远程同步

   bug分支只用于在本地修复bug

7. 禁用fast forward模式合并：`git merge --no-ff -m "描述" 合并分支名`

    加上`--no-ff`参数就可以用普通模式合并，合并后的历史有分支，能看出来曾经做过合并，而`fast forward`合并就看不出来曾经做过合并，因为该模式下删除分支后，会丢掉分支信息

+++

> **版本进退：**

1. 查看历史命令：`history`（可储存1000条）
2. 使用历史命令：`！序号`
3. `git log -graph`查看日志图，**以回退版本**
4. `git reflog`查看命令历史，**以再回进版本**
5. `git log --pretty=oneline`仅显示版本号查看日志图
6. `ls -ah`查看隐藏文件
7. `git status`查看是否还有未提交，或者文件是否有被修改
8. `git diff`查看文件修改处
9. `git reset --hard HEAD~数字`回退当前版本（HEAD默认当前版本）前第数字个版本
10. ![分支](C:\Users\16404\Desktop\分支.jpg)
11. 先切换到需要打标签的分支>`git tag 标签名以简单的名字打标签以便以后访问回退版本
12. `git tag 标签名 commit的id`对历史分支打标签
13. `git tag`查看标签`git show 标签名`查看标签信息
14. 

+++

> **仓库管理：**

1. `git init`把当前目录变成仓库
2. `git remote -v`查看远程库的信息
3. `git config --global color.ui true`适当地显示不同的颜色
4. `git init 目录名`把该目录变为git可管理的本地仓库
5. `git commit -m "自己备注的信息"`最终提交修改
6. `git add -A `添加全部文件
7. `git push`提交当前分支到远程仓库（第二次及之后）
8. `git remote add origin git@github.com:michaelliao/learngit.git`需要在本地的learngit目录下进行，与michaelliao账户内的learngit关联
9. `git clone git@github.com:michaelliao/gitskills.git`将michaelliao账户的GitHub内的gitskills仓库克隆到本地
10. `git remote -v`显示远程仓库信息
11. `git pull`撤销上传远程仓库的分支