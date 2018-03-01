function pages(url,headRow,circleRow,cols){
		var curpage=1;//当前页码
		var totpages;//总页数
		initData(url+curpage,headRow,circleRow,curpage,cols);
		//首页
		$("#firstPage").click(function(){
			curpage=1;
			initData(url+curpage,headRow,circleRow,curpage,cols);
		});
		//末页
		$("#lastPage").click(function(){
			curpage=totpages;
			initData(url+curpage,headRow,circleRow,curpage,cols);
		});
		//上一页
		$("#prevPage").click(function(){
			curpage=curpage-1;
			initData(url+curpage,headRow,circleRow,curpage,cols);
		});
		//下一页
		$("#nextPage").click(function(){
			curpage=curpage+1;
			initData(url+curpage,headRow,circleRow,curpage,cols);
		});
}
		function initData(url,headRow,circleRow,curp,cols){
			$.getJSON(url,null,function(data){
				curpage=data.page.currentPageNo;
				totpages=data.page.totalPageCount;
				$("#curp").html(curpage);
				$("#totp").html(data.page.totalPageCount);
				$.each(data.list,function(i,da){
					circleRow+="<tr>";
					circleRow+="<td>"+da.userName+"</td>";
					circleRow+="<td>"+da.name+"</td>";
					circleRow+="<td>"+da.passWord+"</td>";
					circleRow+="<td>"+da.phone+"</td>";
					circleRow+="<td><a href=\"user/preUpdate?id="+da.id+"\">修改</a><a href=\"user/delete?id="+da.id+"\">删除</a>";
					circleRow+="</td>";
					circleRow+="</tr>";
				});
				
				$("tbody").html("");
				$("tbody").html(headRow+circleRow);
				
				if(curpage<=1){
					$("#prevPage").hide();
					//$("#nextPage").show();
				}else{
					$("#prevPage").show();
				}
				if(curpage>=totpages){
					$("#nextPage").hide();
					//$("#prevPage").show();
				}else{
					$("#nextPage").show();
				}
			});
		}