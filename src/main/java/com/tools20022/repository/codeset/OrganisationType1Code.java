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
import com.tools20022.repository.codeset.OrganisationType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.OrganisationType1Code#InvestmentFund
 * OrganisationType1Code.InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationType1Code#PrivateAssociation
 * OrganisationType1Code.PrivateAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationType1Code#Public
 * OrganisationType1Code.Public}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationType1Code#PublicFund
 * OrganisationType1Code.PublicFund}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrganisationTypeCode
 * OrganisationTypeCode}</li>
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
 * "OrganisationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of organisation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrganisationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationType1Code
	 * OrganisationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFund"</li>
	 * </ul>
	 */
	public static final OrganisationType1Code InvestmentFund = new OrganisationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFund";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationType1Code.mmObject();
			codeName = OrganisationTypeCode.InvestmentFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationType1Code
	 * OrganisationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivateAssociation"</li>
	 * </ul>
	 */
	public static final OrganisationType1Code PrivateAssociation = new OrganisationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivateAssociation";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationType1Code.mmObject();
			codeName = OrganisationTypeCode.PrivateAssociation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationType1Code
	 * OrganisationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Public"</li>
	 * </ul>
	 */
	public static final OrganisationType1Code Public = new OrganisationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Public";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationType1Code.mmObject();
			codeName = OrganisationTypeCode.Public.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationType1Code
	 * OrganisationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicFund"</li>
	 * </ul>
	 */
	public static final OrganisationType1Code PublicFund = new OrganisationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicFund";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationType1Code.mmObject();
			codeName = OrganisationTypeCode.PublicFund.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrganisationType1Code> codesByName = new LinkedHashMap<>();

	protected OrganisationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrganisationType1Code";
				definition = "Specifies a type of organisation.";
				trace_lazy = () -> OrganisationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrganisationType1Code.InvestmentFund, com.tools20022.repository.codeset.OrganisationType1Code.PrivateAssociation,
						com.tools20022.repository.codeset.OrganisationType1Code.Public, com.tools20022.repository.codeset.OrganisationType1Code.PublicFund);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InvestmentFund.getCodeName().get(), InvestmentFund);
		codesByName.put(PrivateAssociation.getCodeName().get(), PrivateAssociation);
		codesByName.put(Public.getCodeName().get(), Public);
		codesByName.put(PublicFund.getCodeName().get(), PublicFund);
	}

	public static OrganisationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrganisationType1Code[] values() {
		OrganisationType1Code[] values = new OrganisationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrganisationType1Code> {
		@Override
		public OrganisationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrganisationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}