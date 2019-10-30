import {View} from '@tarojs/components'
import Taro, {useEffect, useState} from '@tarojs/taro'
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

  const [showSensorsList, setShowSensorsList] = useState(false)

  useEffect (() => {
    if (info.description.length > 30) {
      info.description = info.description.substr(0, 30) + '...'
    }
  })

  let sensorsList
  if (showSensorsList && info.sensors) {
    sensorsList = info.sensors.map(sensor => {
      return (
        <View key={sensor}>{sensor}</View>
      )
    })
  } else {
    sensorsList = ''
  }

  const renderSensors = info.sensors ? (
      <View className='sensor-button' onClick={() => setShowSensorsList(!showSensorsList)}>
        查看传感器列表 ({info.sensors.length})
      </View>
  ): (
    <View className='sensor'>默认传感器 - 温度</View>
  )


  return (
    <View className='container' onClick={info.onClick}>
      <View className='main-area'>
        <View className='title'>
          {info.title}
        </View>
        <View className='description'>
          {info.description}
        </View>
      </View>
      <View className='sensor-area'>
        {renderSensors}
        {sensorsList}
      </View>
    </View>
  )
}
