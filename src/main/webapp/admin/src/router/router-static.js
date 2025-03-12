import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import hezuoxinxi from '@/views/modules/hezuoxinxi/list'
    import qiyewenhua from '@/views/modules/qiyewenhua/list'
    import yingpinxinxi from '@/views/modules/yingpinxinxi/list'
    import qiyezhixing from '@/views/modules/qiyezhixing/list'
    import forum from '@/views/modules/forum/list'
    import zhaopinxinxi from '@/views/modules/zhaopinxinxi/list'
    import discusshezuoxinxi from '@/views/modules/discusshezuoxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import tushujieyue from '@/views/modules/tushujieyue/list'
    import messages from '@/views/modules/messages/list'
    import xuexiziliao from '@/views/modules/xuexiziliao/list'
    import tushuguihai from '@/views/modules/tushuguihai/list'
    import config from '@/views/modules/config/list'
    import tushuxinxi from '@/views/modules/tushuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
          ,{
	path: '/hezuoxinxi',
        name: '合作信息',
        component: hezuoxinxi
      }
          ,{
	path: '/qiyewenhua',
        name: '企业文化',
        component: qiyewenhua
      }
          ,{
	path: '/yingpinxinxi',
        name: '应聘信息',
        component: yingpinxinxi
      }
          ,{
	path: '/qiyezhixing',
        name: '企业之星',
        component: qiyezhixing
      }
          ,{
	path: '/forum',
        name: '聊天论坛',
        component: forum
      }
          ,{
	path: '/zhaopinxinxi',
        name: '招聘信息',
        component: zhaopinxinxi
      }
          ,{
	path: '/discusshezuoxinxi',
        name: '合作信息评论',
        component: discusshezuoxinxi
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/tushujieyue',
        name: '图书借阅',
        component: tushujieyue
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/xuexiziliao',
        name: '学习资料',
        component: xuexiziliao
      }
          ,{
	path: '/tushuguihai',
        name: '图书归还',
        component: tushuguihai
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/tushuxinxi',
        name: '图书信息',
        component: tushuxinxi
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
