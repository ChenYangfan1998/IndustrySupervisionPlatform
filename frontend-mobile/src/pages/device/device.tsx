import {View} from '@tarojs/components'
import Taro, {useRouter} from '@tarojs/taro'
import './device.scss'

export default function Device () {
  const deviceId = useRouter().params.deviceId

  return (
    <View>
      lorem, {deviceId}
    </View>
  )
}
