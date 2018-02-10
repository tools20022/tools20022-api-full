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
import com.tools20022.repository.codeset.ReceiveDelivery1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the settlement transaction is a delivery or receipt.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code#Delivery
 * ReceiveDelivery1Code.Delivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code#Receive
 * ReceiveDelivery1Code.Receive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReceiveDeliveryCode
 * ReceiveDeliveryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DELI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReceiveDelivery1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the settlement transaction is a delivery or receipt."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReceiveDelivery1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code
	 * ReceiveDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * </ul>
	 */
	public static final ReceiveDelivery1Code Delivery = new ReceiveDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delivery";
			owner_lazy = () -> com.tools20022.repository.codeset.ReceiveDelivery1Code.mmObject();
			codeName = ReceiveDeliveryCode.Delivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code
	 * ReceiveDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Receive"</li>
	 * </ul>
	 */
	public static final ReceiveDelivery1Code Receive = new ReceiveDelivery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Receive";
			owner_lazy = () -> com.tools20022.repository.codeset.ReceiveDelivery1Code.mmObject();
			codeName = ReceiveDeliveryCode.Receive.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReceiveDelivery1Code> codesByName = new LinkedHashMap<>();

	protected ReceiveDelivery1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DELI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceiveDelivery1Code";
				definition = "Specifies whether the settlement transaction is a delivery or receipt.";
				trace_lazy = () -> ReceiveDeliveryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReceiveDelivery1Code.Delivery, com.tools20022.repository.codeset.ReceiveDelivery1Code.Receive);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Delivery.getCodeName().get(), Delivery);
		codesByName.put(Receive.getCodeName().get(), Receive);
	}

	public static ReceiveDelivery1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReceiveDelivery1Code[] values() {
		ReceiveDelivery1Code[] values = new ReceiveDelivery1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReceiveDelivery1Code> {
		@Override
		public ReceiveDelivery1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReceiveDelivery1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}