class Solution {
    public boolean canAliceWin(int n) {
        // aloce agar 10 hata ya toh
        // bob 9 ghatayega
        // jo bhi wo move nhi kr payega ow jit jayega 
        // agar alice jita th true 
        // agar bob jita oth false;
int remove=10;


while(n>=remove){
    n=n-remove;
    remove=remove-1;

    if(n<remove){
        return true;
    }
    n=n-remove;
    remove=remove-1;
}
return false;
    }
}