https://www.codechef.com/submit/XJUMP<br/>
<b>Problem</b><br/>
Chef is currently standing at stair 00 and he wants to reach stair numbered XX.

Chef can climb either YY steps or 11 step in one move.
Find the minimum number of moves required by him to reach exactly the stair numbered XX.

<b>Input Format</b><br/>
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of a single line of input containing two space separated integers XX and YY denoting the number of stair Chef wants to reach and the number of stairs he can climb in one move.
<br/><b>Output Format</b><br/>
For each test case, output the minimum number of moves required by him to reach exactly the stair numbered XX.

<b>Constraints</b><br/>
1≤T≤500<br/>
1≤X,Y≤100<br/>
<b>Sample 1:</b><br/>
<b>Input</b><br/>
4<br/>
4 2<br/>
8 3<br/>
3 4<br/>
2 1
<br/>
<b>Output</b><br/>
2<br/>
4<br/>
3<br/>
2
<br/>
<b>Explanation:</b><br/>
<b>Test case 11:</b> Chef can make 22 moves and climb 22 steps in each move to reach stair numbered 44.

<b>Test case 22:</b> Chef can make a minimum of 44 moves. He can climb 33 steps in 22 of those moves and 11 step each in remaining 22 moves to reach stair numbered 88.

T<b>est case 33:</b> Chef can make 33 moves and climb 11 step in each move to reach stair numbered 33.

<b>Test case 44:</b> Chef can make 22 moves and climb 11 step in each move to reach stair numbered 22.