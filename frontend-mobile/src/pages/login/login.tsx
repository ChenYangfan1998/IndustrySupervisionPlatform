import {Button, Form, Input, Label, View} from "@tarojs/components"
import Taro, {useState}from '@tarojs/taro'
import './login.scss'
import CheckStatement from "../../components/check-statement/check-statement"

export default function Login() {

  let [isBindWechatAccount, setBindWechatAccount] = useState(false);

  function handleCheckedClick (value) {
    setBindWechatAccount(value)
  }

  function handleLogin() {
    // login

    if (isBindWechatAccount) {

    }
  }

  return (
    <View className='container'>
      <View className='heading-wrapper'>
        <View className='heading'>用户登录</View>
        <View className='subheading'>您的微信号尚未绑定本平台账号</View>
      </View>
      <Form>
          <Label className='input-area'>
            <View className='input-area--label'>用户名</View>
            <Input className='input-area--input' auto-focus placeholder='在此输入用户名' />
          </Label>
        <Label className='input-area input-area--bottom-line'>
          <View className='input-area--label'>
            密码
          </View>
          <Input className='input-area--input' password placeholder='在此输入密码' />
        </Label>
        <CheckStatement text='将微信号与该账号关联' marginVertical='16px' onClick={handleCheckedClick} />
        <Button type='primary' className='login-button' onClick={handleLogin}>确认</Button>
      </Form>
    </View>
  )
}

Login.config = {
    navigationBarTitleText: '登录云平台'
}
