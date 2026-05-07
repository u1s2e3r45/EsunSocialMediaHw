<script setup lang="ts">
import { ref } from 'vue'
import { useLoginStore } from '@/stores/loginStore'
import type { SignInForm, SignUpForm } from '@/types/form'
import { useRouter } from 'vue-router'
import axios from 'axios'
import type { SignUpReq } from '@/types/requestDto/signUpReq'
import type { SignUpRes } from '@/types/responseDto/signUpRes'
import { ResponseStatus } from '@/constant/responseStatus'

const router = useRouter()

const loginStore = useLoginStore()

const mode = ref<'sign in' | 'sign up'>('sign in')

const isError = ref<boolean>(false)
const message = ref('帳號密碼錯誤')

const signInForm = ref<SignInForm>({})
const signUpForm = ref<SignUpForm>({})

const signInFormValidation = (): boolean => {
  if (!signInForm.value.account || !signInForm.value.password) {
    isError.value = true
    message.value = '請填寫所有欄位'
    return false
  }

  console.log(signInForm.value)
  isError.value = false
  message.value = ''
  return true
}

const signUpFormValidation = (): boolean => {
  if (
    !signUpForm.value.account ||
    !signUpForm.value.email ||
    !signUpForm.value.password ||
    !signUpForm.value.rePassword
  ) {
    isError.value = true
    message.value = '請填寫所有欄位'
    return false
  }

  if (signUpForm.value.password !== signUpForm.value.rePassword) {
    isError.value = true
    message.value = '密碼二次輸入不符'
    return false
  }
  console.log(signUpForm.value)
  isError.value = false
  message.value = ''
  return true
}

const signUp = async () => {
  // 打API到後端
  // 註冊成功的話取回使用者資料
  const request: SignUpReq = {
    phone: signUpForm.value.account,
    email: signUpForm.value.email,
    password: signUpForm.value.password,
  }
  const response = await axios.post<SignUpRes>(
    'http://localhost:8080/registerController/register',
    request,
  )
  if (response.data.status === ResponseStatus.SUCCESS) {
    loginStore.user = {
      id: response.data.userID,
      account: signUpForm.value.account!,
      email: signUpForm.value.email!,
    }
  } else {
    isError.value = true
    message.value = '註冊失敗！'
  }
}

const pushToHome = () => {
  router.push('/')
}

const clickSignUp = async () => {
  if (mode.value === 'sign up') {
    // 如果已經在註冊介面就註冊
    // 檢查註冊表單
    const ifSuccess = signUpFormValidation()
    if (!ifSuccess) return
    // 註冊
    await signUp()
    pushToHome()
  } else {
    // 如果在登入頁面就切換成註冊頁面
    mode.value = 'sign up'
  }
}

const clickSignIn = async () => {
  if (mode.value === 'sign in') {
    // 如果已經在登入介面就登入
    // 檢查登入表單
    const ifSuccess = signInFormValidation()
    if (!ifSuccess) return
    // 登入
    const response = await loginStore.signIn(signInForm.value.account!, signInForm.value.password!)

    if (response.data.status === ResponseStatus.SUCCESS) {
      // 並回寫user
      loginStore.user = {
        id: response.data.userID,
        account: signInForm.value.account!,
        email: response.data.email,
      }
      pushToHome()
    } else {
      isError.value = true
      message.value = '登入失敗！'
    }
  } else {
    // 如果在註冊頁面就切換成登入頁面
    mode.value = 'sign in'
  }
}
</script>
<template>
  <div class="container">
    <div class="main-panel">
      <div v-if="mode === 'sign in'" class="sign-in-form">
        <h1>歡迎回來</h1>
        <div class="input-row">
          <span>手機 ＞</span>
          <input v-model="signInForm.account" type="text" />
        </div>
        <div class="input-row">
          <span>密碼 ＞</span>
          <input v-model="signInForm.password" type="password" />
        </div>
        <button class="btnSecondary" type="button" @click="clickSignUp">註冊</button>
        <button class="btnPrimary" type="button" @click="clickSignIn">登入</button>
        <p v-if="message" :class="isError ? 'error' : 'base'">{{ message }}</p>
      </div>
      <div v-if="mode === 'sign up'" class="sign-up-form">
        <h1>用戶註冊</h1>
        <div class="input-row">
          <span>手機號碼 ＞</span>
          <input v-model="signUpForm.account" type="text" />
        </div>
        <div class="input-row">
          <span>電子信箱 ＞</span>
          <input v-model="signUpForm.email" type="email" />
        </div>
        <div class="input-row">
          <span>輸入密碼 ＞</span>
          <input v-model="signUpForm.password" type="text" />
        </div>
        <div class="input-row">
          <span>二次輸入 ＞</span>
          <input v-model="signUpForm.rePassword" type="text" />
        </div>
        <button class="btnSecondary" type="button" @click="clickSignIn">登入</button>
        <button class="btnPrimary" type="button" @click="clickSignUp">註冊</button>
        <p v-if="message" :class="isError ? 'error' : 'base'">{{ message }}</p>
      </div>
    </div>
  </div>
</template>
<style>
.container {
  flex: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100%;
  width: 100%;
}

.main-panel {
  width: 40%;
  height: 80%;
  background-color: rgba(204, 255, 127, 0.25);
  border: 2px solid darkgoldenrod;
  border-radius: 20px;
  padding: 20px;
}

.sign-in-form,
.sign-up-form {
  height: 100%;
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  align-items: center;
  padding: 5px;
}

.input-row {
  display: flex;
  justify-content: space-evenly;
  width: 100%;
}

.input-row > span {
  /* display: inline; */
  width: fit-content;
}

.input-row > input {
  max-width: 50%;
}

.btnSecondary {
  border: 0px;
  font-size: 16px;
  font-weight: bold;
  text-decoration: underline;
  background-color: transparent;
  color: gray;
  cursor: pointer;
}

.btnPrimary {
  padding: 6px 12px;
  font-size: 20px;
  font-weight: bold;
  border: 0px;
  border-radius: 6px;
  background-color: greenyellow;
  color: green;
  cursor: pointer;
}

.error {
  color: red;
}

.base {
  color: green;
}
</style>
