<template>
  <div class="background">
    <div id="card-1"></div>
    <div id="card-2"></div>
    <div id="card-3"></div>
    <div id="card-4"></div>
    <div id="card-5">
      <svg t="1709522765446" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg"
        p-id="14747" width="128" height="128">
        <path
          d="M823.2 384H704V224c0-17.6-14.4-32-32-32H96c-17.6 0-32 14.4-32 32v448c0 17.6 14.4 32 32 32h32c0 70.4 57.6 128 128 128s128-57.6 128-128h256c0 70.4 57.6 128 128 128s128-57.6 128-128h32c17.6 0 32-14.4 32-32V581.6c0-3.2-0.8-6.4-2.4-8.8l-120.8-181.6c-3.2-4.8-8-7.2-13.6-7.2zM268.8 766.4c-44.8 8.8-84-30.4-75.2-75.2 4.8-24.8 24.8-45.6 50.4-50.4 44.8-8.8 84 30.4 75.2 75.2-5.6 25.6-25.6 45.6-50.4 50.4z m512 0c-44.8 8.8-84-30.4-75.2-75.2 4.8-24.8 24.8-45.6 50.4-50.4 44.8-8.8 84 30.4 75.2 75.2-5.6 25.6-25.6 45.6-50.4 50.4zM704 576V448h95.2c5.6 0 10.4 2.4 12.8 7.2L896 576H704z"
          p-id="14748" fill="#6CDDF9"></path>
      </svg>
      <div class="label">向外供应量</div>
      <div class="font">5555万吨</div>
    </div>
    <div id="card-6">
      <svg t="1709524853292" class="icon" viewBox="0 0 1025 1024" version="1.1" xmlns="http://www.w3.org/2000/svg"
        p-id="18634" width="100" height="100">
        <path
          d="M826.496102 458.3424c0-21.61664 17.18272-38.8096 38.79936-38.8096s39.36256 17.18272 39.36256 38.8096v382.48448c0 21.61664-17.73568 39.08608-39.36256 39.08608H158.520422c-21.61664 0-38.8096-17.46944-38.8096-39.08608V458.3424c0-21.61664 17.18272-38.8096 38.8096-38.8096s39.07584 17.18272 39.07584 38.8096v343.40864h61.80864V441.15968c0-13.02528 10.25024-23.83872 23.27552-23.83872H740.838502c13.02528 0 24.1152 10.81344 24.1152 23.83872V801.76128h61.53216V458.3424h0.01024zM306.519142 715.28448h411.32032v-59.32032H306.519142v59.32032z m411.32032 46.55104H306.519142v39.90528h411.32032v-39.90528z m-411.32032-152.9856h411.32032v-59.32032H306.519142v59.32032z m0-105.8816h411.32032V464.9984H306.519142v37.96992zM58.741862 446.14656c-18.29888 10.52672-42.68032 3.88096-53.21728-13.86496-11.08992-18.8416-4.98688-42.9568 13.85472-53.21728L492.231782 98.02752c12.7488-7.4752 28.27264-7.20896 39.91552 0l472.84224 281.04704c18.29888 10.25024 24.39168 34.36544 13.86496 53.21728-11.08992 17.73568-34.9184 24.39168-53.77024 13.86496L512.179302 177.01888 58.741862 446.14656zM531.584102 98.02752h0.5632-0.5632z"
          fill="#6CDDF9" p-id="18635"></path>
      </svg>
      <div class="label">库存数量</div>
      <div class="font">5555万吨</div>
    </div>
    <div id="card-7">
      <svg t="1709524957273" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg"
        p-id="19943" width="100" height="100">
        <path
          d="M160 640a32 32 0 0 1 32 32V896a32 32 0 0 1-64 0v-224a32 32 0 0 1 32-32zM403.2 480a32 32 0 0 1 32 32v384a32 32 0 0 1-64 0V512a32 32 0 0 1 32-32zM646.4 576a32 32 0 0 1 32 32V896a32 32 0 0 1-64 0V608a32 32 0 0 1 32-32zM889.6 384a32 32 0 0 1 32 32V896a32 32 0 1 1-64 0V416a32 32 0 0 1 32-32zM685.312 128c0-17.664 15.552-32 34.688-32h173.312c19.2 0 34.688 14.336 34.688 32v160c0 17.664-15.488 32-34.688 32-19.136 0-34.624-14.336-34.624-32V213.12l-181.952 192a36.736 36.736 0 0 1-46.208 4.928l-220.352-145.28-256.64 207.36a36.736 36.736 0 0 1-48.96-3.072 30.336 30.336 0 0 1 3.264-45.12l277.312-224a36.928 36.928 0 0 1 43.008-1.92l217.088 143.104 171.712-181.12H720c-19.2 0-34.688-14.336-34.688-32z"
          p-id="19944" fill="#6CDDF9"></path>
      </svg>
      <div class="label">总炼油产量</div>
      <div class="font">5555万吨</div>
    </div>
    <div id="container" class="background"></div>
  </div>
