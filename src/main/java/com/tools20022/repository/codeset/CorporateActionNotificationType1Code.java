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
import com.tools20022.repository.codeset.CorporateActionNotificationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of notification advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType1Code#New
 * CorporateActionNotificationType1Code.New}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType1Code#Replacement
 * CorporateActionNotificationType1Code.Replacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType1Code#Reminder
 * CorporateActionNotificationType1Code.Reminder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode
 * CorporateActionNotificationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NEWM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNotificationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of notification advice."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionNotificationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType1Code
	 * CorporateActionNotificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "New"</li>
	 * </ul>
	 */
	public static final CorporateActionNotificationType1Code New = new CorporateActionNotificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "New";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNotificationType1Code.mmObject();
			codeName = CorporateActionNotificationTypeCode.New.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType1Code
	 * CorporateActionNotificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replacement"</li>
	 * </ul>
	 */
	public static final CorporateActionNotificationType1Code Replacement = new CorporateActionNotificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replacement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNotificationType1Code.mmObject();
			codeName = CorporateActionNotificationTypeCode.Replacement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType1Code
	 * CorporateActionNotificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder"</li>
	 * </ul>
	 */
	public static final CorporateActionNotificationType1Code Reminder = new CorporateActionNotificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionNotificationType1Code.mmObject();
			codeName = CorporateActionNotificationTypeCode.Reminder.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionNotificationType1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionNotificationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NEWM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotificationType1Code";
				definition = "Type of notification advice.";
				trace_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionNotificationType1Code.New, com.tools20022.repository.codeset.CorporateActionNotificationType1Code.Replacement,
						com.tools20022.repository.codeset.CorporateActionNotificationType1Code.Reminder);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(New.getCodeName().get(), New);
		codesByName.put(Replacement.getCodeName().get(), Replacement);
		codesByName.put(Reminder.getCodeName().get(), Reminder);
	}

	public static CorporateActionNotificationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionNotificationType1Code[] values() {
		CorporateActionNotificationType1Code[] values = new CorporateActionNotificationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionNotificationType1Code> {
		@Override
		public CorporateActionNotificationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionNotificationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}