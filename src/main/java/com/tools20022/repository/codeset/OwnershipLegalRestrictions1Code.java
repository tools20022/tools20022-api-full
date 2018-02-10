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
import com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the regulatory restrictions applicable to a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code#USLegal144A
 * OwnershipLegalRestrictions1Code.USLegal144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code#NoRestrictions
 * OwnershipLegalRestrictions1Code.NoRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code#Restrictions
 * OwnershipLegalRestrictions1Code.Restrictions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode
 * OwnershipLegalRestrictionsCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"A144"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OwnershipLegalRestrictions1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the regulatory restrictions applicable to a financial instrument."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OwnershipLegalRestrictions1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code
	 * OwnershipLegalRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USLegal144A"</li>
	 * </ul>
	 */
	public static final OwnershipLegalRestrictions1Code USLegal144A = new OwnershipLegalRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USLegal144A";
			owner_lazy = () -> com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code.mmObject();
			codeName = OwnershipLegalRestrictionsCode.USLegal144A.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code
	 * OwnershipLegalRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRestrictions"</li>
	 * </ul>
	 */
	public static final OwnershipLegalRestrictions1Code NoRestrictions = new OwnershipLegalRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRestrictions";
			owner_lazy = () -> com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code.mmObject();
			codeName = OwnershipLegalRestrictionsCode.NoRestrictions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code
	 * OwnershipLegalRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restrictions"</li>
	 * </ul>
	 */
	public static final OwnershipLegalRestrictions1Code Restrictions = new OwnershipLegalRestrictions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restrictions";
			owner_lazy = () -> com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code.mmObject();
			codeName = OwnershipLegalRestrictionsCode.Restrictions.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OwnershipLegalRestrictions1Code> codesByName = new LinkedHashMap<>();

	protected OwnershipLegalRestrictions1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("A144");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OwnershipLegalRestrictions1Code";
				definition = "Specifies the regulatory restrictions applicable to a financial instrument.";
				trace_lazy = () -> OwnershipLegalRestrictionsCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code.USLegal144A, com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code.NoRestrictions,
						com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code.Restrictions);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(USLegal144A.getCodeName().get(), USLegal144A);
		codesByName.put(NoRestrictions.getCodeName().get(), NoRestrictions);
		codesByName.put(Restrictions.getCodeName().get(), Restrictions);
	}

	public static OwnershipLegalRestrictions1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OwnershipLegalRestrictions1Code[] values() {
		OwnershipLegalRestrictions1Code[] values = new OwnershipLegalRestrictions1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OwnershipLegalRestrictions1Code> {
		@Override
		public OwnershipLegalRestrictions1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OwnershipLegalRestrictions1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}