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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.LegalRestrictions1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the regulatory restrictions applicable to a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code#USLegal144A
 * LegalRestrictions1Code.USLegal144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code#NoRestrictions
 * LegalRestrictions1Code.NoRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code#Restrictions
 * LegalRestrictions1Code.Restrictions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictionsCode
 * LegalRestrictionsCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LegalRestrictions1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the regulatory restrictions applicable to a security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::REST</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"USLE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LegalRestrictions1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ownership or transfer of an unregistered security issued, pursuant to US
	 * legal restrictions 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code
	 * LegalRestrictions1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USLE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USLegal144A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final LegalRestrictions1Code USLegal144A = new LegalRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USLegal144A";
			definition = "Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictions1Code.mmObject();
			codeName = "USLE";
			codeName = LegalRestrictionsCode.USLegal144A.getCodeName().orElse(name);
		}
	};
	/**
	 * Ownership or transfer of a security that is not subject to restrictions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code
	 * LegalRestrictions1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of a security that is not subject to restrictions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final LegalRestrictions1Code NoRestrictions = new LegalRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoRestrictions";
			definition = "Ownership or transfer of a security that is not subject to restrictions.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictions1Code.mmObject();
			codeName = "NORE";
			codeName = LegalRestrictionsCode.NoRestrictions.getCodeName().orElse(name);
		}
	};
	/**
	 * Ownership or transfer of a security that is subject to restrictions, and
	 * not pursuant to 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code
	 * LegalRestrictions1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final LegalRestrictions1Code Restrictions = new LegalRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restrictions";
			definition = "Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A.";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictions1Code.mmObject();
			codeName = "REST";
			codeName = LegalRestrictionsCode.Restrictions.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LegalRestrictions1Code> codesByName = new LinkedHashMap<>();

	protected LegalRestrictions1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::REST"));
				example = Arrays.asList("USLE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LegalRestrictions1Code";
				definition = "Specifies the regulatory restrictions applicable to a security.";
				trace_lazy = () -> LegalRestrictionsCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegalRestrictions1Code.USLegal144A, com.tools20022.repository.codeset.LegalRestrictions1Code.NoRestrictions,
						com.tools20022.repository.codeset.LegalRestrictions1Code.Restrictions);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(USLegal144A.getCodeName().get(), USLegal144A);
		codesByName.put(NoRestrictions.getCodeName().get(), NoRestrictions);
		codesByName.put(Restrictions.getCodeName().get(), Restrictions);
	}

	public static LegalRestrictions1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LegalRestrictions1Code[] values() {
		LegalRestrictions1Code[] values = new LegalRestrictions1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LegalRestrictions1Code> {
		@Override
		public LegalRestrictions1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LegalRestrictions1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}