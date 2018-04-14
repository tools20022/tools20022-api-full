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
import com.tools20022.repository.codeset.TransactionChannel3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#MailOrder
 * TransactionChannel3Code.MailOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#TelephoneOrder
 * TransactionChannel3Code.TelephoneOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#ElectronicCommerce
 * TransactionChannel3Code.ElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#TelevisionPayment
 * TransactionChannel3Code.TelevisionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#SecuredElectronicCommerce
 * TransactionChannel3Code.SecuredElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#MobilePayment
 * TransactionChannel3Code.MobilePayment}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionChannel3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TransactionChannel5Code
 * TransactionChannel5Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
 * TransactionChannel1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionChannel3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#MailOrder
	 * TransactionChannel5Code.MailOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#MailOrder
	 * TransactionChannel1Code.MailOrder}</li>
	 * </ul>
	 */
	public static final TransactionChannel3Code MailOrder = new TransactionChannel3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailOrder";
			nextVersions_lazy = () -> Arrays.asList(TransactionChannel5Code.MailOrder);
			previousVersion_lazy = () -> TransactionChannel1Code.MailOrder;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel3Code.mmObject();
			codeName = TransactionChannelCode.MailOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelephoneOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#TelephoneOrder
	 * TransactionChannel5Code.TelephoneOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#TelephoneOrder
	 * TransactionChannel1Code.TelephoneOrder}</li>
	 * </ul>
	 */
	public static final TransactionChannel3Code TelephoneOrder = new TransactionChannel3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelephoneOrder";
			nextVersions_lazy = () -> Arrays.asList(TransactionChannel5Code.TelephoneOrder);
			previousVersion_lazy = () -> TransactionChannel1Code.TelephoneOrder;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel3Code.mmObject();
			codeName = TransactionChannelCode.TelephoneOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#ElectronicCommerce
	 * TransactionChannel5Code.ElectronicCommerce}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#ElectronicCommerce
	 * TransactionChannel1Code.ElectronicCommerce}</li>
	 * </ul>
	 */
	public static final TransactionChannel3Code ElectronicCommerce = new TransactionChannel3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicCommerce";
			nextVersions_lazy = () -> Arrays.asList(TransactionChannel5Code.ElectronicCommerce);
			previousVersion_lazy = () -> TransactionChannel1Code.ElectronicCommerce;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel3Code.mmObject();
			codeName = TransactionChannelCode.ElectronicCommerce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelevisionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#TelevisionPayment
	 * TransactionChannel5Code.TelevisionPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#TelevisionPayment
	 * TransactionChannel1Code.TelevisionPayment}</li>
	 * </ul>
	 */
	public static final TransactionChannel3Code TelevisionPayment = new TransactionChannel3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelevisionPayment";
			nextVersions_lazy = () -> Arrays.asList(TransactionChannel5Code.TelevisionPayment);
			previousVersion_lazy = () -> TransactionChannel1Code.TelevisionPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel3Code.mmObject();
			codeName = TransactionChannelCode.TelevisionPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#SecuredElectronicCommerce
	 * TransactionChannel5Code.SecuredElectronicCommerce}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TransactionChannel3Code SecuredElectronicCommerce = new TransactionChannel3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredElectronicCommerce";
			nextVersions_lazy = () -> Arrays.asList(TransactionChannel5Code.SecuredElectronicCommerce);
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel3Code.mmObject();
			codeName = TransactionChannelCode.SecuredElectronicCommerce.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#MobilePayment
	 * TransactionChannel5Code.MobilePayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TransactionChannel3Code MobilePayment = new TransactionChannel3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePayment";
			nextVersions_lazy = () -> Arrays.asList(TransactionChannel5Code.MobilePayment);
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel3Code.mmObject();
			codeName = TransactionChannelCode.MobilePayment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionChannel3Code> codesByName = new LinkedHashMap<>();

	protected TransactionChannel3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionChannel3Code";
				definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
				nextVersions_lazy = () -> Arrays.asList(TransactionChannel5Code.mmObject());
				previousVersion_lazy = () -> TransactionChannel1Code.mmObject();
				trace_lazy = () -> TransactionChannelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel3Code.MailOrder, com.tools20022.repository.codeset.TransactionChannel3Code.TelephoneOrder,
						com.tools20022.repository.codeset.TransactionChannel3Code.ElectronicCommerce, com.tools20022.repository.codeset.TransactionChannel3Code.TelevisionPayment,
						com.tools20022.repository.codeset.TransactionChannel3Code.SecuredElectronicCommerce, com.tools20022.repository.codeset.TransactionChannel3Code.MobilePayment);
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
	}

	public static TransactionChannel3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionChannel3Code[] values() {
		TransactionChannel3Code[] values = new TransactionChannel3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionChannel3Code> {
		@Override
		public TransactionChannel3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionChannel3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}