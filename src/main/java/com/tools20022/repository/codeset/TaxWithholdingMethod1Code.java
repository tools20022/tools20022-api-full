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
import com.tools20022.repository.codeset.TaxWithholdingMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specified the method by which the tax on the interests is to be processed
 * i.e. either withheld at source or reported to tax authorities or a tax
 * certificate has been provided by the beneficiary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod1Code#WithholdTax
 * TaxWithholdingMethod1Code.WithholdTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod1Code#ReportTax
 * TaxWithholdingMethod1Code.ReportTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod1Code#TaxCertificate
 * TaxWithholdingMethod1Code.TaxCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod1Code#WithholdTaxAndReport
 * TaxWithholdingMethod1Code.WithholdTaxAndReport}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"WTHD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxWithholdingMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specified the method by which the tax on the interests is to be processed i.e. either withheld at source or reported to tax authorities or a tax certificate has been provided by the beneficiary."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxWithholdingMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod1Code
	 * TaxWithholdingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdTax"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod1Code WithholdTax = new TaxWithholdingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod1Code.mmObject();
			codeName = TaxWithholdingMethodCode.WithholdTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod1Code
	 * TaxWithholdingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportTax"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod1Code ReportTax = new TaxWithholdingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod1Code.mmObject();
			codeName = TaxWithholdingMethodCode.ReportTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod1Code
	 * TaxWithholdingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCertificate"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod1Code TaxCertificate = new TaxWithholdingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod1Code.mmObject();
			codeName = TaxWithholdingMethodCode.TaxCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod1Code
	 * TaxWithholdingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdTaxAndReport"</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethod1Code WithholdTaxAndReport = new TaxWithholdingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdTaxAndReport";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethod1Code.mmObject();
			codeName = TaxWithholdingMethodCode.WithholdTaxAndReport.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxWithholdingMethod1Code> codesByName = new LinkedHashMap<>();

	protected TaxWithholdingMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WTHD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxWithholdingMethod1Code";
				definition = "Specified the method by which the tax on the interests is to be processed i.e. either withheld at source or reported to tax authorities or a tax certificate has been provided by the beneficiary.";
				trace_lazy = () -> TaxWithholdingMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxWithholdingMethod1Code.WithholdTax, com.tools20022.repository.codeset.TaxWithholdingMethod1Code.ReportTax,
						com.tools20022.repository.codeset.TaxWithholdingMethod1Code.TaxCertificate, com.tools20022.repository.codeset.TaxWithholdingMethod1Code.WithholdTaxAndReport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WithholdTax.getCodeName().get(), WithholdTax);
		codesByName.put(ReportTax.getCodeName().get(), ReportTax);
		codesByName.put(TaxCertificate.getCodeName().get(), TaxCertificate);
		codesByName.put(WithholdTaxAndReport.getCodeName().get(), WithholdTaxAndReport);
	}

	public static TaxWithholdingMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxWithholdingMethod1Code[] values() {
		TaxWithholdingMethod1Code[] values = new TaxWithholdingMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxWithholdingMethod1Code> {
		@Override
		public TaxWithholdingMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxWithholdingMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}