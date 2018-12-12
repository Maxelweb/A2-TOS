////////////////////////////////////////////////////////////////////
// [Mariano] [Sciacco] [1142498]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.business.exception;

public class RestaurantBillException extends Throwable {

    private String error;

    public String getError() {
        return error;
    }
    
    public RestaurantBillException(String e) {
        this.error = e;
    }
	
}
