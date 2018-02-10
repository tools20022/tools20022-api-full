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
import com.tools20022.repository.codeset.Registration2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether registration should occur upon receipt.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Registration2Code#PartyHold
 * Registration2Code.PartyHold}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Registration2Code#CSDHold
 * Registration2Code.CSDHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Registration2Code#ConditionalDelivery
 * Registration2Code.ConditionalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Registration2Code#CSDValidation
 * Registration2Code.CSDValidation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
 * RegistrationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PTYH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Registration2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether registration should occur upon receipt."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Registration2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Registration2Code
	 * Registration2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyHold"</li>
	 * </ul>
	 */
	public static final Registration2Code PartyHold = new Registration2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyHold";
			owner_lazy = () -> com.tools20022.repository.codeset.Registration2Code.mmObject();
			codeName = RegistrationCode.PartyHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Registration2Code
	 * Registration2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDHold"</li>
	 * </ul>
	 */
	public static final Registration2Code CSDHold = new Registration2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDHold";
			owner_lazy = () -> com.tools20022.repository.codeset.Registration2Code.mmObject();
			codeName = RegistrationCode.CSDHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Registration2Code
	 * Registration2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDelivery"</li>
	 * </ul>
	 */
	public static final Registration2Code ConditionalDelivery = new Registration2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.Registration2Code.mmObject();
			codeName = RegistrationCode.ConditionalDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Registration2Code
	 * Registration2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDValidation"</li>
	 * </ul>
	 */
	public static final Registration2Code CSDValidation = new Registration2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.Registration2Code.mmObject();
			codeName = RegistrationCode.CSDValidation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Registration2Code> codesByName = new LinkedHashMap<>();

	protected Registration2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PTYH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Registration2Code";
				definition = "Specifies whether registration should occur upon receipt.";
				trace_lazy = () -> RegistrationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Registration2Code.PartyHold, com.tools20022.repository.codeset.Registration2Code.CSDHold,
						com.tools20022.repository.codeset.Registration2Code.ConditionalDelivery, com.tools20022.repository.codeset.Registration2Code.CSDValidation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartyHold.getCodeName().get(), PartyHold);
		codesByName.put(CSDHold.getCodeName().get(), CSDHold);
		codesByName.put(ConditionalDelivery.getCodeName().get(), ConditionalDelivery);
		codesByName.put(CSDValidation.getCodeName().get(), CSDValidation);
	}

	public static Registration2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Registration2Code[] values() {
		Registration2Code[] values = new Registration2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Registration2Code> {
		@Override
		public Registration2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Registration2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}