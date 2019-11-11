import Taro from '@tarojs/taro'
import {Image, View} from '@tarojs/components'
import './index.scss'
import DeviceCard from '../../components/device-card/device-card'
import centerPNG from '../../images/index/center.png'
import SearchBar from '../../components/search-bar/search-bar'

export default function Index() {

  function handleDeviceCardClick(deviceId: string) {
    return function () {
      Taro.navigateTo({
        url: `/pages/device/device?deviceId=${deviceId}`,
      }).catch((e) => {
        console.log(e)
      })
    }
  }

  return (
    <View className='container'>
      <View className='top-nav'>
        <View className='heading-text'>
          <View className='heading'>
            我的设备
          </View>
          <View className='subheading'>
            与该账号绑定的所有设备信息
          </View>
        </View>
        <View className='heading-icon'>
          <Image src={centerPNG} className='center-icon' />
        </View>
      </View>
      <View className='search-bar-wrapper'>
        <SearchBar />
      </View>
      <View className='devices'>
        <DeviceCard onClick={handleDeviceCardClick('1d2341375')} deviceId='1d2341375' title='螺丝刀设备 1' description='实验项目螺丝刀设置' sensors={['转动传感器', '温度传感器']} />
        <DeviceCard onClick={handleDeviceCardClick('2d2341375')} deviceId='2d2341375' title='螺丝刀设备 2' description='实验项目螺丝刀设置' />
        <DeviceCard onClick={handleDeviceCardClick('3d2341375')} deviceId='3d2341375' title='螺丝刀设备 2' description='实验项目螺丝刀设置' />
      </View>
    </View>
  )
}

Index.config = {
  navigationBarTitleText: '物联网云平台',
  navigationBarBackgroundColor: '#f5f5f5',
  backgroundColor: '#f5f5f5'
}
