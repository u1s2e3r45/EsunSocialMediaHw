<script setup lang="ts">
import { useLoginStore } from '@/stores/loginStore'
import Posting from './components/Posting.vue'
import PostingEditor from './components/PostingEditor.vue'

const loginStore = useLoginStore()
</script>
<template>
  <div class="posts">
    <PostingEditor v-if="loginStore.user"></PostingEditor>
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
