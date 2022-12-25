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
