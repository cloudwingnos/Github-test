package test;

public class getUrlImg {



/**
	 * 获取网络上的图片
	 * @param URLName 地址
	 * @throws Exception
	 */
	public getUrlImg(String URLName) throws Exception {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		int HttpResult = 0; //服务器返回的状态
		URL url = new URL(URLName); //创建URL
		URLConnection urlconn = url.openConnection(); // 试图连接并取得返回状态码urlconn.connect();
		HttpURLConnection httpconn = (HttpURLConnection) urlconn;
		HttpResult = httpconn.getResponseCode();
		System.out.println(HttpResult);
		if (HttpResult != HttpURLConnection.HTTP_OK){  //不等于HTTP_OK说明连接不成功
			System.out.print("连接失败！");
		}else {
			int filesize = urlconn.getContentLength();  //取数据长度
			System.out.println(filesize); 
			BufferedInputStream bis=new BufferedInputStream(urlconn.getInputStream()); 
			BufferedOutputStream bos=new BufferedOutputStream(os);
			byte[] buffer = new byte[1024]; //创建存放输入流的缓冲
			int num = -1; //读入的字节数
			while (true) {
				num = bis.read(buffer); // 读入到缓冲区
				if (num ==-1){
					bos.flush();
					break; //已经读完
				}
				bos.flush();
				bos.write(buffer,0,num);
			}
			bos.close();
			bis.close();
	  }
	  ByteArrayInputStream bis = new ByteArrayInputStream(os.toByteArray());
	  return bis;
	}
}