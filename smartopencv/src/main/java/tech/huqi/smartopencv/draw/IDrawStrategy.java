package tech.huqi.smartopencv.draw;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by hzhuqi on 2019/9/3
 */

/**
 * 图像帧绘制策略接口
 * 将实时获取的每一帧图像{@code frameBitmap}绘制到预览画布{@code canvas}上
 */
public interface IDrawStrategy {
    /**
     * 绘制每一帧图像
     *
     * @param canvas         画布
     * @param frameBitmap    待绘制图像帧的{@code Bitmap}对象
     * @param surfaceWidth   SurfaceView的宽度
     * @param surfaceHeight  SurfaceView的高度
     * @param isSetLandscape 是否设置为横屏
     * @param isPortrait     当前屏幕是否是竖屏显示
     */
    void drawBitmap(Canvas canvas, Bitmap frameBitmap, int surfaceWidth, int surfaceHeight, boolean isSetLandscape, boolean isPortrait);
}
