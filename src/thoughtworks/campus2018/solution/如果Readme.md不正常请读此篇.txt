【程序说明】
* 该程序对应的题目为：ThoughtWorks2018校园招聘作业题目——出租车
* 本程序使用jdk1.8_121运行通过题目中给出的两个测试用例
* 为了便于您的运行， 我将程序里用到的所有的类、接口等都放在了一个文件中，即Main.java文件。

【运行说明】
* 解压缩“徐振康-ThoughtWorks2018校园招聘作业题目——出租车--Java.zip”,您会看到一个文件夹“main”,该文件夹下有两个文件一个是Main.java，另一个是Readme.md，即本篇说明文档。
* 在windows操作系统下， 打开cmd，进入当前目录“main”，输入命令：javac Main.java
* 再输入:java Main
* 此时可以输入测试用例一：

SubmitDate: 2030/09/01
CAR0001|2025/04/05|Porsche|10000|F
CAR0002|2029/10/14|Porsche|9000|F
CAR0003|2026/08/17|Porsche|13000|F
CAR0004|2027/11/01|BYD|23000|T
CAR0005|2027/01/11|BYD|19500|F
CAR0006|2029/07/01|Audi|10001|T
CAR0007|2028/04/19|Ford|9800|F
CAR0008|2027/07/10|Ford|15000|T
CAR0009|2024/10/22|Ford|90300|F
EOF

（注意：输入最后的EOF，代表输入结束）
此时，程序会输出如下结果：

Reminder
==================

* Time-related maintenance coming soon...
Audi: 1 (CAR0006)
Porsche: 1 (CAR0002)

* Distance-related maintenance coming soon...
BYD: 1 (CAR0005)
Ford: 1 (CAR0007)
Porsche: 1 (CAR0001)

* Write-off coming soon...
BYD: 1 (CAR0004)
Ford: 1 (CAR0009)


* 再输入:java Main
* 此时可以输入测试用例二：


SubmitDate: 2050/05/01
CAR0001|2044/05/01|Volkswagen|65535|F
CAR0002|2044/05/03|BMW|100001|F
CAR0003|2047/05/02|Mercedes-Benz|37789|T
CAR0004|2047/05/03|Honda|59908|T
CAR0005|2049/12/10|Peugeot|49999|F
CAR0006|2046/11/15|Jeep|2000|F
CAR0007|2046/11/16|Jeep|5000|F
EOF

（注意：输入最后的EOF，代表输入结束）
此时，程序会输出如下结果：

Reminder
==================

* Time-related maintenance coming soon...
Jeep: 2 (CAR0006, CAR0007)

* Distance-related maintenance coming soon...
Peugeot: 1 (CAR0005)

* Write-off coming soon...
BMW: 1 (CAR0002)
Honda: 1 (CAR0004)

