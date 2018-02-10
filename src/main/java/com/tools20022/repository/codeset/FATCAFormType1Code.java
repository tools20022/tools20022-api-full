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
import com.tools20022.repository.codeset.FATCAFormType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#CertificateForeignIntermediary
 * FATCAFormType1Code.CertificateForeignIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#CertificateForeignPersonsClaim
 * FATCAFormType1Code.CertificateForeignPersonsClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#CertificateForeignStatusBeneficialOwner
 * FATCAFormType1Code.CertificateForeignStatusBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#CertificateLossNationality
 * FATCAFormType1Code.CertificateLossNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#SelfCertification
 * FATCAFormType1Code.SelfCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#SelfCertificationLossNationality
 * FATCAFormType1Code.SelfCertificationLossNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#TaxpayerIdentificationNumberRequest
 * FATCAFormType1Code.TaxpayerIdentificationNumberRequest}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
 * FATCAFormTypeCode}</li>
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
 * "FATCAFormType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of Foreign Account Tax Compliance Act (FATCA) form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FATCAFormType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code
	 * FATCAFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateForeignIntermediary"</li>
	 * </ul>
	 */
	public static final FATCAFormType1Code CertificateForeignIntermediary = new FATCAFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignIntermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormType1Code.mmObject();
			codeName = FATCAFormTypeCode.CertificateForeignIntermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code
	 * FATCAFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateForeignPersonsClaim"</li>
	 * </ul>
	 */
	public static final FATCAFormType1Code CertificateForeignPersonsClaim = new FATCAFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignPersonsClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormType1Code.mmObject();
			codeName = FATCAFormTypeCode.CertificateForeignPersonsClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code
	 * FATCAFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateForeignStatusBeneficialOwner"</li>
	 * </ul>
	 */
	public static final FATCAFormType1Code CertificateForeignStatusBeneficialOwner = new FATCAFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignStatusBeneficialOwner";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormType1Code.mmObject();
			codeName = FATCAFormTypeCode.CertificateForeignStatusBeneficialOwner.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code
	 * FATCAFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateLossNationality"</li>
	 * </ul>
	 */
	public static final FATCAFormType1Code CertificateLossNationality = new FATCAFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateLossNationality";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormType1Code.mmObject();
			codeName = FATCAFormTypeCode.CertificateLossNationality.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code
	 * FATCAFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertification"</li>
	 * </ul>
	 */
	public static final FATCAFormType1Code SelfCertification = new FATCAFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormType1Code.mmObject();
			codeName = FATCAFormTypeCode.SelfCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code
	 * FATCAFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertificationLossNationality"</li>
	 * </ul>
	 */
	public static final FATCAFormType1Code SelfCertificationLossNationality = new FATCAFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationLossNationality";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormType1Code.mmObject();
			codeName = FATCAFormTypeCode.SelfCertificationLossNationality.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code
	 * FATCAFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxpayerIdentificationNumberRequest"</li>
	 * </ul>
	 */
	public static final FATCAFormType1Code TaxpayerIdentificationNumberRequest = new FATCAFormType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxpayerIdentificationNumberRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormType1Code.mmObject();
			codeName = FATCAFormTypeCode.TaxpayerIdentificationNumberRequest.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FATCAFormType1Code> codesByName = new LinkedHashMap<>();

	protected FATCAFormType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FATCAFormType1Code";
				definition = "Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.";
				trace_lazy = () -> FATCAFormTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCAFormType1Code.CertificateForeignIntermediary, com.tools20022.repository.codeset.FATCAFormType1Code.CertificateForeignPersonsClaim,
						com.tools20022.repository.codeset.FATCAFormType1Code.CertificateForeignStatusBeneficialOwner, com.tools20022.repository.codeset.FATCAFormType1Code.CertificateLossNationality,
						com.tools20022.repository.codeset.FATCAFormType1Code.SelfCertification, com.tools20022.repository.codeset.FATCAFormType1Code.SelfCertificationLossNationality,
						com.tools20022.repository.codeset.FATCAFormType1Code.TaxpayerIdentificationNumberRequest);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CertificateForeignIntermediary.getCodeName().get(), CertificateForeignIntermediary);
		codesByName.put(CertificateForeignPersonsClaim.getCodeName().get(), CertificateForeignPersonsClaim);
		codesByName.put(CertificateForeignStatusBeneficialOwner.getCodeName().get(), CertificateForeignStatusBeneficialOwner);
		codesByName.put(CertificateLossNationality.getCodeName().get(), CertificateLossNationality);
		codesByName.put(SelfCertification.getCodeName().get(), SelfCertification);
		codesByName.put(SelfCertificationLossNationality.getCodeName().get(), SelfCertificationLossNationality);
		codesByName.put(TaxpayerIdentificationNumberRequest.getCodeName().get(), TaxpayerIdentificationNumberRequest);
	}

	public static FATCAFormType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FATCAFormType1Code[] values() {
		FATCAFormType1Code[] values = new FATCAFormType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FATCAFormType1Code> {
		@Override
		public FATCAFormType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FATCAFormType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}