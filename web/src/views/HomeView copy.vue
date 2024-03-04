<template>
  <div id="container">
    <!-- <baidu-map class="map" ak="ZYOhHuILwnieGoawkWYl1fUfX3Twg44y" v="3.0" type="API" :center="{ lng: 106, lat: 36 }"
      :zoom="6">
    </baidu-map> -->
    <div id="container"></div>
  </div>
</template>

<script>
// import { BaiduMap } from 'vue-baidu-map-3x'
import * as echarts from 'echarts';
// 请确保在引入百度地图扩展之前已经引入百度地图 JS API 脚本并成功加载
// https://api.map.baidu.com/api?v=3.0&ak=你申请的AK
import 'echarts/extension/bmap/bmap';


export default {
  components: {
    // BaiduMap,
  },
  setup() {
    const init = () => {
      var dom = document.getElementById('container')
      var myChart = echarts.init(dom)
      var app = {}
      var option = {
        backgroundColor: 'transparent',
        title: {
          text: '全国主要城市空气质量',
          subtext: 'data from PM25.in',
          sublink: 'http://www.pm25.in',
          left: 'center',
          textStyle: {
            color: '#fff'
          }
        },
        tooltip: {
          trigger: 'item'
        },
        bmap: {
          center: [104.114129, 37.550339],
          zoom: 5,
          roam: true,
          mapStyle: {
            styleJson: [
              {
                featureType: 'water',
                elementType: 'all',
                stylers: {
                  color: '#044161'
                }
              },
              {
                featureType: 'land',
                elementType: 'all',
                stylers: {
                  color: '#004981'
                }
              },
              {
                featureType: 'boundary',
                elementType: 'geometry',
                stylers: {
                  color: '#064f85'
                }
              },
              {
                featureType: 'railway',
                elementType: 'all',
                stylers: {
                  visibility: 'off'
                }
              },
              {
                featureType: 'highway',
                elementType: 'geometry',
                stylers: {
                  color: '#004981'
                }
              },
              {
                featureType: 'highway',
                elementType: 'geometry.fill',
                stylers: {
                  color: '#005b96',
                  lightness: 1
                }
              },
              {
                featureType: 'highway',
                elementType: 'labels',
                stylers: {
                  visibility: 'off'
                }
              },
              {
                featureType: 'arterial',
                elementType: 'geometry',
                stylers: {
                  color: '#004981'
                }
              },
              {
                featureType: 'arterial',
                elementType: 'geometry.fill',
                stylers: {
                  color: '#00508b'
                }
              },
              {
                featureType: 'poi',
                elementType: 'all',
                stylers: {
                  visibility: 'off'
                }
              },
              {
                featureType: 'green',
                elementType: 'all',
                stylers: {
                  color: '#056197',
                  visibility: 'off'
                }
              },
              {
                featureType: 'subway',
                elementType: 'all',
                stylers: {
                  visibility: 'off'
                }
              },
              {
                featureType: 'manmade',
                elementType: 'all',
                stylers: {
                  visibility: 'off'
                }
              },
              {
                featureType: 'local',
                elementType: 'all',
                stylers: {
                  visibility: 'off'
                }
              },
              {
                featureType: 'arterial',
                elementType: 'labels',
                stylers: {
                  visibility: 'off'
                }
              },
              {
                featureType: 'boundary',
                elementType: 'geometry.fill',
                stylers: {
                  color: '#029fd4'
                }
              },
              {
                featureType: 'building',
                elementType: 'all',
                stylers: {
                  color: '#1a5787'
                }
              },
              {
                featureType: 'label',
                elementType: 'all',
                stylers: {
                  visibility: 'off'
                }
              }
            ]
          }
        },
      }

      app.title = '热力图与百度地图扩展'
      var points = [
        [114.295024, 22.632375],
      ]


      myChart.setOption({
        animation: false,
        bmap: {
          center: [114.294924, 22.632275],
          zoom: 15,
          roam: false,
          mapStyle: { style: 'midnight' },
          enableMapClick: false
        },
        visualMap: {
          show: false,
          top: 'top',
          min: 0,
          max: 5,
          seriesIndex: 0,
          calculable: false,
          inRange: {
            color: ['blue', 'blue', 'green', 'yellow', 'red']
          }
        },
        series: [{
          type: 'heatmap',
          coordinateSystem: 'bmap',
          data: points,
          pointSize: 5,
          blurSize: 6
        }]
      })


    }

    return {
      init
    }
  },

  mounted() {
    console.log(2) // 0
    this.init();
  }
}

</script>

<style>
#container {
  width: 100%;
  height: 100vh;
}

.map {
  width: 100%;
  height: 100vh;
}

#main {
  width: 200px;
  height: 300px;
  background-color: aqua;
}
</style>