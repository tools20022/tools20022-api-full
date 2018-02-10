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
import com.tools20022.repository.codeset.MailType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of mail service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MailType1Code#AirMail
 * MailType1Code.AirMail}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MailType1Code#OrdinaryMail
 * MailType1Code.OrdinaryMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MailType1Code#RegisteredMail
 * MailType1Code.RegisteredMail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MailTypeCode MailTypeCode}</li>
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
 * "MailType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of mail service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MailType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MailType1Code
	 * MailType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirMail"</li>
	 * </ul>
	 */
	public static final MailType1Code AirMail = new MailType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirMail";
			owner_lazy = () -> com.tools20022.repository.codeset.MailType1Code.mmObject();
			codeName = MailTypeCode.AirMail.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MailType1Code
	 * MailType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrdinaryMail"</li>
	 * </ul>
	 */
	public static final MailType1Code OrdinaryMail = new MailType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrdinaryMail";
			owner_lazy = () -> com.tools20022.repository.codeset.MailType1Code.mmObject();
			codeName = MailTypeCode.OrdinaryMail.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MailType1Code
	 * MailType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMail"</li>
	 * </ul>
	 */
	public static final MailType1Code RegisteredMail = new MailType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMail";
			owner_lazy = () -> com.tools20022.repository.codeset.MailType1Code.mmObject();
			codeName = MailTypeCode.RegisteredMail.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MailType1Code> codesByName = new LinkedHashMap<>();

	protected MailType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MailType1Code";
				definition = "Specifies the type of mail service.";
				trace_lazy = () -> MailTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MailType1Code.AirMail, com.tools20022.repository.codeset.MailType1Code.OrdinaryMail, com.tools20022.repository.codeset.MailType1Code.RegisteredMail);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AirMail.getCodeName().get(), AirMail);
		codesByName.put(OrdinaryMail.getCodeName().get(), OrdinaryMail);
		codesByName.put(RegisteredMail.getCodeName().get(), RegisteredMail);
	}

	public static MailType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MailType1Code[] values() {
		MailType1Code[] values = new MailType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MailType1Code> {
		@Override
		public MailType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MailType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}