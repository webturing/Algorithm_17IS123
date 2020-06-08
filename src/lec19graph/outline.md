# Graph theory

## Graph图的概念：
### 点Vertex : 
class Vertex{
    int id;
    
}

### 边Edge:
- 有向边directed
- 无向边undirected
- 权重 weight /负权
class Edge{
Vertex from;
Vertex to;
}

###图常量：
- 度（出度和入度):点关联的边的条数

## 图的分类：
- 有向图
- 无向图


##图的应用：
- 边的遍历：欧拉图（欧拉路径，欧拉圈）
- 顶点的遍历：哈密尔顿

##MST 最小生成树
- Kruskal算法
- Prim算法
## 最短路径
- Dijkstra算法
- Floyd算法


## 拓扑排序AOV网络
- 重复执行{
找到一个入度为0点X，输出X，删除和X相关联的所有的边
}直到图为空图