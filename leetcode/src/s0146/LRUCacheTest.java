package s0146;

import org.junit.Test;

/**
 * @ClassName LRUCacheTest
 * @Description TODO
 * @Date 2021/11/16 19:26
 **/
public class LRUCacheTest {

    //输入
//    ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
//    [[2]      , [1, 1], [2, 2], [1],  [3, 3],  [2],  [4, 4],  [1],    [3],  [4]]

    @Test
    public void test() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // 返回 -1 (未找到)
        System.out.println(lRUCache.get(3));    // 返回 3
        System.out.println(lRUCache.get(4));    // 返回 4
    }
}
