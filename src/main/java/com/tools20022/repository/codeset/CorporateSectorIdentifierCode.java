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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the corporate sector of the counterparty for reporting to trade
 * repositories.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#mmAssurance
 * CorporateSectorIdentifierCode.mmAssurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#mmCreditInstitution
 * CorporateSectorIdentifierCode.mmCreditInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#mmInvestmentFirm
 * CorporateSectorIdentifierCode.mmInvestmentFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#mmInsurance
 * CorporateSectorIdentifierCode.mmInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#mmAlternativeInvestmentFund
 * CorporateSectorIdentifierCode.mmAlternativeInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#mmOccupationalRetirementProvision
 * CorporateSectorIdentifierCode.mmOccupationalRetirementProvision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#mmReinsurance
 * CorporateSectorIdentifierCode.mmReinsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#mmUCITS
 * CorporateSectorIdentifierCode.mmUCITS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
 * CorporateSectorIdentifier1Code}</li>
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
 * "CorporateSectorIdentifierCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the corporate sector of the counterparty for reporting to trade repositories."
 * </li>
 * </ul>
 */
public class CorporateSectorIdentifierCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Assurance undertaking authorised in accordance with European Securities
	 * and Markets Authority (ESMA) Directive 2002/83/EC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
	 * CorporateSectorIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assurance undertaking authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2002/83/EC."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAssurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assurance";
			definition = "Assurance undertaking authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2002/83/EC.";
			owner_lazy = () -> CorporateSectorIdentifierCode.mmObject();
			codeName = "A";
		}
	};
	/**
	 * Credit Institution authorised in accordance with European Securities and
	 * Markets Authority (ESMA) Directive 2006/48/EC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
	 * CorporateSectorIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit Institution authorised in accordance with  European Securities and Markets Authority (ESMA) Directive 2006/48/EC."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCreditInstitution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditInstitution";
			definition = "Credit Institution authorised in accordance with  European Securities and Markets Authority (ESMA) Directive 2006/48/EC.";
			owner_lazy = () -> CorporateSectorIdentifierCode.mmObject();
			codeName = "C";
		}
	};
	/**
	 * Investment firm in accordance with European Securities and Markets
	 * Authority (ESMA) Directive 2004/39/EC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
	 * CorporateSectorIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "F"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment firm in accordance with  European Securities and Markets Authority (ESMA) Directive 2004/39/EC."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentFirm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFirm";
			definition = "Investment firm in accordance with  European Securities and Markets Authority (ESMA) Directive 2004/39/EC.";
			owner_lazy = () -> CorporateSectorIdentifierCode.mmObject();
			codeName = "F";
		}
	};
	/**
	 * Insurance undertaking in accordance with European Securities and Markets
	 * Authority (ESMA) Directive 73/239/EEC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
	 * CorporateSectorIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "I"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insurance undertaking in accordance with  European Securities and Markets Authority (ESMA) Directive 73/239/EEC."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInsurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Insurance";
			definition = "Insurance undertaking in accordance with  European Securities and Markets Authority (ESMA) Directive 73/239/EEC.";
			owner_lazy = () -> CorporateSectorIdentifierCode.mmObject();
			codeName = "I";
		}
	};
	/**
	 * Alternative investment fund managed by an Alternative Investment Fund
	 * Manager (AIFM) authorised or registered in accordance with European
	 * Securities and Markets Authority (ESMA) Directive 2011/61/EU.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
	 * CorporateSectorIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "L"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeInvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternative investment fund managed by an Alternative Investment Fund Manager (AIFM) authorised or registered in accordance with European Securities and Markets Authority (ESMA) Directive 2011/61/EU."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAlternativeInvestmentFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeInvestmentFund";
			definition = "Alternative investment fund managed by an Alternative Investment Fund Manager (AIFM) authorised or registered in accordance with European Securities and Markets Authority (ESMA) Directive 2011/61/EU.";
			owner_lazy = () -> CorporateSectorIdentifierCode.mmObject();
			codeName = "L";
		}
	};
	/**
	 * Institution for occupational retirement provision within the meaning of
	 * Article 6(a) of European Securities and Markets Authority (ESMA)
	 * Directive 2003/41/EC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
	 * CorporateSectorIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "O"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OccupationalRetirementProvision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institution for occupational retirement provision within the meaning of Article 6(a) of  European Securities and Markets Authority (ESMA) Directive 2003/41/EC."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOccupationalRetirementProvision = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OccupationalRetirementProvision";
			definition = "Institution for occupational retirement provision within the meaning of Article 6(a) of  European Securities and Markets Authority (ESMA) Directive 2003/41/EC.";
			owner_lazy = () -> CorporateSectorIdentifierCode.mmObject();
			codeName = "O";
		}
	};
	/**
	 * Reinsurance undertaking authorised in accordance with European Securities
	 * and Markets Authority (ESMA) Directive 2005/68/EC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
	 * CorporateSectorIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "R"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinsurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reinsurance undertaking authorised in accordance with  European Securities and Markets Authority (ESMA) Directive 2005/68/EC."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReinsurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinsurance";
			definition = "Reinsurance undertaking authorised in accordance with  European Securities and Markets Authority (ESMA) Directive 2005/68/EC.";
			owner_lazy = () -> CorporateSectorIdentifierCode.mmObject();
			codeName = "R";
		}
	};
	/**
	 * Undertakings for Collective Investment in Transferable Securities (UCITS)
	 * and its management company, authorised in accordance with European
	 * Securities and Markets Authority (ESMA) Directive 2009/95/EC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode
	 * CorporateSectorIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "U"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UCITS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertakings for Collective Investment in Transferable Securities (UCITS) and its management company, authorised in accordance with  European Securities and Markets Authority (ESMA) Directive 2009/95/EC."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUCITS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UCITS";
			definition = "Undertakings for Collective Investment in Transferable Securities (UCITS) and its management company, authorised in accordance with  European Securities and Markets Authority (ESMA) Directive 2009/95/EC.";
			owner_lazy = () -> CorporateSectorIdentifierCode.mmObject();
			codeName = "U";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateSectorIdentifierCode";
				definition = "Identifies the corporate sector of the counterparty for reporting to trade repositories.";
				code_lazy = () -> Arrays.asList(CorporateSectorIdentifierCode.mmAssurance, CorporateSectorIdentifierCode.mmCreditInstitution, CorporateSectorIdentifierCode.mmInvestmentFirm, CorporateSectorIdentifierCode.mmInsurance,
						CorporateSectorIdentifierCode.mmAlternativeInvestmentFund, CorporateSectorIdentifierCode.mmOccupationalRetirementProvision, CorporateSectorIdentifierCode.mmReinsurance, CorporateSectorIdentifierCode.mmUCITS);
				derivation_lazy = () -> Arrays.asList(CorporateSectorIdentifier1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}