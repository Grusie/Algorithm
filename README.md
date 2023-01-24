<details>
<summary>22.12.19(이진 탐색, 정렬)</summary>
<div markdown="1">
    
# 22.12.19(이진 탐색,정렬)

---

1920. 수 찾기

2750. 수 정렬하기

## binarySearch() 메서드

- arrays.binarySearch(i)
- 인덱스 반환 or 음수
- 정렬되어 있는 배열
- 이진 탐색의 시간 복잡도는 O(logN) 이 된다.
- 배열의 중간에 있는 임의의 값을 선택하여 찾고자 하는 값 X와 비교한다.

정렬 알고리즘 7가지

## 1. 선택 정렬(Selection Sort)

- 선택된 값과 나머지 데이터 중에 비교하여 알맞은 자리를 찾는 알고리즘
    
    ![img](https://user-images.githubusercontent.com/75468060/209472794-e5d9370e-d605-4309-94b3-cbf7541e7ecf.gif)
    
- 시간 복잡도 O(n²)

## 2. 삽입 정렬(Insertion Sort)

- 데이터 집합을 순회하면서 정렬이 필요한 요소를 뽑아내어 이를 다시 적당한 곳으로 삽입하는 고리즘
- 성능은 버블정렬보다 좋음
    
    ![img (1)](https://user-images.githubusercontent.com/75468060/209472804-0203102e-4307-44e5-9162-6027291cf2db.gif)
    
- 시간 복잡도 O(n²) 이미 정렬 되어있다면 best O(n)

## 3. 버블 정렬(Bubble Sort)

- 거품이 수면으로 올라오는 듯 하여 붙여진 버블정렬, 인접한 두 수를 비교하여 오름차순 or 내림차순
    
    ![img (2)](https://user-images.githubusercontent.com/75468060/209472799-6d8d3866-5aae-4056-a43c-9ea5dfddba4d.gif)
    
- 시간복잡도 O(n²)

## 4. 병합정렬(Merge Sort)

- 둘 이상의 부분집합으로 가르고, 각 부분집합을 정렬한 다음 부분집합들을 다시 정렬된 형태로 합치는 방식
    
    ![img (3)](https://user-images.githubusercontent.com/75468060/209472800-9231386b-ee2a-41a6-b976-0dea7219f88e.gif)
    
- 데이터 집합이 메모리에 한번에 올리기에 너무 클 때 쓰기 좋은 방법이다.
- 시간 복잡도 O(n log n)
- 다른 알고리즘과 비교했을 때 O(n) 수준의 메모리가 추가로 필요하다는 단점이 있다.

## 5. 힙 정렬

- 트리 기반으로 최대 힙 트리 or 최소 힙 트리를 구성해 정렬을 하는 방법
- 내림차순 정렬에서는 최대 힙, 오름차순 정렬을 위해서는 최소 힙을 구성하면 된다.
    
    ![img (4)](https://user-images.githubusercontent.com/75468060/209472801-f6ab3c85-74d4-47d7-a809-48d028eb1bfc.gif)
    
- 완전이진트리여야 함
- 시간복잡도 O(n log n)

 

## 6. 퀵 정렬(Quick Sort)

- 데이터 집합내에 임의의 기준(pivot)을 정하고 해당 피벗으로 집합을 기준으로 두개의 부분 집합으로 나눈다.
- 한쪽 부분에는 피벗값보다 작은 값들만, 다른 한쪽은 큰 값들만 넣는다.
- 더 이상 쪼갤 부분 집합이 없을 때까지 각각의 부분 집합에 대해 피벗/ 쪼개기 재귀적으로 적용.
    
    ![img (5)](https://user-images.githubusercontent.com/75468060/209472802-6728753b-451d-477e-9471-4792483efff5.gif)
    
- 시간 복잡도 O(n log n)

## 7. 기수 정렬

- 낮은 자리수부터 비교해가며 정렬한다. 비교연산을 하지 않아 빠르지만, 또 다른 메모리 공간을 필요하다는 게 단점. 기수정렬은 낮은 자리수부터 비교하여 정렬해 간다는 것을 기본 개념으로 하는 정렬 알고리즘이다.
- 비교 연산을 하지 않아 빠르지만, 데이터 전체 크기에 기수 테이블의 크기만한 메모리가 더 필요하다.
    
    ![img (6)](https://user-images.githubusercontent.com/75468060/209472803-e755e397-d803-4919-8d2d-d927f8e4c000.gif)
    
- 시간 복잡도 O(dn) → d는 자리수
</div>
</details>

<details>
<summary>22.12.21(정렬, 입출력)</summary>
<div markdown="1">

# 22.12.21(정렬, 입출력)

---

2751. 수 정렬하기2
10989. 수 정렬하기3

> 출력으로는 StringBuilder를 사용하는 것이 성능면에서 더 좋다.
입력면에서도 BufferedReader를 사용해보자.
> 

> Collections.sort()는 Object type arrays에 대해 Merge Sort보다 향상된 Tim Sort를 수행한다.
Tim sort란 합병정렬의 최악의 경우와 삽입정렬의 최선의 경우를 합친 알고리즘으로 시간복잡도는 O(n) ~ O(nlogn) 을 보장함.
> 

Collections.sort()는 일반적인 배열로 사용할 수 없고 리스트를 이용해야 한다.

2751은 어찌저치 클리어

10989는 브론즈 문제인데, 시간과 메모리가 중요한 문제인 듯 함

- BufferedReader를 사용하지 않고, Scanner를 사용할 경우 시간초과
- BufferedReader를 사용하더라도, 메모리 초과

→ BuffereReader와 BufferedWriter를 사용할 것

BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야합니다.

</div>
</details>

<details>
<summary>22.12.23(스택, 큐 등)</summary>
<div markdown="1">

# 22.12.23(스택, 큐 등)

---

10815. 숫자 카드

10828. 스택

10845. 큐

10866. 덱

10815. 숫자 카드
- BufferedReader, Writer를 사용
- 덱을 받아서 찾아야 하기에, 덱을 받는 과정에서 split을 사용하기에, 덱 크기 값들은 읽자마자 버려준다.
- 받은 덱을 sort해서 이분 탐색이 가능하게 만들어둔 뒤
- bynarySearch 메소드를 사용하여 출력 시켜 준다.
- flush()는 버퍼에 남아있는 것들을 출력해주기 위함

→ split을 사용하는 것보다 StringTokenizer를 사용하는 것이 빠르다고 한다.

→ print(bw)는 필요없음, 아마 StringBuilder일 때는 필요해서 헷갈린 듯

10828. 스택

과거에 풀었던 스택문제, 시간과 메모리를 줄이기 위해 노력했다.

- BufferedRead, Writer 사용
- split 대신 StringTokenizer사용
- when문 사용 할 때 pop, top에서 뜨는 에러부분을 try-catch로 한 번에 묶어서 처리

10845. 큐

과거에 시간초과로 풀지 못했던 큐문제

- queue 구현 방법은 LinkedList를 사용
- 나머지는 Stack과 동일

10866. 덱
- ArrayDeque를 사용함
- split 대신 StringTokenizer사용
- when문 사용 할 때 pop, front, back에서 뜨는 에러부분을 try-catch로 한 번에 묶어서 처리

1406번. 에디터

- 문자열 자르기로 접근 → 시간초과

```kotlin
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st : StringTokenizer
    var result = br.readLine()
    var cursor = result.length

    for( i in 0 until br.readLine().toInt()) {
        st = StringTokenizer(br.readLine())
        try {
            when (st.nextToken()) {
                "P" -> {
                    result = result.slice(IntRange(0, cursor-1)) + st.nextToken() + result.slice(IntRange(cursor, result.length - 1))
                    cursor++
                }
                "D" -> if(cursor <= result.length-1) cursor++
                "L" -> if(cursor > 0) cursor--
                "B" -> {
                    if(cursor>0) {
                        result = result.removeRange(cursor-1, cursor)
                        cursor--
                    }
                }
            }
        } catch (e: java.lang.Exception) {
        }
    }
    bw.write(result)
    br.close()
    bw.flush()
    bw.close()
}
```

- LinkedList로 접근 → 시간초과

```kotlin
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st : StringTokenizer
    var result = LinkedList<Char>()
    result.addAll(br.readLine().map{it})
    var cursor = result.size

    for( i in 0 until br.readLine().toInt()) {
        st = StringTokenizer(br.readLine())
        try {
            when (st.nextToken()) {
                "P" -> {
                    result.add(cursor, st.nextToken().toCharArray()[0])
                    cursor++
                }
                "D" -> if(cursor <= result.size - 1) cursor++
                "L" -> if(cursor > 0) cursor--
                "B" -> {
                    if(cursor>0) {
                        result.removeAt(cursor-1)
                        cursor--
                    }
                }
            }
        } catch (e: java.lang.Exception) {
        }
    }
    bw.write(result.toCharArray())
    br.close()
    bw.flush()
    bw.close()
}
```

⇒ cursor를 따로 만들어서 사용하면서 시간이 지연된 것 같음

알고리즘 분류를 확인 해 본 겨로가 자료 구조의 스택을 사용한다고 되어있음. 이런 걸 알아채는 것이 중요함

- 스택

</div>
</details>

<details>
<summary>22.12.25(min,max 함수, 다중 조건 정렬)</summary>
<div markdown="1">

# 22.12.25(min,max 함수, 다중 조건 정렬)

---

1026. 보물

1181. 단어 정렬

1026. 보물
- 최대 * 최소 + … 가 제일 작은 값이므로 하나는 오름차순, 하나는 내림차순으로 정렬하면 될 것 같다. → 스택 + 정렬을 이용하는 방법일 것 같은 생각을 한다.
- 문제 풀면서 든 생각은 스택이 아니라, 배열이였어도 그냥 정렬만 된다면 가능했을 것 같다. 오히려 reverse하는 시간보다 인덱스 값으로 접근하는 것이 빠를지도?

→ B 배열은 재배열하지 말라고 나와있다. 다시 풀어보자

- 콜렉션의 min, max 함수가 있는 걸로 처리했다
- 알고리즘 분류를 보니까 그리디 알고리즘이라고 한다.

1181. 단어 정렬
- 중복을 허용하지 않는다는 것에서 Set을 사용하려고 마음 먹었다 → HashSet이 접근이 더 빠르다고 해서 변경
- 다중 조건 sort문제인데, 코틀린에서 sortWith or sortedWith에 비교할 대상인 compareBy({},{},,}로 다중 조건을 입력해줄 수 있다.
</div>
</details>

<details>
<summary>22.12.26(정렬, count 시간복잡도)</summary>
<div markdown="1">

# 22.12.26

---

11650. 좌표 정렬하기
11651. 좌표 정렬하기
11867. 중복 빼고 정렬하기
10816. 숫자 카드2

11650. 좌표 정렬하기
- 이번에도 정렬하기 문제이다.
- 좌표 정렬하기라고 하니까 x,y 값으로 따로 정렬을 하는 방법을 떠올렸다.
- 중복은 안된다기에 전에 사용한 HashSet을 생각을 하였고, 두 점을 한번에 넣는 방법 중 Pair라는 것을 생각해서 Pair에서 정렬한 뒤 출력해주는 생각을 하였다.

→ 중복이 안 된다는 것이 아니라, 중복되는 점의 입력이 없다는 것.. 일반 ArrayList사용해도 된다는 뜻

11651. 좌표 정렬하기
- 위랑 같은 문제인데, 정렬 조건이 x, y에서 y, x로 바뀐 것 뿐이다.

10867. 중복 빼고 정렬하기
- HashSet을 사용해서 중복을 빼고 정렬

11867. 숫자 카드 2
- 몇 개인지 세야하니까 컬렉션의 count를 사용해서 문제를 풀었는데, 시간초과가 떴다.

```kotlin
bw.write("${array.count { (it==item)}} ")
```

- count를 반복문 안에 사용하니까 O(n²)이므로, 배열 크기를 정해두고 배열 인덱스로 접근하는 방법을 하용하기로 했다 O[1]

</div>
</details>

<details>
<summary>22.12.27(큐)</summary>
<div markdown="1">

# 22.12.27(큐)

---

1158. 요세푸스

1966. 프린터 큐

1158. 요세푸스
- 단순히 배열을 이용해서 구현하는 것을 생각 했다. 그 이외엔 링크드 리스트 정도?
- 원형이라면… 큐일수도 있겠다는 생각이 든다.
- index를 더해주면서 ArrayList 값을 하나씩 출력하는 식으로 문제를 해결했다.

→ if문을 두 번 써서 마음에 안들었는데, 다른 코드들 보다가 %를 사용하는 게 있어서 유레카를 외쳤다.

→ 알고리즘 분류를 보니 큐로 푸는 것도 맞다고 한다. 큐로 다시 풀어보자

```jsx
result.joinToString(", ", "<", ">")
```

<ele, ele, ele> 등… 이런식으로 표현하나봄

1966. 프린터 큐
- 예전에 도전했던 문제지만, 못 풀었어서 다시 리벤지를 해보려고 한다.
- 큐 문제이고, 우선순위가 있을꺼고 원하는 문서가 출력될 때까지 빼서 뒤로 넣는 방식이다.

</div>
</details>

<details>
<summary>22.12.28</summary>
<div markdown="1">

# 22.12.28

---

1966. 프린터 큐

5430. AC

1966. 프린터 큐
- 드디어 리벤지 성공
- 맨 앞 크기를 판단하여 젤 크면 poll 시키고, 아니면 add(poll)해주고, 모든 일이 일어날 때 마다 index를 같이 이동시킨다.
- 만약 index가 0이면서 현재 맨 앞이 최대 크기면 break

5430. AC
- 첫 골드문제이다. 걱정이 앞서지만, 문제를 읽어보니 풀 수 있다는 생각이 들었다.
- reverse와 delete를 하는 부분에서 stack의 기운이 느껴졌다. 하지만 그냥 뮤터블 리스트로 시도해보기로 했다.

→ 시간초과가 나왔다. 예상했던 결과이긴 하다.

- ArrayList를 사용하여, StringTokenizer로 넣었다.

→ 33퍼까지 갔다가 시간초과가 뜬다.

→ 찾아보니 deque를 사용하여뒤집기를 할 필요 없이 마지막 부분을 제거하면 된다고 한다..

- deque를 사용하지 않고, ‘R’이 나왔을 때 rCount를 증가시켜주고 ‘D’일 때 rCount가 짝수인지 홀수인지를 판별하여 짝수일 땐 첫번째, 홀수일 땐 마지막 인덱스에서 제거하도록 진행하였다.

→ 찾아보니까 rCount를 증가하지말고 Boolean으로 설정하여서 넣을 때마다 이 코드를 넣는 것이 더 좋아보인다. 이런 생각을 하다니 세상은 넓고 천재는 많은 것 같다.

```kotlin
rCount = !rCount
```

- 제거를 한 뒤에 출력할 때에도 판별하여 홀수이면 거꾸로 출력해준다.

</div>
</details>

<details>
<summary>22.12.29(백트래킹)</summary>
<div markdown="1">

# 22.12.29(백트래킹)

---

6603. 로또

6603. 로또
- 49 숫자 중, 6~13까지의 배열을 만들고 6개를 뽑아서 출력하는 문제인데, 수학적으로 접근은 가능하지만 어떻게 해야할지 감이 안 온다.

→ 알고리즘 분류를 보니, 백트래킹, 재귀함수 등이라고 한다.

백트래킹

- 해를 찾는 도중 해가 아니어서 막히면, 되돌아가서 다시 해를 찾아가는 기법을 말한다.(최적화 문제와 결정 문제를 푸는 방법이 된다.)

## **백트래킹 기법의 유망성 판단**

어떤 노드의 유망성, 즉 **해가 될 만한지 판단한 후 유망하지 않다고 결정되면 그 노드의 이전(부모)로 돌아가(Backtracking)** 다음 자식 노드로 갑니다.

**해가 될 가능성이 있으면 유망하다(promising)고 하며**, 유망하지 않은 노드에 가지 않는 것을 **가지치기(pruning)** 한다고 하는 것입니다.

→ 백트래킹, dfs, bfs 문제를 좀 더 풀어보고 익혀야할 것 같다

→ 재귀함수에 이해가 잘 안 되는 듯 하다.

</div>
</details>

<details>
<summary>23.01.01(백트래킹, 다이나믹 프로그래밍)</summary>
<div markdown="1">

# 23.01.01(백트래킹, 다이나믹 프로그래밍)

---

1182. 부분수열의 합

9095. 1, 2, 3 더하기

1182. 부분수열의 합
- 문제를 보아하니, 백트래킹 같다는 생각을 했다. 이런 생각을 함으로써 한 단계 나아갔다고 생각을 하였다. 하지만 여전히 구현이 문제였다. dfs 구현.. 재귀함수 쪽에대한 이해가 좀 부족하다보니 이 문제도 찾아보고, 새로운 비슷한 문제를 또 풀어보려고 한다.

```kotlin
dfs(start + 1, temp + array[start]); // 1. 해당 인덱스 더함
dfs(start + 1, temp); // 2. 해당 인덱스 더하지않음
```

9095. 1, 2, 3 더하기
- 처음에 문제를 보고 백트래킹을 생각하고, 접근하였다. 앞 문제랑 동일하다고 생각했는데, 잘 안되어서 찾아보니 DP라는 분류더라(다이나믹 프로그래밍), 처음 풀어보니 무엇인지 알아야겠다고 생각했다.

> **큰 문제를 한 번에 해결하기 힘들 때 작은 여러 개의 문제로 나누어서 푸는 기법**
> 

a[1] = 1

a[2] = 2

a[3] = 4

a[4] = 7

…이므로 a[n] = a[n-3] + a[n-2] + a[n-1]식으로 이어지는 것을 볼 수 있었다.

a>3이어야 하기에, a[1],a[2],a[3]을 지정 해두고 시작하였다.

</div>
</details>

<details>
<summary>23.01.04</summary>
<div markdown="1">

# 23.01.04

---

9663. N-Queen

9663. N-Queen
- 빽트래킹 문제일 것이라고 생각한다.
- dirX, dirY로 퀸의 움직임을 표시하고~~
- 인터넷을 찾아보고 문제를 푼 만큼.. 백트래킹에 대한 이해가 더 필요하다고 생각한다.
</div>
</details>


<details>
<summary>23.01.09</summary>
<div markdown="1">
    
# 23.01.09

---

1037. 약수

1978. 소수찾기

1037. 약수
- 본인과 1을 제외하고 들어온다면, 제일 작은 값과 큰 값을 곱하면 값이 나올 것이라고 생각했다.

1978. 소수찾기
- 소수란 1과 자기 자신만을 약수로 가지는 수이기에, 2부터 소수까지 증가시키면서 나눠서 나누어 떨어진다면 소수가 아닌 것
</div>
</details>

<details>
<summary>23.01.10</summary>
<div markdown="1">

# 23.01.10

---

1929. 소수 구하기

2609. 최대공약수와 최소공배수

1929. 소수 구하기
- 소수 구하는 앞 문제와 같은 문제라 똑같이 증가시키면서 구했더니 시간초과가 났다. 지난 번에도 보면서 끝까지 나눌 필요가 없다고 생각해서 /2한 값을 했었는데, 틀렸다고 나왔어서 고민을 하다가 그냥 끝까지 했었는데, 찾아보니 sqrt를 사용해서 제곱근으로 나눠도 안 나누어 떨어진다면, 그 수는 소수이기 때문에 sqrt를 사용하면 된다고 한다.

2609. 최대공약수와 최소공배수
- 최대공약수는 양 쪽의 약수(나눴을 대 나누어 떨어지는 수 중 가장 큰 값)
- 최소공배수는 양쪽의 약수 중 겹치는 부분들을 전부 곱했을 때인 줄 알았으나, 아닌 것으로 판별하고 찾아 본 결과 양 수를 곱한 뒤, 최대공약수로 나누면 최소공배수가 나온다고 한다.
- 문제를 풀었는데, 백준에서 런타임 에러가 떴다. 나중에 다시 시도해보자

</div>
</details>

<details>
<summary>23.01.21</summary>
<div markdown="1">

# 23.01.21

---

2609. 최대공약수와 최소공배수

2609. 최대공약수와 최소공배수
- 리벤지
- 찾아보니, 유클리드 호제법이라는 게 있다더라

![image](https://user-images.githubusercontent.com/75468060/213846083-1a5ae9cd-d618-4347-b382-7ed0e31f6158.png)

- 최소공배수는 양수를 곱하고 최대공약수로 나누면 가능
</div>
</details>

<details>
<summary>23.01.24</summary>
<div markdown="1">

# 23.01.24

---

14889. 스타트와 링크

15686. 치킨 배달

14889. 스타트와 링크
- 백트래킹 문제인 것으로 판단을 하였고, 백트래킹을 조금 더 알아봐야겠다고 생각하였다.
- 이 문제의 경우 depth가 N/2라는 것을 캐치해 낸 상태에서 그 때 까지의 visit가 true인 경우는 start팀으로, 아닌 경우는 link팀으로 하고, 각각의 합을 구한 후 뺀 값의 절대값을 결과로 내면 된다.

15686. 치킨 배달
- 0은 빈 칸, 1은 집, 2는 치킨집
- 위 문제와 크게 다르지 않지만, 치킨집과, 집을 따로 Pair로 저장하는 부분에서 좀 막혔고, 거리 계산 알고리즘을 생각해내는데에 조금 걸렸다. 추가로 인터넷을 찾아보면서 거의 같게 했는데도, 시간초과
</div>
</details>
