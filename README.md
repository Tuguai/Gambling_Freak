# Gambling_Freak

Yuelin test

yuelin.liu@mail.mcgill.ca



Lide

Yikan





我们想用一个一维数组来表示一手牌：



int[] card = new int[18];



int[3]表示3

int[4]表示4

int[13]表示K

int[14]表示A

int[15]表示2

int[16]表示小王

int[17]表示大王

int[0]，int[1]，int[2]的值为0



int[3]=1 表示有1张3

int[3]=2 表示有2张3

int[3]=3 表示有3张3

int[3]=0 表示没有3



以此类推。。。



大家可以阅读一下HandCards（在Model文件夹里），可以想想这样行不行哈，可以写几个函数试试水。





简单说明一下，这个项目适合喜欢斗地主或编程的小朋友，如果感兴趣，请加入我们github的orgnization，务必，务必。



这个项目带给你的好处： 对斗地主玩法深入的理解，编程工具的熟悉使用....(大家帮我编一点)



坏处：每周至少花费1个小时



设想：

Phase1: 教会机器出牌规则。讨论model							2周（包括本周）

Phase2：   教会机器如何玩1v1残局游戏。用3人单机对局测试Model		2周

Phase3：   完成用户注册功能和所有丑陋的前端。					1周

Phase4：   完成游戏保存功能，加入数据库。						1周

Phase5：   完成AI算牌。										4周



总之，先把人确定了，大家可以问问周边的朋友有没有愿意来的。确定了以后再讨论详细分工。













2019.01.24



Model已经写出来了，大家可以看看model.ump这个文件





我分配了5个任务，任务说明在Controller里面，说明的不是很详细，不清楚的可以找我。



大家认领一下，5个任务按照难度等级：



Task1： 完成初始化游戏函数，并通过tester，有很多搬砖的小任务。

Task2： 完成出牌函数（单张)，并通过tester，无技术困难。

Task3： 完成出牌函数（双张)，为task1和task4写tester

Task4： 完成出牌函数（顺子)，为task2和task3写tester



Task5： 架构分析，完善上游model（用户注册，时间等）















