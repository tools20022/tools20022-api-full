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
import com.tools20022.repository.codeset.CorporateSectorIdentifierCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#Assurance
 * CorporateSectorIdentifierCode.Assurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#CreditInstitution
 * CorporateSectorIdentifierCode.CreditInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#InvestmentFirm
 * CorporateSectorIdentifierCode.InvestmentFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#Insurance
 * CorporateSectorIdentifierCode.Insurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#AlternativeInvestmentFund
 * CorporateSectorIdentifierCode.AlternativeInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#OccupationalRetirementProvision
 * CorporateSectorIdentifierCode.OccupationalRetirementProvision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#Reinsurance
 * CorporateSectorIdentifierCode.Reinsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifierCode#UCITS
 * CorporateSectorIdentifierCode.UCITS}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateSectorIdentifierCode extends MMCode {

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
	public static final CorporateSectorIdentifierCode Assurance = new CorporateSectorIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assurance";
			definition = "Assurance undertaking authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2002/83/EC.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifierCode.mmObject();
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
	 * "Credit Institution authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2006/48/EC."
	 * </li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifierCode CreditInstitution = new CorporateSectorIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditInstitution";
			definition = "Credit Institution authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2006/48/EC.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifierCode.mmObject();
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
	 * "Investment firm in accordance with European Securities and Markets Authority (ESMA) Directive 2004/39/EC."
	 * </li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifierCode InvestmentFirm = new CorporateSectorIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFirm";
			definition = "Investment firm in accordance with European Securities and Markets Authority (ESMA) Directive 2004/39/EC.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifierCode.mmObject();
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
	 * "Insurance undertaking in accordance with European Securities and Markets Authority (ESMA) Directive 73/239/EEC."
	 * </li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifierCode Insurance = new CorporateSectorIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Insurance";
			definition = "Insurance undertaking in accordance with European Securities and Markets Authority (ESMA) Directive 73/239/EEC.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifierCode.mmObject();
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
	public static final CorporateSectorIdentifierCode AlternativeInvestmentFund = new CorporateSectorIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeInvestmentFund";
			definition = "Alternative investment fund managed by an Alternative Investment Fund Manager (AIFM) authorised or registered in accordance with European Securities and Markets Authority (ESMA) Directive 2011/61/EU.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifierCode.mmObject();
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
	 * "Institution for occupational retirement provision within the meaning of Article 6(a) of European Securities and Markets Authority (ESMA) Directive 2003/41/EC."
	 * </li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifierCode OccupationalRetirementProvision = new CorporateSectorIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OccupationalRetirementProvision";
			definition = "Institution for occupational retirement provision within the meaning of Article 6(a) of European Securities and Markets Authority (ESMA) Directive 2003/41/EC.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifierCode.mmObject();
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
	 * "Reinsurance undertaking authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2005/68/EC."
	 * </li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifierCode Reinsurance = new CorporateSectorIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinsurance";
			definition = "Reinsurance undertaking authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2005/68/EC.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifierCode.mmObject();
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
	 * "Undertakings for Collective Investment in Transferable Securities (UCITS) and its management company, authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2009/95/EC."
	 * </li>
	 * </ul>
	 */
	public static final CorporateSectorIdentifierCode UCITS = new CorporateSectorIdentifierCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UCITS";
			definition = "Undertakings for Collective Investment in Transferable Securities (UCITS) and its management company, authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2009/95/EC.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateSectorIdentifierCode.mmObject();
			codeName = "U";
		}
	};
	final static private LinkedHashMap<String, CorporateSectorIdentifierCode> codesByName = new LinkedHashMap<>();

	protected CorporateSectorIdentifierCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateSectorIdentifierCode";
				definition = "Identifies the corporate sector of the counterparty for reporting to trade repositories.";
				derivation_lazy = () -> Arrays.asList(CorporateSectorIdentifier1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateSectorIdentifierCode.Assurance, com.tools20022.repository.codeset.CorporateSectorIdentifierCode.CreditInstitution,
						com.tools20022.repository.codeset.CorporateSectorIdentifierCode.InvestmentFirm, com.tools20022.repository.codeset.CorporateSectorIdentifierCode.Insurance,
						com.tools20022.repository.codeset.CorporateSectorIdentifierCode.AlternativeInvestmentFund, com.tools20022.repository.codeset.CorporateSectorIdentifierCode.OccupationalRetirementProvision,
						com.tools20022.repository.codeset.CorporateSectorIdentifierCode.Reinsurance, com.tools20022.repository.codeset.CorporateSectorIdentifierCode.UCITS);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Assurance.getCodeName().get(), Assurance);
		codesByName.put(CreditInstitution.getCodeName().get(), CreditInstitution);
		codesByName.put(InvestmentFirm.getCodeName().get(), InvestmentFirm);
		codesByName.put(Insurance.getCodeName().get(), Insurance);
		codesByName.put(AlternativeInvestmentFund.getCodeName().get(), AlternativeInvestmentFund);
		codesByName.put(OccupationalRetirementProvision.getCodeName().get(), OccupationalRetirementProvision);
		codesByName.put(Reinsurance.getCodeName().get(), Reinsurance);
		codesByName.put(UCITS.getCodeName().get(), UCITS);
	}

	public static CorporateSectorIdentifierCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateSectorIdentifierCode[] values() {
		CorporateSectorIdentifierCode[] values = new CorporateSectorIdentifierCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateSectorIdentifierCode> {
		@Override
		public CorporateSectorIdentifierCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateSectorIdentifierCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}