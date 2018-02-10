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
import com.tools20022.repository.codeset.DeliveryType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes the delivery or custody arrangement for the underlying securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryType2Code#AgainstPayment
 * DeliveryType2Code.AgainstPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliveryType2Code#Free
 * DeliveryType2Code.Free}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeliveryType2Code#Triparty
 * DeliveryType2Code.Triparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryType2Code#HoldInCustody
 * DeliveryType2Code.HoldInCustody}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeV2Code
 * DeliveryTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"APMT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the delivery or custody arrangement for the underlying securities."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryType2Code
	 * DeliveryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstPayment"</li>
	 * </ul>
	 */
	public static final DeliveryType2Code AgainstPayment = new DeliveryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryType2Code.mmObject();
			codeName = DeliveryTypeV2Code.AgainstPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryType2Code
	 * DeliveryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Free"</li>
	 * </ul>
	 */
	public static final DeliveryType2Code Free = new DeliveryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Free";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryType2Code.mmObject();
			codeName = DeliveryTypeV2Code.Free.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryType2Code
	 * DeliveryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Triparty"</li>
	 * </ul>
	 */
	public static final DeliveryType2Code Triparty = new DeliveryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Triparty";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryType2Code.mmObject();
			codeName = DeliveryTypeV2Code.Triparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryType2Code
	 * DeliveryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldInCustody"</li>
	 * </ul>
	 */
	public static final DeliveryType2Code HoldInCustody = new DeliveryType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldInCustody";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryType2Code.mmObject();
			codeName = DeliveryTypeV2Code.HoldInCustody.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DeliveryType2Code> codesByName = new LinkedHashMap<>();

	protected DeliveryType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("APMT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryType2Code";
				definition = "Describes the delivery or custody arrangement for the underlying securities.";
				trace_lazy = () -> DeliveryTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryType2Code.AgainstPayment, com.tools20022.repository.codeset.DeliveryType2Code.Free, com.tools20022.repository.codeset.DeliveryType2Code.Triparty,
						com.tools20022.repository.codeset.DeliveryType2Code.HoldInCustody);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AgainstPayment.getCodeName().get(), AgainstPayment);
		codesByName.put(Free.getCodeName().get(), Free);
		codesByName.put(Triparty.getCodeName().get(), Triparty);
		codesByName.put(HoldInCustody.getCodeName().get(), HoldInCustody);
	}

	public static DeliveryType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryType2Code[] values() {
		DeliveryType2Code[] values = new DeliveryType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryType2Code> {
		@Override
		public DeliveryType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}