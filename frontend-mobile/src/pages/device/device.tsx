import {View} from '@tarojs/components'
import Taro, {useRouter, useEffect} from '@tarojs/taro'
import './device.scss'
import Chart from '../../components/chart/Chart'

interface DeviceInfo {
  deviceId: string,
  title: string,
  description: string,
  sensors: string[]
  date: string,
}

export default function Device() {
  const deviceId = useRouter().params.deviceId
  let deviceInfo: DeviceInfo = {
    title: '加载数据中',
    deviceId: deviceId,
    description: '数据正在加载中，请稍后...',
    sensors: [],
    date: ''
  }

  // 第二个参数传空数组以起到componentDidMount函数类似的功能
  useEffect(() => {
    // eslint-disable-next-line react-hooks/exhaustive-deps
    deviceInfo = getDeviceInfo(deviceId);
  }, [deviceId])

  return (
    <View className='container'>
      <View className='header'>
        <View className='title'>{deviceInfo.title}</View>
        <View className='description'>{deviceInfo.description}</View>
        <Chart option={{
          xAxis: {
            type: 'category',
            data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
          },
          yAxis: {
            type: 'value'
          },
          series: [{
            data: [820, 932, 901, 934, 1290, 1330, 1320],
            type: 'line'
          }]
        }} width='100%' height='400px'
        />
      </View>
    </View>
  )
}

function getDeviceInfo(deviceId) {
  console.log('假数据！' + deviceId)
  return {
    title: '螺丝刀传感器 1',
    description: '实验用的螺丝刀项目',
    deviceId: deviceId,
    sensors: ['温度传感器', '转动传感器'],
    date: '2019/11/06',
  }
}
