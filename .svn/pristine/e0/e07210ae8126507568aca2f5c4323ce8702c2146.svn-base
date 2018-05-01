function getStyle(obj,attr)
{
    if(obj.currentStyle)
    {
        return obj.currentStyle[attr];
    }
    else
    {
        return getComputedStyle(obj,false)[attr];
    }
}
function startMove(obj,json,fnend)
{    
    clearInterval(obj.timer);
    obj.timer=setInterval(function(){
        for(var attr in json){
		var bStop=true;//假设所有的值到了
		var iCur=0;
        if(attr=='opacity')
        {
          iCur=parseInt(parseFloat(getStyle(obj,attr))*100);
        }
        else
        {
          iCur=parseInt(getStyle(obj,attr));
        }
        var iSpeed=(json[attr]-iCur)/3;
        iSpeed=iSpeed>0?Math.ceil(iSpeed):Math.floor(iSpeed);
         if(iCur!=json[attr])
             bStop=false;
            if(attr=='opacity')
            {
              obj.style.filter='alpha(opacity:'+(iCur+iSpeed)+')';
              obj.style.opacity=(iCur+iSpeed)/100;
            }
            else
            {
            obj.style[attr]=iCur+iSpeed+'px';
            }
        }	
	   if(bStop){
            clearInterval(obj.timer);
			if(fnend){
				fnend()
				}
		   }
		}
	
		,30);
}// JavaScript Document// JavaScript Document