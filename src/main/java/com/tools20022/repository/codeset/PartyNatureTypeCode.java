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
import com.tools20022.repository.codeset.PartyNatureTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of a counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyNatureTypeCode#FinancialInstitution
 * PartyNatureTypeCode.FinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyNatureTypeCode#NonFinancialInstitution
 * PartyNatureTypeCode.NonFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyNatureTypeCode#CentralCounterparty
 * PartyNatureTypeCode.CentralCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyNatureTypeCode#Other
 * PartyNatureTypeCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyNatureType1Code
 * PartyNatureType1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyNatureTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of a counterparty."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyNatureTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Issuer is a financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyNatureTypeCode
	 * PartyNatureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer is a financial institution."</li>
	 * </ul>
	 */
	public static final PartyNatureTypeCode FinancialInstitution = new PartyNatureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstitution";
			definition = "Issuer is a financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyNatureTypeCode.mmObject();
			codeName = "FIIN";
		}
	};
	/**
	 * Issuer is a non-financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyNatureTypeCode
	 * PartyNatureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer is a non-financial institution."</li>
	 * </ul>
	 */
	public static final PartyNatureTypeCode NonFinancialInstitution = new PartyNatureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFinancialInstitution";
			definition = "Issuer is a non-financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyNatureTypeCode.mmObject();
			codeName = "NFIN";
		}
	};
	/**
	 * Issuer is a central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyNatureTypeCode
	 * PartyNatureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer is a central counterparty."</li>
	 * </ul>
	 */
	public static final PartyNatureTypeCode CentralCounterparty = new PartyNatureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralCounterparty";
			definition = "Issuer is a central counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyNatureTypeCode.mmObject();
			codeName = "CCPS";
		}
	};
	/**
	 * Other type of issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyNatureTypeCode
	 * PartyNatureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other type of issuer."</li>
	 * </ul>
	 */
	public static final PartyNatureTypeCode Other = new PartyNatureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other type of issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyNatureTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, PartyNatureTypeCode> codesByName = new LinkedHashMap<>();

	protected PartyNatureTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyNatureTypeCode";
				definition = "Specifies the nature of a counterparty.";
				derivation_lazy = () -> Arrays.asList(PartyNatureType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyNatureTypeCode.FinancialInstitution, com.tools20022.repository.codeset.PartyNatureTypeCode.NonFinancialInstitution,
						com.tools20022.repository.codeset.PartyNatureTypeCode.CentralCounterparty, com.tools20022.repository.codeset.PartyNatureTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FinancialInstitution.getCodeName().get(), FinancialInstitution);
		codesByName.put(NonFinancialInstitution.getCodeName().get(), NonFinancialInstitution);
		codesByName.put(CentralCounterparty.getCodeName().get(), CentralCounterparty);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static PartyNatureTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyNatureTypeCode[] values() {
		PartyNatureTypeCode[] values = new PartyNatureTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyNatureTypeCode> {
		@Override
		public PartyNatureTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyNatureTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}