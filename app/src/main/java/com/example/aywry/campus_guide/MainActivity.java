package com.example.aywry.campus_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;


public class MainActivity extends AppCompatActivity {

    public class MainMapActivity extends Activity {
        MapView mMapView = null;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //获取地图控件引用
            mMapView = (MapView) findViewById(R.id.map);
            //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
            mMapView.onCreate(savedInstanceState);
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
            mMapView.onDestroy();
        }
        @Override
        protected void onResume() {
            super.onResume();
            //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
            mMapView.onResume();
        }
        @Override
        protected void onPause() {
            super.onPause();
            //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
            mMapView.onPause();
        }
        @Override
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
            mMapView.onSaveInstanceState(outState);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView;
        //定义了一个地图view
        mapView = (MapView) findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);// 此方法须覆写，虚拟机需要在很多情况下保存地图绘制的当前状态。
        //初始化地图控制器对象
        AMap aMap = null;
        if (aMap == null) {
            aMap = mapView.getMap();
        }
    }

}

/*
private MapView mapView;
    private AMap aMap;
    private LinearLayout.LayoutParams mParams;
    private RelativeLayout mContainerLayout;
    private LatLng centerSHpoint = new LatLng(31.238068, 121.501654);// 上海市经纬度
    private LatLng centerBJpoint= new LatLng(39.904989,116.405285);// 北京市经纬度
    private LatLng centerGZpoint= new LatLng(23.125178,113.280637);// 广州市经纬度

    public  static  final  String CITI_KEY="city";
    public  static  final int SHANGHAI=0;
    public  static  final int BEIJING=1;
    public  static  final int GUANGZHOU=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContainerLayout = (RelativeLayout) findViewById(R.id.activity_main);
        AMapOptions aOptions = new AMapOptions();

        int cityIndex = getIntent().getIntExtra(CITI_KEY,0);
        switch (cityIndex){
            case SHANGHAI:
                aOptions.camera(new CameraPosition(centerSHpoint, 10f, 0, 0));
                break;
            case BEIJING:
                aOptions.camera(new CameraPosition(centerBJpoint, 10f, 0, 0));
                break;
            case GUANGZHOU:
                aOptions.camera(new CameraPosition(centerGZpoint, 10f, 0, 0));
                break;
        }
 */