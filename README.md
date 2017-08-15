This is my first git project.
1. cd 进入目录 
2. 把当前文件变成git可以管理的仓库
     git init
3. 添加单个文件
     git add readme.txt
4. 添加全部文件
     git add -A
5. 提交修改
     git commit -m "wrote a readme file"
6. 第一次连接 远程仓库的提交
     git remote add origin https://github.com/litao8976/springMvc.git
   仓库关联
     git push -u origin master 
7. 第二次以后 远程仓库的提交
     git push