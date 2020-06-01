# lec17 宽度优先搜索
## 队列
### 数据结构 ```data[]  front,rear ```
### 队列元素 ```data[front:rear];```
### API:
- front/peek 获得队首元素
- pop/poll 出队
- push/offer入队
- isEmpty()判断空队

##实现方法：
### 自己数组实现 
- 方向
- 标记数组


### 使用Queue接口 
- 实现的多数采用LinkedList
- 因为访问数组采用了HashSet/HashMap
- 元素要重载equals和hashCode

