import { createRouter, createWebHistory } from 'vue-router'
import LoginView from '../views/loginView/LoginView.vue'
import MainView from '@/views/mainView/MainView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'main',
      component: MainView,
    },
    {
      path: '/login',
      name: 'login',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      //component: MainView,
      //component: LoginView,
      component: () => import('../views/loginView/LoginView.vue'),
    },
  ],
})

export default router
