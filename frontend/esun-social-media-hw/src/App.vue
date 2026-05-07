<script setup lang="ts">
import { RouterView } from 'vue-router'
import { useLoginStore } from '@/stores/loginStore'

const loginStore = useLoginStore()
</script>
<template>
  <div class="app-container">
    <div class="topbar">
      <RouterLink to="/">
        <img src="/public/esun_logo.png" height="45" />
      </RouterLink>
      <nav>
        <div v-if="loginStore.user" class="userTitle">{{ loginStore.user.account }}</div>
        <RouterLink v-if="!loginStore.user" to="/login">Sign In</RouterLink>
        <button v-if="loginStore.user" @click="loginStore.signOut">Sign Out</button>
      </nav>
    </div>
    <main>
      <RouterView />
    </main>
  </div>
</template>
<style scoped>
.app-container {
  /* 縱向排列 */
  display: flex;
  flex-direction: column;
  /* 滿版高度 */
  height: 100vh;
  /* 防止最外層出現滾動條(會做在main) */
  overflow: hidden;
}

.topbar {
  /* 橫向排列 */
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
  height: fit-content;
  padding: 6px;
  background-color: aquamarine;
}

nav {
  /* 橫向排列 */
  display: flex;
  gap: 2px;
  padding: 2px 6px;
}

main {
  height: auto;
  /* 高度占用flex的剩餘部分 */
  flex: 1;
  overflow-y: scroll;
}

.userTitle {
  padding: 4px;
  color: blue;
}
</style>
