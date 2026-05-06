<script setup lang="ts">
import { ref } from 'vue'
import Posting from './components/Posting.vue'
import PostingEditor from './components/PostingEditor.vue'
const isLogin = ref<boolean>(true)
</script>
<template>
  <div class="posts">
    <PostingEditor v-if="isLogin"></PostingEditor>
    <Posting v-for="n in 3"></Posting>
  </div>
</template>

<style scoped>
.posts {
  display: flex;
  flex-direction: column;
  gap: 2rem;
  padding: 2rem 5rem;
  height: auto;
}
</style>
