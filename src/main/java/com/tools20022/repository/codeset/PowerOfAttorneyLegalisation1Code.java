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
import com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the legal constraint on the Power of Attorney.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code#Notary
 * PowerOfAttorneyLegalisation1Code.Notary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code#LocalAuthority
 * PowerOfAttorneyLegalisation1Code.LocalAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code#Apostilled
 * PowerOfAttorneyLegalisation1Code.Apostilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code#Consularized
 * PowerOfAttorneyLegalisation1Code.Consularized}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode
 * PowerOfAttorneyLegalisationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NOTA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PowerOfAttorneyLegalisation1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the legal constraint on the Power of Attorney."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PowerOfAttorneyLegalisation1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code
	 * PowerOfAttorneyLegalisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notary"</li>
	 * </ul>
	 */
	public static final PowerOfAttorneyLegalisation1Code Notary = new PowerOfAttorneyLegalisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notary";
			owner_lazy = () -> com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code.mmObject();
			codeName = PowerOfAttorneyLegalisationCode.Notary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code
	 * PowerOfAttorneyLegalisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalAuthority"</li>
	 * </ul>
	 */
	public static final PowerOfAttorneyLegalisation1Code LocalAuthority = new PowerOfAttorneyLegalisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalAuthority";
			owner_lazy = () -> com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code.mmObject();
			codeName = PowerOfAttorneyLegalisationCode.LocalAuthority.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code
	 * PowerOfAttorneyLegalisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Apostilled"</li>
	 * </ul>
	 */
	public static final PowerOfAttorneyLegalisation1Code Apostilled = new PowerOfAttorneyLegalisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Apostilled";
			owner_lazy = () -> com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code.mmObject();
			codeName = PowerOfAttorneyLegalisationCode.Apostilled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code
	 * PowerOfAttorneyLegalisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consularized"</li>
	 * </ul>
	 */
	public static final PowerOfAttorneyLegalisation1Code Consularized = new PowerOfAttorneyLegalisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consularized";
			owner_lazy = () -> com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code.mmObject();
			codeName = PowerOfAttorneyLegalisationCode.Consularized.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PowerOfAttorneyLegalisation1Code> codesByName = new LinkedHashMap<>();

	protected PowerOfAttorneyLegalisation1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NOTA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorneyLegalisation1Code";
				definition = "Indicates the legal constraint on the Power of Attorney.";
				trace_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code.Notary, com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code.LocalAuthority,
						com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code.Apostilled, com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code.Consularized);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Notary.getCodeName().get(), Notary);
		codesByName.put(LocalAuthority.getCodeName().get(), LocalAuthority);
		codesByName.put(Apostilled.getCodeName().get(), Apostilled);
		codesByName.put(Consularized.getCodeName().get(), Consularized);
	}

	public static PowerOfAttorneyLegalisation1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PowerOfAttorneyLegalisation1Code[] values() {
		PowerOfAttorneyLegalisation1Code[] values = new PowerOfAttorneyLegalisation1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PowerOfAttorneyLegalisation1Code> {
		@Override
		public PowerOfAttorneyLegalisation1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PowerOfAttorneyLegalisation1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}