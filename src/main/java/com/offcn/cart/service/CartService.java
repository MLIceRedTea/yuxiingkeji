package com.offcn.cart.service;

import com.offcn.group.Cart;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface CartService {
    public Map test2();
    public List test();
    public Set test1();
    public List bb();
    public List aa();
    public List cc();
    public List dd();
    public List ee();
    public List rr();





    /**
     *哈哈哈
     * 合并购物车
     * @param cartList1
     * @param cartList2
     * @return
     */
    public List<Cart> mergeCartList(List<Cart> cartList1, List<Cart> cartList2);


    /**
     * 从redis中查询购物车
     * @param username
     * @return
     */
    public List<Cart> findCartListFromRedis(String username);

    /**
     * 将购物车保存到redis
     * @param username
     * @param cartList
     */
    public void saveCartListToRedis(String username, List<Cart> cartList);


    /**
     *
     * @param cartList  购物车列表
     * @param itemId    商品id（skuid）
     * @param num        商品数量
     * @return           添加成功后，再返回当前购物车
     */
    public List<Cart> addGoodsToCartList(List<Cart> cartList, Long itemId, Integer num);

}
