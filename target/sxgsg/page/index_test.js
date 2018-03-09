var app = new Vue({
    el: '#app',
    data: {
        message: 'Hello Vue!'
    }
});

new Vue({
    el: '#app2',
    data: {
        message: '页面加载于 ' + new Date().toLocaleString()
    },
});
new Vue({
    el:'#app3',
    data:{
        //seen:false
        seen:true
    }
})

new Vue({
    el:'#app4',
    data:{
        tests:[
            {text:'1'},
            {text:'2'},
            {text:'3'}
        ]
    }
})

new Vue({
    el:'#app5',
    data:{
        message:"上海的水来自海上！"
    },
    methods:{
        reverseMessage: function () {
            this.message = this.message.split('').reverse().join('')
        }
    }
})

new Vue({
    el:".app6",
    data:{
        message:"Love me china!"
    }
})