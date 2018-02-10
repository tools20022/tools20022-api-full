/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TransactionChannel5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of the communication channels used by the cardholder to
 * the acceptor system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#MailOrder
 * TransactionChannel5Code.MailOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#TelephoneOrder
 * TransactionChannel5Code.TelephoneOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#ElectronicCommerce
 * TransactionChannel5Code.ElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#TelevisionPayment
 * TransactionChannel5Code.TelevisionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#SecuredElectronicCommerce
 * TransactionChannel5Code.SecuredElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#MobilePayment
 * TransactionChannel5Code.MobilePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#MobilePOS
 * TransactionChannel5Code.MobilePOS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
 * TransactionChannelCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionChannel5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
 * TransactionChannel3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionChannel5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code
	 * TransactionChannel5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#MailOrder
	 * TransactionChannel3Code.MailOrder}</li>
	 * </ul>
	 */
	public static final TransactionChannel5Code MailOrder = new TransactionChannel5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailOrder";
			previousVersion_lazy = () -> TransactionChannel3Code.MailOrder;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel5Code.mmObject();
			codeName = TransactionChannelCode.MailOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code
	 * TransactionChannel5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelephoneOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#TelephoneOrder
	 * TransactionChannel3Code.TelephoneOrder}</li>
	 * </ul>
	 */
	public static final TransactionChannel5Code TelephoneOrder = new TransactionChannel5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelephoneOrder";
			previousVersion_lazy = () -> TransactionChannel3Code.TelephoneOrder;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel5Code.mmObject();
			codeName = TransactionChannelCode.TelephoneOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code
	 * TransactionChannel5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#ElectronicCommerce
	 * TransactionChannel3Code.ElectronicCommerce}</li>
	 * </ul>
	 */
	public static final TransactionChannel5Code ElectronicCommerce = new TransactionChannel5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicCommerce";
			previousVersion_lazy = () -> TransactionChannel3Code.ElectronicCommerce;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel5Code.mmObject();
			codeName = TransactionChannelCode.ElectronicCommerce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code
	 * TransactionChannel5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelevisionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#TelevisionPayment
	 * TransactionChannel3Code.TelevisionPayment}</li>
	 * </ul>
	 */
	public static final TransactionChannel5Code TelevisionPayment = new TransactionChannel5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelevisionPayment";
			previousVersion_lazy = () -> TransactionChannel3Code.TelevisionPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel5Code.mmObject();
			codeName = TransactionChannelCode.TelevisionPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code
	 * TransactionChannel5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#SecuredElectronicCommerce
	 * TransactionChannel3Code.SecuredElectronicCommerce}</li>
	 * </ul>
	 */
	public static final TransactionChannel5Code SecuredElectronicCommerce = new TransactionChannel5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredElectronicCommerce";
			previousVersion_lazy = () -> TransactionChannel3Code.SecuredElectronicCommerce;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel5Code.mmObject();
			codeName = TransactionChannelCode.SecuredElectronicCommerce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code
	 * TransactionChannel5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#MobilePayment
	 * TransactionChannel3Code.MobilePayment}</li>
	 * </ul>
	 */
	public static final TransactionChannel5Code MobilePayment = new TransactionChannel5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePayment";
			previousVersion_lazy = () -> TransactionChannel3Code.MobilePayment;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel5Code.mmObject();
			codeName = TransactionChannelCode.MobilePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code
	 * TransactionChannel5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePOS"</li>
	 * </ul>
	 */
	public static final TransactionChannel5Code MobilePOS = new TransactionChannel5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePOS";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel5Code.mmObject();
			codeName = TransactionChannelCode.MobilePOS.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionChannel5Code> codesByName = new LinkedHashMap<>();

	protected TransactionChannel5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionChannel5Code";
				definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
				previousVersion_lazy = () -> TransactionChannel3Code.mmObject();
				trace_lazy = () -> TransactionChannelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel5Code.MailOrder, com.tools20022.repository.codeset.TransactionChannel5Code.TelephoneOrder,
						com.tools20022.repository.codeset.TransactionChannel5Code.ElectronicCommerce, com.tools20022.repository.codeset.TransactionChannel5Code.TelevisionPayment,
						com.tools20022.repository.codeset.TransactionChannel5Code.SecuredElectronicCommerce, com.tools20022.repository.codeset.TransactionChannel5Code.MobilePayment,
						com.tools20022.repository.codeset.TransactionChannel5Code.MobilePOS);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MailOrder.getCodeName().get(), MailOrder);
		codesByName.put(TelephoneOrder.getCodeName().get(), TelephoneOrder);
		codesByName.put(ElectronicCommerce.getCodeName().get(), ElectronicCommerce);
		codesByName.put(TelevisionPayment.getCodeName().get(), TelevisionPayment);
		codesByName.put(SecuredElectronicCommerce.getCodeName().get(), SecuredElectronicCommerce);
		codesByName.put(MobilePayment.getCodeName().get(), MobilePayment);
		codesByName.put(MobilePOS.getCodeName().get(), MobilePOS);
	}

	public static TransactionChannel5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionChannel5Code[] values() {
		TransactionChannel5Code[] values = new TransactionChannel5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionChannel5Code> {
		@Override
		public TransactionChannel5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionChannel5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}