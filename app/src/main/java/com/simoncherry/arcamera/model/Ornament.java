package com.simoncherry.arcamera.model;

import org.rajawali3d.Object3D;
import org.rajawali3d.animation.Animation3D;
import org.rajawali3d.materials.plugins.IMaterialPlugin;

import java.util.List;

/**
 * Created by Simon on 2017/6/25.
 */

public class Ornament {

    public static final int TYPE_NONE = -1;
    public static final int TYPE_STATIC = 0;
    public static final int TYPE_DYNAMIC = 1;
    public static final int TYPE_BUILT_IN = 2;

    private int type = TYPE_NONE;
    private int imgResId;
    private List<Model> modelList;
    private List<Object3D> object3DList;
    private List<List<IMaterialPlugin>> materialList;
    private float timeStep;
    private float scale;
    private float offsetX;
    private float offsetY;
    private float offsetZ;
    private float rotateX;
    private float rotateY;
    private float rotateZ;

    private boolean hasShaderPlane;
    private int vertResId;
    private int fragResId;
    private float planeOffsetX;
    private float planeOffsetY;
    private float planeOffsetZ;


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }

    public List<Object3D> getObject3DList() {
        return object3DList;
    }

    public void setObject3DList(List<Object3D> mObject3DList) {
        this.object3DList = mObject3DList;
    }

    public List<List<IMaterialPlugin>> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<List<IMaterialPlugin>> materialList) {
        this.materialList = materialList;
    }

    public float getTimeStep() {
        return timeStep;
    }

    public void setTimeStep(float timeStep) {
        this.timeStep = timeStep;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public float getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(float offsetX) {
        this.offsetX = offsetX;
    }

    public float getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(float offsetY) {
        this.offsetY = offsetY;
    }

    public float getOffsetZ() {
        return offsetZ;
    }

    public void setOffsetZ(float offsetZ) {
        this.offsetZ = offsetZ;
    }

    public float getRotateX() {
        return rotateX;
    }

    public void setRotateX(float rotateX) {
        this.rotateX = rotateX;
    }

    public float getRotateY() {
        return rotateY;
    }

    public void setRotateY(float rotateY) {
        this.rotateY = rotateY;
    }

    public float getRotateZ() {
        return rotateZ;
    }

    public void setRotateZ(float rotateZ) {
        this.rotateZ = rotateZ;
    }

    public boolean isHasShaderPlane() {
        return hasShaderPlane;
    }

    public void setHasShaderPlane(boolean hasShaderPlane) {
        this.hasShaderPlane = hasShaderPlane;
    }

    public int getVertResId() {
        return vertResId;
    }

    public void setVertResId(int vertResId) {
        this.vertResId = vertResId;
    }

    public int getFragResId() {
        return fragResId;
    }

    public void setFragResId(int fragResId) {
        this.fragResId = fragResId;
    }

    public float getPlaneOffsetX() {
        return planeOffsetX;
    }

    public void setPlaneOffsetX(float planeOffsetX) {
        this.planeOffsetX = planeOffsetX;
    }

    public float getPlaneOffsetY() {
        return planeOffsetY;
    }

    public void setPlaneOffsetY(float planeOffsetY) {
        this.planeOffsetY = planeOffsetY;
    }

    public float getPlaneOffsetZ() {
        return planeOffsetZ;
    }

    public void setPlaneOffsetZ(float planeOffsetZ) {
        this.planeOffsetZ = planeOffsetZ;
    }

    public static class Model {
        private String name;
        private int modelResId;
        private float scale;
        private float offsetX;
        private float offsetY;
        private float offsetZ;
        private float rotateX;
        private float rotateY;
        private float rotateZ;
        private int color;
        private List<Animation3D> animation3Ds;
        private int textureResId = -1;
        private String texturePath = null;
        private boolean isDynamic;
        private boolean needSkinColor;
        private boolean needObjectPick;
        // for object pick
        private boolean isPicked;
        private float beforeX;
        private float beforeY;
        private float beforeZ;
        private float afterX;
        private float afterY;
        private float afterZ;
        private float beforeAngle;
        private float afterAngle;
        private int axisX;
        private int axisY;
        private int axisZ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getModelResId() {
            return modelResId;
        }

        public void setModelResId(int modelResId) {
            this.modelResId = modelResId;
        }

        public float getScale() {
            return scale;
        }

        public void setScale(float scale) {
            this.scale = scale;
        }

        public float getOffsetX() {
            return offsetX;
        }

        public void setOffsetX(float offsetX) {
            this.offsetX = offsetX;
        }

        public float getOffsetY() {
            return offsetY;
        }

        public void setOffsetY(float offsetY) {
            this.offsetY = offsetY;
        }

        public float getOffsetZ() {
            return offsetZ;
        }

        public void setOffsetZ(float offsetZ) {
            this.offsetZ = offsetZ;
        }

        public float getRotateX() {
            return rotateX;
        }

        public void setRotateX(float rotateX) {
            this.rotateX = rotateX;
        }

        public float getRotateY() {
            return rotateY;
        }

        public void setRotateY(float rotateY) {
            this.rotateY = rotateY;
        }

        public float getRotateZ() {
            return rotateZ;
        }

        public void setRotateZ(float rotateZ) {
            this.rotateZ = rotateZ;
        }

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }

        public List<Animation3D> getAnimation3Ds() {
            return animation3Ds;
        }

        public void setAnimation3Ds(List<Animation3D> animation3Ds) {
            this.animation3Ds = animation3Ds;
        }

        public int getTextureResId() {
            return textureResId;
        }

        public void setTextureResId(int textureResId) {
            this.textureResId = textureResId;
        }

        public String getTexturePath() {
            return texturePath;
        }

        public void setTexturePath(String texturePath) {
            this.texturePath = texturePath;
        }

        public boolean isDynamic() {
            return isDynamic;
        }

        public void setDynamic(boolean isDynamic) {
            this.isDynamic = isDynamic;
        }

        public boolean isNeedSkinColor() {
            return needSkinColor;
        }

        public void setNeedSkinColor(boolean needSkinColor) {
            this.needSkinColor = needSkinColor;
        }

        public boolean isNeedObjectPick() {
            return needObjectPick;
        }

        public void setNeedObjectPick(boolean needObjectPick) {
            this.needObjectPick = needObjectPick;
        }

        public void setOffset(float x, float y, float z) {
            setOffsetX(x);
            setOffsetY(y);
            setOffsetZ(z);
        }

        public void setRotate(float x, float y, float z) {
            setRotateX(x);
            setRotateY(y);
            setRotateZ(z);
        }

        public boolean isPicked() {
            return isPicked;
        }

        public void setPicked(boolean picked) {
            isPicked = picked;
        }

        public float getBeforeX() {
            return beforeX;
        }

        public void setBeforeX(float beforeX) {
            this.beforeX = beforeX;
        }

        public float getBeforeY() {
            return beforeY;
        }

        public void setBeforeY(float beforeY) {
            this.beforeY = beforeY;
        }

        public float getBeforeZ() {
            return beforeZ;
        }

        public void setBeforeZ(float beforeZ) {
            this.beforeZ = beforeZ;
        }

        public float getAfterX() {
            return afterX;
        }

        public void setAfterX(float afterX) {
            this.afterX = afterX;
        }

        public float getAfterY() {
            return afterY;
        }

        public void setAfterY(float afterY) {
            this.afterY = afterY;
        }

        public float getAfterZ() {
            return afterZ;
        }

        public void setAfterZ(float afterZ) {
            this.afterZ = afterZ;
        }

        public float getBeforeAngle() {
            return beforeAngle;
        }

        public void setBeforeAngle(float beforeAngle) {
            this.beforeAngle = beforeAngle;
        }

        public float getAfterAngle() {
            return afterAngle;
        }

        public void setAfterAngle(float afterAngle) {
            this.afterAngle = afterAngle;
        }

        public int getAxisX() {
            return axisX;
        }

        public void setAxisX(int axisX) {
            this.axisX = axisX;
        }

        public int getAxisY() {
            return axisY;
        }

        public void setAxisY(int axisY) {
            this.axisY = axisY;
        }

        public int getAxisZ() {
            return axisZ;
        }

        public void setAxisZ(int axisZ) {
            this.axisZ = axisZ;
        }
    }
}
