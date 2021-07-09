//package idgenerator;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//import java.util.Random;
//
///**
// * @Author 喻可
// * @Date 2021/7/2 18:36
// */
//public class IdGenerator4 {
//
//    public class RandomIdGenerator implements IdGenerator {
//        private static final Logger logger = LoggerFactory.getLogger(RandomIdGenerator.class);
//
//        @Override
//        public String generate() throws IdGenerationFailureException {
//            String substrOfHostName = null;
//            try {
//                substrOfHostName = getLastFieldOfHostName();
//            } catch (UnknownHostException e) {
//                throw new IdGenerationFailureException("...", e);
//            }
//            long currentTimeMillis = System.currentTimeMillis();
//            String randomString = generateRandomAlphameric(8);
//            String id = String.format("%s-%d-%s",
//                    substrOfHostName, currentTimeMillis, randomString);
//            return id;
//        }
//
//        private String getLastFieldOfHostName() throws UnknownHostException {
//            String substrOfHostName = null;
//            String hostName = InetAddress.getLocalHost().getHostName();
//            if (hostName == null || hostName.isEmpty()) {
//                throw new UnknownHostException("...");
//            }
//            substrOfHostName = getLastSubstrSplittedByDot(hostName);
//            return substrOfHostName;
//        }
//
//        protected String getLastSubstrSplittedByDot(String hostName) {
//            if (hostName == null || hostName.isEmpty()) {
//                throw new IllegalArgumentException("...");
//            }
//
//            String[] tokens = hostName.split("\\.");
//            String substrOfHostName = tokens[tokens.length - 1];
//            return substrOfHostName;
//        }
//
//        protected String generateRandomAlphameric(int length) {
//            if (length <= 0) {
//                throw new IllegalArgumentException("...");
//            }
//
//            char[] randomChars = new char[length];
//            int count = 0;
//            Random random = new Random();
//            while (count < length) {
//                int maxAscii = 'z';
//                int randomAscii = random.nextInt(maxAscii);
//                boolean isDigit = randomAscii >= '0' && randomAscii <= '9';
//                boolean isUppercase = randomAscii >= 'A' && randomAscii <= 'Z';
//                boolean isLowercase = randomAscii >= 'a' && randomAscii <= 'z';
//                if (isDigit || isUppercase || isLowercase) {
//                    randomChars[count] = (char) (randomAscii);
//                    ++count;
//                }
//            }
//            return new String(randomChars);
//        }
//    }
//}
