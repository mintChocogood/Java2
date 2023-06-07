package pa.pb;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class UserResource3 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		log.trace("close() 실행됨.");
	}
}
