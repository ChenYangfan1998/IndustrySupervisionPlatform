import {View} from "@tarojs/components"
import Taro, {useState} from '@tarojs/taro'
import './navbar.scss'

export default function Navbar({
    initChecked = false,
    marginVertical = '0',
    onClick = checked => checked,
    text,
  }) {

  const [checked, setChecked] = useState(initChecked)

  function handleClick () {
    onClick(!checked)
    setChecked(!checked)
  }

  return (
    <View style={{margin: marginVertical + ' 0'}}>
      <View className='checkbox' onClick={handleClick}>
        <View className={`checkbox-item ${checked ? 'checked': 'unchecked'}`} />
        <View className='checkbox-text'>{text}</View>
      </View>
    </View>
  )
}
