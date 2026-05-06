<script setup lang="ts">
import { ref } from 'vue'

const mode = ref<'sign in' | 'sign up'>('sign in')

const errorMessage = ref('帳號密碼錯誤')

const clickSignUp = () => {
  if (mode.value === 'sign up') {
    // 如果已經在註冊介面就註冊
  } else {
    // 如果在登入頁面就切換成註冊頁面
    mode.value = 'sign up'
  }
}

const clickSignIn = () => {
  if (mode.value === 'sign in') {
    // 如果已經在登入介面就登入
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
          <span>帳號 ＞</span>
          <input type="text" />
        </div>
        <div class="input-row">
          <span>密碼 ＞</span>
          <input type="password" />
        </div>
        <button class="btnSecondary" type="button" @click="clickSignUp">註冊</button>
        <button class="btnPrimary" type="button" @click="clickSignIn">登入</button>
        <p v-if="errorMessage" class="error">{{ errorMessage }}</p>
      </div>
      <div v-if="mode === 'sign up'" class="sign-up-form">
        <button class="btnSecondary" type="button" @click="clickSignIn">登入</button>
        <button class="btnPrimary" type="button" @click="clickSignUp">註冊</button>
        <p v-if="errorMessage" class="error">{{ errorMessage }}</p>
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
</style>
