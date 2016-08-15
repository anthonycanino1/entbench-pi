package org.apache.batik.svggen.font.table;
public abstract class LookupSubtable {
    public LookupSubtable() { super(); }
    public static final java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1471109864000L;
    public static final java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL1XX2wcxRmfu7Md27F9thPbaUhMYhwkh3BLVNIWOW1JjN1c" +
                                                              "ONunGCJxgVzmdufuNt7b2czO2mdTWqhUkb6gqA2QVsJPRkioBYRA7UNBrpCA" +
                                                              "irYSNGpLq6Z9pGqjElWiD+m/b2b2bv+cDW896ebmZr75/s/v++aH11G7y9Ao" +
                                                              "sXmGrzjEzUzbPI+ZS4wpC7vuA7BW1J9N4X+c/WjuniTqKKC+KnZndeySGZNY" +
                                                              "hltAe03b5djWiTtHiCFO5BlxCVvC3KR2AQ2ZbrbmWKZu8llqEEFwGrMcGsCc" +
                                                              "M7PkcZL1GXC0NweaaFIT7Vh8ezKHenTqrATku0LkU6EdQVkLZLkc9efO4yWs" +
                                                              "edy0tJzp8sk6Q3c41FqpWJRnSJ1nzltHfBeczB1pccHYK+lPbl6q9ksX7MC2" +
                                                              "Tbk0zz1FXGotESOH0sHqtEVq7gX0DZTKoe0hYo7Gcw2hGgjVQGjD2oAKtO8l" +
                                                              "tlebotIc3uDU4ehCIY72R5k4mOGazyYvdQYOndy3XR4Ga/c1rVVWtpj49B3a" +
                                                              "5WfP9r+aQukCSpv2glBHByU4CCmAQ0mtRJh7zDCIUUADNgR7gTATW+aqH+lB" +
                                                              "16zYmHsQ/oZbxKLnECZlBr6COIJtzNM5ZU3zyjKh/H/tZQtXwNbhwFZl4YxY" +
                                                              "BwO7TVCMlTHknX+kbdG0DY5ujZ9o2jh+PxDA0W01wqu0KarNxrCABlWKWNiu" +
                                                              "aAuQenYFSNspJCDjaPeWTIWvHawv4gopioyM0eXVFlB1SUeIIxwNxckkJ4jS" +
                                                              "7liUQvG5Pnf0qUftE3YSJUBng+iW0H87HBqNHTpFyoQRuAfqYM/B3DN4+I2L" +
                                                              "SYSAeChGrGh+/PUb9x4a3XhX0dyyCc186TzReVFfL/W9v2dq4p6UUKPToa4p" +
                                                              "gh+xXN6yvL8zWXcAYYabHMVmprG5certhx5/kfw1ibqzqEOnlleDPBrQac0x" +
                                                              "LcK+RmzCMCdGFnUR25iS+1m0DeY50yZqdb5cdgnPojZLLnVQ+R9cVAYWwkXd" +
                                                              "MDftMm3MHcyrcl53EEL98EVD8N2N1Ef+cmRoVVojGtaxbdpUyzMq7Hc1QJwS" +
                                                              "+LaqlSDrFzWXegxSUKOsomHIgyppbCxVKsTWylQgFC5ZRMtRuug5C15J/s2I" +
                                                              "bHP+T3Lqwt4dy4kEhGJPHAgsuEMnqGUQVtQve8enb7xUfE8lmbgYvqc4Ogyi" +
                                                              "M0p0RorOKNEZITqjZEVFo0RCStwpVFCBh7AtAgAAAvdMLDxy8tzFsRRknLPc" +
                                                              "Bj4XpGORSjQVoEQD2ov6y4O9q/uvHX4ridpyaBDr3MOWKCzHWAUgS1/0b3VP" +
                                                              "CWpUUCr2hUqFqHGM6sQApNqqZPhcOukSYWKdo50hDo1CJq6stnUZ2VR/tHFl" +
                                                              "+YnT37wriZLR6iBEtgOwieN5gelN7B6Po8JmfNNPfvTJy888RgN8iJSbRpVs" +
                                                              "OSlsGIvnRNw9Rf3gPvx68Y3HxqXbuwC/OYb7BtA4GpcRgZ/JBpQLWzrB4DJl" +
                                                              "NWyJrYaPu3mV0eVgRSbrgBiGVN6KFIopKKvAlxec5373q798XnqyUTDSoUq/" +
                                                              "QPhkCKQEs0EJRwNBRj7ACAG6P17Jf+/p60+ekekIFLdtJnBcjFMAThAd8OC3" +
                                                              "373w4Z+urV9NBinMoUp7JWh26tKWnf+FTwK+/xFfASxiQQHM4JSPcvuaMOcI" +
                                                              "ybcHugHgWQAGIjnGH7QhDc2yKS6WuD//Sh84/PrfnupX4bZgpZEthz6bQbD+" +
                                                              "uePo8ffO/nNUsknoouAG/gvIFIrvCDgfYwyvCD3qT3yw9/vv4OegHgAGu+Yq" +
                                                              "kbCKpD+QDOAR6Yu75Hh3bO+LYjjghnM8eo1CjVFRv3T1497TH795Q2ob7azC" +
                                                              "cZ/FzqTKIhUFEHYA+UME5sXusCPGkTroMBIHqhPYrQKzuzfmHu63Nm6C2AKI" +
                                                              "1QGI3XkGgFmPpJJP3b7t9z97a/jc+ymUnEHdFsXGDJYXDnVBphO3Clhbd756" +
                                                              "r9JjubNRhOqoxUMtCyIKt24e3+maw2VEVn8y8trRF9auybR0FI9bwgxvl+OE" +
                                                              "GA7J9aSY3slRJy4BOoCy9abf5Cf9KX6Lsmdo71YdjOy+1r91ec2Yf/6w6jMG" +
                                                              "o13BNDS9P/rNv3+RufLnn29SgLo4de60yBKxIjI56ouWHeGjXS3drurQ9JfW" +
                                                              "0p0jaw/+VsJYs4vqAZQoe5bVlBeWLTpvRsqmzKgelVeO/MlzNPbZVZGjdvkr" +
                                                              "tZ5XJxc42vNpJzm0L9Rv/f0jpzka2eIIoI6ahOkfgldPnB5Ukb9huoc56g7o" +
                                                              "gJWahEmgsU0BiZiec+TGLmAu01C0yxnVG9YTran2JQXjcn50y5QPpc9tERiQ" +
                                                              "Txs/hLOeetxAB7B2cu7RG194XuE+PIpWV2UrDJ29qi7Nwrl/S24NXh0nJm72" +
                                                              "vdJ1IOnjUaTuhHUT8+OA8BKjd8eA0B1v4uGH60ff/OXFjg8ggc+gBOZox5nQ" +
                                                              "w0J5CtDUg5tyJhd0O6GnsUToyYkfrHzlUPnvf5C32O+O9mxNX9SvvvDIr7+7" +
                                                              "ax2QfHsWtcNdI/UCvJLc+1bsU0RfYgXUa7rTdVARuMCzLYs6Pdu84JEsPMj6" +
                                                              "xE3A4tEj/eK7s7e5KhoCSPaW180mbRQg3jJhx6lnG4JNLwB1sBJ5c/m3q9tz" +
                                                              "nNiBYKUZyp2tthf1+76T/umlwdQM3OaIOWH221yvJKh93sEzTC7IuPaLIVNX" +
                                                              "dTlVzM06TqNObx9xVMYzRSPWOUoc9FcFNidU6Rd/PclOVmJPDMv/A+uj0rxh" +
                                                              "EQAA");
    public static final java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    public static final long jlc$SourceLastModified$jl5 =
      1471109864000L;
    public static final java.lang.String jlc$ClassType$jl5 =
      ("H4sIAAAAAAAAAL1Ze8zk1lX3ftndbLZJdrNpHixpnhtg6/J53p7RFojHM2OP" +
       "x2N7PGPPg9Kt3/aM348Zz5SUtgISUSlEIilBavNXKlCVNhWiAgkVBSGgqBFS" +
       "UcVLoqkQEkUlUvMHBRGgXHu+9+4mqpCY0djX955z7jnnnvPzuXdefQs6E4UQ" +
       "7Hv22rC9eFdL4925Xd2N174W7VJ0lZPCSFNxW4qiEei7rjz+lQs/eOd58+IO" +
       "dHYG3Su5rhdLseW5Ea9Fnr3UVBq6cNjbtjUniqGL9FxaSkgSWzZCW1F8jYbe" +
       "d4Q1hq7Q+yogQAUEqIDkKiDYIRVguktzEwfPOCQ3jgLoE9ApGjrrK5l6MfTY" +
       "cSG+FErOnhgutwBIOJc9i8ConDkNoUcPbN/afIPBL8LIC7/50Yu/ext0YQZd" +
       "sNxhpo4ClIjBJDPoTkdzZC2MMFXV1Bl0j6tp6lALLcm2NrneM+hSZBmuFCeh" +
       "duCkrDPxtTCf89BzdyqZbWGixF54YJ5uaba6/3RGtyUD2Hr/oa1bCztZPzDw" +
       "vAUUC3VJ0fZZTi8sV42hR05yHNh4pQcIAOvtjhab3sFUp10JdECXtmtnS66B" +
       "DOPQcg1AesZLwCwxdPmWQjNf+5KykAztegw9eJKO2w4BqjtyR2QsMXTfSbJc" +
       "ElilyydW6cj6vMV8+LmPu6S7k+usaoqd6X8OMD18gonXdC3UXEXbMt75Qfqz" +
       "0v1fe3YHggDxfSeItzS//4tvP/Whh1//+pbmx29Cw8pzTYmvK6/Id3/zIfxq" +
       "47ZMjXO+F1nZ4h+zPA9/bm/kWuqDzLv/QGI2uLs/+Dr/Z9NPflH73g50vgud" +
       "VTw7cUAc3aN4jm/ZWkhorhZKsaZ2oTs0V8Xz8S50O2jTlqtte1ldj7S4C522" +
       "866zXv4MXKQDEZmLbgdty9W9/bYvxWbeTn0Igi6CH3Qf+F2Gtp/8HkMqYnqO" +
       "hkiK5Fquh3Chl9kfIZoby8C3JiKDqF8gkZeEIAQRLzQQCcSBqe0PLA1DcxEd" +
       "+AaJJdnWENrzFok/TOT8cTeLNv//aZ40s/fi6tQpsBQPnQQCG+QQ6dmqFl5X" +
       "Xkia7be/fP0bOweJseepGCqCqXe3U+/mU+9up97Npt7dznV8aujUqXzG92cq" +
       "bBceLNsCAACAxjuvDn+B+tizj98GIs5fnQY+z0iRWyM0fggZ3RwYFRC30Osv" +
       "rT4l/lJhB9o5DrWZ2qDrfMbOZQB5AIRXTqbYzeReeOa7P3jts097h8l2DLv3" +
       "MOBGziyHHz/p4NBTNBWg4qH4Dz4qffX6156+sgOdBsAAwDCWQPACnHn45BzH" +
       "cvnaPi5mtpwBBute6Eh2NrQPZudjM/RWhz35yt+dt+8BPn4S2rsci/Zs9F4/" +
       "u75/GynZop2wIsfdnxn6n//bv/yXcu7ufYi+cOSlN9Tia0dgIRN2IQeAew5j" +
       "YBRqGqD7h5e433jxrWd+Pg8AQPHEzSa8kl1xAAdgCYGbf+Xrwd+9+e1XvrVz" +
       "GDQxeC8msm0p6dbIH4LPKfD7n+yXGZd1bFP6Er6HK48eAIufzfwTh7oBiLFB" +
       "+mURdEVwHU+1dCsL5Sxi/+vCk8Wv/utzF7cxYYOe/ZD60HsLOOz/sSb0yW98" +
       "9N8fzsWcUrJX3KH/Dsm2uHnvoWQsDKV1pkf6qb/6wG/9ufR5gMAA9SJro+VA" +
       "BuX+gPIFLOS+gPMrcmKslF0eiY4mwvFcO1KKXFee/9b37xK//0dv59oer2WO" +
       "rntf8q9tQy27PJoC8Q+czHpSikxAV3md+chF+/V3gMQZkKgAVIvYEKBPeixK" +
       "9qjP3P73f/wn93/sm7dBOx3ovO1JakfKEw66A0S6FpkAuFL/557aRvPq3D6i" +
       "p9ANxm8D5MH86Tag4NVbY00nK0UO0/XB/2Rt+dP/+B83OCFHmZu8gU/wz5BX" +
       "P3cZ/9nv5fyH6Z5xP5zeiMigbDvkLX3R+bedx8/+6Q50+wy6qOzVhKJkJ1kS" +
       "zUAdFO0XiqBuPDZ+vKbZvsCvHcDZQyeh5si0J4Hm8E0A2hl11j5/uOBX01Mg" +
       "Ec+UdtHdQvb8VM74WH69kl1+cuv1rPlTIGOjvLYEHLrlSnYu52oMIsZWruzn" +
       "qAhqTeDiK3MbzcXcB6rrPDoyY3a3BdoWq7JreatF3q7dMhqu7esKVv/uQ2G0" +
       "B2q9z/zT82/8+hNvgiWioDPLzH1gZY7MyCRZ+furr774gfe98J3P5AAE0Ef8" +
       "5XcuP5VJ7b2bxdmllV3a+6Zezkwd5u90Worifo4Tmppb+66RyYWWA6B1uVfb" +
       "IU9fenPxue9+aVu3nQzDE8Tasy/82g93n3th50i1/MQNBetRnm3FnCt9156H" +
       "Q+ixd5sl5+j882tP/+HvPP3MVqtLx2u/NtjafOmv//uN3Ze+8xc3KTNO297/" +
       "YWHj82+QlaiL7X/o4mRSWikp7+gJ2ldLaKcRm5wsCWZ/aq4WZrlJi0x3zI6L" +
       "1JwpKiyTuAROpYa4cdRET5gYlUvKhi056mgcmMJCrhkBVhqIEcXxC8trTnkM" +
       "FZhm6OOYFU6HDOHTQW3W8Ilg3rbHVgt2ELkEvktYaY3rjZomO7MQrSIRsoRh" +
       "iSwWCXTdwLxo4hDhZt7eCBuZ68KzYWXl4+gywdAm0KzBVCawgozniWuNgl4P" +
       "h3vuzFW19ZCYMVPTjjGtUJar6nxsjWLSwjtstWmnuLjEyz2+hA1KMzmUnXFv" +
       "ltRtO2i3Oysi7CtEhCt9lFsoM7pITPACs9IkqdMdoaJZ1zY9UnNHQYiNFkmB" +
       "Xgi1tjoQF/SMXigNTWcr6zHYPK4LMbXx69GiNigrlWIn8McU7w6poruxY1Jv" +
       "asqmWfQVhZz2YJuT7VrQWEQTtI+XRvKisNkUOxPCi9tDlixEZBC3xQA1JoXW" +
       "bNTztII59VBCWZVMwpiLA2LeKnlYL2brdmxrshd3lXLSEiqaiXenaImvLioO" +
       "S0ib9XSpDqasq67LE75CSIhSDEVxHPvzSqNZlqpjnWuEsDRIFvjQX5YMu0k2" +
       "10IFxx1sUHBinjLRTQvvCgLWYgweNUbYaAxLAQnbzWJtM3XIaIB4Mznt0W4b" +
       "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");
}