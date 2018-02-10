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
import com.tools20022.repository.codeset.TMSContactLevel2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Urgency of the command.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code#AsSoonAsPossible
 * TMSContactLevel2Code.AsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code#Critical
 * TMSContactLevel2Code.Critical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code#DateTime
 * TMSContactLevel2Code.DateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code#EndCustomerSession
 * TMSContactLevel2Code.EndCustomerSession}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
 * TMSContactLevelCode}</li>
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
 * "TMSContactLevel2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Urgency of the command."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TMSContactLevel2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code
	 * TMSContactLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsSoonAsPossible"</li>
	 * </ul>
	 */
	public static final TMSContactLevel2Code AsSoonAsPossible = new TMSContactLevel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsSoonAsPossible";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevel2Code.mmObject();
			codeName = TMSContactLevelCode.AsSoonAsPossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code
	 * TMSContactLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Critical"</li>
	 * </ul>
	 */
	public static final TMSContactLevel2Code Critical = new TMSContactLevel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Critical";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevel2Code.mmObject();
			codeName = TMSContactLevelCode.Critical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code
	 * TMSContactLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * </ul>
	 */
	public static final TMSContactLevel2Code DateTime = new TMSContactLevel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevel2Code.mmObject();
			codeName = TMSContactLevelCode.DateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code
	 * TMSContactLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndCustomerSession"</li>
	 * </ul>
	 */
	public static final TMSContactLevel2Code EndCustomerSession = new TMSContactLevel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndCustomerSession";
			owner_lazy = () -> com.tools20022.repository.codeset.TMSContactLevel2Code.mmObject();
			codeName = TMSContactLevelCode.EndCustomerSession.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TMSContactLevel2Code> codesByName = new LinkedHashMap<>();

	protected TMSContactLevel2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSContactLevel2Code";
				definition = "Urgency of the command.";
				trace_lazy = () -> TMSContactLevelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TMSContactLevel2Code.AsSoonAsPossible, com.tools20022.repository.codeset.TMSContactLevel2Code.Critical,
						com.tools20022.repository.codeset.TMSContactLevel2Code.DateTime, com.tools20022.repository.codeset.TMSContactLevel2Code.EndCustomerSession);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AsSoonAsPossible.getCodeName().get(), AsSoonAsPossible);
		codesByName.put(Critical.getCodeName().get(), Critical);
		codesByName.put(DateTime.getCodeName().get(), DateTime);
		codesByName.put(EndCustomerSession.getCodeName().get(), EndCustomerSession);
	}

	public static TMSContactLevel2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TMSContactLevel2Code[] values() {
		TMSContactLevel2Code[] values = new TMSContactLevel2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TMSContactLevel2Code> {
		@Override
		public TMSContactLevel2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TMSContactLevel2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}