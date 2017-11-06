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
import com.tools20022.repository.codeset.FATCAFormTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
 * FATCAFormTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#mmCertificateForeignIntermediary
 * FATCAFormType1Code.mmCertificateForeignIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#mmCertificateForeignPersonsClaim
 * FATCAFormType1Code.mmCertificateForeignPersonsClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#mmCertificateForeignStatusBeneficialOwner
 * FATCAFormType1Code.mmCertificateForeignStatusBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#mmCertificateLossNationality
 * FATCAFormType1Code.mmCertificateLossNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#mmSelfCertification
 * FATCAFormType1Code.mmSelfCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#mmSelfCertificationLossNationality
 * FATCAFormType1Code.mmSelfCertificationLossNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormType1Code#mmTaxpayerIdentificationNumberRequest
 * FATCAFormType1Code.mmTaxpayerIdentificationNumberRequest}</li>
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
 * "FATCAFormType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of Foreign Account Tax Compliance Act (FATCA) form."</li>
 * </ul>
 */
public class FATCAFormType1Code extends FATCAFormTypeCode {

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
	public static final MMCode mmCertificateForeignIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignIntermediary";
			owner_lazy = () -> FATCAFormType1Code.mmObject();
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
	public static final MMCode mmCertificateForeignPersonsClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignPersonsClaim";
			owner_lazy = () -> FATCAFormType1Code.mmObject();
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
	public static final MMCode mmCertificateForeignStatusBeneficialOwner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignStatusBeneficialOwner";
			owner_lazy = () -> FATCAFormType1Code.mmObject();
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
	public static final MMCode mmCertificateLossNationality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateLossNationality";
			owner_lazy = () -> FATCAFormType1Code.mmObject();
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
	public static final MMCode mmSelfCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertification";
			owner_lazy = () -> FATCAFormType1Code.mmObject();
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
	public static final MMCode mmSelfCertificationLossNationality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationLossNationality";
			owner_lazy = () -> FATCAFormType1Code.mmObject();
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
	public static final MMCode mmTaxpayerIdentificationNumberRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxpayerIdentificationNumberRequest";
			owner_lazy = () -> FATCAFormType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FATCAFormType1Code";
				definition = "Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCAFormType1Code.mmCertificateForeignIntermediary, com.tools20022.repository.codeset.FATCAFormType1Code.mmCertificateForeignPersonsClaim,
						com.tools20022.repository.codeset.FATCAFormType1Code.mmCertificateForeignStatusBeneficialOwner, com.tools20022.repository.codeset.FATCAFormType1Code.mmCertificateLossNationality,
						com.tools20022.repository.codeset.FATCAFormType1Code.mmSelfCertification, com.tools20022.repository.codeset.FATCAFormType1Code.mmSelfCertificationLossNationality,
						com.tools20022.repository.codeset.FATCAFormType1Code.mmTaxpayerIdentificationNumberRequest);
				trace_lazy = () -> FATCAFormTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}