package Converter.dev;

/**
* EuroPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Euro.idl
* jeudi 29 d�cembre 2016 10 h 52 WET
*/

public abstract class EuroPOA extends org.omg.PortableServer.Servant
 implements EuroOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_Devise", new java.lang.Integer (0));
    _methods.put ("_set_Devise", new java.lang.Integer (1));
    _methods.put ("_get_Taux", new java.lang.Integer (2));
    _methods.put ("_set_Taux", new java.lang.Integer (3));
    _methods.put ("toEuro", new java.lang.Integer (4));
    _methods.put ("toDevise", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Euro/_get_Devise
       {
         String $result = null;
         $result = this.Devise ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // Euro/_set_Devise
       {
         String newDevise = in.read_string ();
         this.Devise (newDevise);
         out = $rh.createReply();
         break;
       }

       case 2:  // Euro/_get_Taux
       {
         float $result = (float)0;
         $result = this.Taux ();
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       case 3:  // Euro/_set_Taux
       {
         float newTaux = in.read_float ();
         this.Taux (newTaux);
         out = $rh.createReply();
         break;
       }

       case 4:  // Euro/toEuro
       {
         float devise = in.read_float ();
         float $result = (float)0;
         $result = this.toEuro (devise);
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       case 5:  // Euro/toDevise
       {
         float euro = in.read_float ();
         float $result = (float)0;
         $result = this.toDevise (euro);
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Euro:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Euro _this() 
  {
    return EuroHelper.narrow(
    super._this_object());
  }

  public Euro _this(org.omg.CORBA.ORB orb) 
  {
    return EuroHelper.narrow(
    super._this_object(orb));
  }


} // class EuroPOA
