package com.young.movieapp.utils

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.young.movieapp.R

/**
 * ViewGroup에 확장함수 inflate를 정의
 * attachToRoot는 기본값 false 지정해 생략 가능
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun ImageView.loadImg(imageUrl: String) {
    if (TextUtils.isEmpty(imageUrl)) {
        Picasso.get().load(R.mipmap.ic_launcher).into(this)
    } else {
        Picasso.get().load(imageUrl)
            .placeholder(R.drawable.img_default) // 로드되지 않은 경우 기본 이미지
            //.resize(300,300)  // 300x300 픽셀
            .centerCrop() // 중앙을 기준으로 잘라내기 (전체 이미지가 약간 잘릴 수 있다)
            .fit() // 이미지 늘림 없이 ImageView에 맞춤
            .into(this) // this인 ImageView에 로드
    }
}