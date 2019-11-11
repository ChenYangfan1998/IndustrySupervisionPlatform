import {View} from '@tarojs/components'
import Taro from '@tarojs/taro'
import './device-card.scss'

interface DeviceCardInfo {
  deviceId: string,
  title: string,
  description: string,
  sensors?: string[]
  date?: string,
  onClick: () => void;
}

export default function DeviceCard(info: DeviceCardInfo) {

  let renderSensors
  if (info.sensors) {
    renderSensors = info.sensors.map(sensor => {
      return (
        <View key={sensor} className='sensor'>{sensor}</View>
      )
    })
  } else {
    renderSensors = <View className='sensor'>默认传感器</View>
  }

  return (
    <View className='container' onClick={info.onClick}>
      <View className='title'>{info.title}</View>
      <View className='device-id'>设备 ID - {info.deviceId}</View>
      <View className='description'>{info.description}</View>
      <View className='sensorList'>{renderSensors}</View>
    </View>
  )
}
