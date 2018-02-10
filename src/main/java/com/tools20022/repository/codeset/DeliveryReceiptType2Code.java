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
import com.tools20022.repository.codeset.DeliveryReceiptType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies how the transaction is to be settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code#SeparateSettlement
 * DeliveryReceiptType2Code.SeparateSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code#AgainstPaymentSettlement
 * DeliveryReceiptType2Code.AgainstPaymentSettlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptTypeCode
 * DeliveryReceiptTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FREE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryReceiptType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies how the transaction is to be settled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryReceiptType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeparateSettlement"</li>
	 * </ul>
	 */
	public static final DeliveryReceiptType2Code SeparateSettlement = new DeliveryReceiptType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeparateSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReceiptType2Code.mmObject();
			codeName = DeliveryReceiptTypeCode.SeparateSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstPaymentSettlement"</li>
	 * </ul>
	 */
	public static final DeliveryReceiptType2Code AgainstPaymentSettlement = new DeliveryReceiptType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstPaymentSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReceiptType2Code.mmObject();
			codeName = DeliveryReceiptTypeCode.AgainstPaymentSettlement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DeliveryReceiptType2Code> codesByName = new LinkedHashMap<>();

	protected DeliveryReceiptType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FREE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryReceiptType2Code";
				definition = "Specifies how the transaction is to be settled.";
				trace_lazy = () -> DeliveryReceiptTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryReceiptType2Code.SeparateSettlement, com.tools20022.repository.codeset.DeliveryReceiptType2Code.AgainstPaymentSettlement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SeparateSettlement.getCodeName().get(), SeparateSettlement);
		codesByName.put(AgainstPaymentSettlement.getCodeName().get(), AgainstPaymentSettlement);
	}

	public static DeliveryReceiptType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryReceiptType2Code[] values() {
		DeliveryReceiptType2Code[] values = new DeliveryReceiptType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryReceiptType2Code> {
		@Override
		public DeliveryReceiptType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryReceiptType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}