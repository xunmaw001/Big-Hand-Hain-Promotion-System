
var projectName = '大手海恩宣传系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '企业文化',
	url: './pages/qiyewenhua/list.html'
}, 
{
	name: '企业之星',
	url: './pages/qiyezhixing/list.html'
}, 
{
	name: '招聘信息',
	url: './pages/zhaopinxinxi/list.html'
}, 
{
	name: '图书信息',
	url: './pages/tushuxinxi/list.html'
}, 
{
	name: '学习资料',
	url: './pages/xuexiziliao/list.html'
}, 
{
	name: '合作信息',
	url: './pages/hezuoxinxi/list.html'
}, 

{
	name: '聊天论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '公告信息',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm5b2ht/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"企业文化","menuJump":"列表","tableName":"qiyewenhua"}],"menu":"企业文化管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"企业之星","menuJump":"列表","tableName":"qiyezhixing"}],"menu":"企业之星管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"应聘信息","menuJump":"列表","tableName":"yingpinxinxi"}],"menu":"应聘信息管理"},{"child":[{"buttons":["查看","修改","删除","新增"],"menu":"图书信息","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"图书借阅","menuJump":"列表","tableName":"tushujieyue"}],"menu":"图书借阅管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"图书归还","menuJump":"列表","tableName":"tushuguihai"}],"menu":"图书归还管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学习资料","menuJump":"列表","tableName":"xuexiziliao"}],"menu":"学习资料管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"合作信息","menuJump":"列表","tableName":"hezuoxinxi"}],"menu":"合作信息管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"聊天论坛","tableName":"forum"}],"menu":"聊天论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"企业文化列表","menuJump":"列表","tableName":"qiyewenhua"}],"menu":"企业文化模块"},{"child":[{"buttons":["查看"],"menu":"企业之星列表","menuJump":"列表","tableName":"qiyezhixing"}],"menu":"企业之星模块"},{"child":[{"buttons":["查看","应聘"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"},{"child":[{"buttons":["查看","借阅"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"buttons":["查看"],"menu":"学习资料列表","menuJump":"列表","tableName":"xuexiziliao"}],"menu":"学习资料模块"},{"child":[{"buttons":["查看"],"menu":"合作信息列表","menuJump":"列表","tableName":"hezuoxinxi"}],"menu":"合作信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"应聘信息","menuJump":"列表","tableName":"yingpinxinxi"}],"menu":"应聘信息管理"},{"child":[{"buttons":["查看","归还","删除"],"menu":"图书借阅","menuJump":"列表","tableName":"tushujieyue"}],"menu":"图书借阅管理"},{"child":[{"buttons":["查看"],"menu":"图书归还","menuJump":"列表","tableName":"tushuguihai"}],"menu":"图书归还管理"},{"child":[{"buttons":["查看","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","删除"],"menu":"聊天论坛","tableName":"forum"}],"menu":"聊天论坛"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"企业文化列表","menuJump":"列表","tableName":"qiyewenhua"}],"menu":"企业文化模块"},{"child":[{"buttons":["查看"],"menu":"企业之星列表","menuJump":"列表","tableName":"qiyezhixing"}],"menu":"企业之星模块"},{"child":[{"buttons":["查看","应聘"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"},{"child":[{"buttons":["查看","借阅"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"buttons":["查看"],"menu":"学习资料列表","menuJump":"列表","tableName":"xuexiziliao"}],"menu":"学习资料模块"},{"child":[{"buttons":["查看"],"menu":"合作信息列表","menuJump":"列表","tableName":"hezuoxinxi"}],"menu":"合作信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
