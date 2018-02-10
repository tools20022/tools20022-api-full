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
import com.tools20022.repository.codeset.CardServiceType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of network management service (correspond to the ISO 8583 field 24).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code#DisableStoreForward
 * CardServiceType2Code.DisableStoreForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code#EchoTest
 * CardServiceType2Code.EchoTest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code#EnableStoreForward
 * CardServiceType2Code.EnableStoreForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code#SignOff
 * CardServiceType2Code.SignOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code#SignOn
 * CardServiceType2Code.SignOn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
 * CardServiceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardServiceType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of network management service (correspond to the ISO 8583 field 24)."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardServiceType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code
	 * CardServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisableStoreForward"</li>
	 * </ul>
	 */
	public static final CardServiceType2Code DisableStoreForward = new CardServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisableStoreForward";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceType2Code.mmObject();
			codeName = CardServiceTypeCode.DisableStoreForward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code
	 * CardServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EchoTest"</li>
	 * </ul>
	 */
	public static final CardServiceType2Code EchoTest = new CardServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EchoTest";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceType2Code.mmObject();
			codeName = CardServiceTypeCode.EchoTest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code
	 * CardServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnableStoreForward"</li>
	 * </ul>
	 */
	public static final CardServiceType2Code EnableStoreForward = new CardServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnableStoreForward";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceType2Code.mmObject();
			codeName = CardServiceTypeCode.EnableStoreForward.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code
	 * CardServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignOff"</li>
	 * </ul>
	 */
	public static final CardServiceType2Code SignOff = new CardServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignOff";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceType2Code.mmObject();
			codeName = CardServiceTypeCode.SignOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceType2Code
	 * CardServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignOn"</li>
	 * </ul>
	 */
	public static final CardServiceType2Code SignOn = new CardServiceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignOn";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceType2Code.mmObject();
			codeName = CardServiceTypeCode.SignOn.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardServiceType2Code> codesByName = new LinkedHashMap<>();

	protected CardServiceType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardServiceType2Code";
				definition = "Type of network management service (correspond to the ISO 8583 field 24).";
				trace_lazy = () -> CardServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardServiceType2Code.DisableStoreForward, com.tools20022.repository.codeset.CardServiceType2Code.EchoTest,
						com.tools20022.repository.codeset.CardServiceType2Code.EnableStoreForward, com.tools20022.repository.codeset.CardServiceType2Code.SignOff, com.tools20022.repository.codeset.CardServiceType2Code.SignOn);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DisableStoreForward.getCodeName().get(), DisableStoreForward);
		codesByName.put(EchoTest.getCodeName().get(), EchoTest);
		codesByName.put(EnableStoreForward.getCodeName().get(), EnableStoreForward);
		codesByName.put(SignOff.getCodeName().get(), SignOff);
		codesByName.put(SignOn.getCodeName().get(), SignOn);
	}

	public static CardServiceType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardServiceType2Code[] values() {
		CardServiceType2Code[] values = new CardServiceType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardServiceType2Code> {
		@Override
		public CardServiceType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardServiceType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}