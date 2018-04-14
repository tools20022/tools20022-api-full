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
import com.tools20022.repository.codeset.FinancialPartySectorType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code#AlternativeInvestmentFund
 * FinancialPartySectorType1Code.AlternativeInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code#AssuranceUndertaking
 * FinancialPartySectorType1Code.AssuranceUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code#CreditInstitution
 * FinancialPartySectorType1Code.CreditInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code#InsuranceUndertaking
 * FinancialPartySectorType1Code.InsuranceUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code#InvestmentFirm
 * FinancialPartySectorType1Code.InvestmentFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code#OccupationalRetirementProvisionInstitution
 * FinancialPartySectorType1Code.OccupationalRetirementProvisionInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code#ReinsuranceUndertaking
 * FinancialPartySectorType1Code.ReinsuranceUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code#UCITSManagementCompany
 * FinancialPartySectorType1Code.UCITSManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code#Other
 * FinancialPartySectorType1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorTypeCode
 * FinancialPartySectorTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialPartySectorType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the taxinomy type of a financial party."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialPartySectorType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeInvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancialPartySectorType1Code AlternativeInvestmentFund = new FinancialPartySectorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeInvestmentFund";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorType1Code.mmObject();
			codeName = FinancialPartySectorTypeCode.AlternativeInvestmentFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssuranceUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancialPartySectorType1Code AssuranceUndertaking = new FinancialPartySectorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssuranceUndertaking";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorType1Code.mmObject();
			codeName = FinancialPartySectorTypeCode.AssuranceUndertaking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancialPartySectorType1Code CreditInstitution = new FinancialPartySectorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorType1Code.mmObject();
			codeName = FinancialPartySectorTypeCode.CreditInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancialPartySectorType1Code InsuranceUndertaking = new FinancialPartySectorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceUndertaking";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorType1Code.mmObject();
			codeName = FinancialPartySectorTypeCode.InsuranceUndertaking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancialPartySectorType1Code InvestmentFirm = new FinancialPartySectorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorType1Code.mmObject();
			codeName = FinancialPartySectorTypeCode.InvestmentFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OccupationalRetirementProvisionInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancialPartySectorType1Code OccupationalRetirementProvisionInstitution = new FinancialPartySectorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OccupationalRetirementProvisionInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorType1Code.mmObject();
			codeName = FinancialPartySectorTypeCode.OccupationalRetirementProvisionInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinsuranceUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancialPartySectorType1Code ReinsuranceUndertaking = new FinancialPartySectorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinsuranceUndertaking";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorType1Code.mmObject();
			codeName = FinancialPartySectorTypeCode.ReinsuranceUndertaking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UCITSManagementCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancialPartySectorType1Code UCITSManagementCompany = new FinancialPartySectorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UCITSManagementCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorType1Code.mmObject();
			codeName = FinancialPartySectorTypeCode.UCITSManagementCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancialPartySectorType1Code Other = new FinancialPartySectorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialPartySectorType1Code.mmObject();
			codeName = FinancialPartySectorTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FinancialPartySectorType1Code> codesByName = new LinkedHashMap<>();

	protected FinancialPartySectorType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialPartySectorType1Code";
				definition = "Specifies the taxinomy type of a financial party.";
				trace_lazy = () -> FinancialPartySectorTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialPartySectorType1Code.AlternativeInvestmentFund, com.tools20022.repository.codeset.FinancialPartySectorType1Code.AssuranceUndertaking,
						com.tools20022.repository.codeset.FinancialPartySectorType1Code.CreditInstitution, com.tools20022.repository.codeset.FinancialPartySectorType1Code.InsuranceUndertaking,
						com.tools20022.repository.codeset.FinancialPartySectorType1Code.InvestmentFirm, com.tools20022.repository.codeset.FinancialPartySectorType1Code.OccupationalRetirementProvisionInstitution,
						com.tools20022.repository.codeset.FinancialPartySectorType1Code.ReinsuranceUndertaking, com.tools20022.repository.codeset.FinancialPartySectorType1Code.UCITSManagementCompany,
						com.tools20022.repository.codeset.FinancialPartySectorType1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AlternativeInvestmentFund.getCodeName().get(), AlternativeInvestmentFund);
		codesByName.put(AssuranceUndertaking.getCodeName().get(), AssuranceUndertaking);
		codesByName.put(CreditInstitution.getCodeName().get(), CreditInstitution);
		codesByName.put(InsuranceUndertaking.getCodeName().get(), InsuranceUndertaking);
		codesByName.put(InvestmentFirm.getCodeName().get(), InvestmentFirm);
		codesByName.put(OccupationalRetirementProvisionInstitution.getCodeName().get(), OccupationalRetirementProvisionInstitution);
		codesByName.put(ReinsuranceUndertaking.getCodeName().get(), ReinsuranceUndertaking);
		codesByName.put(UCITSManagementCompany.getCodeName().get(), UCITSManagementCompany);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static FinancialPartySectorType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialPartySectorType1Code[] values() {
		FinancialPartySectorType1Code[] values = new FinancialPartySectorType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialPartySectorType1Code> {
		@Override
		public FinancialPartySectorType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialPartySectorType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}