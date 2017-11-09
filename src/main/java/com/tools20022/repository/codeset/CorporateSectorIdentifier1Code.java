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
import com.tools20022.repository.codeset.CorporateSectorIdentifierCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the corporate sector of the counterparty for reporting to trade
 * repositories.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
 * CorporateSectorIdentifierCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#mmAlternativeInvestmentFund
 * CorporateSectorIdentifier1Code.mmAlternativeInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#mmAssurance
 * CorporateSectorIdentifier1Code.mmAssurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#mmCreditInstitution
 * CorporateSectorIdentifier1Code.mmCreditInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#mmInsurance
 * CorporateSectorIdentifier1Code.mmInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#mmInvestmentFirm
 * CorporateSectorIdentifier1Code.mmInvestmentFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#mmOccupationalRetirementProvision
 * CorporateSectorIdentifier1Code.mmOccupationalRetirementProvision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#mmReinsurance
 * CorporateSectorIdentifier1Code.mmReinsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code#mmUCITS
 * CorporateSectorIdentifier1Code.mmUCITS}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CorporateSectorIdentifier1Code extends CorporateSectorIdentifierCode {

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
	public static final MMCode mmAlternativeInvestmentFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeInvestmentFund";
			owner_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
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
	public static final MMCode mmAssurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assurance";
			owner_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
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
	public static final MMCode mmCreditInstitution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditInstitution";
			owner_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
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
	public static final MMCode mmInsurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Insurance";
			owner_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
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
	public static final MMCode mmInvestmentFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFirm";
			owner_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
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
	public static final MMCode mmOccupationalRetirementProvision = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OccupationalRetirementProvision";
			owner_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
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
	public static final MMCode mmReinsurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinsurance";
			owner_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
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
	public static final MMCode mmUCITS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UCITS";
			owner_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateSectorIdentifier1Code";
				definition = "Identifies the corporate sector of the counterparty for reporting to trade repositories.";
				code_lazy = () -> Arrays.asList(CorporateSectorIdentifier1Code.mmAlternativeInvestmentFund, CorporateSectorIdentifier1Code.mmAssurance, CorporateSectorIdentifier1Code.mmCreditInstitution,
						CorporateSectorIdentifier1Code.mmInsurance, CorporateSectorIdentifier1Code.mmInvestmentFirm, CorporateSectorIdentifier1Code.mmOccupationalRetirementProvision, CorporateSectorIdentifier1Code.mmReinsurance,
						CorporateSectorIdentifier1Code.mmUCITS);
				trace_lazy = () -> CorporateSectorIdentifierCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}