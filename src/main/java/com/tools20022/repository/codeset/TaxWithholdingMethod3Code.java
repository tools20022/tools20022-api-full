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
import com.tools20022.repository.codeset.TaxWithholdingMethod3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method by which the tax on the interests is to be processed
 * i.e. either withheld at source or reported to tax authorities or a tax
 * certificate has been provided by the beneficiary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code#MinorityInterestTax
 * TaxWithholdingMethod3Code.MinorityInterestTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code#InvestmentCompany
 * TaxWithholdingMethod3Code.InvestmentCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code#Accountant
 * TaxWithholdingMethod3Code.Accountant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code#Exempt
 * TaxWithholdingMethod3Code.Exempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code#ReportTax
 * TaxWithholdingMethod3Code.ReportTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code#TaxCertificate
 * TaxWithholdingMethod3Code.TaxCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code#WithholdingCorporateTax
 * TaxWithholdingMethod3Code.WithholdingCorporateTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code#WithholdTax
 * TaxWithholdingMethod3Code.WithholdTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code#WithholdTaxAndReport
 * TaxWithholdingMethod3Code.WithholdTaxAndReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
 * TaxWithholdingMethodCode}</li>
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
 * "TaxWithholdingMethod3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method by which the tax on the interests is to be processed i.e. either withheld at source or reported to tax authorities or a tax certificate has been provided by the beneficiary."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxWithholdingMethod3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinorityInterestTax"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod3Code MinorityInterestTax = new TaxWithholdingMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinorityInterestTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod3Code.mmObject();
			codeName = TaxWithholdingMethodCode.MinorityInterestTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentCompany"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod3Code InvestmentCompany = new TaxWithholdingMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod3Code.mmObject();
			codeName = TaxWithholdingMethodCode.InvestmentCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accountant"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod3Code Accountant = new TaxWithholdingMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accountant";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod3Code.mmObject();
			codeName = TaxWithholdingMethodCode.Accountant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exempt"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod3Code Exempt = new TaxWithholdingMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exempt";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod3Code.mmObject();
			codeName = TaxWithholdingMethodCode.Exempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportTax"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod3Code ReportTax = new TaxWithholdingMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod3Code.mmObject();
			codeName = TaxWithholdingMethodCode.ReportTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCertificate"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod3Code TaxCertificate = new TaxWithholdingMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod3Code.mmObject();
			codeName = TaxWithholdingMethodCode.TaxCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingCorporateTax"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod3Code WithholdingCorporateTax = new TaxWithholdingMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingCorporateTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod3Code.mmObject();
			codeName = TaxWithholdingMethodCode.WithholdingCorporateTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdTax"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod3Code WithholdTax = new TaxWithholdingMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod3Code.mmObject();
			codeName = TaxWithholdingMethodCode.WithholdTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdTaxAndReport"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod3Code WithholdTaxAndReport = new TaxWithholdingMethod3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdTaxAndReport";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod3Code.mmObject();
			codeName = TaxWithholdingMethodCode.WithholdTaxAndReport.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxWithholdingMethod3Code> codesByName = new LinkedHashMap<>();

	protected TaxWithholdingMethod3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxWithholdingMethod3Code";
				definition = "Specifies the method by which the tax on the interests is to be processed i.e. either withheld at source or reported to tax authorities or a tax certificate has been provided by the beneficiary.";
				trace_lazy = () -> TaxWithholdingMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxWithholdingMethod3Code.MinorityInterestTax, com.tools20022.repository.codeset.TaxWithholdingMethod3Code.InvestmentCompany,
						com.tools20022.repository.codeset.TaxWithholdingMethod3Code.Accountant, com.tools20022.repository.codeset.TaxWithholdingMethod3Code.Exempt, com.tools20022.repository.codeset.TaxWithholdingMethod3Code.ReportTax,
						com.tools20022.repository.codeset.TaxWithholdingMethod3Code.TaxCertificate, com.tools20022.repository.codeset.TaxWithholdingMethod3Code.WithholdingCorporateTax,
						com.tools20022.repository.codeset.TaxWithholdingMethod3Code.WithholdTax, com.tools20022.repository.codeset.TaxWithholdingMethod3Code.WithholdTaxAndReport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MinorityInterestTax.getCodeName().get(), MinorityInterestTax);
		codesByName.put(InvestmentCompany.getCodeName().get(), InvestmentCompany);
		codesByName.put(Accountant.getCodeName().get(), Accountant);
		codesByName.put(Exempt.getCodeName().get(), Exempt);
		codesByName.put(ReportTax.getCodeName().get(), ReportTax);
		codesByName.put(TaxCertificate.getCodeName().get(), TaxCertificate);
		codesByName.put(WithholdingCorporateTax.getCodeName().get(), WithholdingCorporateTax);
		codesByName.put(WithholdTax.getCodeName().get(), WithholdTax);
		codesByName.put(WithholdTaxAndReport.getCodeName().get(), WithholdTaxAndReport);
	}

	public static TaxWithholdingMethod3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxWithholdingMethod3Code[] values() {
		TaxWithholdingMethod3Code[] values = new TaxWithholdingMethod3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxWithholdingMethod3Code> {
		@Override
		public TaxWithholdingMethod3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxWithholdingMethod3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}