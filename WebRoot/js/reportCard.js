/**
 * 使用echarts.js生成学生成绩单图表
 */

 $(function(){
	$(".pap li").each(function(){
		$(this).click(function(){
			$.post("ExamController/getGradeList.action",{pid:$(this).children("input").val()},function(data){
				$(".paName").text(data[0].paName);
				if(data==""){
					alert("你还没登录")
				}else{
					var len = data.length;
					if(len>="3"){
						one_data_k = data[0].kGrade;
						one_data_z = data[0].zGrade;
						one_data_f = data[0].fGrade;
						
						two_data_k = data[1].kGrade;
						two_data_z = data[1].zGrade;
						two_data_f = data[1].fGrade;
						
						thr_data_k = data[2].kGrade;
						thr_data_z = data[2].zGrade;
						thr_data_f = data[2].fGrade;
					}else if(len =="2"){
						one_data_k = data[0].kGrade;
						one_data_z = data[0].zGrade;
						one_data_f = data[0].fGrade;
						
						two_data_k = data[1].kGrade;
						two_data_z = data[1].zGrade;
						two_data_f = data[1].fGrade;
						
						thr_data_k = "";
						thr_data_z = "";
						thr_data_f = "";
					}else if(len == "1"){
						one_data_k = data[0].kGrade;
						one_data_z = data[0].zGrade;
						one_data_f = data[0].fGrade;
						
						two_data_k = "";
						two_data_z = "";
						two_data_f = "";
						
						thr_data_k = "";
						thr_data_z = "";
						thr_data_f = "";
					}
					
					/*====================================*/
					var myChart = echarts.init(document.getElementById("main"));
					option = {
					    tooltip : {
					        trigger: 'axis',
					        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
					        }
					    },
					    legend: {
					        data:['上上次测试','上次测试','这次测试']
					    },
					    toolbox: {
					        show : true,
					        orient: 'vertical',
					        x: 'right',
					        y: 'center',
					        feature : {
					            mark : {show: true},
					            magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
					            restore : {show: true},
					            saveAsImage : {show: true}
					        }
					    },
					    calculable : true,
					    xAxis : [
					        {
					            type : 'category',
					            data : ['主观题','客观题','总分数']
					        }
					    ],
					    yAxis : [
					        {
					            type : 'value'
					        }
					    ],
					    series : [
					        {
					            name:'上上次测试',
					            type:'bar',
					            data:[one_data_k, one_data_z, one_data_f]
					        },
					        {
					            name:'上次测试',
					            type:'bar',
					            data:[two_data_k, two_data_z, two_data_f]
					        },
					        {
					            name:'这次测试',
					            type:'bar',
					            data:[thr_data_k, thr_data_z, thr_data_f],
					        },
					   ]
				    };
					/*=====================================*/
					myChart.setOption(option);
					$("#tishi").show();//显示提示信息
				}
			})
		})
	}) 
 });
