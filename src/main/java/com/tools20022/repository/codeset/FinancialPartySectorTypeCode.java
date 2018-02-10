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
import com.tools20022.repository.codeset.FinancialPartySectorTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the taxinomy type of a financial party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#AssuranceUndertaking
 * FinancialPartySectorTypeCode.AssuranceUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#CreditInstitution
 * FinancialPartySectorTypeCode.CreditInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#InvestmentFirm
 * FinancialPartySectorTypeCode.InvestmentFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#InsuranceUndertaking
 * FinancialPartySectorTypeCode.InsuranceUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#AlternativeInvestmentFund
 * FinancialPartySectorTypeCode.AlternativeInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#OccupationalRetirementProvisionInstitution
 * FinancialPartySectorTypeCode.OccupationalRetirementProvisionInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#ReinsuranceUndertaking
 * FinancialPartySectorTypeCode.ReinsuranceUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#UCITSManagementCompany
 * FinancialPartySectorTypeCode.UCITSManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#Other
 * FinancialPartySectorTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#CentralCounterparty
 * FinancialPartySectorTypeCode.CentralCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode#CentralSecuritiesDepository
 * FinancialPartySectorTypeCode.CentralSecuritiesDepository}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
 * FinancialPartySectorType1Code}</li>
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
 * "FinancialPartySectorTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the taxinomy type of a financial party."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialPartySectorTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Assurance undertaking.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssuranceUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Assurance undertaking.\r\n"</li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode AssuranceUndertaking = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssuranceUndertaking";
			definition = "Assurance undertaking.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "ASSU";
		}
	};
	/**
	 * Credit institution that takes deposits or other repayable funds from the
	 * public and grants credits for its own account.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit institution that takes deposits or other repayable funds from the public and grants credits for its own account.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode CreditInstitution = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditInstitution";
			definition = "Credit institution that takes deposits or other repayable funds from the public and grants credits for its own account.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "CDTI";
		}
	};
	/**
	 * Investment firm.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment firm.\r\n"</li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode InvestmentFirm = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFirm";
			definition = "Investment firm.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "INVF";
		}
	};
	/**
	 * Insurance undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insurance undertaking."</li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode InsuranceUndertaking = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceUndertaking";
			definition = "Insurance undertaking.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "INUN";
		}
	};
	/**
	 * Alternative investment fund managed by an alternative investment fund
	 * manager (AIFM).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AIFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeInvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternative investment fund managed by an alternative investment fund manager (AIFM)."
	 * </li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode AlternativeInvestmentFund = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeInvestmentFund";
			definition = "Alternative investment fund managed by an alternative investment fund manager (AIFM).";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "AIFD";
		}
	};
	/**
	 * Institution for occupational retirement provision established for the
	 * purpose of providing retirement benefits in the context of an
	 * occupational activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OccupationalRetirementProvisionInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institution for occupational retirement provision established for the purpose of providing retirement benefits in the context of an occupational activity."
	 * </li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode OccupationalRetirementProvisionInstitution = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OccupationalRetirementProvisionInstitution";
			definition = "Institution for occupational retirement provision established for the purpose of providing retirement benefits in the context of an occupational activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "ORPI";
		}
	};
	/**
	 * Reinsurance undertaking performing the activity of accepting risks ceded
	 * by an insurance undertaking or by another reinsurance undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinsuranceUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reinsurance undertaking performing the activity of accepting risks ceded by an insurance undertaking or by another reinsurance undertaking."
	 * </li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode ReinsuranceUndertaking = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinsuranceUndertaking";
			definition = "Reinsurance undertaking performing the activity of accepting risks ceded by an insurance undertaking or by another reinsurance undertaking.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "REIN";
		}
	};
	/**
	 * Undertaking for collective investment in transferable securities (UCITS)
	 * and its management company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UCITSManagementCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking for collective investment in transferable securities (UCITS) and its management company."
	 * </li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode UCITSManagementCompany = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UCITSManagementCompany";
			definition = "Undertaking for collective investment in transferable securities (UCITS) and its management company.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "UCIT";
		}
	};
	/**
	 * Othery type of financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
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
	 * definition} = "Othery type of financial institution."</li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode Other = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Othery type of financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
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
	 * definition} = "Central counterparty."</li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode CentralCounterparty = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralCounterparty";
			definition = "Central counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "CCPS";
		}
	};
	/**
	 * Central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
	 * FinancialPartySectorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralSecuritiesDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Central securities depository."</li>
	 * </ul>
	 */
	public static final FinancialPartySectorTypeCode CentralSecuritiesDepository = new FinancialPartySectorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralSecuritiesDepository";
			definition = "Central securities depository.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorTypeCode.mmObject();
			codeName = "CSDS";
		}
	};
	final static private LinkedHashMap<String, FinancialPartySectorTypeCode> codesByName = new LinkedHashMap<>();

	protected FinancialPartySectorTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialPartySectorTypeCode";
				definition = "Specifies the taxinomy type of a financial party.";
				derivation_lazy = () -> Arrays.asList(FinancialPartySectorType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialPartySectorTypeCode.AssuranceUndertaking, com.tools20022.repository.codeset.FinancialPartySectorTypeCode.CreditInstitution,
						com.tools20022.repository.codeset.FinancialPartySectorTypeCode.InvestmentFirm, com.tools20022.repository.codeset.FinancialPartySectorTypeCode.InsuranceUndertaking,
						com.tools20022.repository.codeset.FinancialPartySectorTypeCode.AlternativeInvestmentFund, com.tools20022.repository.codeset.FinancialPartySectorTypeCode.OccupationalRetirementProvisionInstitution,
						com.tools20022.repository.codeset.FinancialPartySectorTypeCode.ReinsuranceUndertaking, com.tools20022.repository.codeset.FinancialPartySectorTypeCode.UCITSManagementCompany,
						com.tools20022.repository.codeset.FinancialPartySectorTypeCode.Other, com.tools20022.repository.codeset.FinancialPartySectorTypeCode.CentralCounterparty,
						com.tools20022.repository.codeset.FinancialPartySectorTypeCode.CentralSecuritiesDepository);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AssuranceUndertaking.getCodeName().get(), AssuranceUndertaking);
		codesByName.put(CreditInstitution.getCodeName().get(), CreditInstitution);
		codesByName.put(InvestmentFirm.getCodeName().get(), InvestmentFirm);
		codesByName.put(InsuranceUndertaking.getCodeName().get(), InsuranceUndertaking);
		codesByName.put(AlternativeInvestmentFund.getCodeName().get(), AlternativeInvestmentFund);
		codesByName.put(OccupationalRetirementProvisionInstitution.getCodeName().get(), OccupationalRetirementProvisionInstitution);
		codesByName.put(ReinsuranceUndertaking.getCodeName().get(), ReinsuranceUndertaking);
		codesByName.put(UCITSManagementCompany.getCodeName().get(), UCITSManagementCompany);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(CentralCounterparty.getCodeName().get(), CentralCounterparty);
		codesByName.put(CentralSecuritiesDepository.getCodeName().get(), CentralSecuritiesDepository);
	}

	public static FinancialPartySectorTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialPartySectorTypeCode[] values() {
		FinancialPartySectorTypeCode[] values = new FinancialPartySectorTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialPartySectorTypeCode> {
		@Override
		public FinancialPartySectorTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialPartySectorTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}