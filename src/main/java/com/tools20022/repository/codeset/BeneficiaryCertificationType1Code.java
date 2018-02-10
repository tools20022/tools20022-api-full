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
import com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of beneficiary's certification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code#AccreditedInvestor
 * BeneficiaryCertificationType1Code.AccreditedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code#DomicileCountry
 * BeneficiaryCertificationType1Code.DomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code#FullBeneficialOwnerBreakdown
 * BeneficiaryCertificationType1Code.FullBeneficialOwnerBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code#QIBCertification
 * BeneficiaryCertificationType1Code.QIBCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code#TaxRateBreakdown
 * BeneficiaryCertificationType1Code.TaxRateBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code#NonCompany
 * BeneficiaryCertificationType1Code.NonCompany}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
 * BeneficiaryCertificationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACCI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BeneficiaryCertificationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of beneficiary's certification."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BeneficiaryCertificationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code
	 * BeneficiaryCertificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccreditedInvestor"</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType1Code AccreditedInvestor = new BeneficiaryCertificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccreditedInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.AccreditedInvestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code
	 * BeneficiaryCertificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomicileCountry"</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType1Code DomicileCountry = new BeneficiaryCertificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomicileCountry";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.DomicileCountry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code
	 * BeneficiaryCertificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullBeneficialOwnerBreakdown"</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType1Code FullBeneficialOwnerBreakdown = new BeneficiaryCertificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullBeneficialOwnerBreakdown";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.FullBeneficialOwnerBreakdown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code
	 * BeneficiaryCertificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QIBCertification"</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType1Code QIBCertification = new BeneficiaryCertificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QIBCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.QIBCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code
	 * BeneficiaryCertificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateBreakdown"</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType1Code TaxRateBreakdown = new BeneficiaryCertificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRateBreakdown";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.TaxRateBreakdown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code
	 * BeneficiaryCertificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCompany"</li>
	 * </ul>
	 */
	public static final BeneficiaryCertificationType1Code NonCompany = new BeneficiaryCertificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.mmObject();
			codeName = BeneficiaryCertificationTypeCode.NonCompany.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BeneficiaryCertificationType1Code> codesByName = new LinkedHashMap<>();

	protected BeneficiaryCertificationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationType1Code";
				definition = "Specifies the type of beneficiary's certification.";
				trace_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.AccreditedInvestor, com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.DomicileCountry,
						com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.FullBeneficialOwnerBreakdown, com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.QIBCertification,
						com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.TaxRateBreakdown, com.tools20022.repository.codeset.BeneficiaryCertificationType1Code.NonCompany);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccreditedInvestor.getCodeName().get(), AccreditedInvestor);
		codesByName.put(DomicileCountry.getCodeName().get(), DomicileCountry);
		codesByName.put(FullBeneficialOwnerBreakdown.getCodeName().get(), FullBeneficialOwnerBreakdown);
		codesByName.put(QIBCertification.getCodeName().get(), QIBCertification);
		codesByName.put(TaxRateBreakdown.getCodeName().get(), TaxRateBreakdown);
		codesByName.put(NonCompany.getCodeName().get(), NonCompany);
	}

	public static BeneficiaryCertificationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BeneficiaryCertificationType1Code[] values() {
		BeneficiaryCertificationType1Code[] values = new BeneficiaryCertificationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BeneficiaryCertificationType1Code> {
		@Override
		public BeneficiaryCertificationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BeneficiaryCertificationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}