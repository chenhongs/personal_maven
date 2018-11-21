package com.ch.android.weipinhuiSDK;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * @author: panrongfu
 * @date: 2018/8/27 20:07
 * @describe:
 */

public class WeiPinHuiSDK {

    public static void jumpToGoodsDetailPage(Context context,  String traFrom,String brandId, String goodsId) {
        StringBuffer sb = new StringBuffer();
        sb.append("vipshop://showGoodsDetail?")
                .append("goodsId=").append(goodsId).append("&amp;")
                .append("brandId=").append(brandId).append("&amp;")
                .append("tra_from=").append(traFrom).append("&amp;")
                .append("other=");
        String uriStr = sb.toString();

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uriStr));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
