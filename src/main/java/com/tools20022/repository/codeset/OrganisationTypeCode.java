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
import com.tools20022.repository.codeset.OrganisationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationTypeCode#Public
 * OrganisationTypeCode.Public}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationTypeCode#PrivateAssociation
 * OrganisationTypeCode.PrivateAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationTypeCode#InvestmentFund
 * OrganisationTypeCode.InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationTypeCode#PublicFund
 * OrganisationTypeCode.PublicFund}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OrganisationType1Code
 * OrganisationType1Code}</li>
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
 * "OrganisationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of organisation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrganisationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Organisation is a public company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationTypeCode
	 * OrganisationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Public"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation is a public company."</li>
	 * </ul>
	 */
	public static final OrganisationTypeCode Public = new OrganisationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Public";
			definition = "Organisation is a public company.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationTypeCode.mmObject();
			codeName = "PUBL";
		}
	};
	/**
	 * Organisation is a private association.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationTypeCode
	 * OrganisationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivateAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation is a private association."</li>
	 * </ul>
	 */
	public static final OrganisationTypeCode PrivateAssociation = new OrganisationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivateAssociation";
			definition = "Organisation is a private association.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationTypeCode.mmObject();
			codeName = "PRIV";
		}
	};
	/**
	 * Organisation is an investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationTypeCode
	 * OrganisationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation is an investment fund."</li>
	 * </ul>
	 */
	public static final OrganisationTypeCode InvestmentFund = new OrganisationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFund";
			definition = "Organisation is an investment fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationTypeCode.mmObject();
			codeName = "IFUN";
		}
	};
	/**
	 * Organisation is a public fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationTypeCode
	 * OrganisationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation is a public fund."</li>
	 * </ul>
	 */
	public static final OrganisationTypeCode PublicFund = new OrganisationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicFund";
			definition = "Organisation is a public fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationTypeCode.mmObject();
			codeName = "PFUN";
		}
	};
	final static private LinkedHashMap<String, OrganisationTypeCode> codesByName = new LinkedHashMap<>();

	protected OrganisationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrganisationTypeCode";
				definition = "Specifies a type of organisation.";
				derivation_lazy = () -> Arrays.asList(OrganisationType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrganisationTypeCode.Public, com.tools20022.repository.codeset.OrganisationTypeCode.PrivateAssociation,
						com.tools20022.repository.codeset.OrganisationTypeCode.InvestmentFund, com.tools20022.repository.codeset.OrganisationTypeCode.PublicFund);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Public.getCodeName().get(), Public);
		codesByName.put(PrivateAssociation.getCodeName().get(), PrivateAssociation);
		codesByName.put(InvestmentFund.getCodeName().get(), InvestmentFund);
		codesByName.put(PublicFund.getCodeName().get(), PublicFund);
	}

	public static OrganisationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrganisationTypeCode[] values() {
		OrganisationTypeCode[] values = new OrganisationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrganisationTypeCode> {
		@Override
		public OrganisationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrganisationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}