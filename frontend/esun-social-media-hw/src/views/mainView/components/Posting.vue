<script lang="ts"></script>
<template>
  <div class="post">
    <div class="title">
      <h1>作者</h1>
      <!-- <span>by 作者</span> -->
    </div>
    <h2 class="createdTime">2026年05月05日</h2>
    <div class="content">
      Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi sint, praesentium ullam mollitia
      quod asperiores iste, odit odio, natus tempora veniam nobis quaerat magnam ea dicta facere
      quibusdam rerum at obcaecati. Sapiente error cupiditate sunt! Molestias perspiciatis enim ab
      minus eaque adipisci repudiandae incidunt sapiente vel! Provident architecto nisi, amet,
      repudiandae deleniti aspernatur deserunt sed, similique odit quam voluptatum eaque numquam
      praesentium harum voluptatem? Reiciendis illum consequatur, amet dicta adipisci, culpa ut
      aspernatur a, maiores nihil mollitia cum? Dolorem eveniet modi ullam quis doloribus omnis.
      Recusandae, fuga eos nemo neque fugit accusamus, vero quibusdam iure mollitia earum illum
      enim? Eaque expedita iste, quisquam voluptatem, corrupti rem quos beatae culpa laborum neque
      facilis reiciendis enim debitis hic nam numquam ex natus nihil! Quis impedit aspernatur
      eveniet illo quas perspiciatis praesentium accusamus laborum nulla, omnis rerum expedita nisi
      nam? Ratione sed neque quis et! Corporis maxime soluta asperiores doloribus reiciendis
      expedita earum, nostrum hic blanditiis quaerat et provident commodi voluptatibus voluptas
      minus quos consequuntur impedit ipsam repellat! Cumque, commodi beatae suscipit quidem
      aspernatur eos odio omnis! Non, dolorem mollitia pariatur necessitatibus vero modi soluta
      voluptates odit dignissimos delectus aliquid ipsa sunt sequi labore doloribus libero deleniti
      fuga! Maxime voluptates, voluptas, nihil recusandae, voluptatem ipsam est placeat non
      accusamus tempore voluptate ducimus quisquam explicabo deleniti atque consequatur ratione sit
      incidunt laborum pariatur aliquid libero natus. Laboriosam pariatur culpa possimus! Totam odit
      ex, ut perspiciatis consequatur obcaecati sit, quam inventore hic perferendis modi
      consequuntur beatae suscipit vitae repudiandae? Quia similique harum totam, ad expedita quasi
      repellendus odio voluptate hic velit obcaecati labore quos nulla, facilis vero reprehenderit.
      Culpa repudiandae sit reiciendis expedita necessitatibus quasi vitae ut, nulla quam hic
      delectus incidunt corrupti, earum consequatur aut ad animi accusantium pariatur magnam
      quibusdam iste eveniet repellendus. Ab maxime, cumque ex laborum eum nulla sequi. Distinctio,
      facere ipsa neque unde ipsum amet fugiat maiores quae nesciunt, nihil nostrum odio provident
      natus adipisci! Temporibus ex veritatis natus, alias ea vel libero deleniti adipisci sint
      aspernatur reiciendis et atque provident? Provident officiis consequuntur obcaecati debitis
      nihil cupiditate optio quos, nobis totam saepe nemo vitae et omnis odit odio explicabo harum
      accusamus aliquid, tempora consequatur numquam sunt. Consequuntur minima minus temporibus fuga
      voluptatibus eaque sed quo necessitatibus nesciunt alias veniam optio voluptate doloribus
      atque placeat dolores sunt non odio, nihil, hic esse iusto vitae doloremque. Dicta ratione
      minima dignissimos commodi quaerat ullam porro consequatur vitae eum incidunt sunt at illum
      cumque, hic nesciunt rem accusamus. Temporibus eum, ipsa qui minima ad voluptatibus
      necessitatibus, quae doloremque sequi repellat unde voluptates ut voluptatem, totam ipsum
      sunt! Magnam tempore laboriosam nisi qui a nesciunt atque possimus dolorum officiis rerum,
      culpa iusto et aperiam eveniet illum odit animi eligendi voluptates unde eum. Veniam illum
      dolorum vel vero cupiditate debitis rerum recusandae, commodi eius, amet fugiat quia
      perferendis ipsa animi placeat ea voluptate quisquam numquam iure? Unde, officiis asperiores
      laudantium voluptate fugit ducimus quos cumque. Eos id neque iusto qui iste eligendi culpa
      similique omnis officia, ullam ad, dolorum molestiae ea eum! Modi, minima sed.
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
