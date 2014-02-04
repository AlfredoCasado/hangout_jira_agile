function init() {
  gapi.hangout.onApiReady.add(function(eventObj) {
    if (eventObj.isApiReady) {
          main()
    }
  });
}

gadgets.util.registerOnLoadHandler(init);

function main() {
 
 test_remote_call_with_google_widgets_api();

}

function test_remote_call_with_google_widgets_api() {

  gadgets.io.makeRequest("https://79.155.158.26:8080/api/hello-world",function(response) {
    console.log("api response:" + response.text)  
  });

}