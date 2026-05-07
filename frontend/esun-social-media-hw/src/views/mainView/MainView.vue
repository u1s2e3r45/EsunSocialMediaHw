<script setup lang="ts">
import { useLoginStore } from '@/stores/loginStore'
import Posting from './components/Posting.vue'
import PostingEditor from './components/PostingEditor.vue'
import { onMounted, ref } from 'vue'
import axios from 'axios'
import type { PostRes } from '@/types/responseDto/postRes'
import type { Post } from '@/types/post'

const loginStore = useLoginStore()

const postings = ref<Post[]>([])

const getPostings = async () => {
  const response = await axios.post<PostRes[]>('http://localhost:8080/postController/showAllPost')
  postings.value = response.data.map((item) => {
    return {
      postId: item.postID,
      userId: item.userID,
      userName: item.userName,
      content: item.content,
      createdTime: item.Created_At,
      image: item.Image,
    }
  })
}

const refreshPost = () => {
  postings.value = []
  getPostings()
}

onMounted(() => {
  setTimeout(() => {
    getPostings()
  }, 1000)
})
</script>
<template>
  <div class="posts">
    <PostingEditor v-if="loginStore.user" @onCreate="refreshPost"></PostingEditor>
    <Posting v-for="post in postings" :id="post.postId" :post="post"></Posting>
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
