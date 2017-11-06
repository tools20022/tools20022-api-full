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
import com.tools20022.repository.codeset.CRSFormTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of Common Reporting Standard (CRS) form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CRSFormTypeCode
 * CRSFormTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#mmCertificateIdentificationGovernment
 * CRSFormType1Code.mmCertificateIdentificationGovernment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#mmCertificateOfResidence
 * CRSFormType1Code.mmCertificateOfResidence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#mmOfficialDocumentGovernmentForEntity
 * CRSFormType1Code.mmOfficialDocumentGovernmentForEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#mmOtherDocumentOrReport
 * CRSFormType1Code.mmOtherDocumentOrReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#mmPublicInformationEntity
 * CRSFormType1Code.mmPublicInformationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#mmSelfCertificationSeparateDocument
 * CRSFormType1Code.mmSelfCertificationSeparateDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#mmSelfCertificationWithAccountOpeningContract
 * CRSFormType1Code.mmSelfCertificationWithAccountOpeningContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code#mmStandardised
 * CRSFormType1Code.mmStandardised}</li>
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
 * "CRSFormType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of Common Reporting Standard  (CRS) form."</li>
 * </ul>
 */
public class CRSFormType1Code extends CRSFormTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentificationGovernment"</li>
	 * </ul>
	 */
	public static final MMCode mmCertificateIdentificationGovernment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentificationGovernment";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfResidence"</li>
	 * </ul>
	 */
	public static final MMCode mmCertificateOfResidence = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfResidence";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialDocumentGovernmentForEntity"</li>
	 * </ul>
	 */
	public static final MMCode mmOfficialDocumentGovernmentForEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialDocumentGovernmentForEntity";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentOrReport"</li>
	 * </ul>
	 */
	public static final MMCode mmOtherDocumentOrReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentOrReport";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicInformationEntity"</li>
	 * </ul>
	 */
	public static final MMCode mmPublicInformationEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicInformationEntity";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertificationSeparateDocument"</li>
	 * </ul>
	 */
	public static final MMCode mmSelfCertificationSeparateDocument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationSeparateDocument";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertificationWithAccountOpeningContract"</li>
	 * </ul>
	 */
	public static final MMCode mmSelfCertificationWithAccountOpeningContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationWithAccountOpeningContract";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSFormType1Code
	 * CRSFormType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardised"</li>
	 * </ul>
	 */
	public static final MMCode mmStandardised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standardised";
			owner_lazy = () -> CRSFormType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CRSFormType1Code";
				definition = "Specifies the type of Common Reporting Standard  (CRS) form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CRSFormType1Code.mmCertificateIdentificationGovernment, com.tools20022.repository.codeset.CRSFormType1Code.mmCertificateOfResidence,
						com.tools20022.repository.codeset.CRSFormType1Code.mmOfficialDocumentGovernmentForEntity, com.tools20022.repository.codeset.CRSFormType1Code.mmOtherDocumentOrReport,
						com.tools20022.repository.codeset.CRSFormType1Code.mmPublicInformationEntity, com.tools20022.repository.codeset.CRSFormType1Code.mmSelfCertificationSeparateDocument,
						com.tools20022.repository.codeset.CRSFormType1Code.mmSelfCertificationWithAccountOpeningContract, com.tools20022.repository.codeset.CRSFormType1Code.mmStandardised);
				trace_lazy = () -> CRSFormTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}