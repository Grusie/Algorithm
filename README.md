<details>
<summary>22.12.19(이진 탐색, 정렬)</summary>
<div markdown="1">
# 22.12.19(이진 탐색,정렬)

---

1. 수 찾기

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
    
    ![img.gif](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/77d22c60-26f7-4f1e-a3a3-b7d95002689b/img.gif)
    
- 시간 복잡도 O(n²)

## 2. 삽입 정렬(Insertion Sort)

- 데이터 집합을 순회하면서 정렬이 필요한 요소를 뽑아내어 이를 다시 적당한 곳으로 삽입하는 고리즘
- 성능은 버블정렬보다 좋음
    
    ![img.gif](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7465ae8e-0045-4c5f-bfbf-f58b1465128b/img.gif)
    
- 시간 복잡도 O(n²) 이미 정렬 되어있다면 best O(n)

## 3. 버블 정렬(Bubble Sort)

- 거품이 수면으로 올라오는 듯 하여 붙여진 버블정렬, 인접한 두 수를 비교하여 오름차순 or 내림차순
    
    ![img.gif](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/54bc105a-d96e-42a4-b603-5680ea8ae811/img.gif)
    
- 시간복잡도 O(n²)

## 4. 병합정렬(Merge Sort)

- 둘 이상의 부분집합으로 가르고, 각 부분집합을 정렬한 다음 부분집합들을 다시 정렬된 형태로 합치는 방식
    
    ![img.gif](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f09cfe27-eef2-4406-9f3d-3fa786ba2e28/img.gif)
    
- 데이터 집합이 메모리에 한번에 올리기에 너무 클 때 쓰기 좋은 방법이다.
- 시간 복잡도 O(n log n)
- 다른 알고리즘과 비교했을 때 O(n) 수준의 메모리가 추가로 필요하다는 단점이 있다.

## 5. 힙 정렬

- 트리 기반으로 최대 힙 트리 or 최소 힙 트리를 구성해 정렬을 하는 방법
- 내림차순 정렬에서는 최대 힙, 오름차순 정렬을 위해서는 최소 힙을 구성하면 된다.
    
    ![img.gif](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0ca59c2b-025a-46f8-b9f2-ac79b607851c/img.gif)
    
- 완전이진트리여야 함
- 시간복잡도 O(n log n)

 

## 6. 퀵 정렬(Quick Sort)

- 데이터 집합내에 임의의 기준(pivot)을 정하고 해당 피벗으로 집합을 기준으로 두개의 부분 집합으로 나눈다.
- 한쪽 부분에는 피벗값보다 작은 값들만, 다른 한쪽은 큰 값들만 넣는다.
- 더 이상 쪼갤 부분 집합이 없을 때까지 각각의 부분 집합에 대해 피벗/ 쪼개기 재귀적으로 적용.
    
    ![img.gif](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5a884fe5-ab61-4fd4-add0-ae0a14b079e7/img.gif)
    
- 시간 복잡도 O(n log n)

## 7. 기수 정렬

- 낮은 자리수부터 비교해가며 정렬한다. 비교연산을 하지 않아 빠르지만, 또 다른 메모리 공간을 필요하다는 게 단점. 기수정렬은 낮은 자리수부터 비교하여 정렬해 간다는 것을 기본 개념으로 하는 정렬 알고리즘이다.
- 비교 연산을 하지 않아 빠르지만, 데이터 전체 크기에 기수 테이블의 크기만한 메모리가 더 필요하다.
    
    ![img.gif](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d2c8a38c-05eb-47aa-9305-352bcbba3d96/img.gif)
    
- 시간 복잡도 O(dn) → d는 자리수
</div>
</details>
