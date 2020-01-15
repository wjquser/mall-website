package com.mr.entity;

import java.util.List;

/**
 * Created by macro on 2018/5/25.
 */
public class ShoppingCategoryWithChildrenItem extends ShoppingCategory {
    private List<ShoppingCategory> children;

    public List<ShoppingCategory> getChildren() {
        return children;
    }

    public void setChildren(List<ShoppingCategory> children) {
        this.children = children;
    }
}
