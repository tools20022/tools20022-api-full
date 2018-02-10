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
import com.tools20022.repository.codeset.LegalRestrictions2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code#JurisdictionOwnership
 * LegalRestrictions2Code.JurisdictionOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code#PrivatePlacements
 * LegalRestrictions2Code.PrivatePlacements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code#AccreditedInvestor
 * LegalRestrictions2Code.AccreditedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code#Margin
 * LegalRestrictions2Code.Margin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code#Privilege
 * LegalRestrictions2Code.Privilege}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"JURO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LegalRestrictions2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the regulatory restrictions applicable to a security."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LegalRestrictions2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code
	 * LegalRestrictions2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JurisdictionOwnership"</li>
	 * </ul>
	 */
	public static final LegalRestrictions2Code JurisdictionOwnership = new LegalRestrictions2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JurisdictionOwnership";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictions2Code.mmObject();
			codeName = LegalRestrictionsCode.JurisdictionOwnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code
	 * LegalRestrictions2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivatePlacements"</li>
	 * </ul>
	 */
	public static final LegalRestrictions2Code PrivatePlacements = new LegalRestrictions2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivatePlacements";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictions2Code.mmObject();
			codeName = LegalRestrictionsCode.PrivatePlacements.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code
	 * LegalRestrictions2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccreditedInvestor"</li>
	 * </ul>
	 */
	public static final LegalRestrictions2Code AccreditedInvestor = new LegalRestrictions2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccreditedInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictions2Code.mmObject();
			codeName = LegalRestrictionsCode.AccreditedInvestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code
	 * LegalRestrictions2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Margin"</li>
	 * </ul>
	 */
	public static final LegalRestrictions2Code Margin = new LegalRestrictions2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Margin";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictions2Code.mmObject();
			codeName = LegalRestrictionsCode.Margin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions2Code
	 * LegalRestrictions2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Privilege"</li>
	 * </ul>
	 */
	public static final LegalRestrictions2Code Privilege = new LegalRestrictions2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Privilege";
			owner_lazy = () -> com.tools20022.repository.codeset.LegalRestrictions2Code.mmObject();
			codeName = LegalRestrictionsCode.Privilege.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LegalRestrictions2Code> codesByName = new LinkedHashMap<>();

	protected LegalRestrictions2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("JURO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LegalRestrictions2Code";
				definition = "Specifies the regulatory restrictions applicable to a security.";
				trace_lazy = () -> LegalRestrictionsCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegalRestrictions2Code.JurisdictionOwnership, com.tools20022.repository.codeset.LegalRestrictions2Code.PrivatePlacements,
						com.tools20022.repository.codeset.LegalRestrictions2Code.AccreditedInvestor, com.tools20022.repository.codeset.LegalRestrictions2Code.Margin, com.tools20022.repository.codeset.LegalRestrictions2Code.Privilege);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(JurisdictionOwnership.getCodeName().get(), JurisdictionOwnership);
		codesByName.put(PrivatePlacements.getCodeName().get(), PrivatePlacements);
		codesByName.put(AccreditedInvestor.getCodeName().get(), AccreditedInvestor);
		codesByName.put(Margin.getCodeName().get(), Margin);
		codesByName.put(Privilege.getCodeName().get(), Privilege);
	}

	public static LegalRestrictions2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LegalRestrictions2Code[] values() {
		LegalRestrictions2Code[] values = new LegalRestrictions2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LegalRestrictions2Code> {
		@Override
		public LegalRestrictions2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LegalRestrictions2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}