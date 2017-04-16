function altRows(id){  
    if(document.getElementsByTagName){    
          
        var table = document.getElementById(id);    
        var rows = table.getElementsByTagName("tr");   
        rows[0].className = "evenrowcolor";
        for(i = 1; i < rows.length; i++){            
            if(i % 2 == 0){  
                rows[i].className = "evenrowcolor";  
            }else{  
                rows[i].className = "oddrowcolor";  
            }        
        }  
    }  
}  
  
window.onload=function(){  
    altRows('alternatecolor');  
} 
