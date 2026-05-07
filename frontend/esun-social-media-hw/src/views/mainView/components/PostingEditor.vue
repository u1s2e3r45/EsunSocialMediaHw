<script setup lang="ts">
import { ResponseStatus } from '@/constant/responseStatus'
import { useLoginStore } from '@/stores/loginStore'
import axios from 'axios'
import { ref } from 'vue'

const emit = defineEmits<{
  (event: 'onCreate'): void
}>()

const loginStore = useLoginStore()

const content = ref<string>('')

const createPost = async () => {
  const response = await axios.post('http://localhost:8080/postController/createPost', {
    userID: loginStore.user?.id,
    content: content.value,
  })
  if (response.data.status === ResponseStatus.SUCCESS) {
    content.value = ''
    emit('onCreate')
  }
}
</script>
<template>
  <div id="post-editor">
    <div class="title-input-area">
      <span>發文內容：</span>
    </div>
    <input type="textarea" id="content-input" rows="10" v-model="content" />
    <div class="tool-list">
      <button @click="createPost">發文</button>
    </div>
  </div>
</template>
<style>
#post-editor {
  display: flex;
  flex-direction: column;
  gap: 20px;
  padding: 10px;
  background-color: rgba(0, 222, 0, 0.1);
  border-radius: 5px;
}
.title-input-area {
  display: flex;
}
.input-container {
  flex: 1;
  padding-right: 20px;
}
input {
  width: 100%;
}
#content-input {
  height: 200px;
}
.tool-list {
  display: flex;
  justify-content: end;
  padding: 5px 0px;
}
</style>