</template>

<script>
import * as echarts from 'echarts';
import 'echarts/extension/bmap/bmap';
import geoCoordMap from '@/assets/js/GeoPos'
import $ from 'jquery'
import cityToProvince from '@/assets/js/CityToProvince'

export default {
  components: {
  },
  setup() {
    var Province = []
    let ProductQuantity = []
    let OilProduction = []
    let OilInventory = []

    let select_Province = null



    const initcard_1 = () => {
      var chartDom = document.getElementById('card-1');
      var myChart = echarts.init(chartDom);
      let option = {
        series: [
          {
            type: 'gauge',
            min: 0,
            max: 10000,
            radius: '100%',
            axisLine: {
              lineStyle: {
                width: 20,
                color: [
                  [0.5, '#DD6F1E'],
                  [0.7, '#F6DB31'],
                  [1, '#2ABF8F']
                ]
              }
            },
            pointer: {
              itemStyle: {
                color: 'auto'
              }
            },
            axisTick: {
              distance: -20,
              length: 8,
              lineStyle: {
                color: '#fff',
                width: 1
              }
            },
            splitLine: {
              distance: -20,
              length: 24,
              lineStyle: {
                color: '#fff',
                width: 4
              }
            },
            axisLabel: {
              color: 'inherit',
              distance: 20,
              fontSize: 14
            },

            detail: {
              valueAnimation: true,
              formatter: '{value} 万吨',
              color: 'inherit',
              fontSize: 18
            },
            title: {
              fontSize: 20,
              color: 'inherit'
            },
            data: [
              {
                value: 0,
                name: '生产总值',
              }
            ]
          }
        ]
      }

      setInterval(function () {
        myChart.setOption({
          series: [
            {
              data: [
                {
                  value: Province[select_Province].grossDomesticProduct,
                  name: '生产总值'
                }
              ]
            }
          ]
        });
      }, 2000);

      option && myChart.setOption(option);
    };
    const initcard_2 = () => {

      var chartDom = document.getElementById('card-2');
      var myChart = echarts.init(chartDom);

      var option = {
        toolbox: {
          show: true,
          feature: {
            mark: { show: true },
            dataView: { show: true, readOnly: false },
            restore: { show: true },
            saveAsImage: { show: true }
          }
        },
        series: [
          {
            type: 'pie',
            radius: [45, 100],
            center: ['50%', '50%'],
            roseType: 'area',
            itemStyle: {
              borderRadius: 8
            },
            data: [
              { value: OilProduction[select_Province].totalProduction, name: '总产量' },
              { value: OilProduction[select_Province].crudeOilAmount, name: '原油量' },
              { value: OilProduction[select_Province].lossAmount, name: '损失量' },
              { value: OilProduction[select_Province].finishedProductAmount, name: '成品量' }
            ]
          }
        ]
      };

      option && myChart.setOption(option);
    };
    const initcard_3 = () => {

      var chartDom = document.getElementById('card-3');
      var myChart = echarts.init(chartDom);
      var option;

      option = {
        title: {
          text: '石油产品数量',
          left: 'center'
        },

        visualMap: {
          show: false,
          min: 0,
          max: 10000,
          splitNumber: 7,
          inRange: {
            color: ['#174A48', '#6D4D8E', '#B4A53D', '#B07631', '#2B9274', '#3A7AAA', '#23528A'],
          },
        },
        series: [
          {
            type: 'treemap',
            data: [
              {
                children: [
                  {
                    name: '炼制产品',
                    value: ProductQuantity[select_Province].refinedProducts
                  },
                  {
                    name: '化工产品',
                    value: ProductQuantity[select_Province].chemicalProducts
                  },
                  {
                    name: '汽油',
                    value: ProductQuantity[select_Province].gasoline
                  },
                  {
                    name: '化肥',
                    value: ProductQuantity[select_Province].fertilizer
                  },
                  {
                    name: '润滑油',
                    value: ProductQuantity[select_Province].lubricatingOil
                  },
                  {
                    name: '煤油',
                    value: ProductQuantity[select_Province].kerosene
                  },
                  {
                    name: '柴油',
                    value: ProductQuantity[select_Province].diesel
                  }
                ]
              }
            ]
          }
        ]
      };

      option && myChart.setOption(option);
    };

    const initcard_4 = () => {
      var chartDom = document.getElementById('card-4');
      var myChart = echarts.init(chartDom);
      var option;
      var series = []
      var cnt = { "华东": 5, '华中': 5, '西南': 5, '西北': 5 }
      var num = [0, 0, 0, 0]
      for (var i in Province) {
        if (cnt[Province[i].region] > 0) {
          let tmp = {
            type: 'bar',
            stack: 'a',
            barWidth: 25
          }
          tmp.name = i
          if (Province[i].region === '华东') {
            tmp.data = [Province[i].grossDomesticProduct, '-', '-', '-'];
            num[0] += Province[i].grossDomesticProduct
          } else if (Province[i].region == '华中') {
            tmp.data = ['-', Province[i].grossDomesticProduct, '-', '-']
            num[1] += Province[i].grossDomesticProduct
          } else if (Province[i].region == '西南') {
            tmp.data = ['-', '-', Province[i].grossDomesticProduct, '-']
            num[2] += Province[i].grossDomesticProduct
          } else {
            tmp.data = ['-', '-', '-', Province[i].grossDomesticProduct]
            num[3] += Province[i].grossDomesticProduct
          }
          series.push(tmp);
        }
      }

      const stackInfo = {};
      for (let i = 0; i < series[0].data.length; ++i) {
        for (let j = 0; j < series.length; ++j) {
          const stackName = series[j].stack;
          if (!stackName) {
            continue;
          }
          if (!stackInfo[stackName]) {
            stackInfo[stackName] = {
              stackStart: [],
              stackEnd: []
            };
          }
          const info = stackInfo[stackName];
          const data = series[j].data[i];
          if (data && data !== '-') {
            if (info.stackStart[i] == null) {
              info.stackStart[i] = 100;
            }
            info.stackEnd[i] = j;
          }
        }
      }
      for (let i = 0; i < series.length; ++i) {
        const data = series[i].data;
        for (let j = 0; j < series[i].data.length; ++j) {
          data[j] = {
            value: data[j],
            itemStyle: {
              borderRadius: [8, 8, 8, 8]
            }
          };
        }
      }
      option = {
        grid: {
          top: 8,
          bottom: 20,
          left: 50
        },
        title: {
          text: "大区总炼油量"
        },
        xAxis: {
          type: 'category',
          data: ['华东', '华中', '西南', '西北'],
          axisTick: {
            length: 1,
            interval: 0, // 设置为0表示所有标签都显示
          }
        },
        yAxis: {
          type: 'value',
          max: 55000,
          min: 15000
        },
        series: series
      };

      option && myChart.setOption(option);
    };

    const initcard_567 = () => {
      var fontDiv = document.querySelector("#card-5 .font");
      fontDiv.innerHTML = OilInventory[select_Province].externalSupplyQuantity + "万吨"

      fontDiv = document.querySelector("#card-6 .font");
      fontDiv.innerHTML = OilInventory[select_Province].inventoryQuantity + "万吨"

      fontDiv = document.querySelector("#card-7 .font");
      fontDiv.innerHTML = Math.floor(OilInventory[select_Province].totalRefiningProduction) + "万吨"

    }

    const initcard = () => {
      initcard_1();
      initcard_2();
      initcard_3();
      initcard_4();
      initcard_567();
    };


    const initMap = () => {
      var dom = document.getElementById('container')
      var myChart = echarts.init(dom)

      var convertData = function (data) {
        var res = [];
        for (var it in data) {
          var geoCoord = geoCoordMap[data[it].capitalCity];
          if (geoCoord) {
            res.push({
              name: data[it].capitalCity,
              value: geoCoord.concat(data[it].grossDomesticProduct)
            });
          }
        }
        return res;
      };

      var option = {
        backgroundColor: 'transparent',
        title: {
          text: '石油工业大数据分析展示平台',
          left: 'center',
          textStyle: {
            color: '#fff',
            fontSize: 32,
            lineHeight: 50
          }
        },
        tooltip: {
          trigger: 'item'
        },
        bmap: {
          center: [105.5, 36],
          zoom: 6,
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
        series: [
          {
            name: '产量(万吨)',
            type: 'effectScatter',
            coordinateSystem: 'bmap',
            data: convertData(
              Province
            ),
            encode: {
              value: 2
            },
            symbolSize: 10,
            showEffectOn: 'emphasis',
            rippleEffect: {
              brushType: 'stroke'
            },
            hoverAnimation: true,
            label: {
              formatter: '{b}',
              position: 'right',
              show: true
            },
            itemStyle: {
              color: '#f4e925',
              shadowBlur: 10,
              shadowColor: '#333'
            },
            zlevel: 1
          },

        ]
      }
      option && myChart.setOption(option);
      myChart.on("click", function (e) {
        console.log(cityToProvince[e.data.name])    //  每个标识点的信息
        select_Province = cityToProvince[e.data.name]
        initcard();
      })

      initcard();
    };

    const init = () => {
      $.ajax({
        url: "http://127.0.0.1:3000/Province/getlist/",
        type: "get",
        data: {
        },
        success(resp) {
          resp.forEach(item => {
            Province[item.provinceName] = item;
          });
          select_Province = resp[0].provinceName
          $.ajax({
            url: "http://127.0.0.1:3000/ProductQuantity/getlist/",
            type: "get",
            data: {
            },
            success(resp) {
              resp.forEach(item => {
                ProductQuantity[item.provinceName] = item;
              });
              $.ajax({
                url: "http://127.0.0.1:3000/OilProduction/getlist/",
                type: "get",
                data: {
                },
                success(resp) {
                  resp.forEach(item => {
                    OilProduction[item.provinceName] = item;
                  });
                  $.ajax({
                    url: "http://127.0.0.1:3000/OilInventory/getlist/",
                    type: "get",
                    data: {
                    },
                    success(resp) {
                      resp.forEach(item => {
                        OilInventory[item.provinceName] = item;
                      });
                      initMap();
                    },
                    error() {
                      console.log("error");
                    }
                  })

                },
                error() {
                  console.log("error");
                }
              })


            },
            error() {
              console.log("error");
            }
          })
        },
        error() {
          console.log("error");
        }
      })
    };

    return {
      init,

    }
  },

  mounted() {
    this.init();
  },
}

</script>

<style>
.background {
  width: 100%;
  height: 100vh;
}

#card-1 {
  position: absolute;
  bottom: 400px;
  left: 10px;
  width: 310px;
  height: 280px;
  background-color: rgba(200, 200, 200, 0.5);
  border: 5px solid rgba(200, 200, 200, 0.75);
  border-radius: 3%;
  z-index: 999;
}

