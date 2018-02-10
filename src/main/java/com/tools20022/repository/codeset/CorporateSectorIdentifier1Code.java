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
import com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the corporate sector of the counterparty for reporting to trade
 * repositories.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#AlternativeInvestmentFund
 * CorporateSectorIdentifier1Code.AlternativeInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#Assurance
 * CorporateSectorIdentifier1Code.Assurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#CreditInstitution
 * CorporateSectorIdentifier1Code.CreditInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#Insurance
 * CorporateSectorIdentifier1Code.Insurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#InvestmentFirm
 * CorporateSectorIdentifier1Code.InvestmentFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#OccupationalRetirementProvision
 * CorporateSectorIdentifier1Code.OccupationalRetirementProvision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#Reinsurance
 * CorporateSectorIdentifier1Code.Reinsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#UCITS
 * CorporateSectorIdentifier1Code.UCITS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
 * CorporateSectorIdentifierCode}</li>
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
 * "CorporateSectorIdentifier1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the corporate sector of the counterparty for reporting to trade repositories."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateSectorIdentifier1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeInvestmentFund"</li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifier1Code AlternativeInvestmentFund = new CorporateSectorIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeInvestmentFund";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.mmObject();
			codeName = CorporateSectorIdentifierCode.AlternativeInvestmentFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assurance"</li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifier1Code Assurance = new CorporateSectorIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assurance";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.mmObject();
			codeName = CorporateSectorIdentifierCode.Assurance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditInstitution"</li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifier1Code CreditInstitution = new CorporateSectorIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.mmObject();
			codeName = CorporateSectorIdentifierCode.CreditInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insurance"</li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifier1Code Insurance = new CorporateSectorIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Insurance";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.mmObject();
			codeName = CorporateSectorIdentifierCode.Insurance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFirm"</li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifier1Code InvestmentFirm = new CorporateSectorIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.mmObject();
			codeName = CorporateSectorIdentifierCode.InvestmentFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OccupationalRetirementProvision"</li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifier1Code OccupationalRetirementProvision = new CorporateSectorIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OccupationalRetirementProvision";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.mmObject();
			codeName = CorporateSectorIdentifierCode.OccupationalRetirementProvision.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinsurance"</li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifier1Code Reinsurance = new CorporateSectorIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinsurance";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.mmObject();
			codeName = CorporateSectorIdentifierCode.Reinsurance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UCITS"</li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifier1Code UCITS = new CorporateSectorIdentifier1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UCITS";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.mmObject();
			codeName = CorporateSectorIdentifierCode.UCITS.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateSectorIdentifier1Code> codesByName = new LinkedHashMap<>();

	protected CorporateSectorIdentifier1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateSectorIdentifier1Code";
				definition = "Identifies the corporate sector of the counterparty for reporting to trade repositories.";
				trace_lazy = () -> CorporateSectorIdentifierCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.AlternativeInvestmentFund, com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.Assurance,
						com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.CreditInstitution, com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.Insurance,
						com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.InvestmentFirm, com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.OccupationalRetirementProvision,
						com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.Reinsurance, com.tools20022.repository.codeset.CorporateSectorIdentifier1Code.UCITS);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AlternativeInvestmentFund.getCodeName().get(), AlternativeInvestmentFund);
		codesByName.put(Assurance.getCodeName().get(), Assurance);
		codesByName.put(CreditInstitution.getCodeName().get(), CreditInstitution);
		codesByName.put(Insurance.getCodeName().get(), Insurance);
		codesByName.put(InvestmentFirm.getCodeName().get(), InvestmentFirm);
		codesByName.put(OccupationalRetirementProvision.getCodeName().get(), OccupationalRetirementProvision);
		codesByName.put(Reinsurance.getCodeName().get(), Reinsurance);
		codesByName.put(UCITS.getCodeName().get(), UCITS);
	}

	public static CorporateSectorIdentifier1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateSectorIdentifier1Code[] values() {
		CorporateSectorIdentifier1Code[] values = new CorporateSectorIdentifier1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateSectorIdentifier1Code> {
		@Override
		public CorporateSectorIdentifier1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateSectorIdentifier1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}