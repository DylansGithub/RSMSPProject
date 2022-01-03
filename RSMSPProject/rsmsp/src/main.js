import Vue from 'vue'
import App from './App'
import router from './router'
//引入element ui
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
//引入axios
import axios from "axios";

Vue.config.productionTip = false
Vue.use(ElementUI)
//将axios插入vue原型属性中
Vue.prototype.$axios = axios
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>',
  render: h => h(App)
})
