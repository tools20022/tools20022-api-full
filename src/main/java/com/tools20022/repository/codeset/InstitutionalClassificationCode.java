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
import com.tools20022.repository.codeset.InstitutionalClassificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * TSE/JASDEC extension codes for mergers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#SurvivingCompany
 * InstitutionalClassificationCode.SurvivingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#DiscontinuedCompany
 * InstitutionalClassificationCode.DiscontinuedCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#Subsidiary
 * InstitutionalClassificationCode.Subsidiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#Unknown
 * InstitutionalClassificationCode.Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#Parent
 * InstitutionalClassificationCode.Parent}</li>
 * </ul>
 * </li>
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
 * "InstitutionalClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "TSE/JASDEC extension codes for mergers."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstitutionalClassificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * In the case of a merger, the Issuer or the Counterparty is the surviving
	 * company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SURV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivingCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the Issuer or the Counterparty is the surviving company."
	 * </li>
	 * </ul>
	 */
	public static final InstitutionalClassificationCode SurvivingCompany = new InstitutionalClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivingCompany";
			definition = "In the case of a merger, the Issuer or the Counterparty is the surviving company.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstitutionalClassificationCode.mmObject();
			codeName = "SURV";
		}
	};
	/**
	 * In the case of a merger, the Issuer or the Counterparty is the
	 * discontinued company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscontinuedCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the Issuer or the Counterparty is the discontinued company."
	 * </li>
	 * </ul>
	 */
	public static final InstitutionalClassificationCode DiscontinuedCompany = new InstitutionalClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscontinuedCompany";
			definition = "In the case of a merger, the Issuer or the Counterparty is the discontinued company.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstitutionalClassificationCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * In the case of a merger, the Issuer or the Counterparty is a subsidiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subsidiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the Issuer or the Counterparty is a subsidiary."
	 * </li>
	 * </ul>
	 */
	public static final InstitutionalClassificationCode Subsidiary = new InstitutionalClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subsidiary";
			definition = "In the case of a merger, the Issuer or the Counterparty is a subsidiary.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstitutionalClassificationCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * In the case of a merger, the classification of the Issuer or the
	 * Counterparty is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the classification of the Issuer or the Counterparty is unknown."
	 * </li>
	 * </ul>
	 */
	public static final InstitutionalClassificationCode Unknown = new InstitutionalClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "In the case of a merger, the classification of the Issuer or the Counterparty is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstitutionalClassificationCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * In the case of a merger, the Issuer or the Counterparty is a parent
	 * company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the Issuer or the Counterparty is a parent company."
	 * </li>
	 * </ul>
	 */
	public static final InstitutionalClassificationCode Parent = new InstitutionalClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parent";
			definition = "In the case of a merger, the Issuer or the Counterparty is a parent company.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstitutionalClassificationCode.mmObject();
			codeName = "PRNT";
		}
	};
	final static private LinkedHashMap<String, InstitutionalClassificationCode> codesByName = new LinkedHashMap<>();

	protected InstitutionalClassificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstitutionalClassificationCode";
				definition = "TSE/JASDEC extension codes for mergers.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstitutionalClassificationCode.SurvivingCompany, com.tools20022.repository.codeset.InstitutionalClassificationCode.DiscontinuedCompany,
						com.tools20022.repository.codeset.InstitutionalClassificationCode.Subsidiary, com.tools20022.repository.codeset.InstitutionalClassificationCode.Unknown,
						com.tools20022.repository.codeset.InstitutionalClassificationCode.Parent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SurvivingCompany.getCodeName().get(), SurvivingCompany);
		codesByName.put(DiscontinuedCompany.getCodeName().get(), DiscontinuedCompany);
		codesByName.put(Subsidiary.getCodeName().get(), Subsidiary);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(Parent.getCodeName().get(), Parent);
	}

	public static InstitutionalClassificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstitutionalClassificationCode[] values() {
		InstitutionalClassificationCode[] values = new InstitutionalClassificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstitutionalClassificationCode> {
		@Override
		public InstitutionalClassificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstitutionalClassificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}