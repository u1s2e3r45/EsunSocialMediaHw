import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import type { User } from '@/types/user'
import axios from 'axios'
import type { SignInReq } from '@/types/requestDto/signInReq'
import type { SignInRes } from '@/types/responseDto/signInRes'
import { ResponseStatus } from '@/constant/responseStatus'

export const useLoginStore = defineStore('loginStore', () => {
  // state (ref)
  const user = ref<User | undefined>()

  // getters (computed)

  // actions (function)
  async function signIn(account: string, password: string) {
    const signInReq: SignInReq = {
      phone: account,
      password: password,
    }
    // 打API到後端進行登入
    return await axios.post<SignInRes>('http://localhost:8080/loginController/login', signInReq)
  }

  async function signOut() {
    user.value = undefined
  }

  return { user, signIn, signOut }
})