#card-2 {
  position: absolute;
  bottom: 400px;
  right: 10px;
  width: 310px;
  height: 280px;
  background-color: rgba(200, 200, 200, 0.5);
  border: 5px solid rgba(200, 200, 200, 0.75);
  border-radius: 3%;
  z-index: 999;
}

#card-3 {
  position: absolute;
  bottom: 20px;
  left: 10px;
  width: 310px;
  height: 350px;
  background-color: rgba(200, 200, 200, 0.5);
  border: 5px solid rgba(200, 200, 200, 0.75);
  border-radius: 3%;
  z-index: 999;
}

#card-4 {
  position: absolute;
  bottom: 20px;
  right: 10px;
  width: 310px;
  height: 350px;
  background-color: rgba(200, 200, 200, 0.5);
  border: 5px solid rgba(200, 200, 200, 0.75);
  border-radius: 3%;
  z-index: 999;
}

#card-5 {
  position: absolute;
  bottom: 20px;
  right: 325px;
  width: 270px;
  height: 200px;
  background-color: rgba(200, 200, 200, 0.5);
  border: 5px solid rgba(200, 200, 200, 0.75);
  border-radius: 3%;
  z-index: 999;
}

.icon {
  position: absolute;
  right: 78px;
}

.label {
  position: absolute;
  right: 86px;
  bottom: 57px;
  font-size: large;
  font-weight: 600;
}

.font {
  position: absolute;
  right: 64px;
  bottom: 18px;
  font-size: xx-large;
  font-weight: bolder;
  color: #EAC38D;
}

#card-6 {
  position: absolute;
  bottom: 20px;
  right: 610px;
  width: 280px;
  height: 200px;
  background-color: rgba(200, 200, 200, 0.5);
  border: 5px solid rgba(200, 200, 200, 0.75);
  border-radius: 3%;
  z-index: 999;
}

#card-7 {
  position: absolute;
  bottom: 20px;
  right: 900px;
  width: 275px;
  height: 200px;
  background-color: rgba(200, 200, 200, 0.5);
  border: 5px solid rgba(200, 200, 200, 0.75);
  border-radius: 3%;
  z-index: 999;
}
</style>