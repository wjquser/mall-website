$(function () {

    $.ajax({
        url: "http://localhost:8762/shopping/list",
        type:"get",
        dataType:"json",//规定返回值格式
        async:false,//同步上传
        success:function (data) {//成功回调函数
            var productShow = '';
            for (var i = 0; i < data.data.length; i++) {
                productShow += '<div class="area_title"  style="margin-top: 100px"><div class="name"><span class="floors">'+ (i+1) +'F</span>'+data.data[i].productCategoryName+'</div></div>'
                productShow += '<div class="list_style clearfix">'
                productShow += '<div class="Left_side">'
                productShow += '<ul>'
                productShow += '<li><a href="#"><img width="200px" height="220px" src="'+data.data[i].albumPics.substring(0,88)+'" /><div class="Layers"><img src="../static/images/bg_img.png" /></div></a></li>'
                productShow += '<li><a href="#"><img width="200px" height="220px" src="'+data.data[i].albumPics.substring(89,177)+'" /><div class="Layers"><img src="../static/images/bg_img.png" /></div></a></li>'
                productShow += '<li><a href="#"><img src="../static/Products/AD-3.jpg" /><div class="Layers"><img src="../static/images/bg_img.png" /></div></a></li>'
                productShow += '<li><a href="#"><img src="../static/Products/AD-4.jpg" /><div class="Layers"><img src="../static/images/bg_img.png" /></div></a></li>'
                productShow += '</ul>'
                productShow += '</div>'
                productShow += '<div class="middle">'
                productShow += '<div class="hd">'
                productShow += '<a class="prev" href="javascript:void(0)">&gt;</a>'
                productShow += '<a class="next" href="javascript:void(0)">&lt;</a>'
                productShow += '</div>'
                productShow += '<div class="bd">'
                productShow += '<ul>'
                productShow += '<li><a href="#"><img src="../static/Products/AD-5.jpg" /></a></li>'
                productShow += '<li><a href="#"><img src="../static/Products/AD-6.jpg" /></a></li>'
                productShow += '</ul>'
                productShow += '</div>'
                productShow += '</div>'
                productShow += '<script type="text/javascript">'
                productShow += 'jQuery(".middle").slide({titCell:".hd ul",mainCell:".bd ul",autoPlay:true,autoPage:true,interTime:7000});'
                productShow += '</script>'
                productShow += '<div class="Left_side">'
                productShow += '<ul>'
                productShow += '<li><a href="#"><img width="200px" height="220px" src="'+data.data[i].albumPics.substring(0,88)+'" /><div class="Layers"><img src="../static/images/bg_img.png" /></div></a></li>'
                productShow += '<li><a href="#"><img width="200px" height="220px" src="'+data.data[i].albumPics.substring(89,177)+'" /><div class="Layers"><img src="../static/images/bg_img.png" /></div></a></li>'
                productShow += '<li><a href="#"><img src="../static/Products/AD-3.jpg" /><div class="Layers"><img src="../static/images/bg_img.png" /></div></a></li>'
                productShow += '<li><a href="#"><img src="../static/Products/AD-4.jpg" /><div class="Layers"><img src="../static/images/bg_img.png" /></div></a></li>'
                productShow += '</ul>'
                productShow += '</div>'
                productShow += '<div class="advertising">'
                productShow += '<a href="#"><img src="../static/Products/AD-7.jpg"  width="219" height="150"/></a>'
                productShow += '<a href="#"><img src="../static/Products/AD-8.jpg" width="219" height="150"/></a>'
                productShow += '<a href="#" class="da_AD"><img src="../static/Products/AD-9.jpg" width="318" height="150"/></a>'
                productShow += '<a href="#"><img src="../static/Products/AD-10.jpg" width="219" height="150"/></a>'
                productShow += '<a href="#"><img src="../static/Products/AD-7.jpg" width="219" height="150"/></a>'
                productShow += '</div>'
                productShow +=  '<div class="Brand_Gallery" id="Product_brand">'
                productShow += '</div>'
                productShow += '</div>'
                productShow += '</div>'
            }
            $("#Product_show").html(productShow);
        },
        error :function(){// 错误回调函数
            alert("展示错误,请联系管理员");
        }

    })
    productBrand();
})

//商品品牌
function productBrand() {
    $.ajax({
        url: "http://localhost:8762/brand/listAll",
        type:"get",
        dataType:"json",//规定返回值格式
        async:false,//同步上传
        success:function (data) {//成功回调函数
            var productBrand = '';
            var productBrandSS = '';
            for (var i = 0; i < data.data.length; i++) {
                productBrand += '<a href="#"><img src="'+data.data[i].logo+'"  width="125" height="38"/></a>'
                productBrandSS += '<ul>'
                productBrandSS += '<li>'
                productBrandSS += '<a href="#"><img src="'+data.data[i].logo+'"   width="120" height="40"/></a>'
                productBrandSS += '</li>'
                productBrandSS += '</ul>'

            }
            $("#Product_brand").html(productBrand);
            $("#ProductBrand").html(productBrandSS);
        },
        error :function(){// 错误回调函数
            alert("展示错误,请联系管理员");
        }
    })
}

//产品分类
function productCategory() {
    $.ajax({
        url: "http://localhost:8762/category/list/withChildren",
        type:"get",
        dataType:"json",//规定返回值格式
        async:false,//同步上传
        success:function (data) {//成功回调函数
            var productCategory = '';
            for (var i = 0; i < data.data.length; i++) {

            }
            $("#Product_category").html(productCategory
            );
        },
        error :function(){// 错误回调函数
            alert("展示错误,请联系管理员");
        }
    })
}