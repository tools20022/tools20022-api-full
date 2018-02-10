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
import com.tools20022.repository.codeset.DeliveryPlace1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies where the attendance card should be delivered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryPlace1Code#Employer
 * DeliveryPlace1Code.Employer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryPlace1Code#Individual
 * DeliveryPlace1Code.Individual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryPlace1Code#EntranceOfMeeting
 * DeliveryPlace1Code.EntranceOfMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryPlace1Code#OtherAddress
 * DeliveryPlace1Code.OtherAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DeliveryPlaceCode
 * DeliveryPlaceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EMPL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryPlace1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies where the attendance card should be delivered."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryPlace1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlace1Code
	 * DeliveryPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Employer"</li>
	 * </ul>
	 */
	public static final DeliveryPlace1Code Employer = new DeliveryPlace1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Employer";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryPlace1Code.mmObject();
			codeName = DeliveryPlaceCode.Employer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlace1Code
	 * DeliveryPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Individual"</li>
	 * </ul>
	 */
	public static final DeliveryPlace1Code Individual = new DeliveryPlace1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Individual";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryPlace1Code.mmObject();
			codeName = DeliveryPlaceCode.Individual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlace1Code
	 * DeliveryPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntranceOfMeeting"</li>
	 * </ul>
	 */
	public static final DeliveryPlace1Code EntranceOfMeeting = new DeliveryPlace1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntranceOfMeeting";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryPlace1Code.mmObject();
			codeName = DeliveryPlaceCode.EntranceOfMeeting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlace1Code
	 * DeliveryPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAddress"</li>
	 * </ul>
	 */
	public static final DeliveryPlace1Code OtherAddress = new DeliveryPlace1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryPlace1Code.mmObject();
			codeName = DeliveryPlaceCode.OtherAddress.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DeliveryPlace1Code> codesByName = new LinkedHashMap<>();

	protected DeliveryPlace1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EMPL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryPlace1Code";
				definition = "Specifies where the attendance card should be delivered.";
				trace_lazy = () -> DeliveryPlaceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryPlace1Code.Employer, com.tools20022.repository.codeset.DeliveryPlace1Code.Individual,
						com.tools20022.repository.codeset.DeliveryPlace1Code.EntranceOfMeeting, com.tools20022.repository.codeset.DeliveryPlace1Code.OtherAddress);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Employer.getCodeName().get(), Employer);
		codesByName.put(Individual.getCodeName().get(), Individual);
		codesByName.put(EntranceOfMeeting.getCodeName().get(), EntranceOfMeeting);
		codesByName.put(OtherAddress.getCodeName().get(), OtherAddress);
	}

	public static DeliveryPlace1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryPlace1Code[] values() {
		DeliveryPlace1Code[] values = new DeliveryPlace1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryPlace1Code> {
		@Override
		public DeliveryPlace1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryPlace1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}