<script lang="ts"></script>
<template>
  <div id="post-editor">
    <div class="title-input-area">
      <span>標題：</span>
      <div class="input-container">
        <input class="post-title-input" placeholder="你在想什麼..." />
      </div>
    </div>
    <input type="textarea" id="content-input" />
    <div class="tool-list">
      <button>發文</button>
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
