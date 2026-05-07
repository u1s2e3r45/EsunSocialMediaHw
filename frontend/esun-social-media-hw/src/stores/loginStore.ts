import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import type { User } from '@/types/user'

export const useLoginStore = defineStore('loginStore', () => {
  // state (ref)
  const user = ref<User | undefined>()

  // getters (computed)

  // actions (function)
  async function signIn(account: string, password: string) {
    // 打API到後端進行登入
    // 並回寫user
    user.value = {
      account: '',
      email: '',
    }
  }

  async function signOut() {
    user.value = undefined
  }

  return { user, signIn, signOut }
})
