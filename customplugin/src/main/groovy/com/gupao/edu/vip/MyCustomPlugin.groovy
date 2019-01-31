package com.gupao.edu.vip

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyCustomPlugin implements Plugin<Project>{
    @Override
    void apply(Project target) {
        /**调用 task('myTask',closure)方法，后面的{...}不是定义task()方法的方法体，而是 closure的实现*/
        target.task('myTask'){
           println 'my plugin is myTask'
       }
    }
}
