查看命令更多选项：`完整指令 --help`

查看分支：`git branch`

创建分支：`git branch name`

切换分支：`git switch name`

合并某分支到当前分支：`git merge name`

删除分支：`git branch -d name`

查看历史命令：`history`（可储存1000条）

使用历史命令：`！序号`

查看日志图：`git log -graph`

首先，`master`分支应该是非常稳定的，也就是仅用来发布新版本，平时不能在上面干活

干活都在`dev`分支上，到某个时候，比如1.0版本发布时，再把`dev`分支合并到`master`上，在`master`分支发布1.0版本，每个人都有自己的分支，时不时地往`dev`分支上合并就可以了

禁用fast forward模式合并：`git merge --no-ff -m "描述" 合并分支名`

 加上`--no-ff`参数就可以用普通模式合并，合并后的历史有分支，能看出来曾经做过合并，而`fast forward`合并就看不出来曾经做过合并

`ls -ah`查看隐藏文件

`git init`把当前目录变成仓库

`git remote -v`**查看远程库的信息**

`git push origin 分支名`**推送分支，就是把该分支上的所有本地提交推送到远程库**

**master分支是主分支，因此要时刻与远程同步**

**dev分支是开发分支，团队所有成员都需要在上面工作，所以也需要与远程同步**

**bug分支只用于在本地修复bug**

`git config --global color.ui true`**适当地显示不同的颜色**