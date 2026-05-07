<script setup lang="ts">
import type { Post } from '@/types/post'

const { post } = defineProps<{ post: Post }>()
</script>
<template>
  <div class="post">
    <div class="title">
      <h1>用戶({{ post.userId }})：名稱({{ post.userName ?? '匿名' }})</h1>
      <!-- <span>by 作者</span> -->
    </div>
    <h2 class="createdTime">{{ post.createdTime }}</h2>
    <div class="content">
      {{ post.content }}
    </div>
    <div class="tool-list">
      <button>留言</button>
    </div>
    <div class="comments">
      <div class="comment">
        <span>留言者</span>
        <p>Lorem ipsum dolor sit</p>
        <div class="spacer"></div>
        <span class="commentedTime">2026年05月05日</span>
      </div>
    </div>
  </div>
</template>
<style scoped>
.post {
  display: flex;
  flex-direction: column;
  gap: 2px;
  padding: 10px;
  background-color: rgba(128, 128, 128, 0.1);
  border-radius: 5px;
}
.title {
  display: flex;
  gap: 10px;
}
.title h1 {
  font-size: 30px;
}
.createdTime {
  font-size: 16px;
  color: gray;
}
.content {
  padding: 10px;
}
.tool-list {
  display: flex;
  justify-content: end;
  padding: 5px 0px;
}
.comments {
  display: flex;
  flex-direction: column;
  gap: 10px;
}
.comment {
  display: flex;
  padding: 5px;
  gap: 6px;
  background-color: rgba(128, 128, 128, 0.3);
  border-radius: 5px;
}

p {
  display: inline-block;
}
</style>
