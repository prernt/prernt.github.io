var keylist = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";
var temp = '';

function generatePwd(plength){
    temp = '';
    for(let i=0;i<plength;i++)
    {   
      temp += keylist.charAt(Math.floor(Math.random()*keylist.length)) ;     
    }
    return temp;
}

function populateForm(len){
    
    document.passGen.output.value = generatePwd(len);
    
}